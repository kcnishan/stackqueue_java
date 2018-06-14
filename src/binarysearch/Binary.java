
import java.util.*;

public class Binary {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static Random r = new Random();

	public static void main(String[] args) {
		
		do {
			int rand = r.nextInt((100 - 1) + 1) + 1;
			for (int i = 0; i < 100; i++) {
				if (!arr.contains(rand)) {
					arr.add(rand);
				} 
				
				
				
			}
		} while (arr.size() < 100);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Search sc = new Search(arr);
		if(sc.binarySearch()) {
			System.out.println("found");
		}
		else System.out.println("not found");
		
		

	}
	
}