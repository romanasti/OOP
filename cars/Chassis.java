package cars;

public class Chassis {
    private final int seats;
    private final int fuel_tank;
    private final float max_speed;
    private final int lenght;
    private final int width;
    private final int height;

    public Chassis(int seats, int fuel_tank, float max_speed, int lenght, int width, int height) {
        this.seats = seats;
        this.fuel_tank = fuel_tank;
        this.max_speed = max_speed;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public int getSeats() {return seats;}
    public float getFuelTank() {return fuel_tank;}
    public float getSpeedMax() {return max_speed;}
    public float getLenght() {return lenght;}
    public float getWidth() {return width;}
    public float getHeight() {return height;}

    public String toChassis() {
        String inf = "max_speed: " + max_speed + ", seats: " + seats + ",  fuel_tank " + fuel_tank;
        return inf;
    }
}
