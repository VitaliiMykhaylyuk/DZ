public class RunCatalog {


    public static void main(String[] args) {

        Catalog khyga1 = new Catalog("Война и мир", "Толстой Л.Н.");
        Catalog khyga2 = new Catalog("Верочка","Мартин Брест");
        Catalog khyga3 = new Catalog("Дюна", "Френк Герберт");

        Catalog.Records records1 = khyga1.new Records("Ivanov Ivan Ivanovich");
        Catalog.Records records2 =khyga1.new Records("Petrov Petro Petrovich");
        Catalog.Records records3 =khyga2.new Records("Sidorov Oleg Vasilevi4");
        Catalog.Records records4 =khyga3.new Records("Pinchuk Viktor Fedorovich");

        System.out.println("Книга: " + '\n'+ khyga1.getName() + '\n'+  "Хто брал "  + '\n'+ khyga1.getListOfRecords());
        System.out.println("Книга: " + '\n'+ khyga2.getName() + '\n'+  "Хто брал"  + '\n'+ khyga2.getListOfRecords());
        System.out.println("Книга: " + '\n'+ khyga3.getName() + '\n'+  "Хто брал"  + '\n'+ khyga3.getListOfRecords());



    }
}