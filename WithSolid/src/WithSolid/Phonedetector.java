package WithSolid;
public class Phonedetector {
    Usage usage;
    Phonedetector(Usage usage){
        this.usage = usage;
    }
    public void detect(){
        usage.use();
    }
}
