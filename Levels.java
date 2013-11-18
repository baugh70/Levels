import org.bukkit.plugin.java.JavaPlugin;

public class Level{
   public void onEnable(){
     
   }
   
   public void onDisable(){
     
   }
   
   public void loadConfiguration(){
     getConfig().options().header("Levels Plugin!");
     getConfig().addDefault("Food_Levels", true);
     
   }
  
  
}
