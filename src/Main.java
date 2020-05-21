public class Main {
    public static void main(String[] args) {
        int amount = 1199;                          // сумма пополнения
        int balance = 100;                          // баланс клиента до пополнения
        int bonus = amount > 1000 ? amount / 100 : 0;
        balance = balance + amount + bonus;         //Итоговый баланс

        System.out.println("Бонус = " + bonus);
    }
}