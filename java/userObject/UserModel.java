class UserModel {
    
    private String name;
    private Integer age;
    private Integer salary;
    private String favoriteColor;
    private Integer luckyNumber;


    public UserModel() {
        //no args constructor
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    
    public HouseModel(String name, Integer age, Integer salary, String favoriteColor, Integer luckyNumber, List<Owner> owners) { 
        //all args constructor
        
        this.name = name; 
        this.age = age;
        this.salary = salary;
        this.favoriteColor = favoriteColor;
        this.luckyNumber = luckyNumber;

        
    }

}
