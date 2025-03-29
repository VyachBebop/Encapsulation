public class ChildBankAccount {


    private double balance;
    private final double maxBalance;

    ChildBankAccount(int maxBalance) {
        this.maxBalance = (maxBalance >= 0) ? maxBalance : 0;
    }

    public double getBalance() {
        return balance;
    }

    public boolean depositMoney(double value) { // Пополнение счёта
        if (value < 0) {
            System.out.println("Ошибка: сумма пополнения должна быть больше чем 0");
            return false;
        } else if ((value += balance) > maxBalance) {
            System.out.println("Ошибка сумма превышает лимит счёта");
            return false;
        } else {
            this.balance = value;
            return true;
        }
    }

    public boolean debitMoney(double value) { // Списание со счёта
        if (value < 0) {
            System.out.println("Ошибка: сумма снятия должна быть больше чем 0");
            return false;
        } else if ((balance - value) < 0) {
            System.out.println("На счету недостаточно средств");
            return false;
        } else {
            this.balance -= value;
            return true;
        }
    }


}
