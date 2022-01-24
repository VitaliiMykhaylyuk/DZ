import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {


        Books book1 = new Books("Ohota na vedbm", "Kapitowka",   "Фінанси",  9 );
        Books book2 = new Books("Ohota na privideniy", "King",   "Azbuka",  100 );


        System.out.println(book1.toString());
        System.out.println(book2.toString());

    }

}
