
package control;

import static java.lang.System.exit;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Aluno
 */
public class ControleCliente {
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    
    public void inserirCliente(Cliente c){
        int i = 0;
        while(clientes != null){
            if(c.getNome().equals(clientes.get(i).getNome()) || c.getNome().length() < 5){
                System.out.println("NOME INCORRETO OU JA CADASTRADO.");
                exit(0);
            }
            
            i++;    
        }
        clientes.add(c);
    }
    
    public ArrayList<Cliente> list(){
        return clientes;
    }
}
