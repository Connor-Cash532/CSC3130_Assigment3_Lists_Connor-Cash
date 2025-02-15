public class DLList {
    DLNode head;
    DLNode tail;
    public DLList(){
        head = new DLNode();
        tail = new DLNode();
        head.next = tail;
        tail.prev = head;
    }
    //0 1
    //1 2
    public void addy(Book b) {
        if(head.getB() == null){
            head.setB(b);
        }
        DLNode temp = new DLNode();
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
        DLNode tempNode = head;
        DLNode tempNode2 = head;

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
        DLNode tempNode = head;
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
