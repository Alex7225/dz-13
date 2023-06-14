import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Test
public class DBReader {
    private final static String URL = "jdbc:postgresql://localhost:4567/postgres";
    private final static String USER_NAME = "postgres";
    private final static String USER_PASSWORD = "12345678";
    private final static String QUERY = "select * values(?)";

    public static List<Number> getDataDB(){
        List<Number> dataDB = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL,USER_NAME,USER_PASSWORD);

            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, 2);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Number str = new Number(resultSet.getInt("num1"), resultSet.getInt("num2"));
                dataDB.add(str);
            }


        }catch (SQLException exception){
            throw new RuntimeException(String.format("Please check connection string"));
        } return dataDB;
    }

}
