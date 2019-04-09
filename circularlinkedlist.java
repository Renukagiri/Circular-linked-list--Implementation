//implementaion of Circular linked list (insertion,print)
package data.structure;

public class circularlinkedlist
{
    
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data =d;
            next = null;
        }
    }
         
        public static Node insert(circularlinkedlist list,int data)
        {
            Node new_node = new Node(data);
            new_node.next = null;
            Node last = null;
            //Node temp = null;
               int c=0;
            if(list.head == null)
            {
                //c++;
              list.head = new_node;
              //temp = new_node.next;
            }
            else
            {
                last = list.head;
                while(last.next!=null)
                {
                    
                    last = last.next;
                    
                   
                }
               // c++;
                last.next = new_node;
          
            }
           System.out.println("c"+c);
            return last;
        
        
        }
    
        //to connect in the last null node to the first node
        //1->2->3->4->5->"1"
        
    public static void traverse(circularlinkedlist list,int c1)
    {
        int c2=0;
        c2++;
        Node last;
        last = list.head;
        Node temp = last.next;
        for(int i=0;i<c1;i++)
        {
            if(last.next!=null)
            {
                c2++;
                 //System.out.println("c2:"+c2);
                last = last.next;
                //continue;
            }
            else
            {
               // Node temp2 =last;
                c2++;
                last.next = temp;
                System.out.println("new c2(number of nodes): "+c2+"\nnext(address) of last node :  "+temp);
                //System.out.println(temp2);
                break;
            }
        }
    }
    
    

public static void print(circularlinkedlist list)
    {
         int c = 0;
       circularlinkedlist.Node curnode = list.head; // create node called curnode which contains list's head
        while(curnode != null)//check if curnode is empty
        {
           
            c++;
            System.out.println(curnode.data); // print the value
            curnode = curnode.next; // moves further
              //System.out.println("c"+c);
        }
        System.out.println("number of nodes:"+c);
        
    }
    
    
    public static void main(String[] args) 
    {
        circularlinkedlist list = new  circularlinkedlist();
        int c1=0;
        c1++;
       list.insert(list,1);
        c1++;
       list.insert(list,2);
         c1++;
        list.insert(list,3);
         c1++;
        list.insert(list,4);
      
       print(list);
        traverse(list,c1);
        
    }
    
}
