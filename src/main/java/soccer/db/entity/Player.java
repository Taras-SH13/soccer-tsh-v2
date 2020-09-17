package soccer.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplayer")
    private Long id;
    @Column(name = "team_name",nullable = false)
    private String team_name;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "position",nullable = false)
    private String position;

    public Player() {
    }

    public Player(String team_name, String name, String position) {
        this.team_name = team_name;
        this.name = name;
        this.position = position;
    }

    public Player(Long id, String team_name, String name, String position) {
        this.id = id;
        this.team_name = team_name;
        this.name = name;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", team_name='" + team_name + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
