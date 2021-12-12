package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Tea", 200);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("Herbal tea", 400);
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}