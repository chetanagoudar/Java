package demos;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Stud implements Comparable<Stud>{
	private int rollNumber;
	private int totalMarks;
	private String name;
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", totalMarks=" + totalMarks + ", name=" + name + "]";
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		if(totalMarks <= 100) {
			this.totalMarks = totalMarks;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Stud(int rollNumber, int totalMarks, String name) {
		super();
		if(totalMarks <= 100) {
			this.totalMarks = totalMarks;
		}
		this.rollNumber = rollNumber;
		
		this.name = name;
	}
	@Override
	public int compareTo(Stud o) {
		return this.getName().compareTo(o.getName());
		
	}
}


  class SortByMarks implements Comparator<Stud>{

	@Override
	public int compare(Stud o1, Stud o2) {
		if(o1.getTotalMarks() == o2.getTotalMarks()) {
			return 0;
		}else if(o1.getTotalMarks() < o2.getTotalMarks()) {
			return -1;
		}else {
			return 1;
		}
	}
  
  
  }
 
public class CompareExample {

	public static void main(String[] args) {
		Set<Stud> students = new TreeSet<>();
		students.add(new Stud(1,58,"CHETANA"));
		students.add(new Stud(2,70,"MOHAN"));
		students.add(new Stud(4,89,"DISHA"));
		students.add(new Stud(5,35,"DIKSHA"));
		students.add(new Stud(3,98,"RAKSHIT"));
	
		System.out.println("\n Students sorted by name: ");
		for(Stud s : students) {
			System.out.println(s.toString());
		}
		
		System.out.println("\n\nStudents sorted by marks");
		
		List<Stud> studentsList = new ArrayList<>();
		for(Stud s : students) {
			studentsList.add(s);
		}
		
		Collections.sort(studentsList, new SortByMarks());
		for(Stud s : studentsList) {
			System.out.println(s.toString());
		}
	}

}
