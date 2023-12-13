import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryOperator<Number> mulValues = (x,y) -> x.doubleValue() * x.doubleValue();
        BinaryOperator<Number> sumValues = (x,y) -> x.doubleValue()+y.doubleValue();
        BinaryOperator<Number> diffValues = (x,y) -> x.doubleValue() - y.doubleValue();
        BinaryOperator<Number> powValue = (x,pow_n) -> Math.pow(x.doubleValue(),pow_n.intValue());
        BinaryOperator<Number> divValues = (x,y) -> x.doubleValue()/y.doubleValue();
    }

    // функция разбора строки в числа и символы
    public void parseEntString(Scanner scanner) {
        String enteringString = scanner.nextLine();
        char[] characterList = enteringString.toCharArray();
        Predicate<String> containSign = (sign) -> enteringString.contains(sign);

    }
}