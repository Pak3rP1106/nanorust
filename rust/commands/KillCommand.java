package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class KillCommand
  implements CommandExecutor
{
  /* Error */
  public boolean onCommand(org.bukkit.command.CommandSender a, org.bukkit.command.Command a, String a, String[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 17
    //   4: ifne +6 -> 10
    //   7: iconst_1
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 17	org/bukkit/entity/Player
    //   14: dup
    //   15: dconst_0
    //   16: invokeinterface 21 3 0
    //   21: invokeinterface 25 1 0
    //   26: invokestatic 31	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   29: dup
    //   30: dup2
    //   31: invokevirtual 37	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   34: invokevirtual 43	java/lang/Integer:intValue	()I
    //   37: bipush 10
    //   39: isub
    //   40: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: invokevirtual 51	nano/spook1998/rust/object/User:setPoints	(Ljava/lang/Integer;)V
    //   46: invokevirtual 54	nano/spook1998/rust/object/User:getDeath	()Ljava/lang/Integer;
    //   49: invokevirtual 43	java/lang/Integer:intValue	()I
    //   52: iconst_1
    //   53: dup_x2
    //   54: iadd
    //   55: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: invokevirtual 57	nano/spook1998/rust/object/User:setDeath	(Ljava/lang/Integer;)V
    //   61: ireturn
    // Line number table:
    //   Java source line #41	-> byte code offset #0
    //   Java source line #150	-> byte code offset #10
    //   Java source line #23	-> byte code offset #14
    //   Java source line #97	-> byte code offset #21
    //   Java source line #164	-> byte code offset #29
    //   Java source line #38	-> byte code offset #46
    //   Java source line #123	-> byte code offset #61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	a	KillCommand
    //   0	62	1	a	org.bukkit.command.CommandSender
    //   0	62	2	a	org.bukkit.command.Command
    //   0	62	3	a	String
    //   0	62	4	a	String[]
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\KillCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */