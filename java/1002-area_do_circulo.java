import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    double area, raio, pi = 3.14159;

    Scanner scanner = new Scanner(System.in);
    raio = scanner.nextDouble();
    scanner.close();

    area = pi * (raio*raio);
    System.out.printf("A=%.4f\n", area);
  }
}
