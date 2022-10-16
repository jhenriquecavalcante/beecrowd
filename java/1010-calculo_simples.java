import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    int codigo1, codigo2, numero1, numero2;
    double valor1, valor2, total;

    Scanner scanner = new Scanner(System.in);
    codigo1 = scanner.nextInt();
    valor1 = scanner.nextDouble();
    numero1 = scanner.nextInt();

    codigo2 = scanner.nextInt();
    valor2 = scanner.nextDouble();
    numero2 = scanner.nextInt();
    scanner.close();

    total = (valor1*numero1) + (valor2*numero2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
  }
}
