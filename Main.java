public class Main{
    public static int factorial(int num){
        int total = num;
        num --;
        while(num > 0){
            total*=num;
            num--;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}