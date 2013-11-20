public class EventListner{
  
  public void onEntityDamageByEntity((Entity damager, Entity damagee, EntityDamageEvent.DamageCause cause, double damage){
    if(attackLevels == true && damager.hasPermission("levels.attacklevels")){ // If enabled in configuration
      if(damager instanceof Player){ // check to see if the damager
        int level = damager.getLevel();
        double levelDamage = level * attackIncrease;
        double newDamage = damage + levelDamage;
        
        damgee.setDamage(newDamage);
      }
    }
  }

}
