import java.util.Scanner;

class calculator{
    public int add(int n1,int n2){
        int r = n1 + n2;
        return r;
    }
}

public class Calling_methods_from_different_class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 20;
        int num2 = 15;
        calculator calc = new calculator();
        int result = calc.add(20,15);
        System.out.println(result);
    }
}