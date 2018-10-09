class Node{
    int data;
    Node next;
    
    Node(){
        data = 0;
        next = null;
    }
    
    Node(int data){
        this.data = data;
        next = null;
    }
}

class LinkedList{
    Node head;
    
    LinkedList(){
        head = new Node();
    }
    
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void middle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    
}

public class Main{
    public static void main(String ar[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(50);
        list.add(700);
        list.add(900);
        list.add(500);
        
        list.add(500);
        list.add(500);
        list.middle();
    }
}
