package pvdk84.junit;

/**
 * Simple message POJO.
 * To test in MessageTest
 */

public class Message {

    private String message;

    public Message(String message){
        this.message = message;
    }

    public String printMessage(){
        return message;
    }
}
