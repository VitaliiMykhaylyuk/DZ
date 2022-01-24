
public class RunPaiments {

        public static void main(String[] args) {
            Payments payments = new Payments();

            payments.addProducts("Молоко", 26.0);
            payments.addProducts("Кефир", 20.0);
            payments.addProducts("Сметана", 35.0);

            payments.showProducts();
        }

}

