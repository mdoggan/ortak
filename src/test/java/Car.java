public class Car extends vehicle {
public String name;
    public int wheel;
    protected String brand;

    @Override
    public int move(int currentVelocity, int time) {

        System.out.println("from car");
        return super.move(currentVelocity, time);
    }
public void read(){
        System.out.println("name come from parent class"+super.name);
       super.move(10,20);

}
    public Car( int wheel, String brand) {
        super("car", 10, 100, 110, 180);
        this.wheel = wheel;
        this.brand = brand;
    }
}
