package Algorithm_and_Structure;

public class NOD {
    public static void main(String[] args) {
        System.out.println(nod(0,3));
    }
    private static int nod(int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == 0 && b == 0) return 0;
        a = Math.abs(a);
        b = Math.abs(b);
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        while (r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
