import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    double pi = 3.14159, raio, volume;

    Scanner scanner = new Scanner(System.in);
    raio = scanner.nextDouble();
    scanner.close();

    volume = (4.0/3.0)*pi*(raio*raio*raio);

    System.out.printf("VOLUME = %.3f\n", volume);
  }
}
