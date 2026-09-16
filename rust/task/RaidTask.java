package nano.spook1998.rust.task;

import org.bukkit.scheduler.BukkitRunnable;

public class RaidTask
  extends BukkitRunnable
{
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 11	nano/spook1998/rust/task/RaidTask:ALLATORIxDEMO	()Ljava/lang/Long;
    //   4: dup
    //   5: astore_1
    //   6: invokevirtual 17	java/lang/Long:longValue	()J
    //   9: getstatic 23	nano/spook1998/rust/data/Settings:RAID_TIME_MIN	Ljava/lang/Long;
    //   12: invokevirtual 17	java/lang/Long:longValue	()J
    //   15: lcmp
    //   16: iflt +26 -> 42
    //   19: aload_1
    //   20: invokevirtual 17	java/lang/Long:longValue	()J
    //   23: getstatic 26	nano/spook1998/rust/data/Settings:RAID_TIME_MAX	Ljava/lang/Long;
    //   26: invokevirtual 17	java/lang/Long:longValue	()J
    //   29: lcmp
    //   30: ifgt +12 -> 42
    //   33: iconst_1
    //   34: invokestatic 32	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   37: putstatic 36	nano/spook1998/rust/data/Settings:RAID	Ljava/lang/Boolean;
    //   40: return
    //   41: athrow
    //   42: iconst_0
    //   43: invokestatic 32	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   46: putstatic 36	nano/spook1998/rust/data/Settings:RAID	Ljava/lang/Boolean;
    //   49: return
    // Line number table:
    //   Java source line #45	-> byte code offset #0
    //   Java source line #41	-> byte code offset #6
    //   Java source line #150	-> byte code offset #33
    //   Java source line #23	-> byte code offset #40
    //   Java source line #97	-> byte code offset #42
    //   Java source line #123	-> byte code offset #49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	a	RaidTask
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\RaidTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */