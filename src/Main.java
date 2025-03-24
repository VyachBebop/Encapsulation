public class Main {
    public static void main(String[] args) {

        //TODO Задание 1.
        ChildBankAccount account =
                new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());

        //TODO Задание 2.
        Country russia = new Country("Russia");
        russia.setCountPeople(146_028_325);
        russia.setSquare(17125191);
        russia.setCapital("Moscow");
        russia.setSeaExit(true);

        russia.printCountry(russia);


    }
}
