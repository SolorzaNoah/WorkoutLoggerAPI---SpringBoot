package io.workoutlogger.split;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SplitController {
	
	@Autowired  //marks as something that needs dependency injection 
	private SplitService splitService;		
	
	@RequestMapping("/splits")
	public List<Split> getAllSplits() {
		return splitService.getAllSplits();
	}
	
	@RequestMapping("/splits/{id}")
	public Split getSplit(@PathVariable String id) {
		return splitService.getSplit(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/splits")
	public void addSplit(@RequestBody Split split) {
		splitService.addSplit(split);		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/splits/{id}")
	public void updateSplit(@RequestBody Split split, @PathVariable String id) {
		splitService.updateSplit(id, split);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/splits/{id}")
	public void deleteSplit(@PathVariable String id) {
		splitService.deleteSplit(id);		
	}
}
