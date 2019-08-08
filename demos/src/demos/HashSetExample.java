package demos;

import java.util.Comparator;
import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

class Student{
	private String name;
	private int rollNumber;
 
    public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getRollNumber() {
		return rollNumber;
	}
 
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
	
        
}

class studentComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRollNumber() == o2.getRollNumber()) {
			return 0;
		}else
			return 1;
	}
	
}

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> students = new TreeSet<>(new studentComp());
		
		students.add(new Student("Chetana",1));
		students.add(new Student("Mohan", 2));
		students.add(new Student("Disha", 1));
		students.add(new Student("Diksha",5));
				
		Iterator<Student> s = students.iterator();
		while(s.hasNext()) {
			System.out.println(s.next().toString());
			
		}
		
		
	}

}
