/*   */ package nano.spook1998.rust.listeners; import org.bukkit.event.Listener;
/*   */ 
/*   */ public class EntityExplodeEvent implements Listener { @org.bukkit.event.EventHandler
/* 2 */   public void onExplode(org.bukkit.event.entity.EntityExplodeEvent a) { a.setCancelled(true); }
/*   */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\EntityExplodeEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */