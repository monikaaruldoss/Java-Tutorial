public class DoublyLinkedList {
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }System.out.print("Null");
    }
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
    }
}

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}