package bai4;


public class Fan {

    private static final int SLOW=1;
    public static final int MEDIUM =2 ;
    public static final int FAST = 3;
    private int speed = SLOW;

    private boolean connected = false ;

    private double radius =5;

    private String color = "blue";


    public Fan(){

    }
    public Fan(int speed, boolean connected, double radius, String color) {
        this.speed = speed;
        this.connected = connected;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isConnected() {
        return connected;
    }

    public void batQuat(boolean connected) {
        this.connected = true;
    }

    public void tatQuat(boolean connected) {
        this.connected = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.connected?"Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' + "fan is on"+
                '}': "Fan{" +
                ", radius=" + radius +
                ", color='" + color + '\'' + "fan is off"+
                '}';
    }

}
