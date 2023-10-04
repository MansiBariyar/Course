//14/06

package educc;

public class MainApp{
    int i , j, s;
    MainApp(){
         i=10;
         j=20;
   }
    void addNumbers(){
           s=i+j;
            System.out.println("sum="+s);
    }
    public static void main(String args[]){
    	MainApp obj=new MainApp();  //constructor
          System.out.println("i="+obj.i);
           System.out.println("i="+obj.j);
           
           obj.addNumbers();

   }
}