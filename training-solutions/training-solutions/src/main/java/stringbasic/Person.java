package stringbasic;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private String email;
    private String address;
    private String socialSecurityNumber;
    private String bankAccountNumber;
    private String phoneNumber;

    // --- constructors -------------------------------------------------------

    public Person(
            String name, String email, String address,
            String socialSecurityNumber, String bankAccountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.phoneNumber = phoneNumber;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }

    public String getBankAccountNumber() { return bankAccountNumber; }
    public void setBankAccountNumber(String bankAccountNumber) { this.bankAccountNumber = bankAccountNumber; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}