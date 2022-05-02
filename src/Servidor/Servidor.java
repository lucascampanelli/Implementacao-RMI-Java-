
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author lucas
 */
public class Servidor {
    
    public static void main(String[] args){
        
        try{
            // Instanciando
            HelloImpl obj = new HelloImpl();
            
            // Exportando o objeto para o stub
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
            
            // Binding o objeto remoto (stub) no registro
            // Responde ao lookup do cliente, que procura por um serviço Hello
            Registry registry = LocateRegistry.createRegistry(18000);
            registry.rebind("Hello", stub);
            
            System.out.println("Servidor pronto");
        } catch(Exception e){
            System.out.println("Exceção do Servidor: " + e.toString());
            e.printStackTrace();
        }
        
    }
    
}
