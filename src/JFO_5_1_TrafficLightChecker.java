import java.util.Scanner;
public class JFO_5_1_TrafficLightChecker {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Digite a cor atual: ");
        int currentColor = input.nextInt();
        
        if (currentColor == 1) {
        	System.out.printf("Próxima cor é verde");
        } else if (currentColor == 2) {
        	System.out.printf("Próxima cor é amarelo");
        } else if (currentColor == 3) {
        	System.out.printf("Próxima cor é vermelho");
        } else {
        	System.out.printf("Cor inválida");
        }
        
        System.out.printf("\n");
        
        switch (currentColor) {
	        case 1:
		        	System.out.printf("Próxima cor é verde"); break;
	        case 2:
		        	System.out.printf("Próxima cor é amarelo"); break;
	        case 3:
		        	System.out.printf("Próxima cor é vermelho"); break;
	        default:
		        	System.out.printf("Cor inválida"); break;
	     }

        input.close();
	}

}

