
package control;

import static java.lang.System.exit;
import java.sql.Connection;
import java.util.ArrayList;
import model.Cliente;
import util.ConexaoBD;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    private Connection conexao;
    
    public ClienteDAO(){
        this.conexao =  ConexaoBD.Conector();
    }
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    
    public void inserirCliente(Cliente c) throws Exception {
        
        String sql = "insert into TB_Cliente (nomeTB_Cliente, idadeTB_Cliente, telefoneTB_Cliente, "
                                                + "TB_Pais_idTB_Pais values (?,?,?,?)"; 
                
        
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
    
    public void alterarCliente(Cliente c) throws Exception{
        Cliente alt = lerCliente(c.getNome());
        alt.setIdade(c.getIdade());
        alt.setTelefone(c.getTelefone());
        alt.setIdade(c.getIdade());
        alt.setPais(c.getPais());
    }
    
    public void excluirCliente(String nome){
        for(int i = 0; i < clientes.size() ; i++){
            if(clientes.get(i).getNome().equals(nome)){
               clientes.remove(clientes.get(i));
            }
            
        } 
    }
    
    public ArrayList<Cliente> listarClientes(){
        return clientes;
    }
}
