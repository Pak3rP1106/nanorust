package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class PlayerDeathEvent
  implements Listener
{
  /* Error */
  @org.bukkit.event.EventHandler
  public void onDeath(org.bukkit.event.entity.PlayerDeathEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokevirtual 16	org/bukkit/event/entity/PlayerDeathEvent:getEntity	()Lorg/bukkit/entity/Player;
    //   5: dup
    //   6: astore_2
    //   7: dup
    //   8: invokeinterface 22 1 0
    //   13: invokestatic 28	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   16: astore_3
    //   17: aconst_null
    //   18: astore 4
    //   20: invokeinterface 32 1 0
    //   25: aload_2
    //   26: invokeinterface 36 1 0
    //   31: invokeinterface 42 2 0
    //   36: pop
    //   37: invokevirtual 16	org/bukkit/event/entity/PlayerDeathEvent:getEntity	()Lorg/bukkit/entity/Player;
    //   40: invokeinterface 45 1 0
    //   45: instanceof 18
    //   48: ifeq +14 -> 62
    //   51: aload_1
    //   52: invokevirtual 16	org/bukkit/event/entity/PlayerDeathEvent:getEntity	()Lorg/bukkit/entity/Player;
    //   55: invokeinterface 45 1 0
    //   60: astore 4
    //   62: aload 4
    //   64: ifnull +501 -> 565
    //   67: getstatic 51	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   70: ldc 53
    //   72: invokestatic 57	nano/spook1998/rust/listeners/PlayerDeathEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   75: invokeinterface 62 2 0
    //   80: checkcast 64	java/lang/String
    //   83: astore 5
    //   85: iconst_0
    //   86: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   89: astore 6
    //   91: iconst_0
    //   92: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   95: astore 7
    //   97: aload 4
    //   99: invokeinterface 22 1 0
    //   104: invokestatic 28	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   107: dup
    //   108: astore 8
    //   110: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   113: invokevirtual 80	java/lang/Integer:intValue	()I
    //   116: aload_3
    //   117: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   120: invokevirtual 80	java/lang/Integer:intValue	()I
    //   123: if_icmple +24 -> 147
    //   126: bipush -3
    //   128: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: astore 6
    //   133: invokestatic 86	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
    //   136: iconst_5
    //   137: bipush 10
    //   139: invokevirtual 90	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
    //   142: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   145: astore 7
    //   147: aload 8
    //   149: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   152: invokevirtual 80	java/lang/Integer:intValue	()I
    //   155: aload_3
    //   156: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   159: invokevirtual 80	java/lang/Integer:intValue	()I
    //   162: if_icmpge +70 -> 232
    //   165: aload_3
    //   166: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   169: invokevirtual 80	java/lang/Integer:intValue	()I
    //   172: aload 8
    //   174: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   177: invokevirtual 80	java/lang/Integer:intValue	()I
    //   180: isub
    //   181: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: dup
    //   185: astore 9
    //   187: invokevirtual 80	java/lang/Integer:intValue	()I
    //   190: sipush 200
    //   193: if_icmple +11 -> 204
    //   196: sipush 200
    //   199: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: astore 9
    //   204: aload 9
    //   206: dup
    //   207: invokevirtual 80	java/lang/Integer:intValue	()I
    //   210: iconst_2
    //   211: idiv
    //   212: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   215: astore 7
    //   217: invokevirtual 80	java/lang/Integer:intValue	()I
    //   220: iconst_4
    //   221: idiv
    //   222: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   225: dup
    //   226: astore 6
    //   228: goto +35 -> 263
    //   231: athrow
    //   232: invokestatic 86	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
    //   235: iconst_5
    //   236: bipush 10
    //   238: invokevirtual 90	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
    //   241: ineg
    //   242: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   245: astore 6
    //   247: invokestatic 86	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
    //   250: iconst_5
    //   251: bipush 30
    //   253: invokevirtual 90	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
    //   256: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   259: astore 7
    //   261: aload 6
    //   263: invokevirtual 80	java/lang/Integer:intValue	()I
    //   266: ifge +15 -> 281
    //   269: aload 6
    //   271: invokevirtual 80	java/lang/Integer:intValue	()I
    //   274: iconst_m1
    //   275: imul
    //   276: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   279: astore 6
    //   281: aload 7
    //   283: invokevirtual 80	java/lang/Integer:intValue	()I
    //   286: ifge +15 -> 301
    //   289: aload 7
    //   291: invokevirtual 80	java/lang/Integer:intValue	()I
    //   294: iconst_m1
    //   295: imul
    //   296: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   299: astore 7
    //   301: aload 8
    //   303: invokevirtual 93	nano/spook1998/rust/object/User:getLastKill	()Ljava/lang/String;
    //   306: aload_2
    //   307: invokeinterface 22 1 0
    //   312: invokevirtual 97	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   315: ifeq +21 -> 336
    //   318: iconst_0
    //   319: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   322: astore 6
    //   324: iconst_0
    //   325: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: astore 7
    //   330: aload 8
    //   332: goto +76 -> 408
    //   335: athrow
    //   336: aload_3
    //   337: dup
    //   338: dup2
    //   339: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   342: invokevirtual 80	java/lang/Integer:intValue	()I
    //   345: aload 6
    //   347: invokevirtual 80	java/lang/Integer:intValue	()I
    //   350: isub
    //   351: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   354: invokevirtual 101	nano/spook1998/rust/object/User:setPoints	(Ljava/lang/Integer;)V
    //   357: invokevirtual 104	nano/spook1998/rust/object/User:getDeath	()Ljava/lang/Integer;
    //   360: invokevirtual 80	java/lang/Integer:intValue	()I
    //   363: iconst_1
    //   364: iadd
    //   365: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: invokevirtual 107	nano/spook1998/rust/object/User:setDeath	(Ljava/lang/Integer;)V
    //   371: aload 8
    //   373: dup
    //   374: dup_x1
    //   375: dup2
    //   376: invokevirtual 110	nano/spook1998/rust/object/User:getKill	()Ljava/lang/Integer;
    //   379: invokevirtual 80	java/lang/Integer:intValue	()I
    //   382: iconst_1
    //   383: iadd
    //   384: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   387: invokevirtual 113	nano/spook1998/rust/object/User:setKill	(Ljava/lang/Integer;)V
    //   390: invokevirtual 76	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   393: invokevirtual 80	java/lang/Integer:intValue	()I
    //   396: aload 7
    //   398: invokevirtual 80	java/lang/Integer:intValue	()I
    //   401: iadd
    //   402: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   405: invokevirtual 101	nano/spook1998/rust/object/User:setPoints	(Ljava/lang/Integer;)V
    //   408: aload_3
    //   409: invokevirtual 114	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   412: invokevirtual 118	nano/spook1998/rust/object/User:setLastKill	(Ljava/lang/String;)V
    //   415: aload 5
    //   417: ldc 120
    //   419: invokestatic 57	nano/spook1998/rust/listeners/PlayerDeathEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   422: aload_2
    //   423: invokeinterface 22 1 0
    //   428: invokevirtual 124	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   431: ldc 126
    //   433: invokestatic 57	nano/spook1998/rust/listeners/PlayerDeathEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   436: aload 4
    //   438: invokeinterface 22 1 0
    //   443: invokevirtual 124	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   446: ldc -128
    //   448: invokestatic 57	nano/spook1998/rust/listeners/PlayerDeathEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   451: new 130	java/lang/StringBuilder
    //   454: dup
    //   455: ldc -124
    //   457: invokestatic 57	nano/spook1998/rust/listeners/PlayerDeathEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   460: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   463: aload 6
    //   465: invokevirtual 138	java/lang/Integer:toString	()Ljava/lang/String;
    //   468: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   474: invokevirtual 124	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   477: ldc -111
    //   479: invokestatic 57	nano/spook1998/rust/listeners/PlayerDeathEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   482: aload 7
    //   484: invokevirtual 138	java/lang/Integer:toString	()Ljava/lang/String;
    //   487: invokevirtual 124	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   490: astore 5
    //   492: new 147	nano/spook1998/rust/utils/PlayerUtil
    //   495: dup
    //   496: invokespecial 150	nano/spook1998/rust/utils/PlayerUtil:<init>	()V
    //   499: invokevirtual 154	nano/spook1998/rust/utils/PlayerUtil:getOnlinePlayers	()Ljava/util/List;
    //   502: invokeinterface 160 1 0
    //   507: dup
    //   508: astore_3
    //   509: goto +42 -> 551
    //   512: aload_3
    //   513: invokeinterface 166 1 0
    //   518: checkcast 18	org/bukkit/entity/Player
    //   521: dup
    //   522: astore 9
    //   524: invokeinterface 22 1 0
    //   529: invokestatic 28	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   532: invokevirtual 170	nano/spook1998/rust/object/User:getStatusChat	()Ljava/lang/Boolean;
    //   535: invokevirtual 176	java/lang/Boolean:booleanValue	()Z
    //   538: ifeq +12 -> 550
    //   541: aload 9
    //   543: aload 5
    //   545: invokeinterface 179 2 0
    //   550: aload_3
    //   551: invokeinterface 182 1 0
    //   556: ifne -44 -> 512
    //   559: aload_1
    //   560: aconst_null
    //   561: invokevirtual 185	org/bukkit/event/entity/PlayerDeathEvent:setDeathMessage	(Ljava/lang/String;)V
    //   564: return
    //   565: aload_2
    //   566: dup
    //   567: dup2
    //   568: invokeinterface 189 1 0
    //   573: new 191	org/bukkit/inventory/ItemStack
    //   576: dup
    //   577: getstatic 197	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   580: invokespecial 200	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   583: invokeinterface 206 2 0
    //   588: invokeinterface 189 1 0
    //   593: new 191	org/bukkit/inventory/ItemStack
    //   596: dup
    //   597: getstatic 197	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   600: invokespecial 200	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   603: invokeinterface 209 2 0
    //   608: invokeinterface 189 1 0
    //   613: new 191	org/bukkit/inventory/ItemStack
    //   616: dup
    //   617: getstatic 197	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   620: invokespecial 200	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   623: invokeinterface 212 2 0
    //   628: invokeinterface 189 1 0
    //   633: new 191	org/bukkit/inventory/ItemStack
    //   636: dup
    //   637: getstatic 197	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   640: invokespecial 200	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   643: invokeinterface 215 2 0
    //   648: aload_1
    //   649: aconst_null
    //   650: invokevirtual 185	org/bukkit/event/entity/PlayerDeathEvent:setDeathMessage	(Ljava/lang/String;)V
    //   653: return
    // Line number table:
    //   Java source line #164	-> byte code offset #0
    //   Java source line #38	-> byte code offset #7
    //   Java source line #123	-> byte code offset #17
    //   Java source line #171	-> byte code offset #20
    //   Java source line #78	-> byte code offset #37
    //   Java source line #93	-> byte code offset #62
    //   Java source line #119	-> byte code offset #67
    //   Java source line #170	-> byte code offset #85
    //   Java source line #96	-> byte code offset #91
    //   Java source line #92	-> byte code offset #97
    //   Java source line #32	-> byte code offset #110
    //   Java source line #13	-> byte code offset #126
    //   Java source line #155	-> byte code offset #133
    //   Java source line #73	-> byte code offset #147
    //   Java source line #182	-> byte code offset #187
    //   Java source line #77	-> byte code offset #204
    //   Java source line #104	-> byte code offset #217
    //   Java source line #47	-> byte code offset #228
    //   Java source line #113	-> byte code offset #232
    //   Java source line #110	-> byte code offset #247
    //   Java source line #141	-> byte code offset #261
    //   Java source line #180	-> byte code offset #281
    //   Java source line #56	-> byte code offset #301
    //   Java source line #24	-> byte code offset #318
    //   Java source line #194	-> byte code offset #324
    //   Java source line #142	-> byte code offset #332
    //   Java source line #3	-> byte code offset #336
    //   Java source line #160	-> byte code offset #357
    //   Java source line #89	-> byte code offset #371
    //   Java source line #72	-> byte code offset #390
    //   Java source line #29	-> byte code offset #408
    //   Java source line #163	-> byte code offset #415
    //   Java source line #193	-> byte code offset #492
    //   Java source line #60	-> byte code offset #524
    //   Java source line #129	-> byte code offset #532
    //   Java source line #193	-> byte code offset #550
    //   Java source line #175	-> byte code offset #559
    //   Java source line #112	-> byte code offset #564
    //   Java source line #158	-> byte code offset #565
    //   Java source line #138	-> byte code offset #588
    //   Java source line #91	-> byte code offset #608
    //   Java source line #39	-> byte code offset #628
    //   Java source line #59	-> byte code offset #648
    //   Java source line #174	-> byte code offset #653
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	654	0	a	PlayerDeathEvent
    //   0	654	1	a	org.bukkit.event.entity.PlayerDeathEvent
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
    int i = (0x3 ^ 0x5) << 4 ^ 0x5;
    (5 << 4 ^ 2 << 1);
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


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PlayerDeathEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */