package edud;

public class App1 {
    public int countAm(String str) {
        
        String lowercaseStr = str.toLowerCase();
        
        int count = 0;
        int index = lowercaseStr.indexOf("am");
        
        while (index != -1) {
            count++;
            index = lowercaseStr.indexOf("am", index + 2);
        }
        
        return count;
    }

    public static void main(String[] args) {
        App1 amsterdam = new App1();
        String str = "Am in Amsterdam am 17";
        int result = amsterdam.countAm(str);
        System.out.println(result);
    }
}