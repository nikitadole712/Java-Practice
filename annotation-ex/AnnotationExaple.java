
//Annotation means suppliment to compiler or runtime it ia also called metadata
class A
{
    public void ShowTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show A");
    }
}

class B extends A
{
    @Override       //we ARE trying t tell compiler we are overriding method
    public void ShowTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show B");
    }
}
public class AnnotationExaple 
{
    
    public static void main(String args[])
    {
        B obj = new B();
        obj.ShowTheDataWhichBelongsToThisClass();
    }
}
