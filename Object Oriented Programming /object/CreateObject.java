class CreateObject {        //creaed class with variable x
    int x = 5;

    public static void main(String[] args) {

        CreateObject myObj = new CreateObject();    //created object of CreateObject which is class name
        System.out.println(myObj.x);

        


        //created multiple objects
        CreateObject myObj1 = new CreateObject();  // Object 1
        CreateObject myObj2 = new CreateObject();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
