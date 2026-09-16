package nano.spook1998.rust.utils;

public class TntUtil
{
  /* Error */
  public static void start(org.bukkit.block.Block a, Integer a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 47	java/lang/Integer:intValue	()I
    //   4: iconst_1
    //   5: isub
    //   6: invokestatic 37	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   9: dup
    //   10: astore_1
    //   11: invokevirtual 47	java/lang/Integer:intValue	()I
    //   14: ifgt +18 -> 32
    //   17: aload_0
    //   18: dup
    //   19: invokestatic 92	nano/spook1998/rust/utils/TntUtil:ALLATORIxDEMO	(Lorg/bukkit/block/Block;)V
    //   22: getstatic 98	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   25: invokeinterface 102 2 0
    //   30: return
    //   31: athrow
    //   32: invokestatic 108	org/bukkit/Bukkit:getScheduler	()Lorg/bukkit/scheduler/BukkitScheduler;
    //   35: invokestatic 114	nano/spook1998/rust/NanoRust:getInstance	()Lnano/spook1998/rust/NanoRust;
    //   38: new 7	nano/spook1998/rust/utils/i
    //   41: dup
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 116	nano/spook1998/rust/utils/i:<init>	(Lorg/bukkit/block/Block;Ljava/lang/Integer;)V
    //   47: aload_1
    //   48: invokevirtual 47	java/lang/Integer:intValue	()I
    //   51: i2l
    //   52: invokeinterface 122 5 0
    //   57: pop
    //   58: return
    // Line number table:
    //   Java source line #38	-> byte code offset #0
    //   Java source line #123	-> byte code offset #11
    //   Java source line #171	-> byte code offset #17
    //   Java source line #78	-> byte code offset #22
    //   Java source line #93	-> byte code offset #30
    //   Java source line #170	-> byte code offset #32
    //   Java source line #73	-> byte code offset #47
    //   Java source line #170	-> byte code offset #52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	a	org.bukkit.block.Block
    //   0	59	1	a	Integer
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\TntUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */