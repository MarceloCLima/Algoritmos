
package retorno;


public class AulaSeguinte {

    
    public static int conectarBD() {
        // Códigos de conexão...
        //...
        System.out.println("Conectado ao BD Tal.");
        
        return 57843;
        
    }
    
    public static void inserir(String nome, int id){
        // Comandos para inserir os dados
        //...
        System.out.println("Dados inseridos!");
    }
    
    public static void atualizar(int id, String nome){
        // Comandos para atualizar os dados
        //...
        System.out.println("Dados atualizados!");
    }
    
    public static String[] selecionar(String tabela){
        // Comandos para selecionar
        //...
     String[] lista = new String[10];
     
     // Só de exemplo
     lista[0] = "Amauri";
     //...
     
     return lista;
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Rodando...");
        
        double r = Math.sqrt(148);
        
        System.out.println("Resultado: " + r);
    }
    
}
