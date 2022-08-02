import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    double a, b, c, media;

    Scanner scanner = new Scanner(System.in);
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();
    scanner.close();

    media = ((a*2) + (b*3) + (c*5)) / 10;
    System.out.printf("MEDIA = %.1f\n", media);
  }
}
