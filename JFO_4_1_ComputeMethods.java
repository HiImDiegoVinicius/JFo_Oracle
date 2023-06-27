import java.util.Random;

public class JFO_4_1_ComputeMethods {
    public double fToC(double degreesF) {
        return ((double) 5 / 9) * (degreesF - 32);
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int roll() {
        Random random = new Random();
        return (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
    }
}