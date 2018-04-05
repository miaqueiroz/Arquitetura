
package control;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
                
        try {
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setInt(2, c.getIdade());
            pst.setDouble(3, c.getLimite());
            pst.setString(4, c.getTelefone());
            pst.setObject(5, c.getPais());
           
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso");
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE CLIENTE DAO");
            System.err.println("\nERRO NO MÉTODO inserirCliente");
            System.err.println("\nCAUSA: " + e.getCause());
            System.err.println("\nMENSAGEM " + e.getMessage());
            e.printStackTrace();
            System.err.println("\n============================================");
            throw new RuntimeException(e);              
        }
    }
    
    public Cliente lerCliente(String nome){ 
        String sql = "select * from tbProduto where nomeTB_Cliente like 'nome'%";
        try {
            Cliente c = new Cliente();
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
           
            c.setNome(rs.getString("nomeTB_Cliente"));
            c.setIdade(rs.getInt("idadeTB_Cliente"));
            c.setLimite(c.getDouble("limiteTB_Cliente"));
            c.setTelefone(c.getString("telefoneTB_Cliente"));
            c.setObject(5, c.getPais());
                Produtos p = new Produtos();
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                //p.setCodBarras(Integer.parseInt(rs.getString("codBarras")));
                p.setCodBarras(rs.getInt("codBarras"));
                p.setCategoria(rs.getString("categoria"));
                
                vetProd.add(p);
            }
            rs.close();
            pst.close();

            return vetProd;
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE ControleProduto - DAO");
            System.err.println("\nERRO NO MÉTODO buscarProduto");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
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
