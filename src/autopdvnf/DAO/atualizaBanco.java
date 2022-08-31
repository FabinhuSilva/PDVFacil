/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopdvnf.DAO;

/**
 *
 * @author Fabinhu
 */
public class atualizaBanco {
    
    //criar esquema produto
            CREATE SCHEMA produto AUTHORIZATION postgres;
    
            "CREATE TABLE produto (\n"
            + "  id integer CONSTRAINT pk_id PRIMARY KEY,\n"
            + "  descricao varchar(30) NOT NULL,\n"
            + "  valorDesc decimal(9,2) NOT NULL\n"
            + ")";
            */
 
            
            "CREATE TABLE operador (\n"
            + "  id integer CONSTRAINT pk_idOperador PRIMARY KEY,\n"
            + "  nome varchar(30) NOT NULL\n"
            + ")";
}
