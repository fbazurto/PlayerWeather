package net.ddns.vcccd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandClassOne implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player ref_player = (Player) sender;
			ref_player.sendMessage("All is working well...");
		} else {
			sender.sendMessage(ChatColor.RED + "Cannot Execute Command In Console...");
		}
		
		return(true);
	}

}
