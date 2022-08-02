import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    int a, b, c, d, diferenca;

    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    d = scanner.nextInt();
    scanner.close();

    diferenca = (a * b - c * d);
    System.out.printf("DIFERENCA = %d\n", diferenca);
  }
}
