
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author lucas
 */
public class Cliente {
    
    private Cliente(){
    }
    
    public static void main(String args[]){
        try{
            
            // Pegando o registro
            Registry registry = LocateRegistry.getRegistry("localhost", 18000);
            
            // Procurando por um registro que utilize a Interface Hello
            Hello stub = (Hello) registry.lookup("Hello");
            
            // Chamando o método remoto
            stub.printMsg();
        
        } catch(Exception e){
            System.out.println("Exceção do Cliente: " + e.toString());
            // Semelhante ao console.log
            e.printStackTrace();
        }
    }
}
