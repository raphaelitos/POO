package simulado_q1;

import java.util.HashMap;
import java.util.Date;

public class UserBase {
    public HashMap<String, User> users = new HashMap<>();

    public UserBase(){}

    public User createUser(String id){
        User u = new User(id);
        users.put(id, u);
        return u;
    }
    public VerifiedUser createVerifiedUser(String id, Date d){
        VerifiedUser u = new VerifiedUser(id, d);
        users.put(id, u);
        return u;
    }

    public double porcentagemVerificados(){
        double n = 0;
        for(User u : this.users.values()){
            if(u instanceof VerifiedUser){
                n++;
            }
        }
        return (n/this.users.size()) * 100;
    }

    public double tamanhoMedioTweets(){
        double cont = 0;
        for(User u : this.users.values()){
            cont += u.TotalTamTweets();
        }
        return cont/this.users.size();
    }
}
