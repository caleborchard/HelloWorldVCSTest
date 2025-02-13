public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Fibonacci Sequence");

        int fib1 = 0;
        int fib2 = 0;
        int current = 1;
        while(current < 5000)
        {
            System.out.println(current);
            fib1 = fib2;
            fib2 = current;
            current = fib1 + fib2;
        }
    }
}