import java.util.Scanner;

public class ProblemS3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o nome de uma cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite um lugar: ");
        String lugar = scanner.nextLine();

        System.out.print("Digite um verbo no infinitivo: ");
        String verbo = scanner.nextLine();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite um número decimal: ");
        double decimal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite uma cor: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o nome de um animal: ");
        String animal = scanner.nextLine();

        System.out.print("Digite um objeto: ");
        String objeto = scanner.nextLine();

        // Calcular o quadrado do número
        int dobronumero = numero * 2;

        // Calcular o dobro do número decimal
        double metadedecimal = decimal / 2;

        System.out.printf("\nEm uma cidade chamada %s, vivia %s %s.\n", cidade, nome, sobrenome);
        System.out.printf("Haviam rumores da existencia de um sombra misteriosa andando na(o) %s. Os boatos diziam que essa sombra era enorme e fazia um barulho estranho.\n", lugar);
        System.out.printf("Em um dia de sol, %s resolveu caminhar na(o) %s para desvendar esse mistério. %s era especialista em %s e estava doido para usar suas habilidades. Empolgada(o) ela(e) monta uma mochila cheia de coisas e sai para sua jornada.\n", nome, lugar, nome, verbo);
        System.out.printf("Após uma longa caminhada os barulhos começaram a surgir... O clima ficou tenso... %s tremia enquanto olhava para todos os lados a procura de uma sombra.\n", nome);
        System.out.printf("Até que uma sombra alta e grande vem de suas costas e cobre toda a luz que estava na frente... %s tira um(a) %s sua mochila começa a virar para trás devagar e não acredita no que vê...\n", nome, objeto);
        System.out.printf("A tal sombra misteriosa era um animal! Um(a) %s %s! Mas... %s não estava com mais medo, estava com pena.\n", animal, cor, nome);
        System.out.printf("A(o) %s estava ferida(o)... %s contou suas feridas e deram %d! Precisava de um veterinário logo!\n", animal, nome, numero);
        System.out.printf("Chegando no consultório mais perto, a Doutora que atendeu o animal diz que estava mais ferido do que %s contou, na verdade a(o) %s %s estava com %d feridas.\n", nome, animal, cor, dobronumero);
        System.out.printf("O tempo passou e a(o) %s estava curada(o). Isso foi um alívio para %s, que logo depois lembrou de uma coisa importante que estava esquecendo. Hoje era sua prova de Química!\n", animal, nome);
        System.out.printf("Não pensando duas vezes %s foi correndo para sua sala de aula, mas ja era tarde demais... Ela(e) contou toda a história para seu professor esperando que ele entendesse a situação.\n", nome);
        System.out.printf("Porém, o professor fechou a cara e disse que estava muito decepcionado. Não acreditou na hisória de %s e por achar mentiras um absurdo abaixou sua nota %.2f para %.2f\n", nome, decimal, metadedecimal);
        System.out.print("FIM");

        scanner.close();
    }  
}