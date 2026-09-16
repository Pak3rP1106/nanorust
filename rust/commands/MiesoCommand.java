package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class MiesoCommand
  implements CommandExecutor
{
  /* Error */
  public boolean onCommand(org.bukkit.command.CommandSender a, org.bukkit.command.Command a, String a, String[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 11
    //   4: ifne +6 -> 10
    //   7: iconst_1
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 11	org/bukkit/entity/Player
    //   14: ldc 13
    //   16: invokestatic 17	nano/spook1998/rust/commands/MiesoCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   19: invokeinterface 21 2 0
    //   24: ifne +6 -> 30
    //   27: iconst_0
    //   28: ireturn
    //   29: athrow
    //   30: new 23	org/bukkit/inventory/ItemStack
    //   33: dup
    //   34: getstatic 29	org/bukkit/Material:GRILLED_PORK	Lorg/bukkit/Material;
    //   37: bipush 10
    //   39: invokespecial 33	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;I)V
    //   42: astore_1
    //   43: invokestatic 39	org/bukkit/Bukkit:getOnlinePlayers	()Ljava/util/Collection;
    //   46: invokeinterface 45 1 0
    //   51: dup
    //   52: astore_2
    //   53: goto +35 -> 88
    //   56: aload_2
    //   57: invokeinterface 51 1 0
    //   62: checkcast 11	org/bukkit/entity/Player
    //   65: invokeinterface 55 1 0
    //   70: iconst_1
    //   71: anewarray 23	org/bukkit/inventory/ItemStack
    //   74: iconst_1
    //   75: dup
    //   76: pop2
    //   77: dup
    //   78: iconst_0
    //   79: aload_1
    //   80: aastore
    //   81: invokeinterface 61 2 0
    //   86: pop
    //   87: aload_2
    //   88: invokeinterface 65 1 0
    //   93: ifne -37 -> 56
    //   96: iconst_1
    //   97: ireturn
    // Line number table:
    //   Java source line #150	-> byte code offset #0
    //   Java source line #23	-> byte code offset #10
    //   Java source line #97	-> byte code offset #14
    //   Java source line #164	-> byte code offset #30
    //   Java source line #38	-> byte code offset #43
    //   Java source line #123	-> byte code offset #65
    //   Java source line #38	-> byte code offset #87
    //   Java source line #78	-> byte code offset #96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	a	MiesoCommand
    //   0	98	1	a	org.bukkit.command.CommandSender
    //   0	98	2	a	org.bukkit.command.Command
    //   0	98	3	a	String
    //   0	98	4	a	String[]
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp11_10 = 1;
    int tmp23_20 = a.length();
    int tmp27_26 = 1;
    tmp27_26;
    int j;
    int ? = tmp27_26;
    int k = tmp23_20;
    (j = new char[tmp23_20] - 1);
    int i = 1 << 3 ^ 0x1;
    if ((5 << 4 ^ tmp11_10 << tmp11_10) >= 0)
    {
      int tmp46_45 = j;
      j--;
      ?[tmp46_45] = ((char)(a.charAt(tmp46_45) ^ i));
      int tmp67_64 = (j--);
      ?[tmp67_64] = ((char)(a.charAt(tmp67_64) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\MiesoCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */