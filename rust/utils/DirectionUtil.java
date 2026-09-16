package nano.spook1998.rust.utils;

public class DirectionUtil
{
  /* Error */
  public static nano.spook1998.rust.utils.type.DirectionType getDirectionSpec(org.bukkit.entity.Player a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 13 1 0
    //   6: invokevirtual 19	org/bukkit/Location:getYaw	()F
    //   9: f2i
    //   10: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   13: dup
    //   14: astore_1
    //   15: invokevirtual 29	java/lang/Integer:intValue	()I
    //   18: ifge +13 -> 31
    //   21: aload_1
    //   22: invokevirtual 29	java/lang/Integer:intValue	()I
    //   25: iconst_m1
    //   26: imul
    //   27: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 29	java/lang/Integer:intValue	()I
    //   35: iflt +12 -> 47
    //   38: aload_1
    //   39: invokevirtual 29	java/lang/Integer:intValue	()I
    //   42: bipush 90
    //   44: if_icmple +23 -> 67
    //   47: aload_1
    //   48: invokevirtual 29	java/lang/Integer:intValue	()I
    //   51: sipush 180
    //   54: if_icmplt +18 -> 72
    //   57: aload_1
    //   58: invokevirtual 29	java/lang/Integer:intValue	()I
    //   61: sipush 270
    //   64: if_icmpgt +8 -> 72
    //   67: getstatic 35	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
    //   70: areturn
    //   71: athrow
    //   72: aload_1
    //   73: invokevirtual 29	java/lang/Integer:intValue	()I
    //   76: bipush 90
    //   78: if_icmplt +13 -> 91
    //   81: aload_1
    //   82: invokevirtual 29	java/lang/Integer:intValue	()I
    //   85: sipush 180
    //   88: if_icmple +23 -> 111
    //   91: aload_1
    //   92: invokevirtual 29	java/lang/Integer:intValue	()I
    //   95: sipush 270
    //   98: if_icmplt +18 -> 116
    //   101: aload_1
    //   102: invokevirtual 29	java/lang/Integer:intValue	()I
    //   105: sipush 360
    //   108: if_icmpgt +8 -> 116
    //   111: getstatic 38	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
    //   114: areturn
    //   115: athrow
    //   116: aconst_null
    //   117: areturn
    // Line number table:
    //   Java source line #155	-> byte code offset #0
    //   Java source line #162	-> byte code offset #15
    //   Java source line #73	-> byte code offset #21
    //   Java source line #182	-> byte code offset #31
    //   Java source line #77	-> byte code offset #67
    //   Java source line #47	-> byte code offset #72
    //   Java source line #113	-> byte code offset #111
    //   Java source line #68	-> byte code offset #116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	a	org.bukkit.entity.Player
  }
  
  /* Error */
  public static nano.spook1998.rust.utils.type.DirectionType getDirection(org.bukkit.entity.Player a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 13 1 0
    //   6: invokevirtual 19	org/bukkit/Location:getYaw	()F
    //   9: f2i
    //   10: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   13: dup
    //   14: astore_1
    //   15: invokevirtual 29	java/lang/Integer:intValue	()I
    //   18: ifge +13 -> 31
    //   21: aload_1
    //   22: invokevirtual 29	java/lang/Integer:intValue	()I
    //   25: iconst_m1
    //   26: imul
    //   27: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 29	java/lang/Integer:intValue	()I
    //   35: iflt +12 -> 47
    //   38: aload_1
    //   39: invokevirtual 29	java/lang/Integer:intValue	()I
    //   42: bipush 45
    //   44: if_icmple +23 -> 67
    //   47: aload_1
    //   48: invokevirtual 29	java/lang/Integer:intValue	()I
    //   51: sipush 315
    //   54: if_icmplt +18 -> 72
    //   57: aload_1
    //   58: invokevirtual 29	java/lang/Integer:intValue	()I
    //   61: sipush 360
    //   64: if_icmpgt +8 -> 72
    //   67: getstatic 38	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
    //   70: areturn
    //   71: athrow
    //   72: aload_1
    //   73: invokevirtual 29	java/lang/Integer:intValue	()I
    //   76: sipush 135
    //   79: if_icmplt +18 -> 97
    //   82: aload_1
    //   83: invokevirtual 29	java/lang/Integer:intValue	()I
    //   86: sipush 225
    //   89: if_icmpgt +8 -> 97
    //   92: getstatic 38	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
    //   95: areturn
    //   96: athrow
    //   97: aload_1
    //   98: invokevirtual 29	java/lang/Integer:intValue	()I
    //   101: bipush 45
    //   103: if_icmplt +17 -> 120
    //   106: aload_1
    //   107: invokevirtual 29	java/lang/Integer:intValue	()I
    //   110: sipush 135
    //   113: if_icmpgt +7 -> 120
    //   116: getstatic 35	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
    //   119: areturn
    //   120: aload_1
    //   121: invokevirtual 29	java/lang/Integer:intValue	()I
    //   124: sipush 225
    //   127: if_icmplt +17 -> 144
    //   130: aload_1
    //   131: invokevirtual 29	java/lang/Integer:intValue	()I
    //   134: sipush 315
    //   137: if_icmpgt +7 -> 144
    //   140: getstatic 35	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
    //   143: areturn
    //   144: aconst_null
    //   145: areturn
    // Line number table:
    //   Java source line #46	-> byte code offset #0
    //   Java source line #167	-> byte code offset #15
    //   Java source line #45	-> byte code offset #21
    //   Java source line #150	-> byte code offset #31
    //   Java source line #23	-> byte code offset #67
    //   Java source line #164	-> byte code offset #72
    //   Java source line #38	-> byte code offset #92
    //   Java source line #171	-> byte code offset #97
    //   Java source line #78	-> byte code offset #116
    //   Java source line #119	-> byte code offset #120
    //   Java source line #170	-> byte code offset #140
    //   Java source line #92	-> byte code offset #144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	a	org.bukkit.entity.Player
  }
  
