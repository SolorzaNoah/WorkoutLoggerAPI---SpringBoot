package io.workoutlogger.exercise;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, String> {	
	//this method searches DB for all exercises with given name
	//public List<Exercise> findByName(String name);
	//public List<Exercise> findByDescription(String foo);
	public List<Exercise> findBySplitId(String splitId);
	
}
