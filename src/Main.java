import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Fibonacci Sequence");

        int counter = 0;
        BigInteger fib1 = new BigInteger("0");
        BigInteger fib2 = new BigInteger("0");
        BigInteger current = new BigInteger("1");
        while(counter < 1000)
        {
            counter++;
            System.out.println(current);
            fib1 = fib2;
            fib2 = current;
            current = fib1.add(fib2);
        }
    }
}