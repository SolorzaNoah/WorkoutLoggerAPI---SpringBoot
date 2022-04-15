package io.workoutlogger.split;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //marks this class as a business service, detects and creates instances
public class SplitService {
	
	private List<Split> splits = new ArrayList<> (Arrays.asList(
			new Split("Push", "Spring Framework", "Spring Framework Description"),
			new Split("Pull", "Core Java", "Core Java Description"),
			new Split("Legs", "Javascript", "Javascript Description")
			));
	
	public List<Split> getAllSplits() {
		return splits;
	}

	public Split getSplit(String id) {
		return splits.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addSplit(Split split) {
		splits.add(split);
	}
	public void updateSplit(String id, Split split) {
		for (int i = 0; i <splits.size(); i++) {
			Split t =splits.get(i);
			if (t.getId().equals(id)) {
				splits.set(i,  split);
				return;
			}
		}	
	}
	public void deleteSplit(String id) {
		splits.removeIf(t -> t.getId().equals(id));
		
	}
}
