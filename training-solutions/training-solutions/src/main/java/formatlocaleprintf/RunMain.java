package formatlocaleprintf;

public class RunMain {

    public static void main(String[] args) {
        Run run = new Run("Kovács Béla");

        run.addRun(10.6);
        run.addRun(10.6);
        run.addRun(5.3);
        run.addRun(15.9);
        run.addRun(10.6);
        System.out.println(run.printFormattedRunText());
    }
}