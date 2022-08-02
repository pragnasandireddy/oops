 class nonstatic
 {
    int s=123;
    public void view()
    {
        System.out.println("this is the view()of abc");
        System.out.println("value of a= "+s);
    }
    public static void main (String[]args)
    {
        System.out.println("s = "+new nonstatic().s);
        new nonstatic().view();
    }
    
    
}
