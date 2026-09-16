package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class StatsCommand
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
    //   14: astore_1
    //   15: aload 4
    //   17: arraylength
    //   18: ifne +190 -> 208
    //   21: aload_1
    //   22: dup
    //   23: dup2
    //   24: invokeinterface 15 1 0
    //   29: invokestatic 21	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   32: astore_2
    //   33: new 23	java/lang/StringBuilder
    //   36: aload_1
    //   37: dup_x2
    //   38: dup
    //   39: pop2
    //   40: dup
    //   41: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   44: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   47: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   50: ldc 39
    //   52: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   61: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   64: aload_2
    //   65: invokevirtual 52	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   68: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokeinterface 59 2 0
    //   79: new 23	java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   86: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   89: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   92: ldc 61
    //   94: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   97: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   103: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   106: aload_2
    //   107: invokevirtual 65	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   110: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokeinterface 59 2 0
    //   121: new 23	java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   128: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   131: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   134: ldc 67
    //   136: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   139: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   145: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   148: aload_2
    //   149: invokevirtual 70	nano/spook1998/rust/object/User:getKill	()Ljava/lang/Integer;
    //   152: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokeinterface 59 2 0
    //   163: new 23	java/lang/StringBuilder
    //   166: dup
    //   167: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   170: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   173: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   176: ldc 72
    //   178: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   181: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   187: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   190: aload_2
    //   191: invokevirtual 75	nano/spook1998/rust/object/User:getDeath	()Ljava/lang/Integer;
    //   194: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   197: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokeinterface 59 2 0
    //   205: iconst_1
    //   206: ireturn
    //   207: athrow
    //   208: aload 4
    //   210: iconst_0
    //   211: aaload
    //   212: invokestatic 21	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   215: astore_2
    //   216: iconst_1
    //   217: aload_1
    //   218: dup
    //   219: dup2
    //   220: new 23	java/lang/StringBuilder
    //   223: dup
    //   224: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   227: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   230: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   233: ldc 39
    //   235: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   238: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   244: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   247: aload_2
    //   248: invokevirtual 52	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   251: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokeinterface 59 2 0
    //   262: new 23	java/lang/StringBuilder
    //   265: dup
    //   266: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   269: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   272: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   275: ldc 61
    //   277: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   280: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   286: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   289: aload_2
    //   290: invokevirtual 65	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   293: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   296: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokeinterface 59 2 0
    //   304: new 23	java/lang/StringBuilder
    //   307: dup
    //   308: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   311: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   314: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   317: ldc 67
    //   319: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   322: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   328: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   331: aload_2
    //   332: invokevirtual 70	nano/spook1998/rust/object/User:getKill	()Ljava/lang/Integer;
    //   335: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   338: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   341: invokeinterface 59 2 0
    //   346: new 23	java/lang/StringBuilder
    //   349: dup
    //   350: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   353: getstatic 33	org/bukkit/ChatColor:GREEN	Lorg/bukkit/ChatColor;
    //   356: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   359: ldc 72
    //   361: invokestatic 43	nano/spook1998/rust/commands/StatsCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   364: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: getstatic 49	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   370: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   373: aload_2
    //   374: invokevirtual 75	nano/spook1998/rust/object/User:getDeath	()Ljava/lang/Integer;
    //   377: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   380: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   383: invokeinterface 59 2 0
    //   388: ireturn
    // Line number table:
    //   Java source line #150	-> byte code offset #0
    //   Java source line #23	-> byte code offset #10
    //   Java source line #97	-> byte code offset #15
    //   Java source line #164	-> byte code offset #21
    //   Java source line #38	-> byte code offset #33
    //   Java source line #123	-> byte code offset #79
    //   Java source line #171	-> byte code offset #121
    //   Java source line #78	-> byte code offset #163
    //   Java source line #93	-> byte code offset #205
    //   Java source line #170	-> byte code offset #208
    //   Java source line #96	-> byte code offset #217
    //   Java source line #92	-> byte code offset #262
    //   Java source line #32	-> byte code offset #304
    //   Java source line #13	-> byte code offset #346
    //   Java source line #155	-> byte code offset #388
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	389	0	a	StatsCommand
    //   0	389	1	a	org.bukkit.command.CommandSender
    //   0	389	2	a	org.bukkit.command.Command
    //   0	389	3	a	String
    //   0	389	4	a	String[]
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp9_8 = 4;
    int tmp19_16 = a.length();
    int tmp23_22 = 1;
    tmp23_22;
    int j;
    int ? = tmp23_22;
    int k = tmp19_16;
    (j = new char[tmp19_16] - 1);
    int i = tmp9_8 << tmp9_8 ^ 3 << 1;
    if (2 << 3 >= 0)
    {
      int tmp42_41 = j;
      j--;
      ?[tmp42_41] = ((char)(a.charAt(tmp42_41) ^ i));
      int tmp63_60 = (j--);
      ?[tmp63_60] = ((char)(a.charAt(tmp63_60) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\StatsCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */