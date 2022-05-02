/**
 *
 * @author lucas
 */

// Implementando a interface remota
public class HelloImpl implements Hello {
    
    // Implementação do método printMsg da interface pelo servidor
    @Override
    public void printMsg() {
        System.out.println("[UAM - SD] Este é um programa de RMI");
    }
}
