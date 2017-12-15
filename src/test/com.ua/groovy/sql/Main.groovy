package sql

import groovy.sql.Sql

class Main {
    static void main(String[] args) {
        println 'hi'
        def sql = Sql.newInstance("jdbc:sqlserver://ADONIS-KH-V2:8183; database=ADONIS; user=sa; password=@donis2015")

        sql.eachRow('SELECT * FROM PW001P01') { row ->
            println row
        }
        sql.close()
    }
}