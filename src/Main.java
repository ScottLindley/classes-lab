import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        StopLight light = new StopLight();
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("red","jeep",90));
        cars.add(new Car("blue","honda",103.5));
        cars.add(new Car("pink","range rover",95));
        cars.add(new Car("black","porche",145));
        cars.add(new Car("white","chevy",120));
        cars.add(new Car("green","ford",120));
        cars.add(new Car("purple","mustang",130));
        cars.add(new Car("grey","camaro",150));
        cars.add(new Car("green","mini cooper",110));
        cars.add(new Car("red","volkswagon",90));
        cars.add(new Car("white","toyota",101));
        cars.add(new Car("orange","subaru",128));
        cars.add(new Car("silver","scion",89));
        cars.add(new Car("brown","station wagon",65));
        cars.add(new Car("grey","dump truck",60));
        cars.add(new Car("black","hummer",98));
        cars.add(new Car("green","tank",78));
        cars.add(new Car("blue","mazda",111));
        cars.add(new Car("silver","mercedes",123));
        cars.add(new Car("orange","fiat",88));
        for (int i=0; i<30; i++){
            //code to change light color found in StopLight class
            light.changeLightColor();
            if(light.isGreen()){
                for(Car c: cars){
                    c.go();
                }
            }else if(light.isYellow()){
                for(Car c: cars){
                    c.slow();
                }
            }else{
                Random random = new Random();
                int carIndex = random.nextInt(20);
                for(Car c: cars){
                    if(!(cars.indexOf(c)==carIndex)){
                        c.stop();
                    }
                }
                System.out.println("The "+cars.get(carIndex).getColor()+" "+cars.get(carIndex).getBrand()+" decided" +
                        " to run the red light!");
                System.out.println("It accelerates to its top speed of "+cars.get(carIndex).getTopSpeed()+"MPH");

            }
        }
    }
}
