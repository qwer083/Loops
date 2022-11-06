import java.sql.SQLOutput;

public class SimpleSum {
    public static void main(String[] args) {
long sum = 0;
        for ( long i = 1; i <= 100; i++)
        {
         long progress = (long) (i*Math.pow(i, i-1));
         sum = sum + progress;
        }
        System.out.println(sum);
    }

    }


