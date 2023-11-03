package net.ddns.vcccd;

import org.bukkit.ChatColor;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerWeather implements CommandExecutor {
	//WeatherType playerWeather = player.getPlayerWeather();
	WeatherType playerWeather;
	@Override
	public  boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender; 
				/*WeatherType playerWeather =*/ player.getPlayerWeather();
				//sender.sendMessage( "The weather is " + player.getPlayerWeather() );
				String Value = ChatColor.GREEN  + "CLEAR";
		}else {sender.sendMessage("null");
				}return true;
		}
		
	}


