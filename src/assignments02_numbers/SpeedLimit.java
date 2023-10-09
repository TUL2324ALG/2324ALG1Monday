package assignments02_numbers;

import java.util.Scanner;

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
       double difference;
       boolean payFine;
       
       //int inSekAll = inHour*3600 + inMin*60 + inSek;
       //int outSekAll = outHour*3600 + outMin*60 + outSek;
       int inSekAll = timeToSek(inHour, inMin, inSek);
       int outSekAll = timeToSek(outHour, outMin, outSek);
       double timeH = (double)(outSekAll - inSekAll) / 3600; //pretypovani jednoho operanda na double => realne deleni
       averageSpeed = distanceKm/timeH;
       difference = maxSpeedKmH - averageSpeed;
       payFine = difference < 0;
       
       //zbytecny
//       if(difference < 0){
//           payFine = true;
//       }else {
//           payFine = false;
//       }
       System.out.println(((payFine)? "Budes ": "Nebudes ") + "platit pokutu.");
       
       if(payFine){
           System.out.println("Budes platit pokutu.");
       }else {
           System.out.println("Nebudes platit pokutu.");
       }
       
       System.out.format("Tvoje prumerna rychlost je %.2f km/h\n", averageSpeed);
        
   }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(timeToSek(a, sc.nextInt(), 5));
//    }
    
    public static int timeToSek(int hour, int min, int sek){
        return hour*3600 + min*60 + sek;
    }
    
}
