import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int base;
    int exp;
    System.out.println("Digite a base da sua exponênciação, por favor.");
    base = scan.nextInt();
    System.out.println("Digite o expoente da sua exponênciação.");
    exp = scan.nextInt();

    for (int i = 0; i < exp - 1; i++){
      base = base * exp;
    }
    System.out.println("O resultado da operação é: " +base);
  }
}
