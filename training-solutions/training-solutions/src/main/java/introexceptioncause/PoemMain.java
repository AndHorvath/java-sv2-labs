package introexceptioncause;

public class PoemMain {

    public static void main(String[] args) {
        String path = "src/main/resources/poem.txt";
        Poem poem = new Poem();

        try {
            for (String line : poem.readPoem(path)) {
                System.out.print(line.charAt(0));
            }
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause().getMessage());
            exception.printStackTrace();
            exception.getCause().printStackTrace();
        }
    }
}