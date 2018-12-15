import java.lang.*;

class Singleton_Demo
{
    static Singleton_Demo obj = new Singleton_Demo();
    /*
    obj is static, so that its memory gets created at the time of class loading
    and its memory gets shared
    */
    
    private Singleton_Demo()    //contructor is private so that we canot call it from outside of this class
    {
        System.out.println("Constructor of class");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Singleton_Demo ref = Singleton_Demo.obj;
        System.out.println(ref);
        
        Singleton_Demo ref2 = Singleton_Demo.obj;
        System.out.println(ref2);
    }
}

/*
out put:
it will print same hashcode of both the references
*/
