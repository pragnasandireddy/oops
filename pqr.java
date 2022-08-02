 class pqr 
{
        static int v=100;
        public static void test()
        {
            System.out.println("this is test() of demo class");
        }
    }
    class nonstatic2
    {
        public static void main(String[]args)
        {
        System.out.println("v is = "+pqr.v);
        pqr.test();
        } 
}
