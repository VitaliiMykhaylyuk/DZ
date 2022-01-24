
import java.util.ArrayList;
import java.util.List;

public class Payments {

    List<Product> productList = new ArrayList<>();

    public Payments(){}

    public void showProducts(){
        for(int i=0;i< productList.size();i++){
            System.out.println(productList.get(i));
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProducts(String name, double price) {
        productList.add(new Product(name, price));
    }






    private class Product{
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" + name + '\'' +
                    ", " + price +
                    '}';
        }
    }
}