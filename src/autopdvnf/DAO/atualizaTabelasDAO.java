package autopdvnf.DAO;

import autopdvnf.VO.conexaoBancoPostgreSQLVO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fabinhu
 */
public class atualizaTabelasDAO {

    conexaoBancoPostgreSQLDAO cBanco = new conexaoBancoPostgreSQLDAO();
    conexaoBancoPostgreSQLVO vBanco = new conexaoBancoPostgreSQLVO();

    String funcSQL = "CREATE TABLE desconto (\n"
            + "  id integer CONSTRAINT pk_id PRIMARY KEY,\n"
            + "  descricao varchar(30) NOT NULL,\n"
            + "  valorDesc decimal(9,2) NOT NULL\n"
            + ")";

    public String getFuncSQL() {
        return funcSQL;
    }

    public void setFuncSQL(String funcSQL) {
        this.funcSQL = funcSQL;
    }

    public atualizaTabelasDAO() {

    }

    public void rodarSQL() throws SQLException {

        Connection con = DriverManager.getConnection(vBanco.getCaminhoCompleto(), vBanco.getUsuario(), vBanco.getSenha());
        Statement stmt = con.createStatement();

        //cBanco.conexao(vBanco.getCaminhoCompleto(), vBanco.getUsuario(), vBanco.getSenha());
        stmt.execute(getFuncSQL());

    }

}
