import java.lang.*;

class Singleton_Demo
{
    private static Singleton_Demo obj = new Singleton_Demo();
    /*
    obj is static, so that its memory gets created at the time of class loading
    and its memory gets shared
    */
    
    private Singleton_Demo()    //contructor is private so that we canot call it from outside of this class
    {
        System.out.println("Constructor of class");
    }
    
    public static Singleton_Demo getReference()   //this method of class is also static, so that we can call it by using class name
    {
        return Singleton_Demo.obj;    //this will return the 'obj'
    }
}

class Test
{
    public static void main(String[] args)
    {
        Singleton_Demo ref = Singleton_Demo.getreference();
        System.out.println(ref);
        
        Singleton_Demo ref1 = Singleton_Demo.getreference();
        System.out.println(ref2);
    }
}
/*
Out put:
This will print same hash code for both the references
*/
