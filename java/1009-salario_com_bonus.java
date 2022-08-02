import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    String nome;
    double salario, vendas, total;

    Scanner scanner = new Scanner(System.in);
    nome = scanner.nextLine();
    salario = scanner.nextDouble();
    vendas = scanner.nextDouble();
    scanner.close();

    total = salario + (vendas * .15);
    System.out.printf("TOTAL = R$ %.2f\n", total);
  }
}
