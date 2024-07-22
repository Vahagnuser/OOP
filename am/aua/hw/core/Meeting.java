package am.aua.hw.core;

import java.util.Objects;
import am.aua.hw.exceptions.MalformedStringParameterException;
public class Meeting extends WorkEvent {
    private final double latitude;
    private final double longitude;

    // Constructor
    public Meeting(String title, double latitude, double longitude) throws MalformedStringParameterException  {
        super(title);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Constructor from string
   public Meeting(String saveString) throws MalformedStringParameterException {
        super(parseTitle(saveString));
        String[] tokens = saveString.split("%%");
        if (tokens.length != 4 || !tokens[0].equals("MEETING")) {
            throw new MalformedStringParameterException("Invalid number of tokens for Meeting.");
        }
        this.latitude = Double.parseDouble(tokens[2]);
        this.longitude = Double.parseDouble(tokens[3]);
    }
    private static String parseTitle(String data) {
        return data.split("%%")[1];
    }

    /*private static double parseLatitude(String data) {
        return Double.parseDouble(data.split("%%")[2]);
    }

    private static double parseLongitude(String data) {
        return Double.parseDouble(data.split("%%")[3]);
    }
*/
  
    public String getFullDetails() {
        return "Title: "+getTitle() + " - Location: (" + latitude + ", " + longitude + ")";
    }

   
    public String toSaveFileString() {
        return "MEETING%%" + getTitle() + "%%" + latitude + "%%" + longitude;
    }

   
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Meeting meeting = (Meeting) obj;
        return Double.compare(meeting.latitude, latitude) == 0 &&
               Double.compare(meeting.longitude, longitude) == 0;
    }

   
   
}
