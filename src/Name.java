public class Name {
    private String firstName;
    private String lastName;
    private String middleInitial;

    public Name(String firstName, String middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public String getNormalOrder() {
        return firstName + " " + middleInitial + ". " + lastName;
    }

    public String getReverseOrder() {
        return lastName + ", " + firstName + " " + middleInitial + ".";
    }

    public String toString() {
        return firstName + " " + middleInitial + ". " + lastName;
    }

}