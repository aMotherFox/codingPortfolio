public class HouseClass {//object class aka model
    //a getter method returns its value while a setter method sets/updates its value

    public static void main(String[] args) {
        
    
        System.out.println("HOUSES");

        //to get an INSTANCE of a class, you must INSTANCIATE it
        //must instanciate the class  to get an instance (object) of it
        //new, constructor (HouseModel)
        //HouseModel is the datatype
        //HouseModel house1 = new HouseModel(); //instanciating our no args constructor

        HouseModel house1 = new HouseModel("blue", 1988, true, 2); //passing into all args constructor on HouseModel.java
        house1.setHouseColor("pink"); //overriding blue and SETTING to pink
        System.out.println("house1 color: " +  house1.getHouseColor()); //GETTING house color
        System.out.println("house1 built in: " +  house1.year);
        System.out.println("is there a backyard: " +  house1.backYard);
        System.out.println("how many levels: " + house1.levels);
        System.out.println("Owners: " + house1.getOwnerList());

        // HouseModel house2 = new HouseModel("brown", 2002, true, 4); //passing into all args constructor on HouseModel.java
        // System.out.println("house2 color: " +  house2.getHouseColor()); //GETTING house color
        // System.out.println("house2 built in: " +  house2.year);
        // System.out.println("is there a backyard: " +  house2.backYard);
        // System.out.println("how many levels: " + house2.levels);

        //getters and setters
        //house1.set FINISH FROM HERE




    
    }

}