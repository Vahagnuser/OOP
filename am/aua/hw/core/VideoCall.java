package am.aua.hw.core;

import am.aua.hw.exceptions.MalformedStringParameterException;

public class VideoCall extends WorkEvent {
    private String email;

    public VideoCall(String title, String email) throws MalformedStringParameterException {
        super(title);
        if (!email.contains("@")) {
            throw new MalformedStringParameterException("Invalid email address.");
        }
        this.email = email;
    }

    public VideoCall(String saveString) throws MalformedStringParameterException {
        super(saveString.split("%%")[1]);
        String[] tokens = saveString.split("%%");
        if (tokens.length != 3 || !tokens[0].equals("VIDEOCALL")) {
            throw new MalformedStringParameterException("Invalid number of tokens for VideoCall.");
        }
        this.email = tokens[2];
        if (!email.contains("@")) {
            throw new MalformedStringParameterException("Invalid email address.");
        }
    }


    public String getFullDetails() {
        return "Title: " + getTitle() + ", Email: " + email;
    }

   
    public String toSaveFileString() {
        return "VIDEOCALL%%" + getTitle() + "%%" + email;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        VideoCall videoCall = (VideoCall) obj;
        return getTitle().equals(videoCall.getTitle()) && email.equals(videoCall.email);
    }
}
