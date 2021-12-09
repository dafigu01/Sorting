import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Storing extends Sorting {
	
	String name;
	String address;
	int rollno;
	
	public Storing(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
	
	@Override
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Storing> storing = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		String name;
		String address;
		Random random = new Random();
		
		System.out.println("Enter Student Name and Student Address (Press Enter After Each Entry): ");
		
		for (int i = 0; i<10; ++i) {
			int rollno = random.nextInt(100);
			
			
			name = scnr.next();
			
			address = scnr.next();
			
			storing.add(new Storing(rollno, name, address));
			
			
			
		}
		sort(storing);
		System.out.println("Sorted Students Below");
		System.out.println("ROLLNO - Name - Address");
		
		for (Storing s: storing) {
			
			System.out.println(s);
		}
	
		
		
	}
}
