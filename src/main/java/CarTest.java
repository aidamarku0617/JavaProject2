public class CarTest {
    public static void main(String[] args) {
        Car car=new Car(20000,"Red");
        System.out.println("Car price; "+car.calculateSalePrice());

        Sedan sedan=new Sedan(35000,"Black",22);
        System.out.println("Sedan price "+sedan.calculateSalePrice());

        Truck truck=new Truck(50000,"blue",2500);
        System.out.println("Truck price "+truck.calculateSalePrice());
    }
}
