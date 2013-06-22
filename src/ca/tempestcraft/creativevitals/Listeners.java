package ca.tempestcraft.creativevitals;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class Listeners implements Listener {

	 @EventHandler
	 public void onFall(EntityChangeBlockEvent event)
	  {
	    List<Material> noFall = new ArrayList<Material>();
	    noFall.add(Material.SAND);
	    noFall.add(Material.GRAVEL);
	    if ((event.getEntityType() == EntityType.FALLING_BLOCK) && noFall.contains(event.getBlock().getType()))
	      event.setCancelled(true);
	  }
	 
	  @EventHandler
	  public void onBlockFade(BlockFadeEvent event)
	  {
	    if (((event.getBlock().getType() == Material.ICE) || (event.getBlock().getType() == Material.SNOW) || (event.getBlock().getType() == Material.SNOW_BLOCK)))
	      event.setCancelled(true);
	  } 
	  
	  @EventHandler
	  public void onLeafDecay(LeavesDecayEvent event)
	  {
	      event.setCancelled(true);
	  } 
	}