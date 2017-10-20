package retorno;

import java.util.Scanner;

public class Atividade09 {

    //Crie uma função para pedir um número inteiro ao usuário. 
    //Toda vez que você precisar de um número informado pelo usuário, utilize ela. 
    //Ela não tem parâmetro e o retorno é o valor digitado pelo usuário.
    
    public static int PedirNumero() {

        Scanner e = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int num = e.nextInt();

        return num;
    }

    public static void main(String[] args) {
        
        int i = PedirNumero();
        System.out.println("O numero digitado é:");

    }

}
