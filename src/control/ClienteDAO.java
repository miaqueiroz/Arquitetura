
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
    
    public int lerCliente(String nome){ 
        for(int i = 0; i < clientes.size() ; i++){
            if(clientes.get(i).getNome().equals(nome)){
                return i;
            }
        } 
        return -1;        
    }
    
    public void alterarCliente(Cliente c, int id){
        this.clientes.get(id).setNome(c.getNome());
                
    }
    public void excluirCliente(){
        
    }
    
    public ArrayList<Cliente> listarClientes(){
        return clientes;
    }
}
