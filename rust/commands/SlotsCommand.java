package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class SlotsCommand
  implements CommandExecutor
{
  /* Error */
  public boolean onCommand(org.bukkit.command.CommandSender a, org.bukkit.command.Command a, String a, String[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 11
    //   4: ifne +6 -> 10
    //   7: iconst_0
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 11	org/bukkit/entity/Player
    //   14: dup
    //   15: astore_1
    //   16: ldc 13
    //   18: invokestatic 17	nano/spook1998/rust/commands/SlotsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokeinterface 21 2 0
    //   26: ifne +28 -> 54
    //   29: aload_1
    //   30: getstatic 27	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   33: ldc 29
    //   35: invokestatic 17	nano/spook1998/rust/commands/SlotsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   38: invokeinterface 35 2 0
    //   43: checkcast 37	java/lang/String
    //   46: invokeinterface 41 2 0
    //   51: iconst_0
    //   52: ireturn
    //   53: athrow
    //   54: aload 4
    //   56: arraylength
    //   57: ifne +5 -> 62
    //   60: iconst_0
    //   61: ireturn
    //   62: aload 4
    //   64: iconst_0
    //   65: aaload
    //   66: invokestatic 47	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   69: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: putstatic 55	nano/spook1998/rust/data/Settings:SLOTS	Ljava/lang/Integer;
    //   75: iconst_0
    //   76: new 57	java/lang/StringBuilder
    //   79: aload_1
    //   80: dup_x1
    //   81: dup
    //   82: pop2
    //   83: dup
    //   84: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   87: getstatic 67	org/bukkit/ChatColor:RED	Lorg/bukkit/ChatColor;
    //   90: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   93: ldc 73
    //   95: invokestatic 17	nano/spook1998/rust/commands/SlotsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   98: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokeinterface 41 2 0
    //   109: invokestatic 86	org/bukkit/Bukkit:setWhitelist	(Z)V
    //   112: iconst_1
    //   113: ireturn
    // Line number table:
    //   Java source line #150	-> byte code offset #0
    //   Java source line #23	-> byte code offset #10
    //   Java source line #97	-> byte code offset #16
    //   Java source line #164	-> byte code offset #29
    //   Java source line #38	-> byte code offset #51
    //   Java source line #171	-> byte code offset #54
    //   Java source line #78	-> byte code offset #62
    //   Java source line #93	-> byte code offset #76
    //   Java source line #119	-> byte code offset #109
    //   Java source line #170	-> byte code offset #112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	a	SlotsCommand
    //   0	114	1	a	org.bukkit.command.CommandSender
    //   0	114	2	a	org.bukkit.command.Command
    //   0	114	3	a	String
    //   0	114	4	a	String[]
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp19_18 = 4;
    int tmp31_28 = a.length();
    int tmp35_34 = 1;
    tmp35_34;
    int j;
    int ? = tmp35_34;
    int k = tmp31_28;
    int tmp45_41 = (j = new char[tmp31_28] - 1);
    tmp45_41;
    int i = tmp19_18 << tmp19_18 ^ 3 << 2 ^ 0x1;
    (5 << 3 ^ 0x3 ^ 0x5);
    if (tmp45_41 >= 0)
    {
      int tmp55_54 = j;
      j--;
      ?[tmp55_54] = ((char)(a.charAt(tmp55_54) ^ i));
      int tmp76_73 = (j--);
      ?[tmp76_73] = ((char)(a.charAt(tmp76_73) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\SlotsCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */