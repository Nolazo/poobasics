class Main{
  public static void main(String[] args){ 
    Car car = new Car();

    car.license = "ABC-123";
    car.driver = "John Doe";
    car.passenger = 4;
    
    System.out.println("Car License: " + car.license);
  }
}