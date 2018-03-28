
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
    
    
    public void inserirCliente(Cliente c) throws Exception {
        if(clientes.contains(c) || c.getNome().length() < 5){
            throw new Exception("NOME INCORRETO OU JA CADASTRADO.");
        }
        clientes.add(c);
    }
    
    public ArrayList<Cliente> list(){
        return clientes;
    }
}
