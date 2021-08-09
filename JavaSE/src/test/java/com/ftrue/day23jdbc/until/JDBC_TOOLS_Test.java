package com.ftrue.day23jdbc.until;

import java.sql.Connection;

public class JDBC_TOOLS_Test {
    public static void main(String[] args) {
        Connection connection = null;
        System.out.println(connection);
        JDBCTools.close(connection);
    }
}
