package OOP.Inheritance;

public class Customer extends Person{
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}
