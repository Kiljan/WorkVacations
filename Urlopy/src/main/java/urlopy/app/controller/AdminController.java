package urlopy.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import urlopy.app.dao.WorkerDao;
import urlopy.app.model.MainWorkerForm;
import urlopy.app.model.Worker;


@Controller
@RequestMapping("/adminMain")
public class AdminController {
	
	@Autowired
	private WorkerDao workerDao;
	
	/*
	 * Metchods "mainListAndModifyWorker" and "save" work together. They are based on an object that can be passed by ModelAndView
	 * Methods "addNewUser" and "saveNew". They also based on an object that can be passed by ModelAndView
	 * 
	 * The "deleteUS" method uses the earlier structure in jsp. Downloading parameters from jsp is possible thanks to "HttpServletRequest"
	 * 
	 * The "saveNew" method detects the sql error (DataIntegrityViolationException). 
	 * It involves the appearance of duplicate values ​​for the primary key. In this case, check the column 'username'
	 * */
	  
	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView mainListAndModifyWorker() {
		
		MainWorkerForm mainWorkerForm = new MainWorkerForm();
		List<Worker> workerList = workerDao.selectAllWorkers();
		
		mainWorkerForm.setWork(workerList);
		
		/*view name, model name in jsp, object*/
		return new ModelAndView("admin" , "mainView", mainWorkerForm);
	}
	
	@RequestMapping(value = "/saveAll", method = RequestMethod.POST)
	public String save(@ModelAttribute("mainView") MainWorkerForm mainWorkerForm, Errors errors) {
		
		List<Worker> contacts = mainWorkerForm.getWork();
		if(null != contacts && contacts.size() > 0) {
			for (int i = 0; i < contacts.size(); i++) {
				try {
					workerDao.save(contacts.get(i));
				}catch(Exception e){
					 return "redirect:/adminMain";
				}
			}
		}
		return "redirect:/adminMain";
	}
	
	@RequestMapping(value="/addNew", method = RequestMethod.GET)
	public ModelAndView addNewUser() {
		Worker work = new Worker();
		return new ModelAndView("addingNew", "worker", work);
	}
	
	@RequestMapping(value="saveNew", method= RequestMethod.POST)
	public String saveNew(@Valid Worker worker, Errors errors) {
		
		if(errors.hasErrors())
			return "addingNew";
		
		try {
		workerDao.addNew(worker);
		}catch (DataIntegrityViolationException e ) {
			return "userExist";
		}
		return "redirect:/adminMain";
	}
	
	@RequestMapping(value="/removeUser", method=RequestMethod.GET )
	public ModelAndView deleteUS(HttpServletRequest request) {
		String userUsername = request.getParameter("username");
		workerDao.removeOne(userUsername);
	return new ModelAndView("redirect:/adminMain");	
	}
	
}
