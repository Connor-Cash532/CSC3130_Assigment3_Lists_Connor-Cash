public class AListGeneric<T>{
    int size;
    int maxSize;
    T[] obj;
    public AListGeneric(){
        size = 0;
        maxSize = 10;
        obj = (T[]) new Object[maxSize];
    }

    public void listAdd(T b){
        if(size == maxSize){
            maxSize *= 2;
            T[] temp = (T[]) new Object[maxSize];
            for(int i = 0; i < size; i++){
                temp[i] = obj[i];
            }
            temp[size] = b;
            size++;
            obj = temp;
        }
//        System.out.println(size);
//        System.out.println(maxSize);
//        System.out.println(books.length);

        obj[size] = b;
        size++;
//        System.out.println(size);
    }

    public void listRemove(int pos){
        T temp = obj[pos];
        for(int i = pos; i < size; i++){
            obj[i] = obj[i+1];
        }
    }

    @Override
    public String toString() {
        if(size == 0)
            return "Empty List";
        String s = "";
        for(int i = 0; i < size-1; i++){
            if(obj[i] != null){
                s += "{" + obj[i].toString() + "}";
                s += "\n";
            }
        }
        if(obj[size-1] != null){
            return s + "{" + obj[size-1].toString() + "}";
        }
        return s;
    }
}
