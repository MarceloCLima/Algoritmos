
package retorno;

import java.util.Random;






public class Ex2 {
    
    //Faça uma função para gerar números aleatórios. 
    //Esta função deve receber um número inteiro como limite de valor e retornar um número entre 1 e esse limite. 
    //Assim, toda vez que você precisar de um número qualquer pode usar a função do exercício anterior ou a deste.

    
    public static int NumerosAleatorios(){
        
        Random r = new Random();
        
        int n = r.nextInt(5);
        
        System.out.println(n);
        
        return NumerosAleatorios();
        
    }

    
    public static void main(String[] args) {
        
    }
    
}
