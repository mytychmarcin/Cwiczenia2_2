import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("podaj pierwsza liczbe: ");
    int a = scanner.nextInt();

    System.out.print("podaj druga liczbe: ");
    int b = scanner.nextInt();

    System.out.print("podaj trzecia lizcbe: ");
    int c = scanner.nextInt();
    int max = a;

    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    scanner.close();
    System.out.println("najwieksza: " + max);

  }
}