package com.company;

interface bicycle{
    int a =45;
    void applyBreaks(int decrement);
    void speedUp(int increment);
}
interface hornBcycle{
    void blowHornK3g();
    void blowHornmhn();
}
    class avonCycle implements bicycle ,hornBcycle{
        void blowHorn(){
            System.out.println("pee pee poo poo ");
        }

        public void applyBreaks(int decrement) {
            System.out.println("applied the breaks");
        }

        public void speedUp(int increment) {
            System.out.println("Applying speeding up");
        }

        public void blowHornK3g() {
            System.out.println("kabhi khushi kabhi gum");
        }

        public void blowHornmhn() {
            System.out.println("gang of Wasseypur");
        }
    }

    public class cwh_54_interfaces {
        public static void main(String[] args) {
            avonCycle kabir = new avonCycle();
            kabir.applyBreaks(1);
            //you can create properties in Interfaces
           // System.out.println(bicycle.a);
            //you cannot modify the properties in Interfaces as they are final
            kabir.blowHornK3g();
            kabir.blowHornmhn();

        }
    }


