/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated.routine.management.system.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author A
 */
public final class DBConnect {
    private Connection con = null;
    private Statement statement = null;
    private ResultSet rs = null;
    
    public DBConnect () throws ClassNotFoundException, SQLException {
        localConnection();
    }
    private static DBConnect handler=null;
    public static DBConnect getInstance() throws ClassNotFoundException, SQLException{
        if (handler==null){
            handler=new DBConnect();
        }
        return handler;
    }
    
    void localConnection() throws ClassNotFoundException, SQLException {
            String TableName = "USERTABLE";
            try {
                try {
                    Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                } catch (InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
                con = DriverManager.getConnection("jdbc:derby:database;create=true");
                statement = con.createStatement();
                
                DatabaseMetaData dbm = con.getMetaData();
                ResultSet tables = dbm.getTables(null, null, TableName.toUpperCase(), null);
                
                if(tables.next()) {
                    //System.out.println("Table "+TableName+" already exist");
                }
                else {
                   // System.out.println("Processing");
                    statement.execute("CREATE TABLE "+TableName+"("
                            +"Username varchar(30) primary key,\n"
                            +"Password varchar(30)\n"
                            +")");
                    
                  //  System.out.println("Created");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    public int setUserData(String userName, String password) throws SQLException {
        rs = statement.executeQuery("SELECT Username FROM UserTable");
        
        while(rs.next()) {
            
            if(userName.equals(rs.getString(1))) {
                return 1;
            }
        }
        
        statement.execute("INSERT INTO UserTable VALUES('"+userName+"', '"+password+"')");
        
        return 0;
    }
    
    public int userLogin(String userName, String password) throws SQLException {
        rs = statement.executeQuery("SELECT Username, Password FROM UserTable WHERE Username='"+userName+"' AND Password='"+password+"'");

        while(rs.next()) {
           return 1;
        }        
        return 0;
    }
    public int userLoginTeacher(String Id) throws SQLException {
        rs = statement.executeQuery("SELECT id FROM TEACHER where id='"+Id+"'");

        while(rs.next()) {
           return 1;
        }        
        return 0;
    }
    public int userLoginStudent(String Id) throws SQLException {
        rs = statement.executeQuery("SELECT id FROM TEACHER where id='"+Id+"'");

        while(rs.next()) {
           return 1;
        }        
        return 0;
    }
    public void setTeacherTable(){
        String TABLE_NAME = "TEACHER";
        try {
            java.sql.Statement stmt = con.createStatement();
            DatabaseMetaData dbm = con.getMetaData();
            ResultSet tables = dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + "already exists. Ready for go !");
            } else {
               
                stmt.execute("CREATE TABLE " + TABLE_NAME+"("
                    + " id varchar(200) primary key,\n"
                    + " name varchar(200),\n"
                    + " speciality varchar(20),\n"
                    + " contact varchar(200)\n"
                    +")");
            }
        } catch(SQLException e){
            System.err.println("--------setupDatabase"+ e.getMessage());
        } finally {
        }
    
    }
    public void setStudentTable(){
        String TABLE_NAME = "STUDENT";
        try {
            java.sql.Statement stmt = con.createStatement();
            DatabaseMetaData dbm = con.getMetaData();
            ResultSet tables = dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + "already exists. Ready for go !");
            } else {
               
                stmt.execute("CREATE TABLE " + TABLE_NAME+"("
                    + " id varchar(200) primary key,\n"
                    + " name varchar(200),\n"
                    + " CGPA varchar(20),\n"
                    + " contact varchar(200)\n"
                    +")");
            }
        } catch(SQLException e){
            System.err.println("--------setupDatabase"+ e.getMessage());
        } finally {
        }
    
    }
    public ResultSet execQuery(String query) {
        ResultSet result;
        try {
            java.sql.Statement stmt = con.createStatement();
            result = stmt.executeQuery(query);
        }
        catch (SQLException ex) {
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return null;
        }
        finally {
        }
        return result;
    }

    public boolean execAction(String qu) {
        try {
            java.sql.Statement stmt = con.createStatement();
            stmt.execute(qu);
            return true;
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return false;
        }
        finally {
        }
    }

}
