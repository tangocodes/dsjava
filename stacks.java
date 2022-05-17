public class stacks{
    private listnode top=null;
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
        if(top==null)
        {
            return true;
        }
        return false;   
    }
    public void push(int data)
    {                                              
        listnode current=new listnode(data);
        listnode temp=top;
        if(isEmpty())
        {
          top=current;
        }
        else{
            current.next=top;
            top=current; 
        }
    } 
    public void pop()   
    {
        if(isEmpty())
        {
            System.out.println("Sai you cannot pop");
        }
        else
        {
           top=top.next;
        }
    }    
    public void display()
    {
        listnode temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null"); 
    }
    public static void main(String[] args) {
        stacks st=new stacks();
        st.display();
        System.out.println();
        st.pop();
        st.pop();
        st.display();
    }
   
} 


