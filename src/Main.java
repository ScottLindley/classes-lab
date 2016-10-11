/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        StopLight light = new StopLight();
        Car car = new Car("red","jeep",90);
        for (int i=0; i<30; i++){
            //code to change light color found in StopLight class
            light.changeLightColor();
            if(light.isGreen()){
                car.go();
            }else if(light.isYellow()){
                car.slow();
            }else{
                car.stop();
            }
        }
    }
}
