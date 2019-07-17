public class MemberOverload{
    protected static int a = 0;

    public static class Inner1{
        protected int a = 1;
        protected int b = 1;
        public int getA(){
            return a;
        }

        public int getB(){
            return b;
        }
    }

    public static class Inner2 extends Inner1{
        protected int a=2;
        protected int b=2;
        public int getA(){
            return a;
        }

        public int getB(){
            return b;
        }
    }

    public static void main(String args[]){
        Inner1 inner1 = new MemberOverload.Inner1();
        Inner1 inner2 = new MemberOverload.Inner2();
        System.out.println("a:"+inner1.getA()+" b:"+inner1.getB());
        System.out.println("a:"+inner2.getA()+" b:"+inner2.getB());
    }

}