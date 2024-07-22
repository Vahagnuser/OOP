package Vahagn_Musheghyan_HW04.Problem2;

import java.util.Arrays;
import java.util.Random;

/**
 * Represents a Duck with customizable eye and beak characters and the ability to manage friendships.
 */
public class Duck {
    private char eye;
    private char beak;
    private Duck[] friendList; // Partially-filled array for storing friends
    private int numberOfFriends; // Number of current friends
    // Static variables for special ducks
    private static Duck elderOracle;
    private static Duck influencerStar;

    /**
     * Constructs a Duck with specified eye and beak characters.
     *
     * @param eye  The character representing the eye of the Duck.
     * @param beak The character representing the beak of the Duck.
     */
    public Duck(char eye, char beak) {
        this.eye = eye;
        this.beak = beak;
        this.friendList = new Duck[100]; // Initialize friendList with size 100
        this.numberOfFriends = 0;
        // Set the first created Duck as the elderOracle
        if (elderOracle == null) {
            elderOracle = this;
        }
    }

    /**
     * Constructs a Duck with random eye and beak characters.
     * Uses default characters for eye (^, -) and beak (<, =, >).
     */
    public Duck() {
        this.eye = getRandomChareye();
        this.beak = getRandomCharbeak();
        this.friendList = new Duck[100];
        this.numberOfFriends = 0;
        // Set the first created Duck as the elderOracle
        if (elderOracle == null) {
            elderOracle = this;
        }
    }

    /**
     * Copy constructor for creating a new Duck identical to another Duck.
     *
     * @param other The Duck object to copy.
     */
    public Duck(Duck other) {
        this.eye = other.eye;
        this.beak = other.beak;
        this.friendList = Arrays.copyOf(other.friendList, 100); // Copy the friendList array
        this.numberOfFriends = other.numberOfFriends;
    }

    /**
     * Returns the character representing the eye of the Duck.
     *
     * @return The eye character.
     */
    public char getEye() {
        return eye;
    }

    /**
     * Returns the character representing the beak of the Duck.
     *
     * @return The beak character.
     */
    public char getBeak() {
        return beak;
    }

    /**
     * Returns the array of Duck objects that are friends with this Duck.
     *
     * @return The array of Duck friends.
     */
    public Duck[] getFriendList() {
        return friendList;
    }

    /**
     * Returns the number of current friends of this Duck.
     *
     * @return The number of friends.
     */
    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    /**
     * Returns the elderOracle Duck, which is the first created Duck object.
     *
     * @return The elderOracle Duck object.
     */
    public static Duck getElderOracle() {
        return elderOracle;
    }

    /**
     * Returns the influencerStar Duck, which is the Duck with the most friends.
     *
     * @return The influencerStar Duck object.
     */
    public static Duck getInfluencerStar() {
        return influencerStar;
    }

    /**
     * Sets the eye character of this Duck.
     *
     * @param eye The new eye character.
     */
    public void setEye(char eye) {
        this.eye = eye;
    }

    /**
     * Sets the beak character of this Duck.
     *
     * @param beak The new beak character.
     */
    public void setBeak(char beak) {
        this.beak = beak;
    }

    /**
     * Checks if two Duck objects are similar, meaning they share at least one common feature (eye or beak).
     *
     * @param d1 The first Duck object.
     * @param d2 The second Duck object.
     * @return True if the Ducks are similar, false otherwise.
     */
    public static boolean isSimilar(Duck d1, Duck d2) {
        return d1.eye == d2.eye || d1.beak == d2.beak;
    }

    /**
     * Checks if this Duck is similar to another Duck, meaning they share at least one common feature (eye or beak).
     *
     * @param other The other Duck object to compare.
     * @return True if the Ducks are similar, false otherwise.
     */
    public boolean isSimilar(Duck other) {
        return isSimilar(this, other);
    }

    /**
     * Checks if two Duck objects are identical, meaning they have the same eye and beak characters.
     *
     * @param d1 The first Duck object.
     * @param d2 The second Duck object.
     * @return True if the Ducks are identical, false otherwise.
     */
    public static boolean isIdentical(Duck d1, Duck d2) {
        return d1.isIdentical(d2);
    }

    /**
     * Checks if this Duck is identical to another Duck, meaning they have the same eye and beak characters.
     *
     * @param other The other Duck object to compare.
     * @return True if the Ducks are identical, false otherwise.
     */
    public boolean isIdentical(Duck other) {
        return this.eye == other.eye && this.beak == other.beak;
    }

    /**
     * Returns a string representation of this Duck, showing its beak and eye characters.
     *
     * @return The string representation of the Duck.
     */
    @Override
    public String toString() {
        return beak + "(" + eye + ")";
    }

    // Helper method to get a random character for beak
    private char getRandomCharbeak() {
        Random rand = new Random();
        String chars = "<=>";
        return chars.charAt(rand.nextInt(chars.length()));
    }

    // Helper method to get a random character for eye
    private char getRandomChareye() {
        Random rand = new Random();
        String chars = "^-";
        return chars.charAt(rand.nextInt(chars.length()));
    }

    /**
     * Prints an array of Duck objects in a formatted grid.
     *
     * @param ducks The array of Duck objects to print.
     */
    public static void print(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.print(ducks[i] + "____ ");
            if ((i + 1) % 10 == 0) {
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
     * Adds another Duck to this Duck's friend list, establishing a mutual friendship.
     * Updates the influencerStar if necessary based on the number of friends.
     *
     * @param other The Duck object to befriend.
     */
    public void befriend(Duck other) {
        if (this.numberOfFriends >= 100 || other.numberOfFriends >= 100) {
            System.err.println("Error: Memory limit reached for friends list. Cannot add more friends.");
            System.exit(1);
        }

        // Add each other to friend lists
        this.friendList[this.numberOfFriends++] = other;
        other.friendList[other.numberOfFriends++] = this;

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
