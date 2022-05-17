public class mergetwo {
    private listnode head;
    private class listnode
    {
        private int data;
        private listnode next;

        listnode(int data)
        {
            this.data = data;
            this.next=null;
        }
    }

    public void insert(int data)
    {
        listnode current=new listnode(data);
        listnode temp=head;
        if(head==null)
        {
            head=current;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=current;
        }
    }

    public void display()  
    {    
        listnode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("Null");

    }
    public void mergelists(listnode a,listnode b)
    {                                       
        listnode temp=new listnode(0);
        listnode curr=temp;             
        while(a!=null && b!=null)
        {
            
            if(a.data<=b.data)
            {
                curr.next=a;
                a=a.next;                              
            }                           
            else{                                  
                                                                        
                curr.next=b;                         
                b=b.next;
            }
            curr=curr.next;
        }
        if(b==null)
        {
           curr.next=a;
        }
        else{
            curr.next=b;
        }
        temp=temp.next;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
       
    }

    public static void main(String[] args)
    {
        mergetwo a=new mergetwo();
        a.insert(1);
        a.insert(2);
        a.insert(4);
        mergetwo b=new mergetwo();
        b.insert(1);
        b.insert(5);

        a.display();
        System.out.println();
        b.display();

        mergetwo c=new mergetwo();
        System.out.println();
        c.mergelists(a.head, b.head);
    
       
    }

}
