package JAVA.Conceitos;

public class classeCachorro {               // Classe
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;


public void comer(){}                        // Método -> | publico "public" | Sem retorno "void" | () não faz nada.


public void latir(){                        // Método -> | publico "public" | Sem retorno "void" | () não faz nada.
    System.out.println("AU AU");
}

public String pegar(){                      // // Método -> | publico "public" | Retorno = String | () não faz nada.
    return "Bolinha";
}

public String interagir(String acao){           // Método -> | publico "public" | Retorno = String | Retorna a ação.

    switch(acao){
        case "carinho": this.estadoDeEspirito = "Feliz";
        break;
        case "vai dormir": this.estadoDeEspirito = "Bravo";
        break;
        default: this.estadoDeEspirito = "Neutro";
        break;
    }

    return this.estadoDeEspirito;  


   // if(acao.equals("carinho")){             // .equals -> Compara as Strings
//
   //     this.estadoDeEspirito = "Feliz";               // this. -> Esse
//
   // }else if(acao.equals("vai dormir")){
   //     this.estadoDeEspirito = "Bravo";
//
   // }else{
   //     this.estadoDeEspirito = "Neutro";
   // }                   
    
}
}
