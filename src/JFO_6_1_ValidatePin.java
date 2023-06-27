import java.util.Scanner;
public class JFO_6_1_ValidatePin {
    public static void main(String[] args){
        int Validatepin = 7845;

        System.out.print("Digite o PIN: ");
        Scanner input = new Scanner(System.in);
        int pin;

        do {
            System.out.print("Digite o PIN: ");
            pin = input.nextInt();

            if (pin != Validatepin) {
                System.out.println("PIN inválido. Tente novamente.");
            }
        } while (pin != Validatepin);
        System.out.println("PIN válido");


        input.close();
	}

}

