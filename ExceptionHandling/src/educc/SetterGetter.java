package educc;

class Student{
	private int sid;
	private String sname;
	
	
	public Student() {
		super();
		
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}


	
}

public class SetterGetter {

	public static void main(String[] args) {
		Student ob=new Student(34,"Manvi");
		System.out.println(ob);
		Student ob1=new Student();
		ob1.setSid(12);
		ob1.setSname("kiran");
		System.out.println(ob1);
	}

}
//mansi bariyar there are two many things are tharer
//eeytho1threre RE we rwe yur there raehere re many there      ////