package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class EntityDamageByEntityEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler(priority=org.bukkit.event.EventPriority.MONITOR, ignoreCancelled=true)
  public void onDamage(org.bukkit.event.entity.EntityDamageByEntityEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 27	org/bukkit/event/entity/EntityDamageByEntityEvent:getDamager	()Lorg/bukkit/entity/Entity;
    //   4: instanceof 29
    //   7: ifeq +97 -> 104
    //   10: aload_1
    //   11: invokevirtual 32	org/bukkit/event/entity/EntityDamageByEntityEvent:getEntity	()Lorg/bukkit/entity/Entity;
    //   14: instanceof 29
    //   17: ifeq +87 -> 104
    //   20: aload_1
    //   21: invokevirtual 32	org/bukkit/event/entity/EntityDamageByEntityEvent:getEntity	()Lorg/bukkit/entity/Entity;
    //   24: checkcast 29	org/bukkit/entity/Player
    //   27: astore_2
    //   28: aload_1
    //   29: invokevirtual 27	org/bukkit/event/entity/EntityDamageByEntityEvent:getDamager	()Lorg/bukkit/entity/Entity;
    //   32: checkcast 29	org/bukkit/entity/Player
    //   35: invokeinterface 36 1 0
    //   40: invokestatic 42	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   43: astore_3
    //   44: aload_2
    //   45: invokeinterface 36 1 0
    //   50: invokestatic 42	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   53: astore_2
    //   54: aload_3
    //   55: invokevirtual 48	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   58: ifnull +10 -> 68
    //   61: aload_2
    //   62: invokevirtual 48	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   65: ifnonnull +5 -> 70
    //   68: return
    //   69: athrow
    //   70: aload_3
    //   71: invokevirtual 48	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   74: aload_2
    //   75: invokevirtual 48	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   78: invokevirtual 52	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   81: ifne +5 -> 86
    //   84: return
    //   85: athrow
    //   86: aload_3
    //   87: invokevirtual 48	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   90: invokevirtual 58	nano/spook1998/rust/object/Clan:isPvP	()Ljava/lang/Boolean;
    //   93: invokevirtual 64	java/lang/Boolean:booleanValue	()Z
    //   96: ifne +8 -> 104
    //   99: aload_1
    //   100: iconst_1
    //   101: invokevirtual 68	org/bukkit/event/entity/EntityDamageByEntityEvent:setCancelled	(Z)V
    //   104: return
    // Line number table:
    //   Java source line #41	-> byte code offset #0
    //   Java source line #150	-> byte code offset #20
    //   Java source line #23	-> byte code offset #28
    //   Java source line #97	-> byte code offset #44
    //   Java source line #164	-> byte code offset #54
    //   Java source line #38	-> byte code offset #70
    //   Java source line #123	-> byte code offset #86
    //   Java source line #78	-> byte code offset #104
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	a	EntityDamageByEntityEvent
    //   0	105	1	a	org.bukkit.event.entity.EntityDamageByEntityEvent
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\EntityDamageByEntityEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */