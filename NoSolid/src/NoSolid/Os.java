package NoSolid;
class Android extends Phone implements Applications {
    public void whatsapp(){
        System.out.println("Opening Whatsapp");
    }
    public void instagram() {
        System.out.println("Opening instagram");
    }
    public void pikashow(){
        System.out.println("opening 3rd party app");
    }
}
class Ios extends Phone implements Applications {
    public void whatsapp(){
        System.out.println("Opening Whatsapp");
    }
    public void instagram() {
        System.out.println("Opening instagram");
    }
    public void pikashow(){
        //ios does not support 3rd party apps
    }
}
