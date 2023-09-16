package JAVA.POO.Calculadora;

public class calculadora {

    double valor_atual= 0;              // x

    //soma
    
    double soma (double p1, double p2){             // 2 parâmetros
    this.valor_atual = p1 + p2;                                        //return -->> Retornando o valor da soma
    return this.valor_atual;
    }
double soma (double valor_atual){                   // 1 parâmetro
    this.valor_atual = this.valor_atual + p;                                       // this retorna a x, this é uma boa prática
    return this.valor_atual;

}

void clean(){
    this.valor_atual = 0;
}

             

    //subtração

    double subtracao (double p1, double p2){            
    this.valor_atual = p1 - p2;                                  
    return this.valor_atual;
    }
double subtracao (double valor_atual){                   
    this.valor_atual = this.valor_atual - p;                                      
    return this.valor_atual;

}

void clean(){
    this.valor_atual = 0;
}

}