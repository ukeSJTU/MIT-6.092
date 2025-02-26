public class GravityCalculator {
    public static void main(String[] args) {
        double a=9.81,v_i=3, x_i=5;
        double t = 0.001;
        double x = 0.5*a*t*t+v_i*t+x_i;
        System.out.println("The position of the falling object at time t = " + t + " seconds is: " + x + " meters.");
    }
}
