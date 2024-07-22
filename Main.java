

import Vahagn_Musheghyan_HW04.Problem2.Duck;

public class Main {
    public static void main(String[] args) {
        // Create several Duck objects
        Duck duck1 = new Duck('^', '<');
        Duck duck2 = new Duck('-', '>');
        Duck duck3 = new Duck('^', '=');
        Duck duck4 = new Duck('-', '<');
        Duck duck5 = new Duck(); // Random eye and beak
        Duck duck6 = new Duck(); // Random eye and beak

        // Print initial state
        System.out.println("Initial Ducks:");
        Duck.print(new Duck[]{duck1, duck2, duck3, duck4, duck5, duck6});

        // Check elderOracle
        System.out.println("\nElder Oracle: " + Duck.getElderOracle());

        // Befriend some ducks
        duck1.befriend(duck2);
        duck2.befriend(duck3);
        duck3.befriend(duck4);
        duck4.befriend(duck5);
        duck5.befriend(duck6);
        duck6.befriend(duck1); // Completing a circle

        // Print after friendships
        System.out.println("\nDucks after befriending:");
        Duck.print(new Duck[]{duck1, duck2, duck3, duck4, duck5, duck6});

        // Check influencerStar
        System.out.println("\nInfluencer Star: " + Duck.getInfluencerStar());

        // Additional friendships to test influencerStar changes
        duck1.befriend(duck3);
        duck1.befriend(duck4);

        // Print after additional friendships
        System.out.println("\nDucks after additional befriending:");
        Duck.print(new Duck[]{duck1, duck2, duck3, duck4, duck5, duck6});

        // Check influencerStar again
        System.out.println("\nInfluencer Star: " + Duck.getInfluencerStar());

        // Print friends of duck1
        System.out.println("\nFriends of Duck 1:");
        for (Duck friend : duck1.getFriendList()) {
            if (friend != null) {
                System.out.print(friend + " ");
            }
        }
        System.out.println();

        // Print friends of duck2
        System.out.println("\nFriends of Duck 2:");
        for (Duck friend : duck2.getFriendList()) {
            if (friend != null) {
                System.out.print(friend + " ");
            }
        }
        System.out.println();

        // Check similarities
        System.out.println("\nChecking similarities:");
        System.out.println("Duck 1 and Duck 2 are similar: " + Duck.isSimilar(duck1, duck2));
        System.out.println("Duck 1 and Duck 3 are similar: " + duck1.isSimilar(duck3));
        System.out.println("Duck 2 and Duck 4 are similar: " + duck2.isSimilar(duck4));

        // Check identities
        System.out.println("\nChecking identities:");
        System.out.println("Duck 1 and Duck 2 are identical: " + Duck.isIdentical(duck1, duck2));

    }}