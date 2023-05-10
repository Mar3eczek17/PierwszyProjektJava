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
        createPerson("Marek");
        createPerson("Marek");
        createPerson("Marek");



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }

    // Wzorzec projektowy Factory (Fabryka)
    public static Person createPerson(String name){
        if(INSTANCE == null){
            INSTANCE = new Person(name);
        }
        return INSTANCE;
    }

    // Metoda
    public static class Person{
        // Parameterless constructor
//        Person(){
//            System.out.println("Person");
        // Constructor z parameter
        Person(String name){
            System.out.println("Person: " + name);
        }
    }
}