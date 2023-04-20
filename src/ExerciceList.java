import java.util.Scanner;

public class ExerciceList {
    public static void main(String[] args) {
//        EX1
        int g_numeros1 = (8 + 9 + 7) / 3;
        int g_numeros2 = (4 + 5 + 6) / 3;

        System.out.println("A media dos dos grupos 1 e 2 sao: " + g_numeros1 + " | " + g_numeros2);

        int soma_media = (g_numeros1 + g_numeros2) / 2;

        System.out.print("A media das medias e: " + soma_media);

//        EX2
        System.out.println("Informe um saldo, para calcular o com um reajuste de 1%: ");
        Scanner sc = new Scanner(System.in);
        int saldo = sc.nextInt();

        int reajusteCalc = (saldo * 1) / 100;
        int saldoReajuste = saldo + reajusteCalc;

        System.out.println("O valor do reajuste: " + saldoReajuste);

//         EX3
        double salarioMinimo = 788.00;
        double salarioUsuario, qtdSalarios;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: R$ ");
        salarioUsuario = input.nextDouble();

        qtdSalarios = salarioUsuario / salarioMinimo;

        System.out.printf("Você ganha %.2f salários mínimos.%n", qtdSalarios);

        System.out.println("Informe um numero e iremos te mostrar seu antecessor: ");
        int numero = sc.nextInt();

        int numero_anterior = numero - 1;
        System.out.println(numero_anterior);
    }
}
