import java.util.Arrays;

public class GunDemo {

    public static void main(String[] args) {

        // 1️⃣ Store references (array of 10 gun models)
        String[] gunModels = {
            "AK47", "M16", "Glock17", "DesertEagle", "Uzi",
            "MP5", "ScarL", "SniperX", "Pistol9mm", "Shotgun12G"
        };

        // 2️⃣ Update element
        gunModels[3] = "Beretta";

        // 3️⃣ Read & print using loop
        System.out.println("Gun Models:");
        for (int i = 0; i < gunModels.length; i++) {
            System.out.println(gunModels[i]);
        }

        // 4️⃣ Access elements in reverse direction
        System.out.println("\nReverse Order:");
        for (int i = gunModels.length - 1; i >= 0; i--) {
            System.out.println(gunModels[i]);
        }

        // 5️⃣ Sort elements
        Arrays.sort(gunModels);
        System.out.println("\nSorted Gun Models:");
        for (String gun : gunModels) {
            System.out.println(gun);
        }

        // 6️⃣ ArrayIndexOutOfBoundsException Demo
        try {
            System.out.println("\nException Demo:");
            System.out.println(gunModels[15]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}