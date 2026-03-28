import java.util.Arrays;

public class LipstickDemo {

    public static void main(String[] args) {

        
        String[] lipstickBrands = {
            "Lakme", "Maybelline", "Nykaa", "MAC", "Colorbar",
            "Revlon", "Sugar", "Faces", "Elle18", "Huda"
        };

        
        lipstickBrands[2] = "Loreal";

        
        System.out.println("Lipstick Brands:");
        for (int i = 0; i < lipstickBrands.length; i++) {
            System.out.println(lipstickBrands[i]);
        }

        
        System.out.println("\nReverse Order:");
        for (int i = lipstickBrands.length - 1; i >= 0; i--) {
            System.out.println(lipstickBrands[i]);
        }

        
        Arrays.sort(lipstickBrands);
        System.out.println("\nSorted Brands:");
        for (String brand : lipstickBrands) {
            System.out.println(brand);
        }

        
        try {
            System.out.println("\nException Demo:");
            System.out.println(lipstickBrands[20]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}