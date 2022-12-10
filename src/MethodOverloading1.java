public class MethodOverloading1 {
    void display(int a , double b){
        System.out.println("Method 01");
    }
    void display(int a,double b,double c){
        System.out.println("Method 02");
    }
    public static void main(String[] args) {
        MethodOverloading1 methodOverloading1 = new MethodOverloading1();
        methodOverloading1.display(1,3.2);
        methodOverloading1.display(2,0.5,0.002);
    }
}
