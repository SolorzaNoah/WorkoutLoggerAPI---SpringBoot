package io.workoutlogger.exercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.workoutlogger.split.Split;

@RestController
public class ExerciseController {
	
	@Autowired  //marks as something that needs dependency injection 
	private ExerciseService exerciseService;		
	
	@RequestMapping("/splits/{id}/exercises")
	public List<Exercise> getAllExercises(@PathVariable String id) {
		return exerciseService.getAllExercises(id);
	}
	
	@RequestMapping("/splits/{splitId}/exercises/{id}")
	public Exercise getExercise(@PathVariable String id) {
		return exerciseService.getExercise(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/splits/{splitId}/exercises")
	public void addExercise(@RequestBody Exercise exercise, @PathVariable String splitId) {
		exercise.setSplit(new Split(splitId, "",""));
		exerciseService.addExercise(exercise);		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/splits/{splitId}/exercises/{id}")
	public void updateExercise(@RequestBody Exercise exercise, @PathVariable String splitId,  @PathVariable String id) {
		exercise.setSplit(new Split(splitId, "",""));
		exerciseService.updateExercise(exercise);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/splits/{splitId}/exercises/{id}")
	public void deleteExercise(@PathVariable String id) {
		exerciseService.deleteExercise(id);		
	}
}
