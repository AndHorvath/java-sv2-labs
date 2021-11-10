package stringseparate;

import java.util.Arrays;

public class CodesMain {

    public static void main(String[] args) {
        Codes codes = new Codes();
        String[] codesArray = { "T57fbj", "34aa4aq", "xto5cu45", "2we9qq11", "f578GVHd" };

        System.out.println(Arrays.asList(codesArray));
        System.out.println(codes.getCodesStartWithLetter(Arrays.asList(codesArray)));
    }
}