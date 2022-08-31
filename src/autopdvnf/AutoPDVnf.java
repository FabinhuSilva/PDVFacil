
package autopdvnf;

import autopdvnf.DAO.atualizaTabelasDAO;
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
    //loginGUI log = new loginGUI();
    
    atualizaTabelasDAO conectabanco = new atualizaTabelasDAO();   
    conectabanco.rodarSQL();
    /*
    conexaoBancoPostgreSQLVO conect = new conexaoBancoPostgreSQLVO();
    */
 /*
    executandoThreads exT = new executandoThreads();
    Thread atualizaHora = new Thread(exT);
    atualizaHora.start();
        System.out.println(exT.getHoraThread());        
*/
    }
    
}
