import javax.swing.tree.TreeSelectionModel;
public class circularlinkedlist {
    private listnode last=null;
    private int length=0;
    private class listnode{
        private int data;
        private listnode next;
        listnode(int data)
        {
            this.data=data;
            
        }
    }
    public void insert(int data)
    {                            
        listnode current=new listnode(data);
        if(last==null)
        {
            last=current;
            last.next=current;

        }
        else
        { 
            current.next=last.next;
            last.next=current;  
            last=current;   
        }   
        length++;                               
    }             
     public void deletenode()
     {
        listnode temp=last;
        if(last.next==last)   
        { 
            last=null;
        }
        else
        {
        temp.next=temp.next.next;
        }
    }
    public void insertatpos(int pos,int data)
    {
        listnode current=new listnode(data);    
        if(pos==1)
        {
            current.next=last.next;       
            last.next=current;      
        }
       else if(pos==length+1)
        {
            current.next=last.next;
            last.next=current;
            last=current;
        }
        else
        {
            listnode temp=last.next; 
            int count=1;   
            while(count<pos-1)
            {
                temp=temp.next;
                count+=1; 
            }
             current.next=temp.next;
             temp.next=current;
        }
        length++;
    }
    public void deleteatpos(int pos)
    {
        if(pos==1)
        {
           last.next=last.next.next; 
        }
        else if (pos==length) {
            listnode temp=last.next;
            int count=1;
            while(count<pos-1)
            {
                temp=temp.next;
                count+=1;
            }
            temp.next=last.next;  
            last=temp;  
        }
        else
        {
            listnode temp=last.next;
            int count=1;     
            while(count<pos-1) 
            {
                temp=temp.next;
                count+=1;
            }
            temp.next=temp.next.next;  
        }
    }
    public void display()
    {
        if(last==null)
        {
            System.out.println("Null");
        }
        else
        {
        listnode temp=last.next;
        
        while(temp!=last)  
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
            
        } 
        System.out.print(temp.data);
    }
    }                                                
    public static void main(String[] args)
    {
        circularlinkedlist cr=new circularlinkedlist();
        cr.insert(20);
        cr.insert(30);
        cr.insert(40);
        cr.insert(50);
        cr.insert(60);
        cr.display();
        System.out.println();
        // cr.deletenode();
        // cr.display();
        cr.insertatpos(5,55);
        System.out.println();
        cr.display();
        cr.deleteatpos(6);
        System.out.println();
        cr.display();
    }
}
