

import javax.swing.JOptionPane;

public class JFO_3_1{
    public static void main(String[] args){
      String name = JOptionPane.showInputDialog("Qual o seu nome");
      int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
      double Altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?"));
      String sonho = JOptionPane.showInputDialog("Qual o seu sonho?");

      int anoAtual = 2023;
      int anoNAscimento =  anoAtual - idade;
      double imc = peso / (Altura * Altura);

      String anoNascimentoJO1 = Integer.toString(anoNAscimento);
      String anoNascimentoJO2 = Integer.toString(anoNAscimento - 1);
      String imcJO1 = Double.toString(imc);

      JOptionPane.showMessageDialog(null, "Você já fez aniversário esse ano?");
      int choice1 = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1 Sim\n 2 Não"));
      if(choice1 == 1){
      JOptionPane.showMessageDialog(null,"Nascido em: " + anoNascimentoJO1);
      }if (choice1 == 2) {
        JOptionPane.showMessageDialog(null,"Nascido em: " + anoNascimentoJO2 );
      }else {JOptionPane.showMessageDialog(null, "Escolha inválida", null, 0);}

      JOptionPane.showMessageDialog(null, "Em um lugar distante vivia um(a) garoto(a) chamado " + name + "\nde  " + idade + " anos");
      JOptionPane.showMessageDialog(null, "ele(a) têm  " + Altura + " de altura e pesa  " + peso + "Kg e seu IMC é de  " + imcJO1 + " Seu sonho é:  " + sonho + "  logo esse sonho será realizado.");


      }
      
       

    }


    

