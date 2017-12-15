package sql
/*
package sql

import java.sql.*
import groovy.sql.Sql

class SQLClass {
*/
/*

    String dbUrl = "jdbc:mysql://192.168.1.202:8181/ADONIS-KH-V2\\ADONIS"
    String user = 'sa'
    String pass = '@donis2015'

    Connection myConn = DriverManager.getConnection(dbUrl,user,pass)

    Statement myStmt = myConn.createStatement()

    ResultSet myRs = getMyStmt().executeQuery('select * from pw001p01')
*//*


    def sql = Sql.newInstance('jdbc:mysql://ADONIS-KH-V2:8183/ADONIS',
            'sa', '@donis2015', 'com.mysql.jdbc.Driver')

    sql.ea

    sql.close()

    void printResult() {
        println myRs
    }

}
*/
