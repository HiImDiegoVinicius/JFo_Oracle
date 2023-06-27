import java.util.Scanner;

public class JFO_6_1_DisplayMultiples {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Digite um número: ");
        int number = input.nextInt();
        
        
        for (int i = 1; i <= 12; i++) {
        	System.out.println(number + "x" + i + "=" + number * i);
        }
        
        input.close();
	}

}

