package net.ddns.vcccd;

//import java.util.Date;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
public class EventClassOne implements Listener{
	@EventHandler
	public void ThisNameDoesentMatter(PlayerJoinEvent event) {
		Player ref_player = event.getPlayer();
		ref_player.getExpCooldown();
	}

}
