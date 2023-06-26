import java.util.Scanner;

public class ProblemS4_1TestClass {
    public static void main(String[] args) {

        ProblemS4_1ComputeMethods cm = new ProblemS4_1ComputeMethods();

        Scanner scanner = new Scanner(System.in);

       System.out.println("Temp in celsius is " + cm.fToC(100));

        System.out.println("Hypotenuse is " + cm.hypotenuse(5,5));

         System.out.println("The sum of the dice values is " + cm.roll());

         scanner.close();

    }
}