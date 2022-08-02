import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    int number, hours;
    double value, salary;

    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt();
    hours = scanner.nextInt();
    value = scanner.nextDouble();
    scanner.close();

    salary = hours * value;
    System.out.printf("NUMBER = %d\n", number);
    System.out.printf("SALARY = U$ %.2f\n", salary);
  }
}
