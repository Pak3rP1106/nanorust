package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class PrepareItemCraftEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onPrepare(org.bukkit.event.inventory.PrepareItemCraftEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 16	org/bukkit/event/inventory/PrepareItemCraftEvent:getInventory	()Lorg/bukkit/inventory/CraftingInventory;
    //   4: invokeinterface 22 1 0
    //   9: dup
    //   10: astore_2
    //   11: ifnull +16 -> 27
    //   14: aload_2
    //   15: invokevirtual 28	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   18: getstatic 34	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   21: invokevirtual 38	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   24: ifeq +5 -> 29
    //   27: return
    //   28: athrow
    //   29: aload_2
    //   30: invokevirtual 28	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   33: getstatic 41	org/bukkit/Material:WOOD	Lorg/bukkit/Material;
    //   36: invokevirtual 38	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   39: ifne +15 -> 54
    //   42: aload_1
    //   43: invokevirtual 16	org/bukkit/event/inventory/PrepareItemCraftEvent:getInventory	()Lorg/bukkit/inventory/CraftingInventory;
    //   46: aconst_null
    //   47: invokeinterface 45 2 0
    //   52: return
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual 16	org/bukkit/event/inventory/PrepareItemCraftEvent:getInventory	()Lorg/bukkit/inventory/CraftingInventory;
    //   58: new 24	org/bukkit/inventory/ItemStack
    //   61: dup
    //   62: getstatic 48	org/bukkit/Material:WORKBENCH	Lorg/bukkit/Material;
    //   65: invokespecial 52	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   68: invokeinterface 45 2 0
    //   73: return
    // Line number table:
    //   Java source line #46	-> byte code offset #0
    //   Java source line #167	-> byte code offset #11
    //   Java source line #45	-> byte code offset #29
    //   Java source line #41	-> byte code offset #42
    //   Java source line #150	-> byte code offset #52
    //   Java source line #97	-> byte code offset #54
    //   Java source line #164	-> byte code offset #73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	a	PrepareItemCraftEvent
    //   0	74	1	a	org.bukkit.event.inventory.PrepareItemCraftEvent
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PrepareItemCraftEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */