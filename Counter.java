package Algorithm_and_Structure;

public class    Counter {
    private static int count;
    Counter(){ count++; }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);
    }
}
