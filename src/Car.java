/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class Car {
    private String mColor;
    private String mBrand;
    private double mTopSpeed;

    public Car(String color, String brand, double topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go(){
        System.out.println("The "+mColor+" "+mBrand+" accelerates");
    }

    public void slow(){
        System.out.println("The "+mColor+" "+mBrand+" slows down");
    }

    public void stop(){
        System.out.println("The "+mColor+" "+mBrand+" stops");
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public double getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        mTopSpeed = topSpeed;
    }
}
