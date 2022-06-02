import java.util.List;

class UsersList {

    //EACH MODEL/CLASS NEEDS THEIR OWN FILE, UsersList AND UserModel MUST BE SEPARATE
    //List<UserModel> users = List.of(user1, user2, user3, user4, user5);
    //private List<UsersList> UsersModel;
    private String name;
    private Integer age;
    private Integer salary;
    private String favoriteColor;
    private Integer luckyNumber;

    public UsersList() {
        //no args 
    }


    public UsersList(String name, Integer age, Integer salary, String favoriteColor, Integer luckyNumber) { 
        //all args constructor
        
        this.name = name; 
        this.age = age;
        this.salary = salary;
        this.favoriteColor = favoriteColor;
        this.luckyNumber = luckyNumber;
        
        
    }
}
