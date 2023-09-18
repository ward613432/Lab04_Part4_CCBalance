public class Main {
    public static void main(String[] args) {
        double balance = 5000;

        for (int i = 0; i < 2; i++) {
            balance += balance * .17;
            System.out.printf("Your balance after %d month(s) with an interest of 17%% is $%.2f %n", i+1, balance);
        }
    }
}