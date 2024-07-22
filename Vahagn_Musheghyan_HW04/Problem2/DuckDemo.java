package Vahagn_Musheghyan_HW04.Problem2;

public class DuckDemo {

    public static void main(String[] args) {
        // Create an array of Duck objects
        Duck[] ducks = new Duck[20];

        // Initialize ducks with random eye and beak characters
        for (int i = 0; i < ducks.length; i++) {
            ducks[i] = new Duck();
        }

        // Print the array of ducks
        System.out.println("Original Ducks:");
        Duck.print(ducks);
        System.out.println();

        // Demonstrate copying a duck
        Duck copiedDuck = new Duck(ducks[0]);
        System.out.println("Copied Duck: " + copiedDuck);
        System.out.println();

        // Demonstrate friendship and similarity checks
        System.out.println("Befriending some ducks...");
        ducks[0].befriend(ducks[1]);
        ducks[2].befriend(ducks[3]);
        ducks[0].befriend(ducks[2]);
        ducks[4].befriend(ducks[0]);

        // Print the updated array of ducks with their friends
        System.out.println("Ducks after befriending:");
        Duck.print(ducks);
        System.out.println();

        // Compare some ducks for similarity and identity
        System.out.println("Checking duck similarities and identities:");
        System.out.println("Is ducks[0] similar to ducks[1]? " + Duck.isSimilar(ducks[0], ducks[1]));
        System.out.println("Is ducks[0] identical to ducks[4]? " + Duck.isIdentical(ducks[0], ducks[4]));
        System.out.println("Is ducks[2] similar to ducks[3]? " + ducks[2].isSimilar(ducks[3]));
        System.out.println("Is ducks[1] identical to ducks[2]? " + ducks[1].isIdentical(ducks[2]));
        System.out.println();

        // Access special ducks
        System.out.println("Elder Oracle Duck: " + Duck.getElderOracle());
        System.out.println("Influencer Star Duck: " + Duck.getInfluencerStar());
        System.out.println();

        // Attempt to exceed friend limit (for demonstration purposes)
        Duck duckA = new Duck();
        Duck duckB = new Duck();
        for (int i = 0; i < 100; i++) {
            duckA.befriend(duckB);
        }
    }
}
