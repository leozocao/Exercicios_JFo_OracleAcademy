import java.util.Scanner;

public class ProblemS4_2ProcessName {
        public static void main(String[] args) {    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Type your name (nome + sobrenome):  ");
    String nomeSobrenome = teclado.nextLine();
    
    int spaceIndex = nomeSobrenome.indexOf(' ');
    String nome = nomeSobrenome.substring(0, spaceIndex);
    String sobrenome = nomeSobrenome.substring(spaceIndex + 1);
    
    String nomeFormatado = sobrenome + ", " + nome.charAt(0) + ".";
    
    System.out.println("Your name is: " + nomeFormatado);

    teclado.close();

    }
     
}