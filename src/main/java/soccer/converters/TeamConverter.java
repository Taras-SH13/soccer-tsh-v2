package soccer.converters;

import soccer.db.entity.Team;
import soccer.dto.TeamDto;

import java.util.List;
import java.util.stream.Collectors;

public class TeamConverter {
    public static TeamDto toTeamDto(Team team) {
        return new TeamDto(
                team.getId(),
                team.getName(),
                team.getCountry(),
                team.getCity(),
                PlayerConverter.toPlayerDtoList(team.getPlayerList())
        );
    }

    public static List<TeamDto> toTeamDtoList(List<Team> teams) {
        return teams.stream().map(TeamConverter::toTeamDto).collect(Collectors.toList());
    }


    public static Team toTeam(TeamDto teamDto) {
        return new Team(teamDto.getId(),
                teamDto.getName(),
                teamDto.getCountry(),
                teamDto.getCity(),
                teamDto.getPlayerDtos().stream().map(PlayerConverter::toPlayer).collect(Collectors.toList()));
    }
}
