public class DivideLListIntoTwo {

   public static class Node{
         int data;
        Node next;
        public Node()
        {data=0;
            next=null;
        }
         public Node(int d1)
        {this.data=d1;
        this.next=null;}
    }

    public static void main(String[] args) {
       Node n1= new Node(1);
        Node n2= new Node(99);
        Node n3= new Node(88);

        n1.next=n2;
        n2.next=n3;
        n3.next=null;

        Node curr=n1;
        while(!(curr==null))
                {System.out.println(curr.data);
                curr=curr.next;}


    }
}
