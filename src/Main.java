// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Array List Testing of Integers");
        AListGeneric<Integer> integerAListGeneric = new AListGeneric<>();
        integerAListGeneric.listAdd(2);
        integerAListGeneric.listAdd(3);
        integerAListGeneric.listAdd(4);
        System.out.println(integerAListGeneric);
        System.out.println("Testing removing element at index 2");
        integerAListGeneric.listRemove(2);
        System.out.println(integerAListGeneric);

        System.out.println("\nArray List Testing of String");
        AListGeneric<String> stringAListGeneric = new AListGeneric<>();
        stringAListGeneric.listAdd("Fjord");
        stringAListGeneric.listAdd("Bjord");
        stringAListGeneric.listAdd("Djord");
        System.out.println(stringAListGeneric);
        System.out.println("Testing removing element at index 0");
        stringAListGeneric.listRemove(0);
        System.out.println(stringAListGeneric);

        System.out.println("\nArray List Testing of Books");
        AListGeneric<Book> bookAListGeneric = new AListGeneric<>();
        bookAListGeneric.listAdd(new Book("Dune", "Frank Herbert", 10.00));
        bookAListGeneric.listAdd(new Book("Dune Messiah", "Frank Herbert", 10.00));
        bookAListGeneric.listAdd(new Book("The Hunger Games", "Frank Herbert", 10.00));
        System.out.println(bookAListGeneric);
        System.out.println("Testing removing element at index 2");
        bookAListGeneric.listRemove(2);
        System.out.println(bookAListGeneric);

        System.out.println("\nLinked List Testing of Integer");
        SLListGeneric<Integer> integerSLListGeneric= new SLListGeneric<>();
        integerSLListGeneric.addy(1);
        integerSLListGeneric.addy(31);
        integerSLListGeneric.addy(42);
        integerSLListGeneric.addy(3);
        System.out.println(integerSLListGeneric);
        System.out.println("Testing removing element at index 3");
        integerSLListGeneric.removy(3);
        System.out.println(integerSLListGeneric);


        System.out.println("\nLinked List Testing of String");
        SLListGeneric<String> stringSLListGeneric = new SLListGeneric<>();
        stringSLListGeneric.addy("Fjord");
        stringSLListGeneric.addy("Bjord");
        stringSLListGeneric.addy("Djord");
        System.out.println(stringSLListGeneric);
        System.out.println("Testing removing element at index 0");
        stringSLListGeneric.removy(0);
        System.out.println(stringSLListGeneric);

        System.out.println("\nLinked List Testing of Books");
        SLListGeneric<Book> bookSLListGeneric = new SLListGeneric<>();
        bookSLListGeneric.addy(new Book("Dune", "Frank Herbert", 10.00));
        bookSLListGeneric.addy(new Book("Dune Messiah", "Frank Herbert", 10.00));
        bookSLListGeneric.addy(new Book("The Hunger Games", "Frank Herbert", 10.00));
        System.out.println(bookSLListGeneric);
        System.out.println("Testing removing element at index 1");
        bookSLListGeneric.removy(1);
        System.out.println(bookSLListGeneric);


        System.out.println("\nDouble Linked List Testing of Integer");
        DLListGeneric<Integer> integerDLListGeneric= new DLListGeneric<>();
        integerDLListGeneric.addy(1);
        integerDLListGeneric.addy(31);
        integerDLListGeneric.addy(42);
        integerDLListGeneric.addy(3);
        System.out.println(integerDLListGeneric);
        System.out.println("Testing removing element at index 1");
        integerDLListGeneric.removy(1);
        System.out.println(integerDLListGeneric);


        System.out.println("\nDouble Linked List Testing of String");
        DLListGeneric<String> stringDLListGeneric = new DLListGeneric<>();
        stringDLListGeneric.addy("Fjord");
        stringDLListGeneric.addy("Bjord");
        stringDLListGeneric.addy("Djord");
        System.out.println(stringDLListGeneric);
        System.out.println("Testing removing element at index 2");
        stringDLListGeneric.removy(2);
        System.out.println(stringDLListGeneric);

        System.out.println("\nDouble Linked List Testing of Books");
        DLListGeneric<Book> bookDLListGeneric = new DLListGeneric<>();
        bookDLListGeneric.addy(new Book("Dune", "Frank Herbert", 10.00));
        bookDLListGeneric.addy(new Book("Dune Messiah", "Frank Herbert", 10.00));
        bookDLListGeneric.addy(new Book("The Hunger Games", "Frank Herbert", 10.00));
        System.out.println(bookDLListGeneric);
        System.out.println("Testing removing element at index 0");
        bookDLListGeneric.removy(0);
        System.out.println(bookDLListGeneric);
    }
}