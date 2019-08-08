package demos;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Student1{
	private int rollNumber;
	private int totalMarks;
	private String name;
	
	
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
	
	public Student1(int rollNumber, int totalMarks, String name) {
		super();
		if(totalMarks <= 100) {
			this.totalMarks = totalMarks;
		}
		this.rollNumber = rollNumber;
		
		this.name = name;
	}
	
	
	
}
class studentComp1 implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.getRollNumber() == o2.getRollNumber()) {
			return 0;
		}else
			return 1;
	}
	
}

public class TreeMapEx {

	public static void main(String[] args) {
		
		Set<Student1> students = new TreeSet<>(new studentComp1());
		
		students.add(new Student1(1,58,"chetana"));
		students.add(new Student1(2,70,"mohan"));
		students.add(new Student1(1,89,"Disha"));
		students.add(new Student1(5,35,"Diksha"));
		char grade = 'A';
		
		Map<Integer, Character> grades = new TreeMap<>();
		for(Student1 s:students) {
			if(s.getTotalMarks() >= 60 ) {
				grade = 'A';
			}else if(s.getTotalMarks() < 60 && s.getTotalMarks()>40) {
				grade = 'B';
			}else if(s.getTotalMarks() <= 40) {
				grade = 'C';
			}
			
			grades.put(s.getRollNumber(), grade);
		}
		
		Set<Integer> keySet = grades.keySet();
		for(Integer i : keySet) {
			System.out.println("ROLL NUmber: " + i + " GRADE: " + grades.get(i));
		}
	}

}
