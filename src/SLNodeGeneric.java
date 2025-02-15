public class SLNodeGeneric<T>{
    protected SLNodeGeneric<T> next;
    protected T b;

    public SLNodeGeneric(){
        next = null;
        b = null;
    }
    public SLNodeGeneric<T> getNext() {
        return next;
    }
    public T getB() {
        return b;
    }
    public void setT(T b) {
        this.b = b;
    }
    public void setNext(SLNodeGeneric<T> next) {
        this.next = next;
    }
}
