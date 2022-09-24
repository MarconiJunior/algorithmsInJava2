import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
int greaterValue;
int lowerValue;
int value;
int value1;


value1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor " + (1) + ":"));
value = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor " + (2) + ":"));

if (value1 - value <= 0) {
greaterValue = value;
}
else {
greaterValue = value1;
}

if (value1 - value > 0) {
lowerValue = value;
}
else {
lowerValue = value1;
}

for(int i = 0; i < 18; i++) {
value = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor " + (i + 3) + ":"));
if (greaterValue - value <= 0) {
greaterValue = value;
}
if (lowerValue - value > 0) {
lowerValue = value;
}
}

System.out.println("Maior valor: " + greaterValue);
System.out.println("Menor valor: " + lowerValue);
  }
}
