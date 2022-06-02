//import java.util.List;

class UserModel {
    
    private String name;
    private Integer age;
    private Integer salary;
    private String favoriteColor;
    private Integer luckyNumber;
    //


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
        
        
    }
    

    //GETTING name
    public String getName() {
        return this.name;
    }
    //SETTING name
    public void setName(String name) {
        this.name = name; //setting the name through the all args constructor
    }



    //GETTING age
    public Integer getAge() {
        return this.age;
    }
    //SETTING age
    public void setAge(Integer age) {
        this.age = age; //setting the age through the all args constructor
    }



    //GETTING salary
    public Integer getSalary() {
        return this.salary;
    }
    //SETTING salary
    public void setSalary(Integer salary) {
        this.salary = salary; //setting the salary through the all args constructor
    }


    //GETTING favorite color
    public String getFavoriteColor() {
        return this.favoriteColor;
    }
    //SETTING favorite color
    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor; //setting the name through the all args constructor
    }


    
    //GETTING lucky number
    public Integer getLuckyNumber() {
        return this.luckyNumber;
    }
    //SETTING luckyNumber
    public void setLuckyNumber(Integer luckyNumber) {
        this.luckyNumber = luckyNumber; //setting the age through the all args constructor
    }

}
