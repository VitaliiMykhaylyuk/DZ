public class Books {
    private String name;
    private String autor;
    private String izdatelb;
    private double price;

    public Books(String name, String autor, String izdatelb, double price) {
        this.name = name;
        this.autor = autor;
        this.izdatelb = izdatelb;
        if(price < 10){
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getIzdatelb() {
        return izdatelb;
    }

    public void setIzdatelb(String izdatelb) {
        this.izdatelb = izdatelb;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 10){
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", izdatelb='" + izdatelb + '\'' +
                ", price=" + price +
                '}';
    }
}
