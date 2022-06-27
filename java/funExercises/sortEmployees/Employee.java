package sortEmployees;

import java.time.OffsetDateTime;

public class Employee {
    private String name;
    private Integer age;
    private OffsetDateTime birthday;

    public Employee() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public Employee(String name, Integer age, OffsetDateTime birthday) {
        //ALL ARGS CONSTRUCTOR
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public OffsetDateTime getBirthDay(){
        return birthday;
    }

    public void setBirthDay(OffsetDateTime birthday){
        this.birthday = birthday;
    }


    // overwriting
    public String toString(){
        return "Employee: { name: " + name 
        + " ,age: " + age
        + " ,birthday: " + birthday
        + " }";
    }

}
