package task2;


public class Employee {
    StationaryList stationaryList = new StationaryList();
    String name;
    Object[] inventory = new Object[0];

    Employee(String name) {
        this.name = name;
    }

}
