package soccer.converters;

import soccer.db.entity.Player;
import soccer.dto.PlayerDto;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerConverter {
    public static PlayerDto toPlayerDto(Player player) {
        return new PlayerDto(player.getId(),
                player.getName(),
                player.getTeam_name(),
                player.getPosition());
    }

    public static List<PlayerDto> toPlayerDtoList(List<Player> players) {
        return players
                .stream()
                .map(PlayerConverter::toPlayerDto)
                .collect(Collectors.toList());
    }


    public static Player toPlayer(PlayerDto playerDto) {
        return new Player(playerDto.getId(),
                playerDto.getName(),
                playerDto.getTeam_name(),
                playerDto.getPosition());
    }
}
