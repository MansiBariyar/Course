package educc;
public class VariableDemo1
{
int instancevar;
static int staticvari;  //only once on class load
static {
	staticvari=0;
}
  VariableDemo1(){
	instancevar=0; 
}

 void updateData() {
	instancevar++; //0
	staticvari++;  //1
	System.out.println("instancevar="+instancevar); //1
	System.out.println("staticvari="+staticvari);  //1
}
	
	public static void main(String[] args) {
		VariableDemo1 ob1=new VariableDemo1();
		 ob1.updateData();
		VariableDemo1 ob2=new VariableDemo1();
       
        ob2.updateData();
	}

}
