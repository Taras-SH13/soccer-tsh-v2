package soccer.db.entity;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idteam",nullable = false)
    private long id;

    @Column(name = "country",nullable = false)
    private String country;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "name",nullable = false)
    private String name;

    @JoinColumn(name = "team_name")
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,fetch = FetchType.LAZY)
    private List<Player> playerList;

    public Team() {
    }

    public Team(String country, String city, String name, List<Player> playerList) {
        this.country = country;
        this.city = city;
        this.name = name;
        this.playerList = playerList;
    }

    public Team(long id, String country, String city, String name, List<Player> playerList) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.name = name;
        this.playerList = playerList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", playerList=" + playerList +
                '}';
    }
}
