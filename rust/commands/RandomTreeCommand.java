package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class RandomTreeCommand
  implements CommandExecutor
{
  /* Error */
  public boolean onCommand(org.bukkit.command.CommandSender a, org.bukkit.command.Command a, String a, String[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 89
    //   4: ifne +6 -> 10
    //   7: iconst_0
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 89	org/bukkit/entity/Player
    //   14: dup
    //   15: astore_1
    //   16: ldc 91
    //   18: invokestatic 94	nano/spook1998/rust/commands/RandomTreeCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokeinterface 98 2 0
    //   26: ifne +6 -> 32
    //   29: iconst_0
    //   30: ireturn
    //   31: athrow
    //   32: aload_1
    //   33: dup
    //   34: dup_x1
    //   35: dup2
    //   36: invokeinterface 99 1 0
    //   41: astore_2
    //   42: invokeinterface 100 1 0
    //   47: invokevirtual 35	org/bukkit/Location:getZ	()D
    //   50: ldc2_w 101
    //   53: dsub
    //   54: d2i
    //   55: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: astore_3
    //   59: invokeinterface 100 1 0
    //   64: invokevirtual 35	org/bukkit/Location:getZ	()D
    //   67: ldc2_w 101
    //   70: dadd
    //   71: d2i
    //   72: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   75: astore 4
    //   77: invokeinterface 100 1 0
    //   82: invokevirtual 28	org/bukkit/Location:getX	()D
    //   85: ldc2_w 101
    //   88: dsub
    //   89: d2i
    //   90: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: astore 5
    //   95: invokeinterface 100 1 0
    //   100: invokevirtual 28	org/bukkit/Location:getX	()D
    //   103: ldc2_w 101
    //   106: dadd
    //   107: d2i
    //   108: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: astore 6
    //   113: invokestatic 108	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
    //   116: bipush 50
    //   118: sipush 150
    //   121: invokevirtual 112	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
    //   124: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: astore 7
    //   129: iconst_0
    //   130: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: dup
    //   134: astore 8
    //   136: goto +90 -> 226
    //   139: aload_2
    //   140: invokestatic 108	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
    //   143: aload 5
    //   145: invokevirtual 32	java/lang/Integer:intValue	()I
    //   148: aload 6
    //   150: invokevirtual 32	java/lang/Integer:intValue	()I
    //   153: invokevirtual 112	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
    //   156: invokestatic 108	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
    //   159: aload_3
    //   160: invokevirtual 32	java/lang/Integer:intValue	()I
    //   163: aload 4
    //   165: invokevirtual 32	java/lang/Integer:intValue	()I
    //   168: invokevirtual 112	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
    //   171: invokeinterface 118 3 0
    //   176: invokeinterface 80 1 0
    //   181: dup
    //   182: astore 9
    //   184: invokestatic 124	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
    //   187: ifnonnull +26 -> 213
    //   190: aload_0
    //   191: aload 9
    //   193: invokespecial 126	nano/spook1998/rust/commands/RandomTreeCommand:ALLATORIxDEMO	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
    //   196: dup
    //   197: astore 9
    //   199: invokevirtual 25	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
    //   202: aload 9
    //   204: getstatic 132	org/bukkit/TreeType:TREE	Lorg/bukkit/TreeType;
    //   207: invokeinterface 136 3 0
    //   212: pop
    //   213: aload 8
    //   215: invokevirtual 32	java/lang/Integer:intValue	()I
    //   218: iconst_1
    //   219: iadd
    //   220: invokestatic 21	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: dup
    //   224: astore 8
    //   226: invokevirtual 32	java/lang/Integer:intValue	()I
    //   229: aload 7
    //   231: invokevirtual 32	java/lang/Integer:intValue	()I
    //   234: if_icmple -95 -> 139
    //   237: iconst_1
    //   238: new 138	java/lang/StringBuilder
    //   241: aload_1
    //   242: dup_x1
    //   243: dup
    //   244: pop2
    //   245: dup
    //   246: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   249: getstatic 147	org/bukkit/ChatColor:RED	Lorg/bukkit/ChatColor;
    //   252: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   255: ldc -103
    //   257: invokestatic 94	nano/spook1998/rust/commands/RandomTreeCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   260: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: getstatic 159	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
    //   266: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   269: aload 7
    //   271: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   274: getstatic 147	org/bukkit/ChatColor:RED	Lorg/bukkit/ChatColor;
    //   277: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   280: ldc -95
    //   282: invokestatic 94	nano/spook1998/rust/commands/RandomTreeCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   285: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: invokeinterface 169 2 0
    //   296: ireturn
    // Line number table:
    //   Java source line #78	-> byte code offset #0
    //   Java source line #93	-> byte code offset #10
    //   Java source line #119	-> byte code offset #16
    //   Java source line #170	-> byte code offset #32
    //   Java source line #96	-> byte code offset #42
    //   Java source line #92	-> byte code offset #59
    //   Java source line #32	-> byte code offset #77
    //   Java source line #13	-> byte code offset #95
    //   Java source line #155	-> byte code offset #113
    //   Java source line #162	-> byte code offset #129
    //   Java source line #73	-> byte code offset #139
    //   Java source line #182	-> byte code offset #187
    //   Java source line #77	-> byte code offset #190
    //   Java source line #104	-> byte code offset #199
    //   Java source line #162	-> byte code offset #213
    //   Java source line #68	-> byte code offset #238
    //   Java source line #141	-> byte code offset #296
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	297	0	a	RandomTreeCommand
    //   0	297	1	a	org.bukkit.command.CommandSender
    //   0	297	2	a	org.bukkit.command.Command
    //   0	297	3	a	String
    //   0	297	4	a	String[]
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp21_18 = a.length();
    int tmp25_24 = 1;
    tmp25_24;
    int j;
    int ? = tmp25_24;
    int k = tmp21_18;
    (j = new char[tmp21_18] - 1);
    int i = 5 << 3 ^ 0x3;
    if ((1 << 3 ^ 0x2) >= 0)
    {
      int tmp44_43 = j;
      j--;
      ?[tmp44_43] = ((char)(a.charAt(tmp44_43) ^ i));
      int tmp65_62 = (j--);
      ?[tmp65_62] = ((char)(a.charAt(tmp65_62) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\RandomTreeCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */