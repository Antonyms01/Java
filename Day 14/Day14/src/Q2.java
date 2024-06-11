//Question
//
//define a class Student 
//	rollno
//	name
//	age
//	marks
//
//	parameterized constructor 
//	getter methods
//
//	create 5 objects and store them inside list.
//
//	using java8 stream api:
//
//	1) find out name starts with 's'
//
//		hint:- use "filter" to check names start with "s" and "forEach" method to display all those names.
//
//	
//	2) how many students got more than 70
//
//		hint: use "filter" and "count"
//
//	3) how many students in between age 22 and 25
//
//		hint: use "filter" and "count"

import java.util.ArrayList;
import java.util.List;

class Student
{
	int rollno;
	String name;
	int age;
	int marks;
	
	
	public Student(int rollno, String name, int age, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}
		
public class Q2 {
	public static void main(String[] args) {
		List<Student>list=new ArrayList<Student>();
		
		Student s1=new Student(1,"Sohan",22,90);
		Student s2=new Student(2,"Rohan",22,92);
		Student s3=new Student(3,"Mohan",24,95);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		

		
		list.stream().filter(s->s.getName().equals("s")).forEach(System.out::println);
		System.out.println(list.stream().mapToInt(t->t.getAge()).average().getAsDouble());
		System.out.println(list.stream().filter(q->q.getMarks()>75).count());
		System.out.println(list.stream().filter(p->p.getAge()>=21 && p.getAge()<=26).count());
		
		
		
	}

}
