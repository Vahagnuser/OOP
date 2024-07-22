package Vahagn_Musheghyan_HW04.ExtraDuck;

import java.util.Arrays;
import java.util.Random;

/**
 * Represents an efficient version of a Duck with a single byte variable for eye and beak.
 */
public class EfficientDuck {
    private byte eyeAndBeak; // Combined byte for both eye and beak
    private EfficientDuck[] friendList; // Partially-filled array for storing friends
    private int numberOfFriends; // Number of current friends
    // Static variables for special ducks
    private static EfficientDuck elderOracle;
    private static EfficientDuck influencerStar;

    /**
     * Constructs an EfficientDuck with specified eye and beak characters.
     *
     * @param eyeAndBeak The byte representing both the eye and beak of the duck.
     */
    public EfficientDuck(byte eyeAndBeak) {
        this.eyeAndBeak = eyeAndBeak;
        this.friendList = new EfficientDuck[100]; // Initialize friendList with size 100
        this.numberOfFriends = 0;
        // Set the first created EfficientDuck as the elderOracle
        if (elderOracle == null) {
            elderOracle = this;
        }
    }

    /**
     * Constructs an EfficientDuck with a randomly generated eye and beak characters.
     */
    public EfficientDuck() {
        this.eyeAndBeak = getRandomEyeAndBeak();
        this.friendList = new EfficientDuck[100];
        this.numberOfFriends = 0;
        // Set the first created EfficientDuck as the elderOracle
        if (elderOracle == null) {
            elderOracle = this;
        }
    }

    /**
     * Copy constructor for creating a new EfficientDuck identical to another EfficientDuck.
     *
     * @param other The EfficientDuck object to copy.
     */
    public EfficientDuck(EfficientDuck other) {
        this.eyeAndBeak = other.eyeAndBeak;
        this.friendList = Arrays.copyOf(other.friendList, 100); // Copy the friendList array
        this.numberOfFriends = other.numberOfFriends;
    }

    /**
     * Returns the combined byte representing both the eye and beak of the EfficientDuck.
     *
     * @return The byte representing eye and beak.
     */
    public byte getEyeAndBeak() {
        return eyeAndBeak;
    }

    /**
     * Returns the array of Duck objects that are friends with this EfficientDuck.
     *
     * @return The array of Duck friends.
     */
    public EfficientDuck[] getFriendList() {
        return friendList;
    }

    /**
     * Returns the number of current friends of this EfficientDuck.
     *
     * @return The number of friends.
     */
    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    /**
     * Returns the elderOracle EfficientDuck, which is the first created EfficientDuck object.
     *
     * @return The elderOracle EfficientDuck object.
     */
    public static EfficientDuck getElderOracle() {
        return elderOracle;
    }

    /**
     * Returns the influencerStar EfficientDuck, which is the EfficientDuck with the most friends.
     *
     * @return The influencerStar EfficientDuck object.
     */
    public static EfficientDuck getInfluencerStar() {
        return influencerStar;
    }

    /**
     * Sets the combined byte representing both the eye and beak of this EfficientDuck.
     *
     * @param eyeAndBeak The new combined byte for eye and beak.
     */
    public void setEyeAndBeak(byte eyeAndBeak) {
        this.eyeAndBeak = eyeAndBeak;
    }

    /**
     * Checks if two EfficientDuck objects are similar, meaning they share at least one common feature (eye or beak).
     *
     * @param d1 The first EfficientDuck object.
     * @param d2 The second EfficientDuck object.
     * @return True if the EfficientDucks are similar, false otherwise.
     */
    public static boolean isSimilar(EfficientDuck d1, EfficientDuck d2) {
        byte eye1 = (byte) (d1.eyeAndBeak >> 4); // Extract upper 4 bits for eye
        byte beak1 = (byte) (d1.eyeAndBeak & 0x0F); // Extract lower 4 bits for beak
        byte eye2 = (byte) (d2.eyeAndBeak >> 4);
        byte beak2 = (byte) (d2.eyeAndBeak & 0x0F);
        return eye1 == eye2 || beak1 == beak2;
    }

