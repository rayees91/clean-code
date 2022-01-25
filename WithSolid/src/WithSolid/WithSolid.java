package WithSolid;
public class WithSolid {
    public static void main(String args[]){
        Call cal=new Call();
        cal.call("rayees");

        Biometricunlock biometricunlock=new Biometricunlock();
        biometricunlock.unlock();

        Landline landline=new Landline();
        landline.answerCall();

        Ios ios=new Ios();
        ios.whatsapp();

        Usage usage = new Samsung();
        Phonedetector phonedetector = new Phonedetector(usage);
        phonedetector.detect();
    }
}
