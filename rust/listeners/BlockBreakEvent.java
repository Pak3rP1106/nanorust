package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class BlockBreakEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onBreak(org.bukkit.event.block.BlockBreakEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 16	org/bukkit/event/block/BlockBreakEvent:getPlayer	()Lorg/bukkit/entity/Player;
    //   4: dup
    //   5: astore_2
    //   6: invokeinterface 22 1 0
    //   11: invokevirtual 28	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   14: getstatic 34	org/bukkit/Material:GOLD_AXE	Lorg/bukkit/Material;
    //   17: invokevirtual 38	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   20: ifeq +32 -> 52
    //   23: aload_1
    //   24: iconst_1
    //   25: aload_2
    //   26: invokeinterface 42 1 0
    //   31: aload_2
    //   32: invokeinterface 42 1 0
    //   37: invokeinterface 48 1 0
    //   42: invokeinterface 52 2 0
    //   47: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   50: return
    //   51: athrow
    //   52: aload_2
    //   53: invokeinterface 60 1 0
    //   58: invokestatic 66	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   61: astore_3
    //   62: aload_1
    //   63: invokevirtual 70	org/bukkit/event/block/BlockBreakEvent:getBlock	()Lorg/bukkit/block/Block;
    //   66: dup
    //   67: astore 4
    //   69: invokeinterface 73 1 0
    //   74: getstatic 76	org/bukkit/Material:SPONGE	Lorg/bukkit/Material;
    //   77: invokevirtual 38	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   80: ifne +13 -> 93
    //   83: aload_3
    //   84: invokestatic 82	java/lang/System:currentTimeMillis	()J
    //   87: invokestatic 88	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   90: invokevirtual 94	nano/spook1998/rust/object/User:setTimeOpen	(Ljava/lang/Long;)V
    //   93: getstatic 100	nano/spook1998/rust/data/Settings:ALLOWED_BREAK	Ljava/util/List;
    //   96: aload 4
    //   98: invokeinterface 73 1 0
    //   103: invokeinterface 105 2 0
    //   108: ifne +32 -> 140
    //   111: aload_2
    //   112: getstatic 109	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   115: ldc 111
    //   117: invokestatic 115	nano/spook1998/rust/listeners/BlockBreakEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   120: invokeinterface 120 2 0
    //   125: checkcast 122	java/lang/String
    //   128: invokeinterface 126 2 0
    //   133: aload_1
    //   134: iconst_1
    //   135: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   138: return
    //   139: athrow
    //   140: aload 4
    //   142: invokestatic 132	nano/spook1998/rust/object/utils/StructuralUtil:checkBlockHP	(Lorg/bukkit/block/Block;)Lnano/spook1998/rust/object/Structural;
    //   145: dup
    //   146: astore 5
    //   148: ifnull +289 -> 437
    //   151: getstatic 136	nano/spook1998/rust/data/Settings:RAID	Ljava/lang/Boolean;
    //   154: invokevirtual 142	java/lang/Boolean:booleanValue	()Z
    //   157: ifne +48 -> 205
    //   160: invokestatic 148	nano/spook1998/rust/utils/DurabilityUtil:getInstance	()Lnano/spook1998/rust/utils/DurabilityUtil;
    //   163: aload_2
    //   164: dup
    //   165: invokeinterface 22 1 0
    //   170: invokevirtual 152	nano/spook1998/rust/utils/DurabilityUtil:recalculateDurability	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   173: aload_2
    //   174: aload_1
    //   175: iconst_1
    //   176: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   179: getstatic 109	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   182: ldc -102
    //   184: invokestatic 115	nano/spook1998/rust/listeners/BlockBreakEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   187: invokeinterface 120 2 0
    //   192: checkcast 122	java/lang/String
    //   195: invokeinterface 126 2 0
    //   200: aload 4
    //   202: goto +237 -> 439
    //   205: aload 5
    //   207: aload 4
    //   209: aload 5
    //   211: invokevirtual 160	nano/spook1998/rust/object/Structural:setTime	()V
    //   214: invokevirtual 164	nano/spook1998/rust/object/Structural:isInStructural	(Lorg/bukkit/block/Block;)Ljava/lang/Boolean;
    //   217: invokevirtual 142	java/lang/Boolean:booleanValue	()Z
    //   220: ifeq +198 -> 418
    //   223: invokestatic 170	org/bukkit/Bukkit:getOnlinePlayers	()Ljava/util/Collection;
    //   226: invokeinterface 176 1 0
    //   231: dup
    //   232: astore 7
    //   234: goto +64 -> 298
    //   237: aload 7
    //   239: invokeinterface 182 1 0
    //   244: checkcast 18	org/bukkit/entity/Player
    //   247: dup
    //   248: astore 6
    //   250: invokeinterface 186 1 0
    //   255: aload 4
    //   257: invokeinterface 187 1 0
    //   262: invokevirtual 193	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
    //   265: ldc2_w 194
    //   268: dcmpg
    //   269: ifgt +27 -> 296
    //   272: aload 4
    //   274: invokeinterface 199 1 0
    //   279: aload 4
    //   281: invokeinterface 187 1 0
    //   286: getstatic 205	org/bukkit/Sound:ZOMBIE_WOOD	Lorg/bukkit/Sound;
    //   289: fconst_1
    //   290: dup
    //   291: invokeinterface 211 5 0
    //   296: aload 7
    //   298: invokeinterface 214 1 0
    //   303: ifne -66 -> 237
    //   306: aload 5
    //   308: invokevirtual 218	nano/spook1998/rust/object/Structural:getHealth	()Ljava/lang/Integer;
    //   311: dup
    //   312: astore 6
    //   314: invokevirtual 223	java/lang/Integer:intValue	()I
    //   317: iconst_1
    //   318: isub
    //   319: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   322: dup
    //   323: astore 6
    //   325: invokevirtual 223	java/lang/Integer:intValue	()I
    //   328: ifge +9 -> 337
    //   331: aload 5
    //   333: invokevirtual 229	nano/spook1998/rust/object/Structural:destroy	()V
    //   336: return
    //   337: aload_2
    //   338: getstatic 109	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   341: ldc -25
    //   343: invokestatic 115	nano/spook1998/rust/listeners/BlockBreakEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   346: invokeinterface 120 2 0
    //   351: checkcast 122	java/lang/String
    //   354: ldc -23
    //   356: invokestatic 115	nano/spook1998/rust/listeners/BlockBreakEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   359: aload 5
    //   361: invokevirtual 218	nano/spook1998/rust/object/Structural:getHealth	()Ljava/lang/Integer;
    //   364: invokevirtual 236	java/lang/Integer:toString	()Ljava/lang/String;
    //   367: invokevirtual 240	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   370: invokeinterface 126 2 0
    //   375: aload 6
    //   377: invokevirtual 223	java/lang/Integer:intValue	()I
    //   380: aload 5
    //   382: swap
    //   383: ifne +11 -> 394
    //   386: invokevirtual 229	nano/spook1998/rust/object/Structural:destroy	()V
    //   389: aload 4
    //   391: goto +48 -> 439
    //   394: aload 6
    //   396: invokevirtual 244	nano/spook1998/rust/object/Structural:setHealth	(Ljava/lang/Integer;)V
    //   399: invokestatic 148	nano/spook1998/rust/utils/DurabilityUtil:getInstance	()Lnano/spook1998/rust/utils/DurabilityUtil;
    //   402: aload_2
    //   403: dup
    //   404: invokeinterface 22 1 0
    //   409: invokevirtual 152	nano/spook1998/rust/utils/DurabilityUtil:recalculateDurability	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   412: aload_1
    //   413: iconst_1
    //   414: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   417: return
    //   418: invokestatic 148	nano/spook1998/rust/utils/DurabilityUtil:getInstance	()Lnano/spook1998/rust/utils/DurabilityUtil;
    //   421: aload_2
    //   422: dup
    //   423: invokeinterface 22 1 0
    //   428: invokevirtual 152	nano/spook1998/rust/utils/DurabilityUtil:recalculateDurability	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   431: aload_1
    //   432: iconst_1
    //   433: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   436: return
    //   437: aload 4
    //   439: invokeinterface 187 1 0
    //   444: dup
    //   445: astore 6
    //   447: invokestatic 250	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
    //   450: dup
    //   451: astore 7
    //   453: ifnull +147 -> 600
    //   456: aload 7
    //   458: aload_3
    //   459: invokevirtual 256	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
    //   462: ifne +119 -> 581
    //   465: getstatic 259	nano/spook1998/rust/data/Settings:ALLOWED_BREAK_AT_REGION	Ljava/util/List;
    //   468: aload 4
    //   470: invokeinterface 73 1 0
    //   475: invokeinterface 105 2 0
    //   480: ifne +32 -> 512
    //   483: aload_2
    //   484: aload_1
    //   485: iconst_1
    //   486: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   489: getstatic 109	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   492: ldc_w 261
    //   495: invokestatic 115	nano/spook1998/rust/listeners/BlockBreakEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   498: invokeinterface 120 2 0
    //   503: checkcast 122	java/lang/String
    //   506: invokeinterface 126 2 0
    //   511: return
    //   512: getstatic 136	nano/spook1998/rust/data/Settings:RAID	Ljava/lang/Boolean;
    //   515: invokevirtual 142	java/lang/Boolean:booleanValue	()Z
    //   518: ifne +44 -> 562
    //   521: invokestatic 148	nano/spook1998/rust/utils/DurabilityUtil:getInstance	()Lnano/spook1998/rust/utils/DurabilityUtil;
    //   524: aload_2
    //   525: dup
    //   526: invokeinterface 22 1 0
    //   531: invokevirtual 152	nano/spook1998/rust/utils/DurabilityUtil:recalculateDurability	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   534: aload_2
    //   535: aload_1
    //   536: iconst_1
    //   537: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   540: getstatic 109	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   543: ldc -102
    //   545: invokestatic 115	nano/spook1998/rust/listeners/BlockBreakEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   548: invokeinterface 120 2 0
    //   553: checkcast 122	java/lang/String
    //   556: invokeinterface 126 2 0
    //   561: return
    //   562: aload 7
    //   564: invokevirtual 262	nano/spook1998/rust/object/Region:getBlock	()Lorg/bukkit/block/Block;
    //   567: aload 4
    //   569: invokevirtual 263	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   572: ifeq +28 -> 600
    //   575: aload_1
    //   576: iconst_1
    //   577: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   580: return
    //   581: aload 7
    //   583: invokevirtual 262	nano/spook1998/rust/object/Region:getBlock	()Lorg/bukkit/block/Block;
    //   586: aload 4
    //   588: invokevirtual 263	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   591: ifeq +9 -> 600
    //   594: aload_1
    //   595: iconst_1
    //   596: invokevirtual 56	org/bukkit/event/block/BlockBreakEvent:setCancelled	(Z)V
    //   599: return
    //   600: aload 4
    //   602: invokestatic 269	nano/spook1998/rust/object/utils/StoneGeneratorUtil:manager	(Lorg/bukkit/block/Block;)V
    //   605: return
    // Line number table:
    //   Java source line #170	-> byte code offset #0
    //   Java source line #96	-> byte code offset #6
    //   Java source line #92	-> byte code offset #25
    //   Java source line #32	-> byte code offset #47
    //   Java source line #13	-> byte code offset #50
    //   Java source line #162	-> byte code offset #52
    //   Java source line #73	-> byte code offset #62
    //   Java source line #182	-> byte code offset #83
    //   Java source line #104	-> byte code offset #93
    //   Java source line #47	-> byte code offset #111
    //   Java source line #113	-> byte code offset #133
    //   Java source line #110	-> byte code offset #138
    //   Java source line #141	-> byte code offset #140
    //   Java source line #180	-> byte code offset #148
    //   Java source line #56	-> byte code offset #151
    //   Java source line #24	-> byte code offset #160
    //   Java source line #194	-> byte code offset #174
    //   Java source line #142	-> byte code offset #179
    //   Java source line #3	-> byte code offset #202
    //   Java source line #160	-> byte code offset #205
    //   Java source line #89	-> byte code offset #214
    //   Java source line #72	-> byte code offset #223
    //   Java source line #5	-> byte code offset #250
    //   Java source line #72	-> byte code offset #296
    //   Java source line #29	-> byte code offset #306
    //   Java source line #163	-> byte code offset #314
    //   Java source line #193	-> byte code offset #325
    //   Java source line #60	-> byte code offset #331
    //   Java source line #129	-> byte code offset #336
    //   Java source line #175	-> byte code offset #337
    //   Java source line #112	-> byte code offset #375
    //   Java source line #70	-> byte code offset #386
    //   Java source line #158	-> byte code offset #391
    //   Java source line #138	-> byte code offset #394
    //   Java source line #91	-> byte code offset #399
    //   Java source line #39	-> byte code offset #412
    //   Java source line #59	-> byte code offset #417
    //   Java source line #120	-> byte code offset #418
    //   Java source line #11	-> byte code offset #431
    //   Java source line #176	-> byte code offset #436
    //   Java source line #139	-> byte code offset #437
    //   Java source line #71	-> byte code offset #447
    //   Java source line #80	-> byte code offset #453
    //   Java source line #106	-> byte code offset #456
    //   Java source line #64	-> byte code offset #465
    //   Java source line #147	-> byte code offset #484
    //   Java source line #74	-> byte code offset #489
    //   Java source line #27	-> byte code offset #511
    //   Java source line #186	-> byte code offset #512
    //   Java source line #133	-> byte code offset #521
    //   Java source line #121	-> byte code offset #535
    //   Java source line #57	-> byte code offset #540
    //   Java source line #192	-> byte code offset #561
    //   Java source line #28	-> byte code offset #562
    //   Java source line #94	-> byte code offset #575
    //   Java source line #157	-> byte code offset #580
    //   Java source line #85	-> byte code offset #581
    //   Java source line #14	-> byte code offset #594
    //   Java source line #67	-> byte code offset #599
    //   Java source line #165	-> byte code offset #600
    //   Java source line #154	-> byte code offset #605
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	606	0	a	BlockBreakEvent
    //   0	606	1	a	org.bukkit.event.block.BlockBreakEvent
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp19_16 = a.length();
    int tmp23_22 = 1;
    tmp23_22;
    int j;
    int ? = tmp23_22;
    int k = tmp19_16;
    int tmp33_29 = (j = new char[tmp19_16] - 1);
    tmp33_29;
    int i = (0x3 ^ 0x5) << 3 ^ 0x1;
    ((0x2 ^ 0x5) << 3 ^ 0x5);
    if (tmp33_29 >= 0)
    {
      int tmp43_42 = j;
      j--;
      ?[tmp43_42] = ((char)(a.charAt(tmp43_42) ^ i));
      int tmp64_61 = (j--);
      ?[tmp64_61] = ((char)(a.charAt(tmp64_61) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\BlockBreakEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */