// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //Wzorzec projektowy Singleton
    private  static Person INSTANCE;

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        // Wywołanie
        createPerson();
        createPerson();
        createPerson();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }

    // Wzorzec projektowy Factory (Fabryka)
    public static Person createPerson(){
        if(INSTANCE == null){
            INSTANCE = new Person();
        }
        return INSTANCE;
    }

    // Metoda
    public static class Person{
        // Constructor
        Person(){
            System.out.println("Person");
        }
    }
}