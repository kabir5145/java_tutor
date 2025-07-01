package com.company;


interface camera{
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
interface wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }void pickCall(){
        System.out.println("Calling....");
    }
}

class mySmartPhone extends myCellPhone implements wifi,camera{
   public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking the snap");
    }
//    public void recordingIn4k(){
//        System.out.println("RECORDING THE VIDEO IN 4K AS THE QUALITY OF THE PICTURE IN 4K IS VERY GOOD");
//    }
    public String[]getNetworks() {
        System.out.println("Getting the list of the networks");
        String[] netWorkList = {"raghav,kabir,aaditya"};
        return netWorkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to"+network);
    }
}
public class cwh_57_default_methods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String[] ar = ms.getNetworks();
        for (String item :ar){
            System.out.println(item);
            ms.recordingIn4k();
            //ms.greet(); this throws an error as it is a private class mentioned
        }
    }
}
