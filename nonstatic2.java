
    class nonstatic2
    {
       int s=123;
       public void view()
       {
           System.out.println("this is the view()of abc");
           System.out.println("value of s= "+s);
       }
    }
    class non
    {
       public static void main (String[]args)
       {
           System.out.println("s = "+new nonstatic().s);
           new nonstatic().view();
       }
       
       
   }
    

