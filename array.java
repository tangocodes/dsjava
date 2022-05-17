public class array {

    public void printforeach(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void removeven(int[] arr)
    { 
       int count=0;
       for(int i =0;i<arr.length;i++)
       {
           if(arr[i]%2==1)
           {
               count+=1;
           }      
       }
       int[] ay=new int[count];
       int j=-1;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]%2==1)                  
           {
             j+=1;
             ay[j]=arr[i];
           }
         
       }
    
       for(int i=0;i<ay.length;i++)
       {
           System.out.print(ay[i]+" ");
       }

      
    }
    public void ispalindrome(String word)
    {
        char[] carr=word.toCharArray();
        int start=0;
        int end=carr.length-1;
        boolean flag=true;        
        while(start<=end)   
        {                                 
            if(carr[start]!=carr[end])
            {
                flag=false;
                break;
            }
            start++;
            end--;
        }
        if(flag==true)
        {
            System.out.print(word+" is palindrome");
        }
        else
        {
            System.out.println(word+" is not palindrome");
        }
    }
    public void reversearray(int[] arr)
    {
        int[] a=new int[arr.length];
        int j=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
             j+=1;
             a[j]=arr[i];
        }
        for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
    }
    public void minarray(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)              

            {
                min=arr[i];     
            }
        }
        System.out.println("Sai min value is "+min);
    }
    public void maxarray(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)              

            {
                max=arr[i];     
            }
        }
        System.out.println("Sai max value is "+max);
    }
    public void secondmax(int[] arr) {
          int temp=0;
          for(int i=0;i<arr.length;i++)
          {
            for(int j=i+1;j<arr.length;j++)
            {  
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }  

            }
          }
          for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       System.out.println("Second max is "+arr[arr.length-2]);
    }
 
    public void movezero(int[] newarr)
    {
        int i=0;
        int j=0;
        int temp=0;
        for(i=0;i<newarr.length;i++)            
        {
            System.out.println();
            print(newarr);  
            System.out.println("arr[i]="+newarr[i]+"arr[j]= "+newarr[j]); 
            if(newarr[i]!=0 && newarr[j]==0)
            {
               temp=newarr[i];
               newarr[i]=newarr[j];
               newarr[j]=temp;
            }
            if(newarr[j]!=0)
            {
                j+=1;
            }
        }
       print(newarr);
    }

    public void findmissing(int[] ars,int n)
    {
    
        int i=1;     
        while(i<=n)
        {
            boolean flag=false;
            for(int j=0;j<ars.length;j++)
            {
                if(ars[j]==i)
                {
                    flag=true;
                    break;
                }
               
            }
            if(flag==false)
            {
            System.out.println(i);
            }
            i+=1; 
        }
        
       
    }    
     public static void main(String[] args)
     {
         array aa=new array();
         
        // int[] arr={22,7,6,1,5,23,55};
        // aa.printforeach(arr);
        // System.out.println();
        // aa.print(arr);
        // System.out.println();
        // aa.removeven(arr);
        // System.out.println();
        // aa.reversearray(arr);
        // System.out.println();
        // aa.minarray(arr);
        // System.out.println();
        // aa.maxarray(arr);
        // aa.secondmax(arr);
        // int[] arrs={1,0,2,1,3,0,0,7};
        // aa.movezero(arrs);
        // int[] ars={1,2,7,5,6,8};
        // aa.findmissing(ars, 9);
        String word="MadaM";
        aa.ispalindrome(word);
        }
}
    