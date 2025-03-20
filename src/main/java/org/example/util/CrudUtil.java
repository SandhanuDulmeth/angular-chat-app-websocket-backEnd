package org.example.util;




import org.example.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {

    public static <T> T execute(String SQL, Object... val) throws SQLException {
        System.out.println(SQL);
        try (PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(SQL)) {
            System.out.println(val + " --- " + val.length);
            for (int i = 0; i < val.length; i++) {
                preparedStatement.setObject(i + 1, val[i]);
            }
            if (SQL.startsWith("SELECT") || SQL.startsWith("select") || SQL.startsWith("Select"))
                return (T) preparedStatement.executeQuery();
            else {
                return (T) (Boolean) (preparedStatement.executeUpdate() > 0);
            }
        }


    }
}
