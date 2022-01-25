package WithSolid;
class Patternunlock implements Unlock {
    public void unlock(){
        System.out.println("unlocking the phone using pattern");
    }
}
class Biometricunlock implements Unlock{
    public void unlock(){
        System.out.println("unlocking the phone using biometric");
    }
}
