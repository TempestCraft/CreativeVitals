package ca.tempestcraft.creativevitals;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	  public void onDisable() {
		  
	    System.out.println("Creative Vitals has Disabled");
	    
	  }

	  @Override
	  public void onEnable() {
		  
	   this.getServer().getPluginManager().registerEvents(new Listeners(), this);
	   
	  }
	  
}