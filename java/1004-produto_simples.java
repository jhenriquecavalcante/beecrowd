import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    int a, b, prod;

    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    scanner.close();

    prod = a * b;
    System.out.printf("PROD = %d\n", prod);
  }
}
