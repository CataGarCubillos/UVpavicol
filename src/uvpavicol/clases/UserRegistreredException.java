
package uvpavicol.clases;

/**
 *
 * @author RYZEN3
 */
public class UserRegistreredException extends Exception {

    private String messege;

    public UserRegistreredException() {
    }

    public UserRegistreredException(String message) {
        super(message);
    }

    public UserRegistreredException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserRegistreredException(Throwable cause) {
        super(cause);
    }

    public UserRegistreredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

 
    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    
}
