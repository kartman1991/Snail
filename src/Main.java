import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner poleHeightScanner = new Scanner(System.in);
        Scanner dayUpScanner = new Scanner(System.in);
        Scanner nightDownScanner = new Scanner(System.in);

        int poleHeight = poleHeightScanner.nextInt();
        int dayUp = dayUpScanner.nextInt();
        int nightDown = nightDownScanner.nextInt();
        int snailFinishDay = 0;

        if (poleHeight < nightDown || dayUp < nightDown){
            System.out.println("Input is incorrect");
        }else{
            for (int i = 0; i < poleHeight - nightDown; i = i + dayUp - nightDown) {
                snailFinishDay++;
            }
            System.out.println(snailFinishDay);
        }
    }
}
