
interface camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning my all friends");
    }
    default void recordingIn4k(){
        greet();
        System.out.println("recording the video in 4k....");
    }
}
interface wifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }void pickCall(){
        System.out.println("Calling....");
    }
}

class mySmartPhone2 implements wifi2, camera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking the snap");
    }
    public String[]getNetworks() {
        System.out.println("Getting the list of the networks");
        String[] netWorkList = {"raghav,kabir,aaditya"};
        return netWorkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to"+network);
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        camera2 cam1 = new mySmartPhone2();//this is a smartphone but , use it as a camera
        //cam1.getNetworks();--> not allowed
        cam1.recordingIn4k();
        cam1.recordVideo();
        cam1.takeSnap();
    }
}
