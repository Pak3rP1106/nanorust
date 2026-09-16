package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class BlockPlaceEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onPlace(org.bukkit.event.block.BlockPlaceEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokevirtual 16	org/bukkit/event/block/BlockPlaceEvent:getPlayer	()Lorg/bukkit/entity/Player;
    //   5: dup
    //   6: astore_2
    //   7: invokeinterface 22 1 0
    //   12: invokestatic 28	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   15: astore_3
    //   16: invokevirtual 32	org/bukkit/event/block/BlockPlaceEvent:getBlock	()Lorg/bukkit/block/Block;
    //   19: dup
    //   20: astore 4
    //   22: dup
    //   23: getstatic 38	org/bukkit/block/BlockFace:DOWN	Lorg/bukkit/block/BlockFace;
    //   26: invokeinterface 44 2 0
    //   31: astore 5
    //   33: invokeinterface 48 1 0
    //   38: getstatic 54	org/bukkit/Material:TNT	Lorg/bukkit/Material;
    //   41: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   44: ifeq +66 -> 110
    //   47: getstatic 64	nano/spook1998/rust/data/Settings:RAID	Ljava/lang/Boolean;
    //   50: invokevirtual 70	java/lang/Boolean:booleanValue	()Z
    //   53: ifne +45 -> 98
    //   56: invokestatic 76	nano/spook1998/rust/utils/DurabilityUtil:getInstance	()Lnano/spook1998/rust/utils/DurabilityUtil;
    //   59: aload_2
    //   60: dup
    //   61: invokeinterface 80 1 0
    //   66: invokevirtual 84	nano/spook1998/rust/utils/DurabilityUtil:recalculateDurability	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   69: aload_2
    //   70: aload_1
    //   71: iconst_1
    //   72: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   75: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   78: ldc 94
    //   80: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   83: invokeinterface 103 2 0
    //   88: checkcast 105	java/lang/String
    //   91: invokeinterface 109 2 0
    //   96: return
    //   97: athrow
    //   98: aload 4
    //   100: bipush 20
    //   102: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   105: invokestatic 121	nano/spook1998/rust/utils/TntUtil:start	(Lorg/bukkit/block/Block;Ljava/lang/Integer;)V
    //   108: return
    //   109: athrow
    //   110: aload_1
    //   111: invokevirtual 122	org/bukkit/event/block/BlockPlaceEvent:getItemInHand	()Lorg/bukkit/inventory/ItemStack;
    //   114: dup
    //   115: astore 6
    //   117: invokevirtual 125	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   120: invokevirtual 128	org/bukkit/Material:toString	()Ljava/lang/String;
    //   123: ldc -126
    //   125: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   128: invokevirtual 134	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   131: ifeq +4 -> 135
    //   134: return
    //   135: aload 4
    //   137: invokeinterface 48 1 0
    //   142: getstatic 137	org/bukkit/Material:LADDER	Lorg/bukkit/Material;
    //   145: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   148: ifne +187 -> 335
    //   151: aload 4
    //   153: invokeinterface 48 1 0
    //   158: getstatic 140	org/bukkit/Material:WALL_SIGN	Lorg/bukkit/Material;
    //   161: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   164: ifne +171 -> 335
    //   167: aload 5
    //   169: invokeinterface 48 1 0
    //   174: getstatic 143	org/bukkit/Material:GRASS	Lorg/bukkit/Material;
    //   177: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   180: ifne +155 -> 335
    //   183: aload 5
    //   185: invokeinterface 48 1 0
    //   190: getstatic 146	org/bukkit/Material:DIRT	Lorg/bukkit/Material;
    //   193: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   196: ifne +139 -> 335
    //   199: aload 5
    //   201: invokeinterface 150 1 0
    //   206: bipush 98
    //   208: if_icmpeq +127 -> 335
    //   211: aload 5
    //   213: invokeinterface 48 1 0
    //   218: getstatic 153	org/bukkit/Material:WOOD	Lorg/bukkit/Material;
    //   221: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   224: ifne +111 -> 335
    //   227: aload 5
    //   229: invokeinterface 48 1 0
    //   234: getstatic 156	org/bukkit/Material:HAY_BLOCK	Lorg/bukkit/Material;
    //   237: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   240: ifne +95 -> 335
    //   243: aload 5
    //   245: invokeinterface 48 1 0
    //   250: getstatic 159	org/bukkit/Material:IRON_BLOCK	Lorg/bukkit/Material;
    //   253: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   256: ifne +79 -> 335
    //   259: aload 5
    //   261: invokeinterface 48 1 0
    //   266: getstatic 162	org/bukkit/Material:BRICK	Lorg/bukkit/Material;
    //   269: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   272: ifne +63 -> 335
    //   275: aload 5
    //   277: invokeinterface 48 1 0
    //   282: getstatic 165	org/bukkit/Material:OBSIDIAN	Lorg/bukkit/Material;
    //   285: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   288: ifne +47 -> 335
    //   291: aload 5
    //   293: invokeinterface 48 1 0
    //   298: getstatic 168	org/bukkit/Material:LOG	Lorg/bukkit/Material;
    //   301: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   304: ifne +31 -> 335
    //   307: aload_2
    //   308: aload_1
    //   309: iconst_1
    //   310: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   313: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   316: ldc -86
    //   318: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   321: invokeinterface 103 2 0
    //   326: checkcast 105	java/lang/String
    //   329: invokeinterface 109 2 0
    //   334: return
    //   335: getstatic 174	nano/spook1998/rust/data/Settings:ALLOWED_PLACE	Ljava/util/List;
    //   338: aload 4
    //   340: invokeinterface 48 1 0
    //   345: invokeinterface 178 2 0
    //   350: ifne +31 -> 381
    //   353: aload_2
    //   354: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   357: ldc -76
    //   359: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   362: invokeinterface 103 2 0
    //   367: checkcast 105	java/lang/String
    //   370: invokeinterface 109 2 0
    //   375: aload_1
    //   376: iconst_1
    //   377: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   380: return
    //   381: aload 4
    //   383: invokeinterface 184 1 0
    //   388: dup
    //   389: astore 7
    //   391: invokestatic 190	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
    //   394: dup
    //   395: astore 8
    //   397: ifnull +40 -> 437
    //   400: aload 8
    //   402: aload_3
    //   403: invokevirtual 196	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
    //   406: ifne +31 -> 437
    //   409: aload_2
    //   410: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   413: ldc -58
    //   415: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   418: invokeinterface 103 2 0
    //   423: checkcast 105	java/lang/String
    //   426: invokeinterface 109 2 0
    //   431: aload_1
    //   432: iconst_1
    //   433: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   436: return
    //   437: aload 6
    //   439: invokevirtual 125	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   442: getstatic 201	org/bukkit/Material:IRON_DOOR	Lorg/bukkit/Material;
    //   445: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   448: ifeq +42 -> 490
    //   451: aload 5
    //   453: invokeinterface 48 1 0
    //   458: getstatic 168	org/bukkit/Material:LOG	Lorg/bukkit/Material;
    //   461: invokevirtual 58	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   464: ifeq +20 -> 484
    //   467: aload_0
    //   468: aload 4
    //   470: invokeinterface 184 1 0
    //   475: invokespecial 204	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Lorg/bukkit/Location;)Ljava/lang/Boolean;
    //   478: invokevirtual 70	java/lang/Boolean:booleanValue	()Z
    //   481: ifne +9 -> 490
    //   484: aload_1
    //   485: iconst_1
    //   486: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   489: return
    //   490: aload 6
    //   492: getstatic 208	nano/spook1998/rust/data/Settings:WORDROBE	Lorg/bukkit/inventory/ItemStack;
    //   495: invokevirtual 212	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
    //   498: ifeq +156 -> 654
    //   501: aload 8
    //   503: ifnonnull +123 -> 626
    //   506: aload 7
    //   508: invokestatic 215	nano/spook1998/rust/object/utils/RegionUtil:distanceWordrobe	(Lorg/bukkit/Location;)Ljava/lang/Boolean;
    //   511: invokevirtual 70	java/lang/Boolean:booleanValue	()Z
    //   514: ifne +31 -> 545
    //   517: aload_2
    //   518: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   521: ldc -39
    //   523: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   526: invokeinterface 103 2 0
    //   531: checkcast 105	java/lang/String
    //   534: invokeinterface 109 2 0
    //   539: aload_1
    //   540: iconst_1
    //   541: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   544: return
    //   545: aload 5
    //   547: invokestatic 223	nano/spook1998/rust/object/utils/StructuralUtil:checkBlock	(Lorg/bukkit/block/Block;)Lnano/spook1998/rust/object/Structural;
    //   550: dup
    //   551: astore 4
    //   553: ifnull +31 -> 584
    //   556: aload 4
    //   558: invokevirtual 229	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   561: getstatic 235	nano/spook1998/rust/utils/type/StructuralType:FLOOR	Lnano/spook1998/rust/utils/type/StructuralType;
    //   564: invokevirtual 236	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
    //   567: ifne +45 -> 612
    //   570: aload 4
    //   572: invokevirtual 229	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   575: getstatic 239	nano/spook1998/rust/utils/type/StructuralType:FLOORSPEC	Lnano/spook1998/rust/utils/type/StructuralType;
    //   578: invokevirtual 236	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
    //   581: ifne +31 -> 612
    //   584: aload_2
    //   585: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   588: ldc -15
    //   590: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   593: invokeinterface 103 2 0
    //   598: checkcast 105	java/lang/String
    //   601: invokeinterface 109 2 0
    //   606: aload_1
    //   607: iconst_1
    //   608: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   611: return
    //   612: new 192	nano/spook1998/rust/object/Region
    //   615: dup
    //   616: aload 7
    //   618: invokespecial 245	nano/spook1998/rust/object/Region:<init>	(Lorg/bukkit/Location;)V
    //   621: aload_3
    //   622: invokevirtual 249	nano/spook1998/rust/object/Region:addUser	(Lnano/spook1998/rust/object/User;)V
    //   625: return
    //   626: aload_1
    //   627: iconst_1
    //   628: invokevirtual 88	org/bukkit/event/block/BlockPlaceEvent:setCancelled	(Z)V
    //   631: aload_2
    //   632: getstatic 92	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   635: ldc -5
    //   637: invokestatic 98	nano/spook1998/rust/listeners/BlockPlaceEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   640: invokeinterface 103 2 0
    //   645: checkcast 105	java/lang/String
    //   648: invokeinterface 109 2 0
    //   653: return
    //   654: return
    // Line number table:
    //   Java source line #92	-> byte code offset #0
    //   Java source line #32	-> byte code offset #7
    //   Java source line #13	-> byte code offset #16
    //   Java source line #155	-> byte code offset #22
    //   Java source line #162	-> byte code offset #33
    //   Java source line #73	-> byte code offset #47
    //   Java source line #182	-> byte code offset #70
    //   Java source line #77	-> byte code offset #75
    //   Java source line #47	-> byte code offset #96
    //   Java source line #110	-> byte code offset #98
    //   Java source line #68	-> byte code offset #108
    //   Java source line #180	-> byte code offset #110
    //   Java source line #56	-> byte code offset #117
    //   Java source line #24	-> byte code offset #135
    //   Java source line #194	-> byte code offset #167
    //   Java source line #142	-> byte code offset #308
    //   Java source line #3	-> byte code offset #313
    //   Java source line #89	-> byte code offset #334
    //   Java source line #86	-> byte code offset #335
    //   Java source line #163	-> byte code offset #353
    //   Java source line #193	-> byte code offset #375
    //   Java source line #60	-> byte code offset #380
    //   Java source line #21	-> byte code offset #381
    //   Java source line #175	-> byte code offset #391
    //   Java source line #112	-> byte code offset #397
    //   Java source line #158	-> byte code offset #409
    //   Java source line #138	-> byte code offset #431
    //   Java source line #91	-> byte code offset #436
    //   Java source line #59	-> byte code offset #437
    //   Java source line #174	-> byte code offset #451
    //   Java source line #19	-> byte code offset #484
    //   Java source line #18	-> byte code offset #489
    //   Java source line #176	-> byte code offset #490
    //   Java source line #66	-> byte code offset #501
    //   Java source line #20	-> byte code offset #506
    //   Java source line #173	-> byte code offset #517
    //   Java source line #139	-> byte code offset #539
    //   Java source line #71	-> byte code offset #544
    //   Java source line #106	-> byte code offset #545
    //   Java source line #64	-> byte code offset #553
    //   Java source line #147	-> byte code offset #584
    //   Java source line #74	-> byte code offset #606
    //   Java source line #27	-> byte code offset #611
    //   Java source line #186	-> byte code offset #612
    //   Java source line #133	-> byte code offset #621
    //   Java source line #121	-> byte code offset #625
    //   Java source line #192	-> byte code offset #626
    //   Java source line #99	-> byte code offset #631
    //   Java source line #28	-> byte code offset #653
    //   Java source line #157	-> byte code offset #654
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	655	0	a	BlockPlaceEvent
    //   0	655	1	a	org.bukkit.event.block.BlockPlaceEvent
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp13_12 = 2;
    int tmp19_18 = 4;
    int tmp25_22 = a.length();
    int tmp29_28 = 1;
    tmp29_28;
    int j;
    int ? = tmp29_28;
    int k = tmp25_22;
    (j = new char[tmp25_22] - 1);
    int i = tmp19_18 << tmp19_18;
    if ((5 << 4 ^ tmp13_12 << tmp13_12 ^ 0x1) >= 0)
    {
      int tmp48_47 = j;
      j--;
      ?[tmp48_47] = ((char)(a.charAt(tmp48_47) ^ i));
      int tmp69_66 = (j--);
      ?[tmp69_66] = ((char)(a.charAt(tmp69_66) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\BlockPlaceEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */