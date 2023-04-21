public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 2;
        
        // first use the value and then increment
        System.out.println(a++);
        System.out.println(a);

        // firest increment the value then use it
        System.out.println(++b);
        System.out.println(++b);

        // question solve
        int y = 7;
        int x = ++y * 8;

        System.out.println(x);

        


    }
}
