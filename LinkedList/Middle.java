public class Middle {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // This function return Middle Node of left 
    public static Node MiddleLeftElement(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
 
    // This function return Middle Node of Right 
    public static Node MiddleRightElement(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!= null){ //fast!= null this are for even ll 
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //delete Right Middle of ll is even 
    public static Node deleteRightMiddle(Node head) {
       
        Node slow = head;
        Node fast = head;

        if(head.next==null){
            return head = null;
        }

        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
 
    //delete left Middle of ll is even 
    public static Node deleteLeftMiddle(Node head) {
       
        Node slow = head;
        Node fast = head;

        if(head.next==null){
            return head = null;
        }

        while(fast.next.next.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp  = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a =  new Node(87);
        Node b =  new Node(100);
        Node c =  new Node(13);
        Node d =  new Node(4);
        Node e =  new Node(5);
        Node f =  new Node(12);
       
    

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        
       display(a);

        Node leftMiddle = MiddleLeftElement(a);
        Node rightMiddle = MiddleRightElement(a);
       // Node temp = deleteLeftMiddle(a);
        Node temp = deleteRightMiddle(a);
       display(temp);
    

      System.out.println("Left Middle node"+ leftMiddle.data);
      System.out.println("right Middle Node "+ rightMiddle.data);
      //  System.out.println(temp.data);
    }
}
