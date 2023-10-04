/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments02_numbers;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class SpeedLimit {

    public static void main(String[] args) {
       double distanceKm = 50;
       int maxSpeedKmH = 50;
       int inHour = 12;
       int inMin = 0;
       int inSek = 0;
       int outHour = 12;
       int outMin = 16;
       int outSek = 0;
       
       double averageSpeed;
       boolean payFine;
       
       //int inSekAll = inHour*3600 + inMin*60 + inSek;
       //int outSekAll = outHour*3600 + outMin*60 + outSek;
       int inSekAll = timeToSek(inHour, inMin, inSek);
       int outSekAll = timeToSek(outHour, outMin, outSek);
       double timeH = (double)(outSekAll - inSekAll) / 3600; //pretypovani jednoho operanda na double => realne deleni
       averageSpeed = distanceKm/timeH;
       
        System.out.format("Tvoje prumerna rychlost je %.2f km/h\n", averageSpeed);
    }
    
    public static int timeToSek(int hour, int min, int sek){
        return hour*3600 + min*60 + sek;
    }
    
}
