package ex_2;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

//import day_10_Stream.ex_1.Player;
public class PlayerBO {
	

	public List<Player> findPlayer(List<Player> playerList, String nationality) 
	{
		return playerList.stream().filter(player->player.getNationality().equals(nationality)).collect(Collectors.toList());
	}
	public List<Player> findPlayer(List<Player> playerList, LocalDate dateOfBirth) 
	{
		return playerList.stream().filter(player->player.getDate().equals(dateOfBirth)).collect(Collectors.toList());
	}
	public List<Player> findPlayer( List<Player> playerList,Double powerRating) 
	{
		return playerList.stream().filter(player->player.getPowerRating()==(powerRating)).collect(Collectors.toList());
	}

}
