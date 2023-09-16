package JAVA.Conceitos;

public class classeCachorro2 {
    public static void main (String[] args){
    
        classeCachorro cachorro1 = new classeCachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marron";
        cachorro1.altura = 25;              // objetos
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;
    

        cachorro1.latir();
        cachorro1.pegar();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
}
}