import java.util.Scanner;

public class StringSplitExample {

    public static void main(String[] args) {
        /**
         * Hurricane Patricia set records for the highest maximum sustained winds ever recorded in a tropical cyclone and the second-lowest barometric pressure (after Typhoon Tip of 1979). Originating near the Gulf of Tehuantepec off the Pacific coast of southern Mexico, the system was classified as a tropical depression on October 20, 2015. The next day it became a tropical storm, the twenty-fourth named storm of the 2015 Pacific hurricane season. The following day it grew from a tropical storm to a Category 5 hurricane in just 24 hours. The National Hurricane Center ultimately estimated that Patricia attained winds of 215 mph (345 km/h) and a minimum pressure of 872 mbar (hPa; 25.75 inHg). The storm made landfall on October 23 near Cuixmala, Jalisco, in a significantly weakened state, but it was still the strongest recorded hurricane to strike Mexico's Pacific coast, with winds estimated at 150 mph (240 km/h).     */
        Scanner s = new Scanner(System.in);
        String message = s.nextLine();
        System.out.println(message);
        System.out.println(message.length());

        String[] splits = message.split("\\.");
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }



    }

}
