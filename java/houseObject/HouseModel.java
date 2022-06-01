class HouseModel {

//models will always have getters and setters

    private String color;
    Integer year;
    Boolean backYard;
    Integer levels;
    private List<Owner> owners; //create owner object, create an owner model with own fields
    //create getters and setters for this
         

//one more poprerty but this d
    public HouseModel() {
        //no args constructor
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }
    
//all args constructor
    public HouseModel(String color, Integer year, Boolean backYard, Integer levels, List<Owner> owners) { 
        
        this.color = color; 
        this.year = year;
        this.backYard = backYard;
        this.levels = levels;
        this.owners = owners;

        
    }

    //GETTER; getting house color
    public String getHouseColor() {
        return color;
    }

    //SETTER; setting house color
    public void setHouseColor(String color) {
        this.color = color;
    }
}
