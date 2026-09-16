package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class PlayerMoveEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onMove(org.bukkit.event.player.PlayerMoveEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: dup_x1
    //   3: invokevirtual 16	org/bukkit/event/player/PlayerMoveEvent:getTo	()Lorg/bukkit/Location;
    //   6: astore_1
    //   7: invokevirtual 19	org/bukkit/event/player/PlayerMoveEvent:getFrom	()Lorg/bukkit/Location;
    //   10: astore_2
    //   11: invokevirtual 23	org/bukkit/event/player/PlayerMoveEvent:getPlayer	()Lorg/bukkit/entity/Player;
    //   14: astore_3
    //   15: aload_1
    //   16: invokevirtual 29	org/bukkit/Location:getX	()D
    //   19: d2i
    //   20: aload_2
    //   21: invokevirtual 29	org/bukkit/Location:getX	()D
    //   24: d2i
    //   25: if_icmpne +16 -> 41
    //   28: aload_1
    //   29: invokevirtual 32	org/bukkit/Location:getZ	()D
    //   32: d2i
    //   33: aload_2
    //   34: invokevirtual 32	org/bukkit/Location:getZ	()D
    //   37: d2i
    //   38: if_icmpeq +7 -> 45
    //   41: aload_3
    //   42: invokestatic 38	nano/spook1998/rust/object/utils/RegionUtil:move	(Lorg/bukkit/entity/Player;)V
    //   45: aload_3
    //   46: invokeinterface 44 1 0
    //   51: invokestatic 50	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   54: dup
    //   55: astore_2
    //   56: invokevirtual 56	nano/spook1998/rust/object/User:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   59: ifnull +332 -> 391
    //   62: aload_3
    //   63: invokeinterface 60 1 0
    //   68: getstatic 66	nano/spook1998/rust/data/Settings:STRUCTURAL_PLAN	Lorg/bukkit/inventory/ItemStack;
    //   71: invokevirtual 72	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
    //   74: ifeq +248 -> 322
    //   77: aload_1
    //   78: invokestatic 78	nano/spook1998/rust/utils/LocationUtil:getLocation	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
    //   81: invokevirtual 82	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
    //   84: astore 4
    //   86: aload_2
    //   87: invokevirtual 86	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   90: ifnull +20 -> 110
    //   93: aload_2
    //   94: invokevirtual 86	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   97: invokevirtual 89	nano/spook1998/rust/object/Structural:getBlock	()Lorg/bukkit/block/Block;
    //   100: aload 4
    //   102: invokevirtual 93	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   105: ifeq +5 -> 110
    //   108: return
    //   109: athrow
    //   110: aload_2
    //   111: invokevirtual 86	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   114: ifnull +58 -> 172
    //   117: aload_2
    //   118: invokevirtual 86	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   121: invokevirtual 97	nano/spook1998/rust/object/Structural:getTypeBlock3	()Ljava/util/List;
    //   124: invokeinterface 103 1 0
    //   129: dup
    //   130: astore_1
    //   131: goto +33 -> 164
    //   134: athrow
    //   135: aload_1
    //   136: invokeinterface 109 1 0
    //   141: checkcast 111	org/bukkit/block/Block
    //   144: astore 5
    //   146: aload_1
    //   147: aload_3
    //   148: aload 5
    //   150: invokeinterface 113 1 0
    //   155: getstatic 119	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   158: iconst_0
    //   159: invokeinterface 123 4 0
    //   164: invokeinterface 127 1 0
    //   169: ifne -34 -> 135
    //   172: new 88	nano/spook1998/rust/object/Structural
    //   175: dup
    //   176: aload 4
    //   178: invokespecial 131	nano/spook1998/rust/object/Structural:<init>	(Lorg/bukkit/block/Block;)V
    //   181: astore 5
    //   183: aload_2
    //   184: aload 5
    //   186: dup
    //   187: dup_x2
    //   188: aload 5
    //   190: aload_2
    //   191: dup_x1
    //   192: invokevirtual 56	nano/spook1998/rust/object/User:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   195: invokevirtual 135	nano/spook1998/rust/object/Structural:setStructuralType	(Lnano/spook1998/rust/utils/type/StructuralType;)V
    //   198: invokevirtual 139	nano/spook1998/rust/object/Structural:run	(Lnano/spook1998/rust/object/User;)V
    //   201: invokevirtual 143	nano/spook1998/rust/object/User:setStructural	(Lnano/spook1998/rust/object/Structural;)V
    //   204: invokevirtual 147	nano/spook1998/rust/object/Structural:getStatusToBuild	()Ljava/lang/Boolean;
    //   207: invokevirtual 152	java/lang/Boolean:booleanValue	()Z
    //   210: ifeq +57 -> 267
    //   213: aload 5
    //   215: invokevirtual 97	nano/spook1998/rust/object/Structural:getTypeBlock3	()Ljava/util/List;
    //   218: invokeinterface 103 1 0
    //   223: dup
    //   224: astore 6
    //   226: goto +32 -> 258
    //   229: aload 6
    //   231: invokeinterface 109 1 0
    //   236: checkcast 111	org/bukkit/block/Block
    //   239: astore_1
    //   240: aload 6
    //   242: aload_3
    //   243: aload_1
    //   244: invokeinterface 113 1 0
    //   249: getstatic 155	org/bukkit/Material:STAINED_GLASS	Lorg/bukkit/Material;
    //   252: iconst_5
    //   253: invokeinterface 123 4 0
    //   258: invokeinterface 127 1 0
    //   263: ifne -34 -> 229
    //   266: return
    //   267: aload 5
    //   269: invokevirtual 97	nano/spook1998/rust/object/Structural:getTypeBlock3	()Ljava/util/List;
    //   272: invokeinterface 103 1 0
    //   277: dup
    //   278: astore 6
    //   280: goto +33 -> 313
    //   283: aload 6
    //   285: invokeinterface 109 1 0
    //   290: checkcast 111	org/bukkit/block/Block
    //   293: astore_1
    //   294: aload 6
    //   296: aload_3
    //   297: aload_1
    //   298: invokeinterface 113 1 0
    //   303: getstatic 155	org/bukkit/Material:STAINED_GLASS	Lorg/bukkit/Material;
    //   306: bipush 14
    //   308: invokeinterface 123 4 0
    //   313: invokeinterface 127 1 0
    //   318: ifne -35 -> 283
    //   321: return
    //   322: aload_2
    //   323: dup
    //   324: aconst_null
    //   325: invokevirtual 156	nano/spook1998/rust/object/User:setStructuralType	(Lnano/spook1998/rust/utils/type/StructuralType;)V
    //   328: invokevirtual 86	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   331: ifnull +60 -> 391
    //   334: aload_2
    //   335: invokevirtual 86	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   338: invokevirtual 97	nano/spook1998/rust/object/Structural:getTypeBlock3	()Ljava/util/List;
    //   341: invokeinterface 103 1 0
    //   346: dup
    //   347: astore 5
    //   349: goto +34 -> 383
    //   352: aload 5
    //   354: invokeinterface 109 1 0
    //   359: checkcast 111	org/bukkit/block/Block
    //   362: astore 4
    //   364: aload 5
    //   366: aload_3
    //   367: aload 4
    //   369: invokeinterface 113 1 0
    //   374: getstatic 119	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   377: iconst_0
    //   378: invokeinterface 123 4 0
    //   383: invokeinterface 127 1 0
    //   388: ifne -36 -> 352
    //   391: return
    // Line number table:
    //   Java source line #170	-> byte code offset #0
    //   Java source line #96	-> byte code offset #7
    //   Java source line #92	-> byte code offset #11
    //   Java source line #32	-> byte code offset #15
    //   Java source line #13	-> byte code offset #41
    //   Java source line #162	-> byte code offset #45
    //   Java source line #104	-> byte code offset #56
    //   Java source line #47	-> byte code offset #62
    //   Java source line #113	-> byte code offset #77
    //   Java source line #110	-> byte code offset #86
    //   Java source line #68	-> byte code offset #110
    //   Java source line #141	-> byte code offset #117
    //   Java source line #56	-> byte code offset #172
    //   Java source line #24	-> byte code offset #183
    //   Java source line #194	-> byte code offset #198
    //   Java source line #142	-> byte code offset #201
    //   Java source line #3	-> byte code offset #204
    //   Java source line #160	-> byte code offset #213
    //   Java source line #89	-> byte code offset #266
    //   Java source line #72	-> byte code offset #267
    //   Java source line #86	-> byte code offset #321
    //   Java source line #29	-> byte code offset #322
    //   Java source line #163	-> byte code offset #328
    //   Java source line #193	-> byte code offset #334
    //   Java source line #175	-> byte code offset #391
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	a	PlayerMoveEvent
    //   0	392	1	a	org.bukkit.event.player.PlayerMoveEvent
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PlayerMoveEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */