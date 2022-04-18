package Java;

public class Car {
  Integer id;
  String license;
  String driver;
  Integer passenger;

  public Car(String license, String driver) {
    this.license = license;
    this.driver = driver;
  }

  void printDataCar(){
    System.out.println("License: " + license);
    System.out.println("Driver: " + driver);
  }
}
