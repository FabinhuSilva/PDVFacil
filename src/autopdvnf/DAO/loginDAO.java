
package autopdvnf.DAO;

import java.awt.List;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class loginDAO {
    
   
        public void comboECF() {
        atualizaTabelasDAO conectaBanco = new atualizaTabelasDAO();
        Connection con=null;

        List<String>cd /
        strList = new ArrayList<String>();

        String query = "SELECT * FROM ecf ";

        conectaBanco.setFuncSQL(query);

        conectaBanco.rodarSQL();
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ResultSet rs = ps.executeQuery();
                
                while(rs.next) {
                    
                    strList.add(rs.getString("nome"));
                    
                }   
            }

    }
}
