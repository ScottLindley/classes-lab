/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class StopLight {
    private String mLightColor;

    public StopLight(){
        mLightColor = "red";
    }

    public boolean isGreen(){
        if(mLightColor.equals("green")){
            return true;
        }
        return false;
    }

    public boolean isYellow(){
        if(mLightColor.equals("yellow")){
            return true;
        }
        return false;
    }

    public boolean isRed(){
        if(mLightColor.equals("red")){
            return true;
        }
        return false;
    }

    public void changeLightColor(){
        if(isGreen()){
            setLightColor("yellow");
            System.out.println("The light turns yellow");
        }else if(isYellow()){
            setLightColor("red");
            System.out.println("The light turns red");
        }else{
            setLightColor("green");
            System.out.println("The light turns green");
        }
    }

    public void setLightColor(String lightColor) {
        String inputLowerCase = lightColor.toLowerCase();
        switch (inputLowerCase){
            case "green":case "yellow":case "red":
                mLightColor = inputLowerCase;
                break;
            default:
                System.out.println("that's not a valid light color");
        }
    }
}
