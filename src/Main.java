import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.math.BigDecimal.*;

public class Main {
    public static void main(String[] args) {
        BigDecimal amount = valueOf(1000.01);       //сумма пополнения
        BigDecimal balance = valueOf(100);          //баланс клиента до пополнения
        BigDecimal bonus = null;
        BigDecimal percent = valueOf(100);
        if (amount.compareTo(valueOf(1000)) == 1) {     //вычисление бонуса
            bonus = amount.divide(percent, 0, RoundingMode.DOWN);
        } else bonus = valueOf(0);

        balance = balance.add(amount);
        balance = balance.add(bonus);                  //баланс после пополнения

        System.out.println("Бонус = " + bonus);
    }
}