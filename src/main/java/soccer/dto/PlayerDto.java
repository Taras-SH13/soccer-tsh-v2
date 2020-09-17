package soccer.dto;

public class PlayerDto {
    private final Long id;
    private final String team_name;
    private final String name;
    private final String position;

    public PlayerDto() {
        this.id=null;
        this.team_name=null;
        this.name=null;
        this.position=null;
    }

    public PlayerDto(Long id, String team_name, String name, String position) {
        this.id = id;
        this.team_name = team_name;
        this.name = name;
        this.position = position;
    }

    public PlayerDto(String team_name, String name, String position) {
        this.id=null;
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
}
