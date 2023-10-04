package educ;

public class Joystring
{
    public void joystring(String s, char ch1, char ch2) {
        String newStr = s.replace(ch1, ch2);
        System.out.println(newStr);
    }
    
    public void joystring(String s) {
        int f = s.indexOf(' ');
        int l = s.lastIndexOf(' ');
        System.out.println("First index:  " + f);
        System.out.println("Last index:  " + l);
    }
    
 
    
    public static void main(String args[]) {
        Joystring j=new Joystring();
        j.joystring("TECHNALAGY", 'A', 'O');
        j.joystring("hello everyone all doing well");
      
    }
}
