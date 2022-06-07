public class User {

    //User with fields: id, firstName, lastName, email

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public User() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public User(Integer id, String firstName, String lastName, String email) {
        //ALL ARGS CONSTRUCTOR
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //id getting and setting
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    //firstName getting and setting
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //lastName getting and setting
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    
}
