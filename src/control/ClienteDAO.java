
package control;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pais;
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
    
    
    public void inserirCliente(Cliente c) throws Exception {
        
        String sql = "insert into TB_Cliente (nomeTB_Cliente, idadeTB_Cliente, limiteTB_Cliente,"
                        + "telefoneTB_Cliente, TB_Pais_idTB_Pais) values (?,?,?,?,?)"; 
        try{
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            
            pst.setString(1, c.getNome());
            pst.setInt(2, c.getIdade());
            pst.setDouble(3, c.getLimite());
            pst.setString(4, c.getTelefone());
            pst.setInt(5, c.getPais().getId());

            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso");
        } catch(Exception e){
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
        String sql = "select * from TB_Cliente where nomeTB_Cliente like '"+nome+"';";
        try {
            Cliente c = new Cliente();
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            c.setNome(rs.getString("nomeTB_Cliente"));
            c.setIdade(rs.getInt("idadeTB_Cliente"));
            c.setLimite(rs.getDouble("limiteTB_Cliente"));
            c.setTelefone(rs.getString("telefoneTB_Cliente"));
            c.setPais((Pais) rs.getObject("TB_Pais_idTB_Pais"));
               
            rs.close();
            pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro na Busca");
            }
            return c;
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE CLIENTE DAO");
            System.err.println("\nERRO NO MÉTODO lerCliente");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
    }

    public ArrayList<Cliente> lerClientes(){
        String sql = "select * from TB_Cliente inner join TB_Pais on idTB_Pais = idTB_Cliente";
        
        try {
            ArrayList<Cliente> clientes = new ArrayList<>();
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                
                c.setNome(rs.getString("nomeTB_Cliente"));
                c.setIdade(rs.getInt("idadeTB_Cliente"));
                c.setLimite(rs.getDouble("limiteTB_Cliente"));
                c.setTelefone(rs.getString("telefoneTB_Cliente"));
                
                Pais p = new Pais();
                p.setId(rs.getInt("idTB_Pais"));
                p.setNome(rs.getString("nomeTB_Pais"));
                p.setSigla(rs.getString("siglaTB_Pais"));
                p.setDigito(rs.getInt("digitosTB_Pais"));
                
                c.setPais(p);
                
                clientes.add(c);
            }
            pst.close();
            rs.close();
            
            return clientes;
            
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE CLIENTE DAO");
            System.err.println("\nERRO NO MÉTODO lerClientes");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
    }
    
    public void alterarCliente(Cliente c) throws Exception{
        String nome = c.getNome();
        String sql = "update TB_Cliente set idadeTB_Cliente = ?, telefoneTB_Cliente = ?, TB_Pais_idTB_Pais = ?" 
                    + "where nomeTB_Cliente like 'nome%';";
        try {
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            
            pst.setInt(1, c.getIdade());
            pst.setDouble(2, c.getLimite());
            pst.setString(3, c.getTelefone());
            pst.setObject(4, c.getPais());
            
            pst.execute();
            pst.close();
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE CLIENTE DAO");
            System.err.println("\nERRO NO MÉTODO alterarCliente");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
    }
    
    public void excluirCliente(String nome){
        String sql = "delete from TB_Cliente where nomeTB_Cliente like nome%;";
        
        try {
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            pst.execute();
            pst.close();
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE CLIENTE DAO");
            System.err.println("\nERRO NO MÉTODO excluirCliente");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
    }
    
}
