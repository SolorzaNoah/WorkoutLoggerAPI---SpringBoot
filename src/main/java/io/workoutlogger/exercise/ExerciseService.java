package io.workoutlogger.exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //marks this class as a business service, detects and creates instances
public class ExerciseService {
	
	@Autowired
	private ExerciseRepository exerciseRepository;
	// "//" comments are old code from previously using a hardcode list
	// We are now using a database Derby.
	
	public List<Exercise> getAllExercises(String splitId) {
		//return exercises; 
		List<Exercise> exercises = new ArrayList<>();
		exerciseRepository.findBySplitId(splitId)
		.forEach(exercises::add);
		return exercises;
	}

	public Exercise getExercise(String id) {
		//return exercises.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return exerciseRepository.findById(id).orElse(null);
		
	}
	public void addExercise(Exercise exercise) {
		//exercises.add(exercise); 
		exerciseRepository.save(exercise);
		
	}
	public void updateExercise(Exercise exercise) {
		//for (int i = 0; i <exercises.size(); i++) {Exercise t =exercises.get(i);
		//if (t.getId().equals(id)) {exercises.set(i,  exercise);	return;}}
		exerciseRepository.save(exercise);
	}
	public void deleteExercise(String id) {
		//exercises.removeIf(t -> t.getId().equals(id));
		exerciseRepository.deleteById(id);
		
	}
}
