public class RunTranzactions {
    public static void main(String[] args) {
        Account account = new Account();
        account.addTranzactions(Account.TypeTranzakcii.POPOLNENIE,100);
        account.addTranzactions(Account.TypeTranzakcii.SNYATIE,20);

        account.showTranzactions();
    }

}
