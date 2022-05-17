import javax.print.event.PrintEvent;

class singlylinked{
     private listnode head;
     private static class listnode{
         private int data;  
         private listnode next;
         private listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
        public void display(listnode head){
            listnode current = head;
            while(current != null)
            {
                System.out.print(current.data+"-->");
                
                current=current.next;
            }
            System.out.print("null");
        }

    public int length()
    {  int count=0;
        if(head==null)
        {
            return 0;
        }
        listnode current =head;
        while(current != null)
        {
           count+=1;
           current=current.next;
        }
        return count;
       
    }
    public void addatbeginnning(int data)
    {
    listnode nn=new listnode(data);
    nn.next=head;
    head=nn;
    }
    public void addatend(int data){
        listnode last=new listnode(data);
        listnode current=head;
        while(current.next != null)
        {
            current=current.next;
        }
       current.next=last;
    }
     public void post(int position,int data)
     { 
         int count=1;
         listnode nodes = new listnode(data);
        
         if(position == 1)
         {
             nodes.next=head;
             head=nodes;
         }
         else{
             listnode current=head;
             while(count < position-1)
             { 
                 current=current.next;
                 count+=1;

             }
             nodes.next=current.next;
             current.next=nodes;
         }
     }  
     public listnode deletefirst()
     {
         if(head==null)
         {
             return null;
         }
         else
         {
            listnode temp=head;
            head=temp.next;
            temp.next=null;
            return temp;    
         }
        
     }
     public listnode deletelast()
     {
         if(head==null || head.next==null)
         {
             return null;
         }
         else
        {                 
                                           
              listnode current = head;
              listnode previous=null;
              while(current.next!=null)
              {
                  previous=current;
                  current=current.next;

              }
             previous.next=null;
             return previous;
         }
     }
     public listnode deleteposition(int position)
     {      int count=0;
            if(position==1)
            {
                head=head.next;
                return head;
            }
            else{
                listnode current=head;
                listnode previous=null;
                while(count<position-1)
                {
                    previous=current;
                    current=current.next;
                    count+=1;
                }
                previous.next=current.next;
                return previous;
            }

     }

     public boolean search(int key)
     {
         listnode current=head;
         while(current !=null)
         {
             if(current.data==key)
             {
                 return true;
             }
             current=current.next;
         }
         return false;
     }
     public listnode reverselinked(listnode head)
     {
         listnode current = head;
         listnode previous=null;
         listnode nextv=null;
         while(current != null)
         { 
             nextv=current.next;
             current.next=previous;
             previous=current;
             current=nextv;
            
         }
         return previous;
     }
     public int findmiddle()
     {
         listnode fast = head;
         listnode slow = head;
         if(head==null)
         {
             return 0;
         }
         while(fast!=null && fast.next!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow.data;
     }
     public listnode insertnodeinsorted(int data)
     {
         listnode insertt=new listnode(data);
         listnode current=head;
         listnode previous=null;
         while(current!=null && current.data < insertt.data)
         {
              previous=current;
              current=current.next;
         }
         insertt.next=current;
         previous.next=insertt;
         return head;
     }
     public void deletekeynode(int key)
     {
         listnode current=head;
         listnode prev=null;
         if(head.data==key)
         { 
             head=head.next;   
             return; 

         }
         while(current!=null && current.data!=key)
         {
             prev=current;
             current=current.next;
         }
         if(current==null)
         {
             return;
         }
         else{
         prev.next=current.next;
         }
     }
   
     public static void main(String[] args) {
         singlylinked sl=new singlylinked();
         
         sl.head=new listnode(10);
         //listnode sec= new listnode(20);
        //  listnode third=new listnode(30);
         //sl.head.next=sec;
         //sec.next=third;
         //insert at the beginning
        // sl.addatbeginnning(20);
        // sl.addatbeginnning(30);
       
        // //insert at the end
        // sl.addatend(55);

       // insert at given position
        // sl.post(2, 33);
        // sl.post(1,22);
        System.out.println("before deleting the first node\n");
        
        System.out.println("\n");
         //Delete a node
        // sl.deletefirst();
        //  sl.deletelast();
        sl.display(sl.head); 
          sl.deletelast(); 
          System.out.println("\n"); 
          sl.display(sl.head);
        //  if(sl.search(226))
        //  {
        //      System.out.println("key Found");
        //  }
        //  else{
        //      System.out.println("key not found");
        //  }
        //  sl.deleteposition(8);
        //  sl.display(sl.head);
        //  System.out.println("\nLength of the linked list is "+sl.length());  
        //  listnode ms=sl.reverselinked(sl.head) ;
        //  sl.display(ms); 
        //  System.out.println("\n"+sl.findmiddle());        
        //  sl.insertnodeinsorted(25);
        //   sl.display(sl.head);
        //  sl.deletekeynode(10);
        //  sl.deletekeynode(20);
        //  sl.deletekeynode(30);

         
     }  
 }