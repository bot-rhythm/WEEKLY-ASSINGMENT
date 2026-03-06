public class KilometersToMiles {
    public static void main(String[] args) {
        // Variable declarations
        double distanceInKm = 10.8;
        double conversionFactor = 1.6;
        double distanceInMiles;
        
        // Convert km to miles
        distanceInMiles = distanceInKm / conversionFactor;
        
        // Display output
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}

