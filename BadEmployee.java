public class BadEmployee {
    //The firstname of the employee
    private String firstname;
    public BadEmployee(String firstname, String lastName) { this.firstname = firstname;this.lastName = lastName; }
    //The lastname of the employee
    private String lastName;
    //Gets the firstname
    public String getFirstname() { return firstname; }
    //Sets the firstname
    public void setFirstname(String firstname) { this.firstname = firstname; }
    //Gets the last name
    public String getLastName() { return lastName; }
    //Sets the last name
    public void setLastName(String lastName) { this.lastName = lastName; }
}
