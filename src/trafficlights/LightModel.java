/**
 * Code is prose. Lefty G Balogh
 */

package trafficlights;

/**
 *
 * @author lefty
 */
public class LightModel {
    private boolean red;
    private boolean yellow;
    private boolean green;

    public LightModel() {
    }

    public LightModel(boolean red, boolean yellow, boolean green) {
        this.red = red;
        this.yellow = yellow;
        this.green = green;
    }
    
    public void setLight(boolean red, boolean yellow, boolean green) {
        this.red = red;
        this.yellow = yellow;
        this.green = green;
    }

public void switchRed(){
    red = !red;
}    
    
public void switchYellow(){
    yellow = !yellow;
}    

public void switchGreen(){
    green = !green;
}    

    public boolean isRed() {
        return red;
    }

    public boolean isYellow() {
        return yellow;
    }

    public boolean isGreen() {
        return green;
    }

    
    
    
}
