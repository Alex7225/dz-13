import com.opencsv.bean.CsvBindByName;

public class Number {
    @CsvBindByName(column = "num1")
    private int num1;
    @CsvBindByName(column = "num2")
    private int num2;

    public Number() {
    }

    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}