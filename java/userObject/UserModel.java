import java.util.List;

class UserModel {
    
    private String name;
    private Integer age;
    private Integer salary;
    private String favoriteColor;
    private Integer luckyNumber;
    //List<UserModel> users


    public UserModel() {
        //no args constructor
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    
    public UserModel(String name, Integer age, Integer salary, String favoriteColor, Integer luckyNumber) { 
        //all args constructor
        
        this.name = name; 
        this.age = age;
        this.salary = salary;
        this.favoriteColor = favoriteColor;
        this.luckyNumber = luckyNumber;
        //this.users = users;
        
    }
    

    //GETTER; getting ages
    // public String getAges() {
    //     return color;
    // }

    // const getUsersRetiringSoon = (listOfUsers) => {
    //     listOfUsers.forEach(theUserImIteratingOn => {
    
    //     // console.log("theUserImIteratingOn", theUserImIteratingOn)
    //     const userAge = theUserImIteratingOn.age
    //   // console.log("userAge", userAge)
      
    //   if (userAge > 59){
    //       listOfUsersRetiringSoon.push(theUserImIteratingOn)
    //   }
      
      
    // })
    // return listOfUsersRetiringSoon
    // }

}
