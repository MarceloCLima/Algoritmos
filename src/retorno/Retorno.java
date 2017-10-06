package retorno;

public class Retorno {

    public static void quadrado(double n) {
        double r = n * n;
    }
    
    public static double metade(double v){
        double r = v/2;
        return r;
    }

    public static void main(String[] args) {

        // Calculando a raiz quadrada
        double raiz;

        System.out.println("raiz: " + Math.sqrt(15));
        
        quadrado(15);

        System.out.println("Metade: " + metade(15));
        

    }

}
