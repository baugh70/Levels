public class EventListner{
  
  public void onEntityDamageByEntity((Entity damager, Entity damagee, EntityDamageEvent.DamageCause cause, double damage){
    if(attackLevels == true && damager.hasPermission("levels.attacklevels")){ // If enabled in configuration
      if(damager instanceof Player){ // check to see if the damager
        int level = damager.getLevel(); // Get the XP level of the damager
        double levelDamage = level * attackIncrease; // Get the level multiplied by the level increase
        double newDamage = damage + levelDamage;
        
        damgee.setDamage(newDamage);
      }
    }
  }
  
  public void on EnchantItem(EnchantItemEvent event){
    Player player = event.getEnchanter();
    
  }

}
