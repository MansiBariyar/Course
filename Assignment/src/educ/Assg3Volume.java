package educ;

public class Assg3Volume
{
    double volume(double R) {
        double vol = (4/3) * (22/7) * R * R * R;
        return vol;
    }
    
    double volume(double H, double R) {
        double vol = (22/7) * R * R * H;
        return vol;
    }
    
    double volume(double L, double B, double H) {
        double vol = L * B * H;
        return vol;
    }
    
    public static void main(String args[]) {
        Assg3Volume a = new Assg3Volume();
        System.out.println("Sphere Vol = " + a.volume(4));
        System.out.println("Cylinder Vol = " + a.volume(5,2.5));
        System.out.println("Cuboid Vol = " + a.volume(8.1,3.2,2));
    }
}