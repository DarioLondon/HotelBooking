/**
 * Created by Dario on 22/02/2016.
 */
public class LogIn {

  private String username;
    protected String passord;
    protected int levelAccess;

    String getUsername(String username){
        return this.username;
    }

    int getLevelAccess(){
        return this.levelAccess;
    }

    String getPassord(){
        return this.passord;
    }
}
