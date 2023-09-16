package JAVA.Conceitos;

public class exStr {
    public static void main(String ars[]) {

        String str = "Hello World";

        System.out.println(str.charAt(6));      // Retorna o caracter em uma determinada posição , (6) no caso.

        // ()  --> método

        System.out.println("aaa".compareTo("aab"));     // Mostra o o menor valor em ordem alfabética,  ira mostrar ("aaa").

        System.out.println("aaa" + "bbb");

        System.out.println(str.contains("ell"));       // Vê se tem caracteres eu uma palavra e vai retornat, true or false. ell em Hello = true

        System.out.println("imagem.png".endsWith(".exe"));

        System.out.println(str.hashCode());

        System.out.println(str.indexOf("o", 5));  // Retorna o numero do indice da palavra ou letra

        System.out.println(" ".isBlank()); // Sem nd, caracter espaço em branco?

        System.out.println(" ".isEmpty()); // Tamanho = 0?

        System.out.println(str.length());

        System.out.println(str.repeat(5)); // repetir a String.

        System.out.println(str.replace("World", "Java")); // substituir ou colocar uma palavra no meio de repetições.

        String arr[] = str.split(" "); // Separa um caracter , ou string. 

        System.out.println(arr[0]);

        System.out.println(arr[1]);

        System.out.println(str.startsWith("Java")); // true para palavras iguais, false para palavras diferentes.

        System.out.println(str.substring(3, 7)); // pegou a 3 a 7 sem incluir a ultima. Ou seja a saida vai ser "lo W", 3° posição até a 7°.

        char arr_chars[] = str.toCharArray(); // Transforma a string em um array de caracter. Cada caracter fica separado 'H''e''l''l''o' 'W''o''r''l''d'

        for (int i = 0; i < arr_chars.length; i++) {
            System.out.println(arr_chars[i]);
        }

        System.out.println(str.toUpperCase()); // Transforma em Letra maiúscula

        System.out.println(str.toLowerCase()); // Transforma em Letra minúscula

        System.out.println(str.Equals("AAA")); // Transforma em Letra minúscula

    
    }
}