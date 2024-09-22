public class YourFirstAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account("Conner", 100.0);
        firstAccount.deposit(20.0);

        System.out.println(firstAccount.saldo());
    }
}
