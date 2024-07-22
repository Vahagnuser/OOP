package am.aua.hw.cli;

import am.aua.hw.core.*;
import am.aua.hw.exceptions.MalformedStringParameterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SchedulerConsole {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Workweek workweek = new Workweek();
        boolean running = true;

        while (running) {
            printSchedule(workweek);

            System.out.println("\nCommands:");
            System.out.println("1. Add an event");
            System.out.println("2. Remove an event");
            System.out.println("3. Print details");
            System.out.println("4. Load schedule from file");
            System.out.println("5. Save schedule to file");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    try {
                        addEvent(workweek, scanner);
                    } catch (MalformedStringParameterException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    removeEvent(workweek, scanner);
                    break;
                case 3:
                    printDetails(workweek, scanner);
                    break;
                case 4:
                    loadFromFile(workweek, scanner);
                    break;
                case 5:
                    saveToFile(workweek, scanner);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void printSchedule(Workweek workweek) {
        System.out.println("\nCurrent Schedule:");
        for (Days day : Days.values()) {
            for (Times time : Times.values()) {
                System.out.printf("%s %s: %s\n", day, time, workweek.getTitleAt(day, time));
            }
        }
    }

    private static void addEvent(Workweek workweek, Scanner scanner) throws MalformedStringParameterException {
        System.out.print("Enter event type (VIDEOCALL/MEETING): ");
        String type = scanner.nextLine().toUpperCase();

       

        if (type.equals("VIDEOCALL") || type.equals("V")) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            System.out.print("Enter day (MONDAY, TUESDAY, etc.): ");
            Days day = Days.valueOf(scanner.nextLine().toUpperCase());
            System.out.print("Enter time (MORNING/AFTERNOON): ");
            Times time = Times.valueOf(scanner.nextLine().toUpperCase());

            workweek.addToSchedule(new VideoCall(title, email), day, time);
        } else if (type.equals("MEETING") || type.equals("M")) {
             System.out.print("Enter title: ");
        String title = scanner.nextLine();
            System.out.print("Enter latitude: ");
            double latitude = scanner.nextDouble();
            System.out.print("Enter longitude: ");
            double longitude = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter day (MONDAY, TUESDAY, etc.): ");
            Days day = Days.valueOf(scanner.nextLine().toUpperCase());
            System.out.print("Enter time (MORNING/AFTERNOON): ");
            Times time = Times.valueOf(scanner.nextLine().toUpperCase());

            workweek.addToSchedule(new Meeting(title, latitude, longitude), day, time);
        } else {
            System.out.println("Invalid event type.");
        }
    }

    private static void removeEvent(Workweek workweek, Scanner scanner) {
        System.out.print("Enter day (MONDAY, TUESDAY, etc.): ");
        Days day = Days.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter time (MORNING/AFTERNOON): ");
        Times time = Times.valueOf(scanner.nextLine().toUpperCase());

        workweek.removeFromSchedule(day, time);
        System.out.println("Event removed.");
    }

    private static void printDetails(Workweek workweek, Scanner scanner) {
        System.out.print("Enter day (MONDAY, TUESDAY, etc.): ");
        Days day = Days.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter time (MORNING/AFTERNOON): ");
        Times time = Times.valueOf(scanner.nextLine().toUpperCase());

        System.out.println(workweek.getFullDetailsAt(day, time));
    }

    private static void loadFromFile(Workweek workweek, Scanner scanner) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            StringBuilder fileContent = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                fileContent.append(fileScanner.nextLine()).append("\n");
            }
            String[] eventStrings = fileContent.toString().split("\n");
            Workweek loadedWorkweek = Workweek.generateWorkweekFromStrings(eventStrings);
            workweek = loadedWorkweek;
            System.out.println("Schedule loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (MalformedStringParameterException e) {
            System.out.println("Error loading schedule: " + e.getMessage());
        }
    }

    private static void saveToFile(Workweek workweek, Scanner scanner) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (Days day : Days.values()) {
                for (Times time : Times.values()) {
                    WorkEvent event = workweek.getEventAt(day, time);
                    if (event != null) {
                        writer.println(event.toSaveFileString());
                    }
                }
            }
            System.out.println("Schedule saved to file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving to file.");
        }
    }
}
