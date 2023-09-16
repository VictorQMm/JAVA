package JAVA.Conceitos.Arrays;

public class array1 {
  public static void main(String[] args) {

// Valore de inicialização para os arrays.
// byte, short, int, long, float e double = 0
// char = '\u0000'
// boolean = false
// String = null

    String[] nomes = new String[3];
  
    nomes[0]= "Goku";
    nomes[1]= "Kirito";
    nomes[2]= "Luffy";

    for (int i = 0; i < nomes.length; i++) {    // .length --> Retorna o tamanho do array
      System.out.println(nomes[i]);
    }

  }
}
