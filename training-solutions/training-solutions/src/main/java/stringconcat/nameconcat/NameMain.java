package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        Name nameA = new Name("Doe", "Jacob", "Jeffrey", Title.MR);
        Name nameB = new Name("Doe", "", "Jillian", Title.MRS);
        Name nameC = new Name("Kovács", "János", "József");
        Name nameD = new Name("Kovács", "", "Péter");

        System.out.println(nameA.concatNameWesternStyle());
        System.out.println(nameB.concatNameWesternStyle());
        System.out.println(nameC.concatNameHungarianStyle());
        System.out.println(nameD.concatNameHungarianStyle());
    }
}