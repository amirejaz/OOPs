public class constructorOverloading {
    int val1;
    int val2;
    constructorOverloading(){
        val1 = 10;
        val2 = 20;
        System.out.println("Inside 1st constructor....");
    }

    constructorOverloading(int a){
        val1 = a;
        System.out.println("Inside 2nd constructor...");
    }

    constructorOverloading(int a, int b){
        val1 = a;
        val2 = b;
        System.out.println("Inside 3rd constructor...");
    }

    void display(){
        System.out.println("Value 1 ===== " + val1);
        System.out.println("Value 2 ===== " + val2);
    }

    public static void main(String[] args){
        constructorOverloading c1 = new constructorOverloading();
        constructorOverloading c2 = new constructorOverloading(47);
        constructorOverloading c3 = new constructorOverloading(18,21);

        c1.display();
        c2.display();
        c3.display();
    }

}
