import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    int N;
    N = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número, por favor."));
    for (int i = 0; i <= N; i++) {
        System.out.println(i);
      }
  }
}
