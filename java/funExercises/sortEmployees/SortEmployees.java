//package sortEmployees;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class SortEmployees {
    public static void main(String[] args) {
        System.out.println("----------------SORT OBJECTS BY DIFFERENT FIELDS----------------");

        //create employee model with following fields:
        // private String name;
        // private Integer age;
        // private OffsetDateTime birthday;
        //create list of 10 employees
        //sysout list of employees sorted by name alphabetically
        //sysout list of employees sorted by age numberically
        //sysout list of employees sorted by bday oldest to youngest
        System.out.println("-----------------EMPLOYEES-------------------");

        //OffsetDateTime class represents date-time with an offset from UTC/Greenwich calander system
        //class is imutable and thread-safe
        // -__ number at end represents by how much the time is offset from UTC//ALL ARGS CONSTRUCTOR
        //alternative to java.util.Date
        Employee employee1 = new Employee("Bucky", 4, OffsetDateTime.of(2019,7,1,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee2 = new Employee("Rocky", 8, OffsetDateTime.of(2014,7,6,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee3 = new Employee("Hank", 10, OffsetDateTime.of(2009,11,17,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee4 = new Employee("Emre", 28, OffsetDateTime.of(1994,1,10,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee5 = new Employee("Victoria", 26, OffsetDateTime.of(1996,8,15,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee6 = new Employee("Lucas", 28, OffsetDateTime.of(1994,1,1,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee7 = new Employee("Daniel", 16, OffsetDateTime.of(2004,11,27,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee8 = new Employee("Felix", 31, OffsetDateTime.of(1991,5,6,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee9 = new Employee("Nieve", 1, OffsetDateTime.of(2020,3,12,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        Employee employee10 = new Employee("June", 30, OffsetDateTime.of(1990,10,9,23,42, 15, 338650,ZoneOffset.of("-05:00")));
        OffsetDateTime offsetDate = OffsetDateTime.now();
        System.out.println(offsetDate); //go to laptop and get time
        OffsetDateTime offsetDate2 = OffsetDateTime.of(2019,7,1,23,42, 15, 338650,ZoneOffset.of("-05:00"));

        // OffsetDateTime offsetDT1 = OffsetDateTime.of(1980,4,9,20,15,45,345875000,ZoneOffset.of("+07:00"));         
        System.out.println(offsetDate2);
    }
}
