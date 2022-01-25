package NoSolid;
public class PhoneDetector {
    Apple apple;
    PhoneDetector(Apple apple){
        this.apple = apple;
    }
    public void detect(){
        apple.use();
    }
}
