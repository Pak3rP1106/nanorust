package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class ClearChatCommand
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
    int tmp37_33 = (j = new char[tmp23_20] - 1);
    tmp37_33;
    int i = 5 << 4 ^ (0x2 ^ 0x5) << 1;
    (1 << 3 ^ 0x3);
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
    //   16: invokeinterface 39 1 0
    //   21: invokestatic 45	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   24: dup
    //   25: astore_2
    //   26: invokevirtual 51	nano/spook1998/rust/object/User:getStatusChat	()Ljava/lang/Boolean;
    //   29: invokevirtual 57	java/lang/Boolean:booleanValue	()Z
    //   32: ifeq +36 -> 68
    //   35: aload_1
    //   36: aload_2
    //   37: iconst_0
    //   38: invokestatic 61	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   41: invokevirtual 65	nano/spook1998/rust/object/User:setStatusChat	(Ljava/lang/Boolean;)V
    //   44: getstatic 71	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   47: ldc 73
    //   49: invokestatic 75	nano/spook1998/rust/commands/ClearChatCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   52: invokeinterface 80 2 0
    //   57: checkcast 17	java/lang/String
    //   60: invokeinterface 84 2 0
    //   65: iconst_1
    //   66: ireturn
    //   67: athrow
    //   68: aload_2
    //   69: iconst_1
    //   70: invokestatic 61	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   73: invokevirtual 65	nano/spook1998/rust/object/User:setStatusChat	(Ljava/lang/Boolean;)V
    //   76: aload_1
    //   77: getstatic 71	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   80: ldc 86
    //   82: invokestatic 75	nano/spook1998/rust/commands/ClearChatCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   85: invokeinterface 80 2 0
    //   90: checkcast 17	java/lang/String
    //   93: invokeinterface 84 2 0
    //   98: iconst_1
    //   99: ireturn
    // Line number table:
    //   Java source line #150	-> byte code offset #0
    //   Java source line #23	-> byte code offset #10
    //   Java source line #97	-> byte code offset #16
    //   Java source line #164	-> byte code offset #26
    //   Java source line #38	-> byte code offset #36
    //   Java source line #123	-> byte code offset #44
    //   Java source line #171	-> byte code offset #65
    //   Java source line #93	-> byte code offset #68
    //   Java source line #119	-> byte code offset #76
    //   Java source line #170	-> byte code offset #98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	a	ClearChatCommand
    //   0	100	1	a	org.bukkit.command.CommandSender
    //   0	100	2	a	org.bukkit.command.Command
    //   0	100	3	a	String
    //   0	100	4	a	String[]
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\ClearChatCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */