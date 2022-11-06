public class SimplyLoop2 {
    public static void main(String[] args) {
        long i;
        for (i = 1; i <= 100; i++) {
           long progress = i * i++;
        }
        long progress = 2;
        System.out.println(Math.pow(i, i++));
    }
}