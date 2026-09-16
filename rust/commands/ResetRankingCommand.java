package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class ResetRankingCommand
  implements CommandExecutor
{
  public static String ALLATORIxDEMO(String a)
  {
    int tmp23_20 = a.length();
    int tmp27_26 = 1;
    tmp27_26;
    int j;
    int ? = tmp27_26;
    int k = tmp23_20;
    (j = new char[tmp23_20] - 1);
    int i = (0x2 ^ 0x5) << 4;
    if (((0x2 ^ 0x5) << 3 ^ 0x3) >= 0)
    {
      int tmp46_45 = j;
      j--;
      ?[tmp46_45] = ((char)(a.charAt(tmp46_45) ^ i));
      int tmp67_64 = (j--);
      ?[tmp67_64] = ((char)(a.charAt(tmp67_64) ^ k));
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
    //   18: invokestatic 39	nano/spook1998/rust/commands/ResetRankingCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokeinterface 43 2 0
    //   26: ifne +6 -> 32
    //   29: iconst_0
    //   30: ireturn
    //   31: athrow
    //   32: aload 4
    //   34: arraylength
    //   35: ifne +38 -> 73
    //   38: iconst_0
    //   39: new 45	java/lang/StringBuilder
    //   42: aload_1
    //   43: dup_x1
    //   44: dup
    //   45: pop2
    //   46: dup
    //   47: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   50: getstatic 52	org/bukkit/ChatColor:RED	Lorg/bukkit/ChatColor;
    //   53: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   56: ldc 58
    //   58: invokestatic 39	nano/spook1998/rust/commands/ResetRankingCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   61: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: invokeinterface 69 2 0
    //   72: ireturn
    //   73: aload 4
    //   75: iconst_0
    //   76: aaload
    //   77: invokestatic 75	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   80: astore_2
    //   81: iconst_1
    //   82: aload_1
    //   83: iconst_0
    //   84: aload_2
    //   85: dup_x1
    //   86: dup_x2
    //   87: iconst_0
    //   88: invokestatic 81	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   91: invokevirtual 87	nano/spook1998/rust/object/User:setDeath	(Ljava/lang/Integer;)V
    //   94: invokestatic 81	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: invokevirtual 90	nano/spook1998/rust/object/User:setKill	(Ljava/lang/Integer;)V
    //   100: getstatic 96	nano/spook1998/rust/data/Settings:DEFAULT_POINTS	Ljava/lang/Integer;
    //   103: invokevirtual 99	nano/spook1998/rust/object/User:setPoints	(Ljava/lang/Integer;)V
    //   106: new 45	java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   113: getstatic 102	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   116: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   119: ldc 104
    //   121: invokestatic 39	nano/spook1998/rust/commands/ResetRankingCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   124: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokeinterface 69 2 0
    //   135: ireturn
    // Line number table:
    //   Java source line #97	-> byte code offset #0
    //   Java source line #164	-> byte code offset #10
    //   Java source line #38	-> byte code offset #16
    //   Java source line #123	-> byte code offset #32
    //   Java source line #171	-> byte code offset #39
    //   Java source line #78	-> byte code offset #72
    //   Java source line #119	-> byte code offset #73
    //   Java source line #170	-> byte code offset #83
    //   Java source line #96	-> byte code offset #94
    //   Java source line #92	-> byte code offset #100
    //   Java source line #32	-> byte code offset #106
    //   Java source line #13	-> byte code offset #135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	a	ResetRankingCommand
    //   0	136	1	a	org.bukkit.command.CommandSender
    //   0	136	2	a	org.bukkit.command.Command
    //   0	136	3	a	String
    //   0	136	4	a	String[]
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\ResetRankingCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */