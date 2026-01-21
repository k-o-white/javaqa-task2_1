public class Main {
    public static void main(String[] args) {
        int amount = 13676;
        int roublesForOneMile = 20;
        System.out.println("Стоимость билета: " + amount);
        int bonus = amount / roublesForOneMile;
        System.out.println("Количество бонусных миль: " + bonus);
    }
}