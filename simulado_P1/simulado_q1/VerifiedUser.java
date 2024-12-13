package simulado_q1;
import java.util.Date;

public class VerifiedUser extends User {
    private String id, nickname;
    Date verifTime;

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public VerifiedUser(String id, Date verifTime){
        super(id);
        this.verifTime = verifTime;
    }
}
