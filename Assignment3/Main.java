public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        // Checking Account operations
        bankFacade.checkCheckingBalance();
        bankFacade.depositToChecking(1000);
        bankFacade.withdrawFromChecking(500);

        // Savings Account operations
        bankFacade.checkSavingsBalance();
        bankFacade.depositToSavings(2000);
        bankFacade.withdrawFromSavings(1000);

        // Investment Account operations
        bankFacade.checkInvestmentBalance();
        bankFacade.investInInvestment(3000);
        bankFacade.liquidateInvestment(1500);
    }
}
