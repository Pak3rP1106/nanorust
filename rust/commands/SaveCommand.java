package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class SaveCommand
  implements CommandExecutor
{
  /* Error */
  public boolean onCommand(org.bukkit.command.CommandSender a, org.bukkit.command.Command a, String a, String[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 17
    //   4: ifne +6 -> 10
    //   7: iconst_0
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 17	org/bukkit/entity/Player
    //   14: dup
    //   15: astore_1
    //   16: ldc 19
    //   18: invokestatic 23	nano/spook1998/rust/commands/SaveCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokeinterface 27 2 0
    //   26: ifne +6 -> 32
    //   29: iconst_0
    //   30: ireturn
    //   31: athrow
    //   32: aload 4
    //   34: iconst_0
    //   35: aaload
    //   36: invokestatic 33	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   39: invokestatic 37	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   42: putstatic 43	nano/spook1998/rust/data/Settings:TIME_SAVE	Ljava/lang/Integer;
    //   45: iconst_1
    //   46: aload_1
    //   47: ldc 45
    //   49: invokestatic 23	nano/spook1998/rust/commands/SaveCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   52: invokeinterface 49 2 0
    //   57: ireturn
    // Line number table:
    //   Java source line #45	-> byte code offset #0
    //   Java source line #41	-> byte code offset #10
    //   Java source line #150	-> byte code offset #16
    //   Java source line #23	-> byte code offset #32
    //   Java source line #97	-> byte code offset #46
    //   Java source line #164	-> byte code offset #57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	a	SaveCommand
    //   0	58	1	a	org.bukkit.command.CommandSender
    //   0	58	2	a	org.bukkit.command.Command
    //   0	58	3	a	String
    //   0	58	4	a	String[]
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp25_22 = a.length();
    int tmp29_28 = 1;
    tmp29_28;
    int j;
    int ? = tmp29_28;
    int k = tmp25_22;
    int tmp39_35 = (j = new char[tmp25_22] - 1);
    tmp39_35;
    int i = (0x2 ^ 0x5) << 4;
    (5 << 4 ^ 5 << 1);
    if (tmp39_35 >= 0)
    {
      int tmp49_48 = j;
      j--;
      ?[tmp49_48] = ((char)(a.charAt(tmp49_48) ^ i));
      int tmp70_67 = (j--);
      ?[tmp70_67] = ((char)(a.charAt(tmp70_67) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\SaveCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */