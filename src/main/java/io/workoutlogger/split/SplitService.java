package io.workoutlogger.split;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //marks this class as a business service, detects and creates instances
public class SplitService {
	
	@Autowired
	private SplitRepository splitRepository;
	// "//" comments are old code from previously using a hardcode list
	// We are now using a database Derby.
	
	public List<Split> getAllSplits() {
		//return splits; 
		List<Split> splits = new ArrayList<>();
		splitRepository.findAll()
		.forEach(splits::add);
		return splits;
	}

	public Split getSplit(String id) {
		//return splits.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return splitRepository.findById(id).orElse(null);
		
	}
	public void addSplit(Split split) {
		//splits.add(split); 
		splitRepository.save(split);
		
	}
	public void updateSplit(String id, Split split) {
		//for (int i = 0; i <splits.size(); i++) {Split t =splits.get(i);
		//if (t.getId().equals(id)) {splits.set(i,  split);	return;}}
		splitRepository.save(split);
	}
	public void deleteSplit(String id) {
		//splits.removeIf(t -> t.getId().equals(id));
		splitRepository.deleteById(id);
		
	}
}
