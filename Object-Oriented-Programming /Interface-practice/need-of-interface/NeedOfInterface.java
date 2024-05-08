interface Computer // instead of using abstract class we can use interface
{
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

class Developer {
    public void DevApp(Computer lap) {
        lap.code();
    }
}

public class NeedOfInterface {
    public static void main(String args[]) {
        Computer lap = new Laptop(); // this is not class reference
        Computer desk = new Desktop(); // we are creating here interface reference

        Developer frontend = new Developer();
        frontend.DevApp(lap);
        frontend.DevApp(desk);
    }
}
