package at.fhtw.appel.colors.dto;

/**
 * Message Class
 * the message is stored here
 */
public class Message {
    private String mes = "";  //the message string

    public String getMes() { return mes; }  //get Message

    public void setMes(String message) {    //set Message
        mes = message;
    }

    public String getCompColor(String message) {
        switch (message) {
            case "red":
                return "green";
            case "green":
                return "red";
            case "orange":
                return "blue";
            case "blue":
                return "orange";
            case "yellow":
                return "purple";
            case "purple":
                return "yellow";
            default:
                return message;
        }     //reset Message
    }
}
