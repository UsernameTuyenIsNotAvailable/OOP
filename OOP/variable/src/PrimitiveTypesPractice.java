public class PrimitiveTypesPractice {

    public static void main(String[] args) {
        System.out.println("Hello World");
        byte a = 127;
        short b = 127;
        int c = 127;
        long t = (long)c;
        int p = 127;
        long d = 127L;
        float v = 127.5F;
        double e = 127.5;
        double w = 127.5;
        char f = 'A';
        boolean r = true;
        boolean h = false;
        int k = (int)e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c + p);
        System.out.println(c - p);
        System.out.println(c * p);
        System.out.println(c % p);
        System.out.println(d);
        System.out.println(v);
        System.out.println(e + w);
        System.out.println(e - w);
        System.out.println(e * w);
        System.out.println(e % w);
        System.out.println(f);
        System.out.println(a > 4 && p > 4);
        System.out.println(a >= 4 || p >= 4);
        System.out.println(!h);
        System.out.println(t);
        System.out.println(k);
    }
}
