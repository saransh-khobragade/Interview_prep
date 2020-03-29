package amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TopNCompetitors {
	public static ArrayList<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
			int numReviews, List<String> reviews) {
		Map<String, Integer> comp = new TreeMap<>();
		Set<String> visited = new HashSet<>();
		for (String review : reviews) {
			String[] rev = review.split(" ");
			for (String word : rev) {
				if (competitors.contains(word) && !visited.contains(word)) {
					if (comp.containsKey(word))
						comp.replace(word, comp.get(word) + 1);
					else {
						comp.put(word, 1);
						visited.add(word);
					}
				}
			}
			visited.clear();
		}
		Map<String, String> sorted = new TreeMap<>(new MyComparator());
		for (String e : comp.keySet()) {
			sorted.put(comp.get(e) + " " + e, e);
		}
		ArrayList<String> result = new ArrayList<>();
		int i = 0;
		for (String e : sorted.keySet()) {
			if (i < topNCompetitors) {
				result.add(i, sorted.get(e));
				i++;
			} else
				break;
		}
		return result;
	}

	public static void main(String[] a) {
		List<String> review = new ArrayList<>();
		review.add("anacel sfd anacel gf");
		review.add("betacel sfd defcel gf");
		review.add("betacel sfd fde gf");
		review.add("acel sfd dcel gf");
		review.add("defcel sfd betacel gf");
		List<String> comp = new ArrayList<>();
		comp.add("anacel");
		comp.add("betacel");
		comp.add("defcel");
		comp.add("acel");
		comp.add("dcel");
		System.out.println(topNCompetitors(5, 2, comp, 5, review));
	}
}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String[] val1 = o1.split(" ");
		String[] val2 = o2.split(" ");
		if (Integer.parseInt(val1[0]) == Integer.parseInt(val2[0]))
			return val1[1].compareTo(val2[1]);
		else
			return o2.compareTo(o1);
	}
}
