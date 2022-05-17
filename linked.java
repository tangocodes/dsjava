import java.util.Scanner; 
public class linked {
    private listnode head=null;
    private class listnode 
    {
        private int data;
        private listnode next;
        private listnode(int data)
        {
            this.data = data;
            this.next=null;
        }
    }

    public void insert(int data)
    {
        listnode current=new listnode(data);
        listnode prev=head;
        if(head==null)
        {
            head=current;  
        }
        else               
        {
            while(prev.next!=null)
            {
                prev=prev.next;
            }
            prev.next=current;
        }
    }
    public int givepos(int pos)
    {
        listnode temp=head;
        int count=1;
        while(count<pos)
        { 
             temp=temp.next;
             count+=1;

        }
        return temp.data;

    }  
    public void removexerox()
    {
        listnode current=head;
        listnode next=null;
        while(current.next!=null)
        {
            next=current.next;
            if(current.data==next.data)
            {
                current.next=next.next;
            }
            else{
                current=current.next;
            }
        }

    }
    public void search(int key)
    {
        listnode current=head;
        boolean flag=false;
        int count =1;
        while(current!=null)
        { 
            if(current.data==key)
            {
                flag=true;
                break;
            }
            
            current=current.next;
            count+=1;
        
        }
       if(flag==true)
       {
           System.out.println("Sai found at :"+count);
       }
       else
       {
           System.out.println("Sai not found :(");
       }

    }
    
    public void insertatbeg(int data)
    {
        listnode current=new listnode(data);
        listnode prev=head;          
        if(head==null)
        {
            head=current;
        }
        else{
            current.next=prev;
            head=current;
        }
    }
    public void insertpos(int pos,int data)
    {
        listnode current=new listnode(data);
        listnode temp=head;
        int count=1;
        if(pos<=0)
        {
            System.out.println("Cant insert at that position");
        }
        else if(pos==1)
        {
          current.next=temp;
          head=current;         
        }
        else{                          
        while(count<pos-1)
            {
                temp=temp.next;
                count+=1;
            }
            current.next=temp.next;
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
    public void count()
    {
        listnode current=head;
        int count=0;
        while(current!=null)
        {
            count=count+1;
            current=current.next;
        }
        System.out.println();
        System.out.println("Length of the linked list "+count);
    }
    public void deletefirst()
    {
        listnode temp=head;
        head=temp.next;
        temp.next=null;       
    }

     public void deletelast()
     {
         listnode temp=head;
         while(temp.next!=null && temp.next.next!=null)
         {
             temp=temp.next;
         }
         temp.next=null;
     }
      public void deleteatpos(int pos)
      {
          listnode temp=head;
          int count=1;
          if(pos==1)
          {
              head=head.next;
          }                                  
          else{
          while(count<pos-1)
          {
              temp=temp.next;
              count+=1;

          }
          temp.next=temp.next.next;
        }
      }
      public void reversenode()   
      {                                    
          listnode current=head;
          listnode previous=null;      
          listnode nextval=null;
          while(current!=null)
          {
             nextval=current.next;
             current.next=previous;
             previous=current;
             current=nextval;
            
          }
          head= previous;
      }
      public void removekey(int key)
      {     
           listnode current=head;
           boolean flag=false;
           if(current.data==key)
           {
               head=current.next;
           }
           else{
           while(current.next!=null)
           {
               if(current.next.data==key)
               {
                   current.next=current.next.next;
                   flag=true;
                   break;
                
               }
               current=current.next;
           }
           if(flag==false)
           {
               System.out.println("Sai not found in linkedlist");
           }
        }
           
      }
       public int findmiddle()
       {
           listnode current=head;
           int count=1;
           while(current!=null)
           {
               current=current.next;
               count+=1;
           }
           if(count%2==1)
           {
              count=count+1;
           }
           count=count/2;
           listnode sai=head;
           int md=1;
           while(md<=count-1)
           {
               sai=sai.next;
               md=md+1;
           }
           return sai.data;
       }                                              
    public static void main(String[] args)
    {
    
        linked sl=new linked();
        sl.insertatbeg(10);
        sl.insertatbeg(40);
        sl.insertatbeg(30);
        sl.insertatbeg(40);
        sl.insertatbeg(70);
        sl.display();
        // sl.deleteatpos(1);
        // System.out.println();
        // sl.display();
        // sl.reversenode();
        // System.out.println();
        // sl.display();
        //sl.count();
        System.out.println();
        // System.out.println(sl.givepos(1));
        //sl.removexerox();
        // sl.removekey(40);
        sl.display();
        System.out.println();
        System.out.println(sl.findmiddle());

    }
}
