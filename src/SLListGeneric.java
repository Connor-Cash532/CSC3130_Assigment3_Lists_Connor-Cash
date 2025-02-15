public class SLListGeneric<T>{
    protected SLNodeGeneric<T> head;
    public SLListGeneric(){
        head = new SLNodeGeneric<>();
    }
    public void addy(T b){
        if(head.getB() == null){
            head.setT(b);
            head.setNext(null);
        }
        else{
            SLNodeGeneric<T> s = new SLNodeGeneric<>();
            s.setT(b);
            SLNodeGeneric<T> tempNode = head;
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
        SLNodeGeneric<T> tempNode = head;
        SLNodeGeneric<T> tempNode2 = head;

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
        if(head.getB() == null)
            return "Empty List";
        String s = "";
        SLNodeGeneric<T> tempNode = head;
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

    public SLNodeGeneric<T> getHead() {
        return head;
    }

}
