import javax.swing.filechooser.FileNameExtensionFilter;
public class queue {
    private listnode front=null;
    private listnode rear=null;
    private class listnode 
    {
        private int data;
        private listnode next;
        listnode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty()
    {
        if(front==null && rear==null)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int data)
    {                                                   
        listnode current=new listnode(data);
        if(isEmpty())     
        {
           front=current;
           
        }
        else
        {
           rear.next=current;
        }
        rear=current;

    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Sai you cannot delete");
        }
        else
        {
        front=front.next;
        }
    }
    public void display()
    {
        listnode temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
        
    }
    public static void main(String[] args)
    {
        queue qu=new queue();
        
        qu.display();
        System.out.println();
        qu.dequeue();
        System.out.println();
        qu.display();
    }
}