  /* Error */
  public static nano.spook1998.rust.utils.type.DirectionType getDirectionSpecv(org.bukkit.entity.Player a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 13 1 0
    //   6: invokevirtual 19	org/bukkit/Location:getYaw	()F
    //   9: f2i
    //   10: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   13: dup
    //   14: astore_1
    //   15: invokevirtual 29	java/lang/Integer:intValue	()I
    //   18: ifge +13 -> 31
    //   21: aload_1
    //   22: invokevirtual 29	java/lang/Integer:intValue	()I
    //   25: iconst_m1
    //   26: imul
    //   27: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 29	java/lang/Integer:intValue	()I
    //   35: iflt +17 -> 52
    //   38: aload_1
    //   39: invokevirtual 29	java/lang/Integer:intValue	()I
    //   42: bipush 90
    //   44: if_icmpgt +8 -> 52
    //   47: getstatic 47	nano/spook1998/rust/utils/type/DirectionType:Z	Lnano/spook1998/rust/utils/type/DirectionType;
    //   50: areturn
    //   51: athrow
    //   52: aload_1
    //   53: invokevirtual 29	java/lang/Integer:intValue	()I
    //   56: sipush 180
    //   59: if_icmplt +18 -> 77
    //   62: aload_1
    //   63: invokevirtual 29	java/lang/Integer:intValue	()I
    //   66: sipush 270
    //   69: if_icmpgt +8 -> 77
    //   72: getstatic 50	nano/spook1998/rust/utils/type/DirectionType:X	Lnano/spook1998/rust/utils/type/DirectionType;
    //   75: areturn
    //   76: athrow
    //   77: aload_1
    //   78: invokevirtual 29	java/lang/Integer:intValue	()I
    //   81: bipush 90
    //   83: if_icmplt +17 -> 100
    //   86: aload_1
    //   87: invokevirtual 29	java/lang/Integer:intValue	()I
    //   90: sipush 180
    //   93: if_icmpgt +7 -> 100
    //   96: getstatic 53	nano/spook1998/rust/utils/type/DirectionType:C	Lnano/spook1998/rust/utils/type/DirectionType;
    //   99: areturn
    //   100: aload_1
    //   101: invokevirtual 29	java/lang/Integer:intValue	()I
    //   104: sipush 270
    //   107: if_icmplt +17 -> 124
    //   110: aload_1
    //   111: invokevirtual 29	java/lang/Integer:intValue	()I
    //   114: sipush 360
    //   117: if_icmpgt +7 -> 124
    //   120: getstatic 56	nano/spook1998/rust/utils/type/DirectionType:V	Lnano/spook1998/rust/utils/type/DirectionType;
    //   123: areturn
    //   124: aconst_null
    //   125: areturn
    // Line number table:
    //   Java source line #24	-> byte code offset #0
    //   Java source line #194	-> byte code offset #15
    //   Java source line #142	-> byte code offset #21
    //   Java source line #160	-> byte code offset #31
    //   Java source line #89	-> byte code offset #47
    //   Java source line #5	-> byte code offset #52
    //   Java source line #86	-> byte code offset #72
    //   Java source line #163	-> byte code offset #77
    //   Java source line #193	-> byte code offset #96
    //   Java source line #129	-> byte code offset #100
    //   Java source line #21	-> byte code offset #120
    //   Java source line #112	-> byte code offset #124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	a	org.bukkit.entity.Player
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\DirectionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */