package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class PlayerQuitEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onQuit(org.bukkit.event.player.PlayerQuitEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 16	org/bukkit/event/player/PlayerQuitEvent:getPlayer	()Lorg/bukkit/entity/Player;
    //   4: dup
    //   5: astore_1
    //   6: ldc 18
    //   8: invokestatic 22	nano/spook1998/rust/listeners/PlayerQuitEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   11: invokeinterface 28 2 0
    //   16: ifne +12 -> 28
    //   19: aload_1
    //   20: getstatic 34	org/bukkit/GameMode:SURVIVAL	Lorg/bukkit/GameMode;
    //   23: invokeinterface 38 2 0
    //   28: aload_1
    //   29: invokeinterface 42 1 0
    //   34: invokestatic 48	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   37: dup
    //   38: astore_2
    //   39: invokevirtual 54	nano/spook1998/rust/object/User:getBukkitTask	()Lorg/bukkit/scheduler/BukkitTask;
    //   42: ifnull +17 -> 59
    //   45: aconst_null
    //   46: aload_2
    //   47: dup_x1
    //   48: invokevirtual 54	nano/spook1998/rust/object/User:getBukkitTask	()Lorg/bukkit/scheduler/BukkitTask;
    //   51: invokeinterface 60 1 0
    //   56: invokevirtual 64	nano/spook1998/rust/object/User:setBukkiTask	(Lorg/bukkit/scheduler/BukkitTask;)V
    //   59: aload_1
    //   60: invokeinterface 68 1 0
    //   65: getstatic 74	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
    //   68: invokeinterface 80 2 0
    //   73: ifnull +17 -> 90
    //   76: aload_1
    //   77: invokeinterface 68 1 0
    //   82: getstatic 74	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
    //   85: invokeinterface 84 2 0
    //   90: aload_2
    //   91: iconst_0
    //   92: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   95: invokevirtual 94	nano/spook1998/rust/object/User:setOnline	(Ljava/lang/Boolean;)V
    //   98: aload_1
    //   99: invokeinterface 98 1 0
    //   104: ifne +17 -> 121
    //   107: aload_1
    //   108: ldc 100
    //   110: invokestatic 22	nano/spook1998/rust/listeners/PlayerQuitEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   113: invokeinterface 28 2 0
    //   118: ifeq +5 -> 123
    //   121: return
    //   122: athrow
    //   123: aload_1
    //   124: invokestatic 106	nano/spook1998/rust/utils/HumanUtil:spawn	(Lorg/bukkit/entity/Player;)V
    //   127: return
    // Line number table:
    //   Java source line #164	-> byte code offset #0
    //   Java source line #38	-> byte code offset #6
    //   Java source line #123	-> byte code offset #28
    //   Java source line #171	-> byte code offset #39
    //   Java source line #78	-> byte code offset #45
    //   Java source line #93	-> byte code offset #56
    //   Java source line #170	-> byte code offset #59
    //   Java source line #96	-> byte code offset #90
    //   Java source line #32	-> byte code offset #98
    //   Java source line #13	-> byte code offset #123
    //   Java source line #155	-> byte code offset #127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	a	PlayerQuitEvent
    //   0	128	1	a	org.bukkit.event.player.PlayerQuitEvent
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp6_5 = 4;
    int tmp23_20 = a.length();
    int tmp27_26 = 1;
    tmp27_26;
    int j;
    int ? = tmp27_26;
    int k = tmp23_20;
    int tmp37_33 = (j = new char[tmp23_20] - 1);
    tmp37_33;
    int i = (0x3 ^ 0x5) << 4 ^ 0x5;
    (tmp6_5 << tmp6_5 ^ 3 << 1);
    if (tmp37_33 >= 0)
    {
      int tmp47_46 = j;
      j--;
      ?[tmp47_46] = ((char)(a.charAt(tmp47_46) ^ i));
      int tmp68_65 = (j--);
      ?[tmp68_65] = ((char)(a.charAt(tmp68_65) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PlayerQuitEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */