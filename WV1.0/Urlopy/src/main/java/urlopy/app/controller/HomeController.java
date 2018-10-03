package urlopy.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import urlopy.app.dao.WorkerDao;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private WorkerDao workerDao;

	  @Autowired
	  public HomeController(WorkerDao workerDao) {
	    this.workerDao = workerDao;
	  }

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model, Principal principal) {
	    model.addAttribute("message", "Witaj, jesteś zalogowany jako " + principal.getName());
	    model.addAttribute("workerDetails", workerDao.selectOne(principal.getName()));
	    return "home";
	  }
	
}
