public class JFO_4_1_TestClass {
    public static void main(String[] args) {
        JFO_4_1_ComputeMethods computeMethods = new JFO_4_1_ComputeMethods();
        //Create an instance of ComputeMethods,
        //invoke the 3 methods and display their results
        System.out.println("Temp in celsius is " + computeMethods.fToC(100.4));
        System.out.println("Hypotenuse is " + computeMethods.hypotenuse(6, 9));
        System.out.println("The sum of the dice values is " + computeMethods.roll());
    }
}

