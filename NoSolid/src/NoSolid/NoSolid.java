package NoSolid;
public class NoSolid {
    public static void main(String args[]){

        Phone phone = new Phone();
        phone.call("rayees");
        Landline landline = new Landline();
        landline.message("rayees");
        PhoneDetector phonedetector = new PhoneDetector(new Apple());
        phonedetector.detect();
    }
}