import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Tu quer converter C para F(1) ou F para C(2)?: ");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Temperatura em C: ");
                double celsius = scanner.nextDouble();
                scanner.nextLine();
                double fahrenheit = (celsius * 1.8) + 32;
                String s = celsius + " graus C para F:" + fahrenheit;
                System.out.println(s);
            } else if (resposta.equals("2")) {
                System.out.println("Temperatura em F: ");
                double f = scanner.nextDouble();
                scanner.nextLine();
                double c = (f - 32) / 1.8;
                String n = f + " Graus F para C: " + c;
                System.out.println(n);
            } else {
                System.out.println("Opção inválida");
            }

            System.out.println("Quer converter outra? S ou N: ");
            continuar = scanner.nextLine();
        }
        System.out.println("flw cpx tmj");
        scanner.close();
    }
}
