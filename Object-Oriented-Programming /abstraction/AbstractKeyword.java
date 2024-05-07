abstract class Car      //abstract method belongs to abstract class
{                       // it is not compulsary to create abstract method for abstract class
    public abstract void drive(); //if we dont know or want to implement anything in method and the child class wants to extend the method then abstract keywrd is used
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("play music");
    }
}
abstract class wagonR extends Car    //if you are unable to implement fly() method then you should have declare this methos also abstract
{
    public void drive()     //it is must to implement the parent class abstract method r ovrride the method.if we change the name it gives an error
    {
        System.out.println("Driving...");
    }
}
class UpdatedWagonR extends wagonR      //concrete class. we created new class.
{
    public void fly()
    {
        System.out.println("fly");
    }
}
public class AbstractKeyword {
    public static void main(String args[]){
       // Car obj = new Car();          //we cannot creact object of abstract class
       Car obj = new UpdatedWagonR();          //but we can create referance of abstract class 
        obj.drive();        //if you want to create object then we have to get sub class which implements all methodsthat class called as concrete class
        obj.playMusic();
        obj.fly();
    }
}
