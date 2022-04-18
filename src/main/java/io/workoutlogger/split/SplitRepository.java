package io.workoutlogger.split;

import org.springframework.data.repository.CrudRepository;

public interface SplitRepository extends CrudRepository<Split, String> {	
	
	//Extending lets our repository get the crud methods from the crudrepository
	//getAllSplits()
	//getSplit(String id)
	//updateSplit(Split t)
	//deleteSplit(String id)
	
	
}
