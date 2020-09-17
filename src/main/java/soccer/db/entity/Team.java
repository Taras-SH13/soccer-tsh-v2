package soccer.db.entity;
import javax.persistence.*;
import java.util.List;
@Entity
public class Team {

    private long id;
    private String country;
    private String city;
    private String name;
    private List<Player> playerList;

}
