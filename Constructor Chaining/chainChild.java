public class chainChild extends chainParent {
    int val3;
    int val4;

    chainChild(){
        val3 = 67;
        val4 = 77;
        System.out.println("Inside child constructor");
    }

    public void display(){
        System.out.println("Value1 ===== " + val1);
        System.out.println("Value2 ===== " + val2);
        System.out.println("Value3 ===== " + val3);
        System.out.println("Value4 ===== " + val4);
    }
}
