package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {
        Position positionA = Position.EXECUTIVE_OFFICER;
        Position positionB = Position.FINANCIAL_OFFICER;
        int salary;
        String benefit;

        salary = positionA.getSalary();
        benefit = positionA.getBenefit();
        System.out.println(salary);
        System.out.println(benefit);
        System.out.println(positionA);

        salary = positionB.getSalary();
        benefit = positionB.getBenefit();
        System.out.println(salary);
        System.out.println(benefit);
        System.out.println(positionB);
    }
}