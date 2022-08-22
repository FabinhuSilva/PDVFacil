
package autopdvnf;

import autopdvnf.DAO.atualizaTabelasDAO;
import autopdvnf.DAO.executandoThreads;
import autopdvnf.GUI.telaLogin.loginGUI;
import autopdvnf.VO.conexaoBancoPostgreSQLVO;
import java.sql.SQLException;

/**
 *
 * @author Fabinhu
 */
public class AutoPDVnf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    /*
    atualizaTabelasDAO conectabanco = new atualizaTabelasDAO();   
    conexaoBancoPostgreSQLVO conect = new conexaoBancoPostgreSQLVO();
    */
 
    loginGUI log = new loginGUI();
    executandoThreads exT = new executandoThreads();
    Thread atualizaHora = new Thread(exT);
    atualizaHora.start();
   
        
    }
    
}
