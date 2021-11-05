package compositionlist;

public class CapsulesMain {

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        System.out.println(capsules.getColours());

        capsules.addFirst("black");
        capsules.addLast("orange");
        capsules.addFirst("red");
        capsules.addLast("blue");
        System.out.println(capsules.getColours());

        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColours());
    }
}