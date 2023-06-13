public class Demo {
    int value1;
    int value2;
    Demo(){
        value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st constructor");
    }
    Demo(int a){
        value1 = a;
        System.out.println("Inside 2nd constructor");
    }
    
    Demo(int a, int b){
        value1 = a;
        value2 = b;
        System.out.println("Inside 3nd constructor");
    }

    public void display(){
        System.out.println("Value1 == "+ value1);
        System.out.println("Value2 == "+ value2);
    }

    public static void main(String[] args){
        Demo d1 = new Demo();
        Demo d2 = new Demo(30);
        Demo d3 = new Demo(30, 40);
        d1.display();
        System.out.println();
        d2.display();
        System.out.println();
        d3.display();
    }

}
