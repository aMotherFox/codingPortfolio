package com.my.firstSpringBootService;

import lombok.*;

//GENERATE IS A FEATURE OF INTELLIJ

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
//@Getter
//@Setter
//@ToString
@Data //has all the getters, setters, and toString built in
public class Car {

    private String model;
    private String make;
    private Integer year;
    private String color;
    private Integer doors;

//    public Car() {
//        // no args constructor
//    }
//
//    public Car(String model, String make, Integer year, String color) {
//        this.model = model;
//        this.make = make;
//        this.year = year;
//        this.color = color;
//    }
//
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    public void setYear(Integer year) {
//        this.year = year;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", make='" + make + '\'' +
//                ", year=" + year +
//                ", color='" + color + '\'' +
//                '}';
//    }

}
