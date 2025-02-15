public class DLNodeGeneric<T>{
    protected DLNodeGeneric<T> next;
    protected T b;
    protected DLNodeGeneric<T> prev;

    public DLNodeGeneric(){
        next = null;
        b = null;
        prev = null;
    }
    public DLNodeGeneric<T> getNext() {
        return next;
    }
    public T getB() {
        return b;
    }

    public DLNodeGeneric<T> getPrev() {
        return prev;
    }
    public void setB(T b) {
        this.b = b;
    }
    public void setNext(DLNodeGeneric<T> next) {
        this.next = next;
    }

    public void setPrev(DLNodeGeneric<T> prev) {
        this.prev = prev;
    }
}
