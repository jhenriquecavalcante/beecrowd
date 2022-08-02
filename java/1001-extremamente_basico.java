import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    int a, b, x;

    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    scanner.close();

    x = a+b;
    System.out.printf("X = %d\n", x);
  }
}
