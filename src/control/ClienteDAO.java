
package control;

import static java.lang.System.exit;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    
    public void inserirCliente(Cliente c) throws Exception {
        if(clientes.contains(c) || c.getNome().length() < 5){
            throw new Exception("NOME INCORRETO OU JA CADASTRADO.");
        }
        clientes.add(c);
    }
    
    public Cliente lerCliente(String nome){ 
        for(int i = 0; i < clientes.size() ; i++){
            if(clientes.get(i).getNome().equals(nome)){
                return clientes.get(i);
            }
        } 
        return null;        
    }
    
    public void alterarCliente(Cliente c){
        lerCliente(c.getNome());
        
        
    }
    public void excluirCliente(){
        
    }
    
    public ArrayList<Cliente> listarClientes(){
        return clientes;
    }
}
