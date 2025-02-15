public class AList {
    int size;
    int maxSize;
    Book[] books;
    public AList(){
        size = 0;
        maxSize = 10;
        books = new Book[maxSize];
    }

    public void listAdd(Book b){
        if(size == maxSize){
            maxSize *= 2;
            Book[] temp = new Book[maxSize];
            for(int i = 0; i < size; i++){
                temp[i] = books[i];
            }
            temp[size] = b;
            size++;
            books = temp;
        }
//        System.out.println(size);
//        System.out.println(maxSize);
//        System.out.println(books.length);

        books[size] = b;
        size++;
//        System.out.println(size);
    }

    public void listRemove(int pos){
        Book temp = books[pos];
        for(int i = pos; i < size; i++){
            books[i] = books[i+1];
        }
    }

    @Override
    public String toString() {
        if(size == 0)
            return "Empty List";
        String s = "";
        for(int i = 0; i < size-1; i++){
            s += "{" + books[i].toString() + "}";
            s += "\n";
        }
        return s + "{" + books[size-1].toString() + "}";
    }


}
