// Bank Facade
class BankFacade {
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;
    private InvestmentAccount investmentAccount;

    public BankFacade() {
        checkingAccount = new CheckingAccount();
        savingsAccount = new SavingsAccount();
        investmentAccount = new InvestmentAccount();
    }

    public void checkCheckingBalance() {
        checkingAccount.checkBalance();
    }

    public void depositToChecking(int amount) {
        checkingAccount.deposit(amount);
    }

    public void withdrawFromChecking(int amount) {
        checkingAccount.withdraw(amount);
    }

    public void checkSavingsBalance() {
        savingsAccount.checkBalance();
    }

    public void depositToSavings(int amount) {
        savingsAccount.deposit(amount);
    }

    public void withdrawFromSavings(int amount) {
        savingsAccount.withdraw(amount);
    }

    public void checkInvestmentBalance() {
        investmentAccount.checkBalance();
    }

    public void investInInvestment(int amount) {
        investmentAccount.invest(amount);
    }

    public void liquidateInvestment(int amount) {
        investmentAccount.liquidate(amount);
    }
}
