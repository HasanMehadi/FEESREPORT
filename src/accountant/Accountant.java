package accountant;

public class Accountant {

    private int id;
    private String name;
    private String password;
    private String email;
    private String contactno;

    public Accountant() {
    }

    public Accountant(int id, String name, String password, String email, String contactno) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.contactno = contactno;
    }
    public Accountant(String name, String password, String email, String contactno) {
        super();
        this.name = name;
        this.password = password;
        this.email = email;
        this.contactno = contactno;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", contactno='" + contactno + '\'' +
                '}';
    }
}
