public class DLNode {
    protected DLNode next;
    protected Book b;
    protected DLNode prev;

    public DLNode(){
        next = null;
        b = null;
        prev = null;
    }
    public DLNode getNext() {
        return next;
    }
    public Book getB() {
        return b;
    }

    public DLNode getPrev() {
        return prev;
    }
    public void setB(Book b) {
        this.b = b;
    }
    public void setNext(DLNode next) {
        this.next = next;
    }

    public void setPrev(DLNode prev) {
        this.prev = prev;
    }
}
