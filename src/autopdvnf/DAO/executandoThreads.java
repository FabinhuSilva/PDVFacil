
package autopdvnf.DAO;

import autopdvnf.GUI.telaLogin.loginGUI;


//1º Incluir o "implements Runnable" na frente da classe
public class executandoThreads implements Runnable{


    public void run() {
        String erro;
        loginGUI login = new loginGUI();
        login.dataHora();
        try {
              Thread.currentThread().sleep(50);
            } catch (InterruptedException e){ 
        System.out.println("Segue o erro: "+e);    
    }
    }
    
}   
    
    
    /*
// Thread        
executandoThreads thd = new executandoThreads();
    */
}
