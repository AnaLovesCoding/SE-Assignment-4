public class BankOperation {

    public static void main(String[] args) {
        CorporateHolder corporateHolder = new CorporateHolder(1, "West Covina", "46576890");
        Account account = new Account(0.0, corporateHolder);
        account.withdraw(10);
    }
}
