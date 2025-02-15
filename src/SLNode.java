public class SLNode {
    protected SLNode next;
    protected Book b;

    public SLNode(){
        next = null;
        b = null;
    }
    public SLNode getNext() {
        return next;
    }
    public Book getB() {
        return b;
    }
    public void setB(Book b) {
        this.b = b;
    }
    public void setNext(SLNode next) {
        this.next = next;
    }
}
