class Teacher {
  //fields of parent class
  String designation = "Teacher";
  String collegeName = "DCS UBIT";

  //method of parent class
  void does(){
    System.out.println("Teaching");
  }
}

public class PhysicsTeacher extends Teacher{
  //field of child class
  String mainSubject = "Physics";
  public static void main(String args[]){
    PhysicsTeacher obj = new PhysicsTeacher();
    //accessing the fields of parent class
    System.out.println(obj.collegeName);
    System.out.println(obj.designation);

    System.out.println(obj.mainSubject);

    //accessing the method of parent class
    obj.does();
  }
}
