public class copyConstructor {
    String web;
    copyConstructor(String w){
        web = w;

    }
    copyConstructor(copyConstructor cc){
        web = cc.web;
    }

    void display(){
        System.out.println("website: " + web);
    }

    public static void main(String[] args) {
        copyConstructor obj1 = new copyConstructor("facebook");
        copyConstructor obj2 = new copyConstructor(obj1);

        obj1.display();
        obj2.display();

    }
}
