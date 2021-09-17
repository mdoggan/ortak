public class vehicle {
    public String name;
    private int size;
    private int velocity;
    private int currentVelocity;
    private int currentDriction;
    int time =10;



    public vehicle(String name, int size) {

        this.name = name;
        this.size = size;

    }

    public vehicle(String name, int size, int velocity, int currentVelocity, int currentDriction) {
        this(name,size);
        this.velocity = velocity;
        this.currentVelocity = currentVelocity;
        this.currentDriction = currentDriction;
    }
    public void move(int currentVelocity){
        System.out.println("current velocity"+currentVelocity);
    }
    public int move(int currentVelocity, int time){
        System.out.println("from vehicle");
        int distance=currentVelocity*time;
        return distance;

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDriction() {
        return currentDriction;
    }

    public void setCurrentDriction(int currentDriction) {
        this.currentDriction = currentDriction;
    }

    public void setName(String name) {
        this.name = name;
    }
}
