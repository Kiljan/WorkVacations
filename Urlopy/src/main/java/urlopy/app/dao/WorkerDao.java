package urlopy.app.dao;

import java.util.List;

import urlopy.app.model.Worker;

public interface WorkerDao {

	List<Worker> selectAllWorkers();

	Worker selectOne(String username);

	void save(Worker worker);
	
	void addNew(Worker worker);
	
	void removeOne(String username);

}
