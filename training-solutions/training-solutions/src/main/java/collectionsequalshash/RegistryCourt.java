package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        Company companyAA = new Company("Company A", "AA-11");
        Company companyAB = new Company("Company A", "BB-22");
        Company companyCA = new Company("Company C", "AA-11");

        companies.add(companyAA);
        System.out.println(companies.contains(new Company("Company A", "AA-11")));
        System.out.println(companies.contains(new Company("Company A", "BB-22")));
        System.out.println(companies.contains(new Company("Company C", "AA-11")));

        companies.add(companyAB);
        System.out.println(companies.contains(new Company("Company A", "AA-11")));
        System.out.println(companies.contains(new Company("Company A", "BB-22")));
        System.out.println(companies.contains(new Company("Company C", "AA-11")));

        companies.add(companyCA);
        System.out.println(companies.contains(new Company("Company A", "AA-11")));
        System.out.println(companies.contains(new Company("Company A", "BB-22")));
        System.out.println(companies.contains(new Company("Company C", "AA-11")));
    }
}