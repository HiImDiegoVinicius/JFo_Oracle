// Diego Vinicius 
// RA: 323134807
import java.util.*;
public class JFO_5_1_ColorRange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
        System.out.print("Digite o comprimento da onda: ");
        double wave = input.nextDouble();
        
        if (wave < 380) {
        	System.out.printf("Número invalido!");
        } else if (wave < 450) {
        	System.out.printf("Vilota");
        } else if (wave < 495) {
        	System.out.printf("Azul");
        } else if (wave < 570) {
        	System.out.printf("Verde");
        } else if (wave < 590) {
        	System.out.printf("Amarelo");
        } else if (wave < 620) {
        	System.out.printf("Laranja");
        } else if (wave < 750) {
        	System.out.printf("Vermelho");
        } else {
        	System.out.printf("Número invalido");
        }
        
        input.close();

	}

}

