package lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook("IntelCore i3", "8-16Гб", "15.6 inches", true, "1.4 kg");
        System.out.println(ultrabook);
        Workstation workstation = new Workstation("IntelCore i4", "8-16Гб", "14.0 inches", true, "NVidia Quadro");
        System.out.println(workstation);


    }
}
