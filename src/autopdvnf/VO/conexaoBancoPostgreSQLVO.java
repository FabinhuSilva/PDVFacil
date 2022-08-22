
package autopdvnf.VO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conexaoBancoPostgreSQLVO {
    
        /*
            Futuramente buscar do arquivo TXT estas informação
            ** Arquivo criptografado / podendoestar alocado no System32
        */
    private String driver = "org.postgresql.Driver";
    private String usuario = "postgres";
    private String caminho = "localhost";
    private String senha = "postgres";
    private String banco = "Banco01";
    private int porta = 5432;
    private String url = "jdbc:postgresql";
    private String caminhoCompleto = url+"://"+caminho+":"+porta+"/"+banco;
    //"jdbc:postgresql://localhost:5432/Databases";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCaminhoCompleto() {
        return caminhoCompleto;
    }

    public void setCaminhoCompleto(String caminhoCompleto) {
        this.caminhoCompleto = caminhoCompleto;
    }
    
    
        
public  void bancoPostgresql(){

  try
    {
     Connection conexao = DriverManager.getConnection(caminhoCompleto, usuario, senha);  
    }
    catch(Exception e)
    {
        System.out.println("Segue Exceção: "+e);
    }
}

}