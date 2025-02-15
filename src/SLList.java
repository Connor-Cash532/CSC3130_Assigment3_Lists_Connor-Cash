public class SLList {
    protected SLNode head;
    public SLList(){
        head = new SLNode();
    }
    public void addy(Book b){
        if(head.getB() == null){
            head.setB(b);
            head.setNext(null);
        }
        else{
            SLNode s = new SLNode();
            s.setB(b);
            SLNode tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = s;
        }


    }

    //0 1 2 3
    //1 2 3 4
    public void removy(int pos){
        int count = 1;
        SLNode tempNode = head;
        SLNode tempNode2 = head;

        if(pos == 0)
            head = head.next;
        else{
            while(tempNode != null && count != pos){
                if(count + 1 == pos)
                    tempNode2 = tempNode;
                tempNode = tempNode.next;
                count++;
            }
            if(tempNode.next != null)
                tempNode.next = tempNode.next.next;
            else
                System.out.println("Remove position not valid");
        }
    }

    @Override
    public String toString() {
        if(head.getB() == null)
            return "Empty List";
        String s = "";
        SLNode tempNode = head;
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

    public SLNode getHead() {
        return head;
    }
}
