package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {

        MathExercise exerciseA = new Adder();
        MathExercise exerciseB = new Subtracter();
        MathExercise exerciseC = new Multiplier();
        MathExercise exerciseD = new Divisor();
        int a = 5;
        int b = 3;

        System.out.println(exerciseA.getSolution(a, b));
        System.out.println(exerciseB.getSolution(a, b));
        System.out.println(exerciseC.getSolution(a, b));
        System.out.println(exerciseD.getSolution(a, b));
    }
}