package am.aua.hw.core;
import am.aua.hw.exceptions.MalformedStringParameterException;
public abstract class WorkEvent {
    private final String title;

    //Constructor
    public WorkEvent(String title) throws MalformedStringParameterException
    {
        if (title.contains("%%")) {
            throw new MalformedStringParameterException("Title cannot contain the delimiter sequence '%%'.");
        }
        this.title = title;

    }
     // Getter for title
    public String getTitle(){
        return title;
    }
   // Abstract methods
   public abstract String getFullDetails();
   public abstract String toSaveFileString();

  
}
