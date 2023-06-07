//package finalProject;
import java.util.*;
/*
 File: MoutainCall.java
 Description: Final Project
 Created: Tues. June 6, 2023, 12:00pm
 Author: Tevinn Howard
 email: howardt125577@student.vvc.edu
*/
public class MountainCall {

    public static void minElevation(HashMap<Double, String> mountainNames) {
        
        TreeMap<Double,String> tm = new  TreeMap<Double,String> (mountainNames);
        Iterator<Double> itr = tm.keySet().iterator(); 
while (itr.hasNext()) {
    Double key = (Double) itr.next();
    System.out.println(key + "\t" + mountainNames.get(key));
    break;
}
        
}

    public static void main(String[] args) {
       
        //Creating class objects
        Mountain mount1 = new Mountain();
        Mountain mount2 = new Mountain();
        Mountain mount3 = new Mountain();
        Mountain mount4 = new Mountain();
        Mountain mount5 = new Mountain();
        Mountain mount6 = new Mountain();
        Mountain mount7 = new Mountain();
        
         //Calling Setter methods for elevation
        mount1.setElevation(20549.00);
        mount2.setElevation(14692.00);
        mount3.setElevation(9573.00);
        mount4.setElevation(29029.00);
        mount5.setElevation(5344.00);
        mount6.setElevation(6684.00);
        mount7.setElevation(9719.00);
       
         //Calling Setter methods for mountains
        mount1.setMount("Chimborazo");
        mount2.setMount("Matterhorn");
        mount3.setMount("Olympus");
        mount4.setMount("Everest");
        mount5.setMount("Mount Marcy - Adirondacks");
        mount6.setMount("Mount Mitchell - Blue Ridge");
        mount7.setMount("Zugspitze");

        //calling setter methods for country names
        mount1.setCountry("Ecuador");
        mount2.setCountry("Switzerland");
        mount3.setCountry("Greece (Macedonia)");
        mount4.setCountry("Nepal");
        mount5.setCountry("United States");
        mount6.setCountry("United States");
        mount7.setCountry("Switzerland");

        //Storing table information into Array's
        String [][] mountainArray = new String[7][2];
        Double[] mountainElevation = new Double[7];
        Double[] mountainElevationInM = new Double[7];

       mountainArray[0][0] = mount1.getMount();
       mountainArray[0][1] = mount1.getCountry();
       mountainElevation[0] = mount1.getElevation();
       Double tmp0 = mount1.getElevation();
       mountainElevationInM[0] = mount1.toMeters(tmp0);

       mountainArray[1][0] = mount2.getMount();
       mountainArray[1][1] = mount2.getCountry();
       mountainElevation[1] = mount2.getElevation();
       Double tmp1 = mount2.getElevation();
       mountainElevationInM[1] = mount2.toMeters(tmp1);

       mountainArray[2][0] = mount3.getMount();
       mountainArray[2][1] = mount3.getCountry();
       mountainElevation[2] = mount3.getElevation();
       Double tmp2 = mount3.getElevation();
       mountainElevationInM[2] = mount3.toMeters(tmp2);

       mountainArray[3][0] = mount4.getMount();
       mountainArray[3][1] = mount4.getCountry();
       mountainElevation[3] = mount4.getElevation();
       Double tmp3 = mount4.getElevation();
       mountainElevationInM[3] = mount4.toMeters(tmp3);

       mountainArray[4][0] = mount5.getMount();
       mountainArray[4][1] = mount5.getCountry();
       mountainElevation[4] = mount5.getElevation();
       Double tmp4 = mount5.getElevation();
       mountainElevationInM[4] = mount5.toMeters(tmp4);

       mountainArray[5][0] = mount6.getMount();
       mountainArray[5][1] = mount6.getCountry();
       mountainElevation[5] = mount6.getElevation();
       Double tmp5 = mount6.getElevation();
       mountainElevationInM[5] = mount6.toMeters(tmp5);

       mountainArray[6][0] = mount7.getMount();
       mountainArray[6][1] = mount7.getCountry();
       mountainElevation[6] = mount7.getElevation();
       Double tmp6 = mount7.getElevation();
       mountainElevationInM[6] = mount7.toMeters(tmp6);

       //Printing out elements of the Arrays
       for (int i = 0; i < mountainArray.length; i++ ) {
            System.out.println(mountainArray[i][0] + "\t" + mountainArray[i][1] + "\t" + mountainElevation[i] + "\t" + mountainElevationInM[i]);
       }

      // HashMap<String, Double > mountainNames = new HashMap< String, Double >();
       HashMap<Double, String> elevationKey = new HashMap<Double, String>();

       elevationKey.put(mount1.getElevation(), mount1.getMount());
       elevationKey.put(mount2.getElevation(), mount2.getMount());
       elevationKey.put(mount3.getElevation(), mount3.getMount());
       elevationKey.put(mount4.getElevation(), mount4.getMount());
       elevationKey.put(mount5.getElevation(), mount5.getMount());
       elevationKey.put(mount6.getElevation(), mount6.getMount());
       elevationKey.put(mount7.getElevation(), mount7.getMount());

       
     minElevation(elevationKey);

    }
    
}
