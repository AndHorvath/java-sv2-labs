package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b;
        //System.out.println(b);
        b = true;
        System.out.println(b);

        int a = 2;
        System.out.println(a);

        int i = 3;
        int j = 4;
        int k = i;
        System.out.println(i + ", " + j + ", " + k);

        int l;
        //System.out.println(l);

        String s = "Hello World!";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(x);
            System.out.println(a);
        }

        //System.out.println(x);
        System.out.println(a);
    }
}