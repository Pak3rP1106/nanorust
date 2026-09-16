package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class OfflinePlayerCommand
  implements CommandExecutor
{
  public static String ALLATORIxDEMO(String a)
  {
    int tmp9_8 = 4;
    int tmp12_11 = 2;
    int tmp21_18 = a.length();
    int tmp25_24 = 1;
    tmp25_24;
    int j;
    int ? = tmp25_24;
    int k = tmp21_18;
    (j = new char[tmp21_18] - 1);
    int i = tmp9_8 << tmp9_8 ^ tmp12_11 << tmp12_11 ^ 0x1;
    if (5 << 4 >= 0)
    {
      int tmp44_43 = j;
      j--;
      ?[tmp44_43] = ((char)(a.charAt(tmp44_43) ^ i));
      int tmp65_62 = (j--);
      ?[tmp65_62] = ((char)(a.charAt(tmp65_62) ^ k));
    }
    return new String(?);
  }
  
  /* Error */
  public boolean onCommand(org.bukkit.command.CommandSender a, org.bukkit.command.Command a, String a, String[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 35
    //   4: ifne +6 -> 10
    //   7: iconst_0
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 35	org/bukkit/entity/Player
    //   14: dup
    //   15: astore_1
    //   16: ldc 37
    //   18: invokestatic 39	nano/spook1998/rust/commands/OfflinePlayerCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokeinterface 43 2 0
    //   26: ifne +6 -> 32
    //   29: iconst_0
    //   30: ireturn
    //   31: athrow
    //   32: invokestatic 49	nano/spook1998/rust/object/utils/UserUtil:getUsers	()Ljava/util/List;
    //   35: invokeinterface 55 1 0
    //   40: dup
    //   41: astore_3
    //   42: goto +82 -> 124
    //   45: aload_3
    //   46: invokeinterface 61 1 0
    //   51: checkcast 63	nano/spook1998/rust/object/User
    //   54: dup
    //   55: astore_2
    //   56: invokevirtual 67	nano/spook1998/rust/object/User:getOnline	()Ljava/lang/Boolean;
    //   59: invokevirtual 73	java/lang/Boolean:booleanValue	()Z
    //   62: ifne +61 -> 123
    //   65: aload_2
    //   66: invokevirtual 77	nano/spook1998/rust/object/User:getHumanBuilder	()Lnano/spook1998/rust/utils/HumanBuilder;
    //   69: dup
    //   70: astore 4
    //   72: ifnull +46 -> 118
    //   75: invokestatic 83	org/bukkit/Bukkit:getOnlinePlayers	()Ljava/util/Collection;
    //   78: invokeinterface 86 1 0
    //   83: dup
    //   84: astore 6
    //   86: goto +24 -> 110
    //   89: aload 6
    //   91: invokeinterface 61 1 0
    //   96: checkcast 35	org/bukkit/entity/Player
    //   99: astore 5
    //   101: aload 6
    //   103: aload 4
    //   105: aload 5
    //   107: invokevirtual 92	nano/spook1998/rust/utils/HumanBuilder:removeFrom	(Lorg/bukkit/entity/Player;)V
    //   110: invokeinterface 95 1 0
    //   115: ifne -26 -> 89
    //   118: aload_2
    //   119: aconst_null
    //   120: invokevirtual 99	nano/spook1998/rust/object/User:setHumanBuilder	(Lnano/spook1998/rust/utils/HumanBuilder;)V
    //   123: aload_3
    //   124: invokeinterface 95 1 0
    //   129: ifne -84 -> 45
    //   132: iconst_1
    //   133: new 101	java/lang/StringBuilder
    //   136: aload_1
    //   137: dup_x1
    //   138: dup
    //   139: pop2
    //   140: dup
    //   141: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   144: getstatic 108	org/bukkit/ChatColor:RED	Lorg/bukkit/ChatColor;
    //   147: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   150: ldc 114
    //   152: invokestatic 39	nano/spook1998/rust/commands/OfflinePlayerCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   155: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: invokeinterface 125 2 0
    //   166: ireturn
    // Line number table:
    //   Java source line #97	-> byte code offset #0
    //   Java source line #164	-> byte code offset #10
    //   Java source line #38	-> byte code offset #16
    //   Java source line #123	-> byte code offset #29
    //   Java source line #78	-> byte code offset #32
    //   Java source line #93	-> byte code offset #56
    //   Java source line #119	-> byte code offset #65
    //   Java source line #170	-> byte code offset #72
    //   Java source line #96	-> byte code offset #75
    //   Java source line #92	-> byte code offset #103
    //   Java source line #96	-> byte code offset #110
    //   Java source line #155	-> byte code offset #118
    //   Java source line #78	-> byte code offset #123
    //   Java source line #182	-> byte code offset #166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	a	OfflinePlayerCommand
    //   0	167	1	a	org.bukkit.command.CommandSender
    //   0	167	2	a	org.bukkit.command.Command
    //   0	167	3	a	String
    //   0	167	4	a	String[]
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\OfflinePlayerCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */