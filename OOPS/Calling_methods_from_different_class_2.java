class remote{
    public int add()
    {
        System.out.println("accessing add from different class");
        return 0;
        
    }
}


public class Calling_methods_from_different_class_2 
{
    public static void main(String[] args)
    { 
        remote calc = new remote();
        calc.add();
        
    }
    
}
