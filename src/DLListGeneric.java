public class DLListGeneric<T>{
    DLNodeGeneric<T> head;
    DLNodeGeneric<T> tail;
    public DLListGeneric(){
        head = new DLNodeGeneric<T>();
        tail = new DLNodeGeneric<T>();
        head.next = tail;
        tail.prev = head;
    }
    //0 1
    //1 2
    public void addy(T b) {
        if(head.getB() == null){
            head.setB(b);
        }
        DLNodeGeneric<T> temp = new DLNodeGeneric<T>();
        temp.setB(b);
        if (tail.getB() == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void removy(int pos){
        int count = 1;
        DLNodeGeneric<T> tempNode = head;
        DLNodeGeneric<T> tempNode2 = head;

        if(pos == 0)
            head = head.next;
        else{
            while(tempNode != null && count != pos){
                if(count + 1 == pos)
                    tempNode2 = tempNode;
                tempNode = tempNode.next;
                count++;
            }
            if(tempNode != null && tempNode.next != null)
                tempNode.next = tempNode.next.next;
            else
                System.out.println("Remove position not valid");
        }
    }

    @Override
    public String toString() {
        if(head == null || head.getB() == null)
            return "Empty List";
        String s = "";
        DLNodeGeneric<T> tempNode = head;
        int i = 0;
        while(tempNode.next != null){
            //s += "\n";
            s += "{" + tempNode.getB() + "}";
            s += "\n";
            tempNode = tempNode.next;
            i++;
        }
        s += "{" + tempNode.getB() + "}";
        return s;
    }
}
