import java.util.ArrayList;
import java.util.List;

public class Account {

    public enum TypeTranzakcii {
        SNYATIE, PLATEG, POPOLNENIE
    }

    List<Tranzactions> tranzactionsList = new ArrayList<>();

    public List<Tranzactions> getProductList() {
        return tranzactionsList;
    }

    public void addTranzactions(TypeTranzakcii TypeTranzakcii, double sumOperation) {
        tranzactionsList.add(new Tranzactions(TypeTranzakcii, sumOperation));
    }

    public void showTranzactions(){
        for(int i=0;i< tranzactionsList.size();i++){
            System.out.println(tranzactionsList.get(i));
        }
    }

    public void showBalance(){
        for(int i=0;i< tranzactionsList.size();i++){
            System.out.println(tranzactionsList.get(i));
        }
    }

    private static class Tranzactions {

        private final TypeTranzakcii TypeTranzakcii;
        private double sumOperation;

        public Tranzactions(TypeTranzakcii TypeTranzakcii, double sumOperation) {
            this.TypeTranzakcii  = TypeTranzakcii;
            this.sumOperation = sumOperation;

        }

        @Override
        public String toString() {
            return "Tranzactions{" +
                    "TypeTranzakcii= " + TypeTranzakcii +
                    ", sumOperation= " + sumOperation +
                    '}';
        }
    }

}
