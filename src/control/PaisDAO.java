
package control;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pais;
import util.ConexaoBD;

/**
 *
 * @author Aluno
 */
public class PaisDAO {
    private Connection conexao;
    
    public PaisDAO(){
        this.conexao =  ConexaoBD.Conector();
    }
    
    public void inserirPais(Pais p)throws Exception{
        String sql = "insert into TB_Pais (nomeTB_Pais, siglaTB_Pais, digitosTB_Pais)"
                                            + "values (?,?,?)"; 
                
        try {
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getSigla());
            pst.setInt(3, p.getDigito());
            
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Pais inserido com sucesso");
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE PAIS DAO");
            System.err.println("\nERRO NO MÉTODO inserirPais");
            System.err.println("\nCAUSA: " + e.getCause());
            System.err.println("\nMENSAGEM " + e.getMessage());
            e.printStackTrace();
            System.err.println("\n============================================");
            throw new RuntimeException(e);              
        }
    }
    
    public Pais lerPais(String nome){ 
        String sql = "select * from TB_Pais where nomeTB_Pais like '"+nome+"%';";
        try {
            Pais c = new Pais();
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            c.setId(rs.getInt("idTB_Pais"));
            c.setNome(rs.getString("nomeTB_Pais"));
            c.setSigla(rs.getString("siglaTB_Pais"));
            c.setDigito(rs.getInt("digitosTB_Pais"));
              
            rs.close();
            pst.close();
            }
            else {
                JOptionPane.showMessageDialog(null, "Erro na busca");
            }
            return c;
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE PAIS DAO");
            System.err.println("\nERRO NO MÉTODO lerPais");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }       
    }
    
    public ArrayList<Pais> lerPaises(){
        String sql = "select * from TB_Pais";
        
        try{
            ArrayList<Pais> paises = new ArrayList<>();
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Pais p = new Pais();
                p.setId(rs.getInt("idTB_Pais"));
                p.setNome(rs.getString("nomeTB_Pais"));
                p.setSigla(rs.getString("siglaTB_Pais"));
                p.setDigito(rs.getInt("digitosTB_Pais"));
                
                paises.add(p);
                
            }
            pst.close();
            rs.close();
            
            return paises;
            
            }catch(Exception e){
                System.err.println("\n============================================");
                System.err.println("\nCLASSE PAIS DAO");
                System.err.println("\nERRO NO MÉTODO lerPaises");
                System.err.println("\n " + e.getCause());
                System.err.println("\n " + e.getMessage());
                System.err.println("\n============================================");
                throw new RuntimeException(e);     
        }
    }
    
    public void alterarPais(Pais c) throws Exception{
        String nome = c.getNome();
        String sql = "update TB_Pais set digitosTB_Pais = ? where nomeTB_Pais like '"+nome+"%';";
        try {
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            
            pst.setInt(1, c.getDigito());
            
            pst.execute();
            pst.close();
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE PAIS DAO");
            System.err.println("\nERRO NO MÉTODO alterarPais");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
    }
    
    public void excluirPais(String nome){
        String sql = "delete from TB_Pais where nomeTB_Pais like '"+nome+"%';";
        
        try {
            PreparedStatement pst = this.conexao.prepareStatement(sql);
            pst.execute();
            pst.close();
        } catch (Exception e) {
            System.err.println("\n============================================");
            System.err.println("\nCLASSE PAIS DAO");
            System.err.println("\nERRO NO MÉTODO excluirPais");
            System.err.println("\n " + e.getCause());
            System.err.println("\n " + e.getMessage());
            System.err.println("\n============================================");
            throw new RuntimeException(e);            
        }
    }

}
