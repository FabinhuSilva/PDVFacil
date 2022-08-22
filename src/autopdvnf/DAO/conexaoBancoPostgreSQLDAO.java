
package autopdvnf.DAO;

import autopdvnf.VO.conexaoBancoPostgreSQLVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fabinhu
 */
public class conexaoBancoPostgreSQLDAO extends conexaoBancoPostgreSQLVO {
    
    
    public void conexao(){
    
    try
        {
            Class.forName(getDriver());
            Connection con = null;
            con = DriverManager.getConnection(getCaminhoCompleto(),getUsuario(), getSenha());
            System.out.println("Conexão realizada com sucesso.");

        }
            catch (ClassNotFoundException ex)
                    {
                        System.err.print(ex.getMessage());
                    }
            catch (SQLException e)
                    {
                        System.err.print(e.getMessage());
                    }
        } 

    private String getDriver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
