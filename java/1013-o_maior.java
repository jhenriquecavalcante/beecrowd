import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) throws IOException {
    int a, b, c, maior;

    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    scanner.close();

    maior = (a+b+Math.abs(a-b))/2;
    maior = (maior + c + Math.abs(maior - c))/2;

    System.out.printf("%d eh o maior\n", maior);
  }
}
