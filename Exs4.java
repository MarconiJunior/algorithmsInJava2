import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int countJoao = 0;
    int countCleitinho = 0;
    int countPedro = 0;
    int countFausto = 0;
    int countNulo = 0;
    int countBranco = 0;
    List<Integer> voto = new ArrayList<>();
    while (true) {
      int candidato;
      System.out.println(
          "Aberta a votação para prefeito: \nDígite 1 para Joao do Bairro;\nDigite 2 para Cleitinho;\nDigite 3 para Pedro;\nDigite 4 para Fausto;\nDigite -1 para nulo;\nDigite -2 para branco;\nDigite 0 para encerrar a votação.");
      candidato = scan.nextInt();
      if (candidato == 1) {
        countJoao++;
      } else if (candidato == 2) {
        countCleitinho++;
      } else if (candidato == 3) {
        countPedro++;
      } else if (candidato == 4) {
        countFausto++;
      } else if (candidato == -1) {
        countNulo++;
      } else if (candidato == -2) {
        countBranco++;
      } else {
        break;
      }
    }
    voto.add(countJoao);
    voto.add(countCleitinho);
    voto.add(countPedro);
    voto.add(countFausto);
    System.out.println("A quantidade de votos para João do Bairro foi: " + countJoao);
    System.out.println("A quantidade de votos para Cleitinho foi: " + countCleitinho);
    System.out.println("A quantidade de votos para Pedro foi: " + countPedro);
    System.out.println("A quantidade de votos para Fausto foi: " + countFausto);
    System.out.println("A quantidade de votos nulos foi: " + countNulo);
    System.out.println("A quantidade de votos brancos foi: " + countBranco);
    if(countJoao > countCleitinho ||countJoao > countPedro || countJoao > countFausto ){
     System.out.println("O vencedor é João do Bairro com " + Collections.max(voto)+" votos");
    }else if(countCleitinho > countJoao ||countCleitinho > countPedro || countCleitinho > countFausto ){
     System.out.println("O vencedor é Cleitinho com " + Collections.max(voto) +" votos");
    }else if(countPedro > countJoao ||countPedro > countCleitinho || countPedro > countFausto ){
     System.out.println("O vencedor é Pedro com " + Collections.max(voto)+" votos");
    }else if(countFausto > countJoao ||countFausto > countCleitinho || countFausto > countPedro ){
     System.out.println("O vencedor é Fausto com " + Collections.max(voto)+" votos");
    }else{
      System.out.println("Não há vencedores.");
    }
  }
}