    /**
     * Checks if this EfficientDuck is similar to another EfficientDuck, meaning they share at least one common feature (eye or beak).
     *
     * @param other The other EfficientDuck object to compare.
     * @return True if the EfficientDucks are similar, false otherwise.
     */
    public boolean isSimilar(EfficientDuck other) {
        return isSimilar(this, other);
    }

    /**
     * Checks if two EfficientDuck objects are identical, meaning they have the same eye and beak characters.
     *
     * @param d1 The first EfficientDuck object.
     * @param d2 The second EfficientDuck object.
     * @return True if the EfficientDucks are identical, false otherwise.
     */
    public static boolean isIdentical(EfficientDuck d1, EfficientDuck d2) {
        return d1.eyeAndBeak == d2.eyeAndBeak;
    }

    /**
     * Checks if this EfficientDuck is identical to another EfficientDuck, meaning they have the same eye and beak characters.
     *
     * @param other The other EfficientDuck object to compare.
     * @return True if the EfficientDucks are identical, false otherwise.
     */
    public boolean isIdentical(EfficientDuck other) {
        return this.eyeAndBeak == other.eyeAndBeak;
    }

    /**
     * Returns a string representation of this EfficientDuck, showing its eye and beak characters.
     *
     * @return The string representation of the EfficientDuck.
     */
   
    public String toString() {
        byte eye = (byte) (eyeAndBeak >> 4); // Extract upper 4 bits for eye
        byte beak = (byte) (eyeAndBeak & 0x0F); // Extract lower 4 bits for beak
        return beak + "(" + eye + ")";
    }

    /**
     * Helper method to get a random combined byte for eye and beak.
     *
     * @return The randomly generated combined byte.
     */
    private byte getRandomEyeAndBeak() {
        Random rand = new Random();
        // Generate random values for eye (upper 4 bits) and beak (lower 4 bits)
        byte eye = (byte) rand.nextInt(16); // 0 to 15 (4 bits)
        byte beak = (byte) rand.nextInt(16); // 0 to 15 (4 bits)
        // Combine eye and beak into a single byte
        return (byte) ((eye << 4) | beak);
    }
 /**
     * Prints an array of Duck objects in a formatted grid.
     *
     * @param ducks The array of Duck objects to print.
     */
    public static void print(EfficientDuck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.print(ducks[i] + "____ ");
            if ((i + 1) % 10 == 0 && ducks[i].eyeAndBeak<10 ) {
                System.out.println();
                for (int j = 0; j < 10; j++) {
                    System.out.print("   \\___/ ");
                }
                System.out.println();
            }
        }

        if (ducks.length % 10 != 0) {
            System.out.println();
            for (int j = 0; j < ducks.length % 10; j++)
                System.out.print("   \\___/ ");
        }
    }

    /**
     * Adds another EfficientDuck to this EfficientDuck's friend list, establishing a mutual friendship.
     * Updates the influencerStar if necessary based on the number of friends.
     *
     * @param other The EfficientDuck object to befriend.
     */
    public void befriend(EfficientDuck other) {
        if (this.numberOfFriends >= 100 || other.numberOfFriends >= 100) {
            System.err.println("Error: Memory limit reached for friends list. Cannot add more friends.");
            System.exit(1);
        }

        // Add each other to friend lists
        this.friendList[this.numberOfFriends++] = new EfficientDuck(this.eyeAndBeak); // Create a new Duck with this EfficientDuck's eye and beak
        other.friendList[other.numberOfFriends++] = new EfficientDuck(other.eyeAndBeak); // Create a new Duck with other EfficientDuck's eye and beak

        // Update the influencerStar based on the number of friends
        if (influencerStar == null || this.numberOfFriends > influencerStar.numberOfFriends) {
            influencerStar = this;
        } else if (other.numberOfFriends > influencerStar.numberOfFriends) {
            influencerStar = other;
        } else if (this.numberOfFriends == influencerStar.numberOfFriends && other.numberOfFriends == influencerStar.numberOfFriends) {
            influencerStar = this;
        }
    }
}