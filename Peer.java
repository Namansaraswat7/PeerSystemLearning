package lld.peerlearningsystem.entity;



import java.util.ArrayList;
import java.util.List;


public class Peer {

    public Integer peerId;
    public String name;
    public String email;
    public List<Subject> favouriteSubjects = new ArrayList<>();

    public Peer(Integer peerId, String name, String email) {
        this.peerId = peerId;
        this.name = name;
        this.email = email;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Subject> getFavouriteSubjects() {
        return favouriteSubjects;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFavouriteSubjects(List<Subject> favouriteSubjects) {
        this.favouriteSubjects = favouriteSubjects;
    }
}
