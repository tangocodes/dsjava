import javax.lang.model.type.NullType;

public class doublylinkedlist {
    private listnode head;
    private listnode tail;
    int length;
    private class listnode{
        private int data;
        private listnode next;
        private listnode previous;
        listnode(int data)
        {
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }
    doublylinkedlist()
        {
            this.head=null;
            this.tail=null;
            this.length=0;
        }
    public boolean isEmpty()
    {
        if(length==0)
        {
            return true;
        }
        return false;
    }
    public void insert(int data)
    {                                     
          listnode current=new listnode(data);
          if(isEmpty())
          {
             head=current;
          }
          else
          {
              tail.next=current;
          }
          current.previous=tail;
          tail=current;
          length++;
    }
public void insertbeg(int data)
    {                                                 
        listnode current=new listnode(data);
        if(isEmpty())
        {
            tail=current;
        }
        else{
            head.previous=current;
        }
        current.next=head;
        head=current;
        length++;
    }
    public void insertpos(int pos,int data)
    {
        listnode current=new listnode(data);
        listnode temp=head;
        int count=1;
        while(count<pos-1)
        {
            temp=temp.next;
            count+=1;
        }
        current.next=temp.next;
        current.previous=temp;
        temp.next.previous=current;
        temp.next=current;
    }
public void forwarddisplay()
    {
        listnode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void Backwarddisplay()
    {
        listnode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.print("null");
    }
    public void deletefirst()
    {
        head=head.next;      
        head.previous=null;
        
    }
    public void deletelast()
    {
        tail=tail.previous; 
        tail.next=null;  
    }
    
    public void deletepos(int pos)  
    {
        listnode temp=head;
        int count=1;
        if(pos==1)
        {
            head=head.next;      
            head.previous=null;
        }
        else{
        while(count<pos-1)
        {
            temp=temp.next;
            count+=1;
        }
        if(temp.next.next!=null)        
        {
        temp.next.next.previous=temp;
        temp.next=temp.next.next;
        }
        else    
        {
            tail=tail.previous; 
            tail.next=null;  
        }

    }
    }
    public static void main(String[] args) {
        doublylinkedlist da=new doublylinkedlist();
        da.insert(20);
        da.insert(32);
        da.insert(45);
        da.insertbeg(11);
        da.insertbeg(10);
        da.insertbeg(5);
        System.out.println();
        da.forwarddisplay();
        System.out.println();
        da.Backwarddisplay();
        System.out.println();
        da.insertpos(3, 33);
        da.forwarddisplay();
        System.out.println();
        da.Backwarddisplay();
        System.out.println();
        da.deletefirst();
        da.forwarddisplay();
        System.out.println();
        da.Backwarddisplay();
        System.out.println();
        da.deletelast();
        da.forwarddisplay();
        System.out.println();
        da.Backwarddisplay();
        System.out.println();
        da.deletepos(5);
        da.forwarddisplay();
        System.out.println();
        da.Backwarddisplay();

        
    }
}
