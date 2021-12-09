import java.util.ArrayList;
import java.util.Comparator;


public class Sorting {
	
	static class Sortbyrollno implements Comparator <Storing> {
		
		public int compare(Storing a, Storing b) {
			return a.rollno - b.rollno;
		}
	}
	
	static class Sortbyname implements Comparator <Storing> {
		
		public int compare(Storing a, Storing b) {
			return a.name.compareTo(b.name);
		}
	}
	
	public static void sort(ArrayList<Storing> storing) {
		Sortbyrollno rollnosort = new Sortbyrollno();
		int s = storing.size();
		
		for (int i = 0; i < s-1; ++i) {
			int min_index = i;
			for (int j = i + 1; j < s; ++j) {
				
				if (rollnosort.compare(storing.get(j), storing.get(min_index)) < 0) 
					min_index = j;
					
					Storing temp = storing.get(min_index);
					storing.set(min_index,  storing.get(i));
					storing.set(i,  temp);
					
				
			}
		}
		
	}
}


