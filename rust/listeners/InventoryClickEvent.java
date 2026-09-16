package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class InventoryClickEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onClick(org.bukkit.event.inventory.InventoryClickEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 16	org/bukkit/event/inventory/InventoryClickEvent:getInventory	()Lorg/bukkit/inventory/Inventory;
    //   4: dup
    //   5: astore_2
    //   6: ifnull +62 -> 68
    //   9: aload_2
    //   10: invokeinterface 22 1 0
    //   15: ifnull +53 -> 68
    //   18: aload_1
    //   19: invokevirtual 26	org/bukkit/event/inventory/InventoryClickEvent:getCurrentItem	()Lorg/bukkit/inventory/ItemStack;
    //   22: ifnull +46 -> 68
    //   25: aload_1
    //   26: invokevirtual 30	org/bukkit/event/inventory/InventoryClickEvent:getWhoClicked	()Lorg/bukkit/entity/HumanEntity;
    //   29: instanceof 32
    //   32: ifeq +36 -> 68
    //   35: aload_2
    //   36: invokeinterface 36 1 0
    //   41: getstatic 42	org/bukkit/event/inventory/InventoryType:CHEST	Lorg/bukkit/event/inventory/InventoryType;
    //   44: invokevirtual 46	org/bukkit/event/inventory/InventoryType:equals	(Ljava/lang/Object;)Z
    //   47: ifeq +21 -> 68
    //   50: aload_1
    //   51: invokevirtual 49	org/bukkit/event/inventory/InventoryClickEvent:getClickedInventory	()Lorg/bukkit/inventory/Inventory;
    //   54: invokeinterface 36 1 0
    //   59: getstatic 42	org/bukkit/event/inventory/InventoryType:CHEST	Lorg/bukkit/event/inventory/InventoryType;
    //   62: invokevirtual 46	org/bukkit/event/inventory/InventoryType:equals	(Ljava/lang/Object;)Z
    //   65: ifne +5 -> 70
    //   68: return
    //   69: athrow
    //   70: aload_1
    //   71: dup
    //   72: invokevirtual 53	org/bukkit/event/inventory/InventoryClickEvent:getRawSlot	()I
    //   75: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: astore_3
    //   79: invokevirtual 30	org/bukkit/event/inventory/InventoryClickEvent:getWhoClicked	()Lorg/bukkit/entity/HumanEntity;
    //   82: checkcast 32	org/bukkit/entity/Player
    //   85: astore 4
    //   87: aload_2
    //   88: invokeinterface 22 1 0
    //   93: getstatic 65	nano/spook1998/rust/data/Settings:WORDROBE_NAME	Ljava/lang/String;
    //   96: invokevirtual 71	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   99: ifeq +23 -> 122
    //   102: invokestatic 77	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   105: aload 4
    //   107: getstatic 83	nano/spook1998/rust/utils/type/GuiType:WARDROBE	Lnano/spook1998/rust/utils/type/GuiType;
    //   110: aload_3
    //   111: aconst_null
    //   112: invokevirtual 87	nano/spook1998/rust/utils/GuiUtil:guiManager	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Ljava/lang/Integer;Lnano/spook1998/rust/object/Gui;)V
    //   115: aload_1
    //   116: iconst_1
    //   117: invokevirtual 91	org/bukkit/event/inventory/InventoryClickEvent:setCancelled	(Z)V
    //   120: return
    //   121: athrow
    //   122: aload_2
    //   123: invokeinterface 22 1 0
    //   128: invokestatic 97	nano/spook1998/rust/object/utils/GuiUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/Gui;
    //   131: dup
    //   132: astore_2
    //   133: ifnull +20 -> 153
    //   136: invokestatic 77	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   139: aload 4
    //   141: aconst_null
    //   142: aload_3
    //   143: aload_2
    //   144: invokevirtual 87	nano/spook1998/rust/utils/GuiUtil:guiManager	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Ljava/lang/Integer;Lnano/spook1998/rust/object/Gui;)V
    //   147: aload_1
    //   148: iconst_1
    //   149: invokevirtual 91	org/bukkit/event/inventory/InventoryClickEvent:setCancelled	(Z)V
    //   152: return
    //   153: return
    // Line number table:
    //   Java source line #97	-> byte code offset #0
    //   Java source line #164	-> byte code offset #6
    //   Java source line #38	-> byte code offset #70
    //   Java source line #123	-> byte code offset #79
    //   Java source line #171	-> byte code offset #87
    //   Java source line #78	-> byte code offset #102
    //   Java source line #93	-> byte code offset #115
    //   Java source line #119	-> byte code offset #120
    //   Java source line #92	-> byte code offset #122
    //   Java source line #32	-> byte code offset #133
    //   Java source line #13	-> byte code offset #136
    //   Java source line #155	-> byte code offset #147
    //   Java source line #162	-> byte code offset #152
    //   Java source line #77	-> byte code offset #153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	a	InventoryClickEvent
    //   0	154	1	a	org.bukkit.event.inventory.InventoryClickEvent
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\InventoryClickEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */