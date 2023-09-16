package JAVA.Conceitos.Arrays;

public class foreach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = { 1, 2, 3, 4, 5 };
        int[] numeros3 = new int[] { 5, 4, 3, 2, 1 };

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for(int num : numeros3){              //foreach ---> for simplificado, esse for não acessa os indices.
            System.out.println(num);
        }

    }
}
