class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
    int mod(int a,int b){
        return a%b;
    }
}

public class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10,5));
        System.out.println("Subtraction: "+ calc.sub(6,2));
        System.out.println("multiplication: "+calc.mul(4,8));
        System.out.println("division: "+calc.div(6,3));
        System.out.println("modulus: "+ calc.mod(4, 8));
    }
}