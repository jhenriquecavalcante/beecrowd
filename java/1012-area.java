import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    double a, b, c, pi = 3.14159;
    double tri, cir, tra, qua, ret;

    Scanner scanner = new Scanner(System.in);
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();
    scanner.close();

    tri = a*c/2;
    cir = pi*(c*c);
    tra = (a+b)*c/2;
    qua = b*b;
    ret = a*b;

    System.out.printf("TRIANGULO: %.3f\n", tri);
    System.out.printf("CIRCULO: %.3f\n", cir);
    System.out.printf("TRAPEZIO: %.3f\n", tra);
    System.out.printf("QUADRADO: %.3f\n", qua);
    System.out.printf("RETANGULO: %.3f\n", ret);
  }
}
