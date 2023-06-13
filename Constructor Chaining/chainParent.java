public class chainParent {
    int val1;
    int val2;
    chainParent(){
        val1 = 10;
        val2 = 20;
        System.out.println("Inside 1st constructor....");
    }

    chainParent(int a){
        val1 = a;
        System.out.println("Inside 2nd constructor...");
    }

    
    void display(){
        System.out.println("Value 1 ===== " + val1);
        System.out.println("Value 2 ===== " + val2);
    }

    public static void main(String[] args){
        
        chainChild cc = new chainChild();
        cc.display();
        
    }

}
