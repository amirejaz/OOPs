// Aggregation - HAS-A relationship
public class Address {
    String house_no;
    int Block;
    String city;
    String state;
    Address(String H_no, int blk, String ct, String st){
        this.house_no = H_no;
        this.Block = blk;
        this.city = ct;
        this.state = st;
    }
}

class StudentInfo{
    String Name;
    int Roll_no;
    Address Studentaddr;

    StudentInfo(String n, int roll, Address addr){
        this.Name = n;
        this.Roll_no = roll;
        this.Studentaddr = addr;

    }

    public static void main(String[] args) {
        Address add = new Address("616", 5, "Karachi", "Sindh");
        StudentInfo stdInfo = new StudentInfo("Amir Aijaz", 18, add);
        System.out.println(stdInfo.Name + " " + stdInfo.Roll_no + " " + add.city );
    }
}
