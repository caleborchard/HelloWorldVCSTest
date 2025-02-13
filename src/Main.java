public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Fibonacci Sequence");

        long fib1 = 0;
        long fib2 = 0;
        long current = 1;
        while(current > 0)
        {
            System.out.println(current);
            fib1 = fib2;
            fib2 = current;
            current = fib1 + fib2;
        }
    }
}