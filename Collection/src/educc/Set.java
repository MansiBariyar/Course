package educc;

import java.util.Comparator;
import java.util.TreeSet;

class Student{
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}
class SortId implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.sid>s2.sid) 
			return 1;
		else if(s1.sid<s2.sid)
		
		return -1;
		else 
			return 0;
	}
	
}

public class Set {

	public static void main(String[] args) {
		TreeSet<Student> streeset =new TreeSet<Student>(new SortId());
		
		Student s1=new Student(1, "Akash", 45000);
		Student s2=new Student(10, "Kiran", 55000);
		Student s3=new Student(3, "Mohd", 65000);
		Student s4=new Student(11, "Sasikanth", 95000);
		
		streeset.add(s1);
		streeset.add(s2);
		streeset.add(s3);
		streeset.add(s4);
		
		System.out.println(streeset); //o/p

	}
}