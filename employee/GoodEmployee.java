package employee;

public class GoodEmployee {
    private String firstname;
    private String lastName;

    public GoodEmployee(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
