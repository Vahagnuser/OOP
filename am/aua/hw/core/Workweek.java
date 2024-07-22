package am.aua.hw.core;
import am.aua.hw.exceptions.MalformedStringParameterException;
public class Workweek {
    private WorkEvent[][] schedule;

    // No-arg constructor
    public Workweek() {
        schedule = new WorkEvent[Days.values().length][Times.values().length];
    }

    // Method to add a WorkEvent to the schedule
    public void addToSchedule(WorkEvent event, Days day, Times time) {
        schedule[day.ordinal()][time.ordinal()] = event;
    }

    // Method to remove a WorkEvent from the schedule
    public void removeFromSchedule(Days day, Times time) {
        schedule[day.ordinal()][time.ordinal()] = null;
    }

    // Method to check if a timeslot is free
    public boolean isEmpty(Days day, Times time) {
        return schedule[day.ordinal()][time.ordinal()] == null;
    }

    // Accessor method to get the title at a specific timeslot
    public String getTitleAt(Days day, Times time) {
        WorkEvent event = schedule[day.ordinal()][time.ordinal()];
        return event != null ? event.getTitle() : "No event scheduled.";
    }

    // Accessor method to get full details at a specific timeslot
    public String getFullDetailsAt(Days day, Times time) {
        WorkEvent event = schedule[day.ordinal()][time.ordinal()];
        return event != null ? event.getFullDetails() : "No event scheduled.";
    }
    public WorkEvent getEventAt(Days day, Times time) {
        return schedule[day.ordinal()][time.ordinal()];
    }

    // Static method to generate a Workweek from an array of strings
    public static Workweek generateWorkweekFromStrings(String[] strings) throws MalformedStringParameterException {
        Workweek workweek = new Workweek();
        for (String str : strings) {
            String[] parts = str.split("%%");
            if (parts.length < 3) {
                throw new MalformedStringParameterException("Malformed string for creating WorkEvent.");
            }
            String type = parts[0];
            WorkEvent event;
            switch (type) {
                case "VIDEOCALL":
                    event = new VideoCall(str);
                    break;
                case "MEETING":
                    event = new Meeting(str);
                    break;
                default:
                    throw new MalformedStringParameterException("Unknown event type: " + type);
            }
            Days day = Days.valueOf(parts[parts.length - 2]);
            Times time = Times.valueOf(parts[parts.length - 1]);
            workweek.addToSchedule(event, day, time);
        }
        return workweek;
    }
    }
