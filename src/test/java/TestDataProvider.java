import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "numbersDB")
    public static Object[][] numbersFromDB(){

        return DBReader.getNumbersFromDB().stream().map(number -> new Object[]{number.getNum1(), number.getNum2()})
                .toArray(Object[][]::new);
        };
}
