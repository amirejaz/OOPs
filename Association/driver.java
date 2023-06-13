package association;

public class driver extends carClass {
    String driverName;
    public driver(String dName, String cName, int cID){
        super(cName, cID);
        this.driverName = dName;
    }
}
class TransportCompany{
   public static void main(String args[])
   {
	driver obj = new driver("Andy", "Ford", 9988);
	System.out.println(obj.driverName+" is a driver of car Id: "+obj.carID);
   }
}
