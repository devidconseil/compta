/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonctions;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class BaseDedonnees {

    public BaseDedonnees() {
    }
    String url = "jdbc:sqlite:dba.db";
    String pilote = "org.sqlite.JDBC";

    Connection getConnection() throws Exception {
        Class.forName(pilote);
        Connection connection = DriverManager.getConnection(url);
        connection.setAutoCommit(true);
        return connection;
    }

    public void insertData(String req) {
        try {
            Connection connection = getConnection();
            java.sql.Statement statement = connection.createStatement();
            statement.execute(req);
            //statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public java.sql.Statement statement;

    public ResultSet getData(String req) throws Exception {
        Connection connection = getConnection();
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(req);
        return resultSet;
    }
}
