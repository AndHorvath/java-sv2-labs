package primitivetypes;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        // --- int and Integer ------------------------------------------------

        int a = 2; // típusnak megfelelő értékadás
        System.out.println(a);

        Integer b = 2; // autoboxing
        System.out.println(b);

        Integer c = a; // autoboxing
        System.out.println(c);

        Integer d = b; // típusnak megfelelő értékadás
        System.out.println(d);

        Integer e = Integer.valueOf(2); // típusnak megfelelő értékadás
        System.out.println(e);

        int f = Integer.valueOf(2); // autounboxing
        System.out.println(f);

        int g = Integer.valueOf(a); // autounboxing
        System.out.println(g);

        int h = Integer.valueOf(c); // autounboxing
        System.out.println(h);

        int i = Integer.parseInt("2"); // típusnak megfelelő értékadás
        System.out.println(i);

        Integer j = Integer.parseInt("2"); // autoboxing
        System.out.println(j);

        // --- boolean and Boolean --------------------------------------------

        boolean k = true; // típusnak megfelelő értékadás
        System.out.println(k);

        Boolean l = true; // autoboxing
        System.out.println(l);

        boolean m = Boolean.valueOf(true); // autounboxing
        System.out.println(m);

        Boolean n = Boolean.valueOf(true); // típusnak megfelelő értékadás
        System.out.println(n);

        boolean o = Boolean.parseBoolean("TrUe"); // típusnak megfelelő
        System.out.println(o);

        Boolean p = Boolean.parseBoolean("TrUe"); // autoboxing
        System.out.println(p);

        boolean q = Boolean.parseBoolean("TreU"); // típusnak megfelelő értékadás
        System.out.println(q);

        Boolean r = Boolean.parseBoolean("TreU"); // autoboxing
        System.out.println(r);
    }
}