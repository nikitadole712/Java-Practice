class Student
{
    private String name;
    private int Roll_No;

    public String getName() {
        return name;
    }
    public void setName(String name) {      //this is keyword which represent the current object.the object which is calling the method.
        this.name = name;
    }
    public int getRoll_No() {
        return Roll_No;
    }
    public void setRoll_No(int Roll_No) {   //used to refer to the current class instance variable, invoke the current class method,    
        this.Roll_No = Roll_No;
    }

    
}

public class ThisKeyword {
    public static void main(String[] args)
    {
        Student objStudent = new Student();
        objStudent.setName("Jerry");
        objStudent.setRoll_No(10);

        System.out.println(objStudent.getName() + ":" + objStudent.getRoll_No());
    }
}
