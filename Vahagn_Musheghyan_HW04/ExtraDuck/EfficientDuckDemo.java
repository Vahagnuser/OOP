package Vahagn_Musheghyan_HW04.ExtraDuck;

public class EfficientDuckDemo {

    public static void main(String[] args) {
        // Create an array of EfficientDuck objects
        EfficientDuck[] ducks = new EfficientDuck[5];

        // Initialize EfficientDucks with random eye and beak values
        for (int i = 0; i < ducks.length; i++) {
            ducks[i] = new EfficientDuck();
        }

        // Print the array of EfficientDucks
        System.out.println("Original EfficientDucks:");
        EfficientDuck.print(ducks);
        System.out.println();

        // Demonstrate copying an EfficientDuck
        EfficientDuck copiedDuck = new EfficientDuck(ducks[0]);
        System.out.println("Copied EfficientDuck: " + copiedDuck);
        System.out.println();

        // Demonstrate friendship and similarity checks
        System.out.println("Befriending some EfficientDucks...");
        ducks[0].befriend(ducks[1]);
        ducks[2].befriend(ducks[3]);
        ducks[0].befriend(ducks[2]);
        ducks[4].befriend(ducks[0]);

        // Print the updated array of EfficientDucks with their friends
        System.out.println("EfficientDucks after befriending:");
        EfficientDuck.print(ducks);
        System.out.println();

        // Compare some EfficientDucks for similarity and identity
        System.out.println("Checking EfficientDuck similarities and identities:");
        System.out.println("Is ducks[0] similar to ducks[1]? " + EfficientDuck.isSimilar(ducks[0], ducks[1]));
        System.out.println("Is ducks[0] identical to ducks[4]? " + EfficientDuck.isIdentical(ducks[0], ducks[4]));
        System.out.println("Is ducks[2] similar to ducks[3]? " + ducks[2].isSimilar(ducks[3]));
        System.out.println("Is ducks[1] identical to ducks[2]? " + ducks[1].isIdentical(ducks[2]));
    }

   
}
