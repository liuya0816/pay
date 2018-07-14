package io.renren.common.config;

 class A {
    static{
        System.out.println("1");
    }
    public A(){
        System.out.println("2");
    }
}
 class B  extends  A{
    static{
        System.out.println("a");
    }
    public B(){
        System.out.println("b");
    }
     public static int[] merge(int[] a, int[] b) {
         int lena = a.length;
         int lenb = b.length;
         int[] c = new int[lena + lenb];
         int i = 0, j = 0, k = 0;//分别代表数组a ,b , c 的索引
         while (i < lena && j < lenb) {
             if (a[i] < b[j]) {
                 c[k++] = a[i++];
             }else{
                 c[k++] = b[j++];}
         }
         System.out.print(c);
         while (i < lena) {
             c[k++] = a[i++];
         }
         while (j < lenb) {
             c[k++] = b[j++];
         }
         return c;
     }

     public static void main(String[] args) {
         int[] c = merge(new int[] { 1, 2, 3, 4,8 }, new int[] { 0, 2, 4, 5,
                 6, 7, 8 });
         for (int i = 0; i < c.length; i++){
             System.out.println(c[i]);}
     }
 }
 class hello {
    public static void main(String[] args){
       /*A ab=new B();
        ab=new B();*/
       /*Thread a =new Thread(){
           @Override
            public void run(){
                p();
            }
       };
       a.run();
        System.out.println("b1");*/
       try{
            throw new ExceptionB("a");
       }catch (ExceptionA e){
           System.out.println("b");
       }catch (Exception e){
           System.out.println("c");
       }
    }

    

}
class ExceptionA  extends  Exception{

}
class ExceptionB  extends  ExceptionA{

    public ExceptionB(String s) {
        super();
    }
}
