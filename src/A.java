public class A {
    static void b (int x){
        System.out.println("Arguments = "+x);
    }
    static void b(int b,int c){
        System.out.println("Arguments = "+ b + " and "+c);
    }

    static void ravi (int a, int b ){
        int c=a+b;
        System.out.println("Argument = " +c );

    }
    static void ravi2 (){
        for (int a=0;a<1000;a++){
            System.out.print("|"+a);
        }

    }

    public static void main(String[] args) {
        b(3,5);
        b(8);
        ravi(10,20);
        ravi2();
    }



}
