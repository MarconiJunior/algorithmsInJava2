import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    int N;
    N = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número, por favor."));
    int soma = 0;
    for (int i = 0; i <= N; i++) {
      soma = soma + i;
      }
    JOptionPane.showMessageDialog(null, "A soma dos valores entre 1 e " + N + " é: " + soma);
  }
}
