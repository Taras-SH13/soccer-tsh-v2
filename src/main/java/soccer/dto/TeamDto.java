package soccer.dto;

import java.util.ArrayList;
import java.util.List;

public class TeamDto {
    private final Long id;
    private final String country;
    private final String city;
    private final String name;
    private final List<PlayerDto> playerDtos;

    public TeamDto() {
        this.id = null;
        this.country = null;
        this.city = null;
        this.name = null;
        this.playerDtos=new ArrayList<>();
    }

    public TeamDto(Long id, String country, String city,String name, List<PlayerDto> playerDtos) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.name = name;
        this.playerDtos = playerDtos;
    }

    public TeamDto(String country, String city,String name, List<PlayerDto> playerDtos) {
        this.id = null;
        this.country = country;
        this.city = city;
        this.name = name;
        this.playerDtos = playerDtos;
    }

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public List<PlayerDto> getPlayerDtos() {
        return playerDtos;
    }
}
