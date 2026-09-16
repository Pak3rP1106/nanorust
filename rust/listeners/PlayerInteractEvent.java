package nano.spook1998.rust.listeners;

import org.bukkit.event.Listener;

public class PlayerInteractEvent
  implements Listener
{
  public static String ALLATORIxDEMO(String a)
  {
    int tmp31_28 = a.length();
    int tmp35_34 = 1;
    tmp35_34;
    int j;
    int ? = tmp35_34;
    int k = tmp31_28;
    (j = new char[tmp31_28] - 1);
    int i = (0x2 ^ 0x5) << 4 ^ 3 << 1;
    if (((0x3 ^ 0x5) << 3 ^ 0x1) >= 0)
    {
      int tmp54_53 = j;
      j--;
      ?[tmp54_53] = ((char)(a.charAt(tmp54_53) ^ i));
      int tmp75_72 = (j--);
      ?[tmp75_72] = ((char)(a.charAt(tmp75_72) ^ k));
    }
    return new String(?);
  }
  
  /* Error */
  @org.bukkit.event.EventHandler
  public void onInteract(org.bukkit.event.player.PlayerInteractEvent a)
  {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokevirtual 246	org/bukkit/event/player/PlayerInteractEvent:getAction	()Lorg/bukkit/event/block/Action;
    //   5: astore_2
    //   6: invokevirtual 250	org/bukkit/event/player/PlayerInteractEvent:getPlayer	()Lorg/bukkit/entity/Player;
    //   9: dup
    //   10: astore_3
    //   11: invokeinterface 21 1 0
    //   16: invokestatic 26	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   19: astore 4
    //   21: aload_2
    //   22: getstatic 256	org/bukkit/event/block/Action:LEFT_CLICK_BLOCK	Lorg/bukkit/event/block/Action;
    //   25: invokevirtual 260	org/bukkit/event/block/Action:equals	(Ljava/lang/Object;)Z
    //   28: ifeq +341 -> 369
    //   31: aload_3
    //   32: invokeinterface 264 1 0
    //   37: astore 5
    //   39: aload_1
    //   40: aload_0
    //   41: aload_3
    //   42: invokespecial 266	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;)V
    //   45: invokevirtual 270	org/bukkit/event/player/PlayerInteractEvent:getClickedBlock	()Lorg/bukkit/block/Block;
    //   48: dup
    //   49: astore 6
    //   51: ifnonnull +5 -> 56
    //   54: return
    //   55: athrow
    //   56: aload 6
    //   58: invokeinterface 276 1 0
    //   63: invokestatic 282	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
    //   66: dup
    //   67: astore 7
    //   69: ifnull +31 -> 100
    //   72: aload 7
    //   74: aload 4
    //   76: invokevirtual 288	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
    //   79: ifne +21 -> 100
    //   82: aload 6
    //   84: invokeinterface 291 1 0
    //   89: getstatic 297	org/bukkit/Material:IRON_DOOR_BLOCK	Lorg/bukkit/Material;
    //   92: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   95: ifeq +5 -> 100
    //   98: return
    //   99: athrow
    //   100: aload 5
    //   102: ifnull +88 -> 190
    //   105: aload 5
    //   107: invokevirtual 299	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   110: getstatic 302	org/bukkit/Material:GOLD_AXE	Lorg/bukkit/Material;
    //   113: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   116: ifeq +74 -> 190
    //   119: aload_1
    //   120: invokevirtual 270	org/bukkit/event/player/PlayerInteractEvent:getClickedBlock	()Lorg/bukkit/block/Block;
    //   123: invokestatic 308	nano/spook1998/rust/object/utils/StructuralUtil:checkBlockHP	(Lorg/bukkit/block/Block;)Lnano/spook1998/rust/object/Structural;
    //   126: dup
    //   127: astore 8
    //   129: ifnull +61 -> 190
    //   132: aload 8
    //   134: invokevirtual 313	nano/spook1998/rust/object/Structural:getHealth	()Ljava/lang/Integer;
    //   137: invokevirtual 141	java/lang/Integer:intValue	()I
    //   140: ifgt +9 -> 149
    //   143: aload 8
    //   145: invokevirtual 316	nano/spook1998/rust/object/Structural:destroy	()V
    //   148: return
    //   149: aload_3
    //   150: getstatic 50	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   153: ldc_w 318
    //   156: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   159: invokeinterface 60 2 0
    //   164: checkcast 62	java/lang/String
    //   167: ldc_w 320
    //   170: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   173: aload 8
    //   175: invokevirtual 313	nano/spook1998/rust/object/Structural:getHealth	()Ljava/lang/Integer;
    //   178: invokevirtual 190	java/lang/Integer:toString	()Ljava/lang/String;
    //   181: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   184: invokeinterface 66 2 0
    //   189: return
    //   190: aload 5
    //   192: getstatic 323	nano/spook1998/rust/data/Settings:STRUCTURAL_PLAN	Lorg/bukkit/inventory/ItemStack;
    //   195: invokevirtual 327	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
    //   198: ifeq +171 -> 369
    //   201: aload 4
    //   203: invokevirtual 331	nano/spook1998/rust/object/User:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   206: ifnull +163 -> 369
    //   209: aload 4
    //   211: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   214: ifnull +155 -> 369
    //   217: aload 4
    //   219: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   222: invokevirtual 338	nano/spook1998/rust/object/Structural:getStatusToBuild	()Ljava/lang/Boolean;
    //   225: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   228: ifeq +118 -> 346
    //   231: aload 4
    //   233: invokevirtual 331	nano/spook1998/rust/object/User:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   236: invokevirtual 341	nano/spook1998/rust/utils/type/StructuralType:toString	()Ljava/lang/String;
    //   239: invokevirtual 344	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   242: astore 8
    //   244: getstatic 347	nano/spook1998/rust/data/Settings:FIRST_COST	Ljava/util/Map;
    //   247: aload 8
    //   249: invokeinterface 60 2 0
    //   254: checkcast 207	java/util/List
    //   257: dup
    //   258: astore 9
    //   260: invokeinterface 350 1 0
    //   265: ifne +21 -> 286
    //   268: aload_2
    //   269: aconst_null
    //   270: aload 4
    //   272: dup_x1
    //   273: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   276: aload_3
    //   277: invokevirtual 353	nano/spook1998/rust/object/Structural:build	(Lorg/bukkit/entity/Player;)V
    //   280: invokevirtual 357	nano/spook1998/rust/object/User:setStructural	(Lnano/spook1998/rust/object/Structural;)V
    //   283: goto +87 -> 370
    //   286: aload_3
    //   287: aload 9
    //   289: invokestatic 363	nano/spook1998/rust/utils/InventoryUtil:hasItemStack	(Lorg/bukkit/entity/Player;Ljava/util/List;)Ljava/lang/Boolean;
    //   292: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   295: ifne +27 -> 322
    //   298: aload_3
    //   299: getstatic 50	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   302: ldc_w 365
    //   305: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   308: invokeinterface 60 2 0
    //   313: checkcast 62	java/lang/String
    //   316: invokeinterface 66 2 0
    //   321: return
    //   322: aload_3
    //   323: aload 9
    //   325: invokestatic 369	nano/spook1998/rust/utils/InventoryUtil:removeItemStack	(Lorg/bukkit/entity/Player;Ljava/util/List;)V
    //   328: aload_2
    //   329: aconst_null
    //   330: aload 4
    //   332: dup_x1
    //   333: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   336: aload_3
    //   337: invokevirtual 353	nano/spook1998/rust/object/Structural:build	(Lorg/bukkit/entity/Player;)V
    //   340: invokevirtual 357	nano/spook1998/rust/object/User:setStructural	(Lnano/spook1998/rust/object/Structural;)V
    //   343: goto +27 -> 370
    //   346: aload_3
    //   347: getstatic 50	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   350: ldc_w 371
    //   353: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   356: invokeinterface 60 2 0
    //   361: checkcast 62	java/lang/String
    //   364: invokeinterface 66 2 0
    //   369: aload_2
    //   370: getstatic 374	org/bukkit/event/block/Action:LEFT_CLICK_AIR	Lorg/bukkit/event/block/Action;
    //   373: invokevirtual 260	org/bukkit/event/block/Action:equals	(Ljava/lang/Object;)Z
    //   376: ifeq +199 -> 575
    //   379: aload_0
    //   380: aload_3
    //   381: dup_x1
    //   382: invokespecial 266	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;)V
    //   385: invokeinterface 264 1 0
    //   390: dup
    //   391: astore 5
    //   393: ifnull +182 -> 575
    //   396: aload 5
    //   398: getstatic 323	nano/spook1998/rust/data/Settings:STRUCTURAL_PLAN	Lorg/bukkit/inventory/ItemStack;
    //   401: invokevirtual 327	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
    //   404: ifeq +171 -> 575
    //   407: aload 4
    //   409: invokevirtual 331	nano/spook1998/rust/object/User:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   412: ifnull +163 -> 575
    //   415: aload 4
    //   417: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   420: ifnull +155 -> 575
    //   423: aload 4
    //   425: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   428: invokevirtual 338	nano/spook1998/rust/object/Structural:getStatusToBuild	()Ljava/lang/Boolean;
    //   431: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   434: ifeq +118 -> 552
    //   437: aload 4
    //   439: invokevirtual 331	nano/spook1998/rust/object/User:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
    //   442: invokevirtual 341	nano/spook1998/rust/utils/type/StructuralType:toString	()Ljava/lang/String;
    //   445: invokevirtual 344	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   448: astore 6
    //   450: getstatic 347	nano/spook1998/rust/data/Settings:FIRST_COST	Ljava/util/Map;
    //   453: aload 6
    //   455: invokeinterface 60 2 0
    //   460: checkcast 207	java/util/List
    //   463: dup
    //   464: astore 7
    //   466: invokeinterface 350 1 0
    //   471: ifne +21 -> 492
    //   474: aload_2
    //   475: aconst_null
    //   476: aload 4
    //   478: dup_x1
    //   479: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   482: aload_3
    //   483: invokevirtual 353	nano/spook1998/rust/object/Structural:build	(Lorg/bukkit/entity/Player;)V
    //   486: invokevirtual 357	nano/spook1998/rust/object/User:setStructural	(Lnano/spook1998/rust/object/Structural;)V
    //   489: goto +87 -> 576
    //   492: aload_3
    //   493: aload 7
    //   495: invokestatic 363	nano/spook1998/rust/utils/InventoryUtil:hasItemStack	(Lorg/bukkit/entity/Player;Ljava/util/List;)Ljava/lang/Boolean;
    //   498: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   501: ifne +27 -> 528
    //   504: aload_3
    //   505: getstatic 50	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   508: ldc_w 365
    //   511: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   514: invokeinterface 60 2 0
    //   519: checkcast 62	java/lang/String
    //   522: invokeinterface 66 2 0
    //   527: return
    //   528: aload_3
    //   529: aload 7
    //   531: invokestatic 369	nano/spook1998/rust/utils/InventoryUtil:removeItemStack	(Lorg/bukkit/entity/Player;Ljava/util/List;)V
    //   534: aload_2
    //   535: aconst_null
    //   536: aload 4
    //   538: dup_x1
    //   539: invokevirtual 335	nano/spook1998/rust/object/User:getStructural	()Lnano/spook1998/rust/object/Structural;
    //   542: aload_3
    //   543: invokevirtual 353	nano/spook1998/rust/object/Structural:build	(Lorg/bukkit/entity/Player;)V
    //   546: invokevirtual 357	nano/spook1998/rust/object/User:setStructural	(Lnano/spook1998/rust/object/Structural;)V
    //   549: goto +27 -> 576
    //   552: aload_3
    //   553: getstatic 50	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   556: ldc_w 371
    //   559: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   562: invokeinterface 60 2 0
    //   567: checkcast 62	java/lang/String
    //   570: invokeinterface 66 2 0
    //   575: aload_2
    //   576: getstatic 377	org/bukkit/event/block/Action:RIGHT_CLICK_AIR	Lorg/bukkit/event/block/Action;
    //   579: invokevirtual 260	org/bukkit/event/block/Action:equals	(Ljava/lang/Object;)Z
    //   582: ifeq +59 -> 641
    //   585: aload_3
    //   586: invokeinterface 264 1 0
    //   591: dup
    //   592: astore 5
    //   594: ifnull +24 -> 618
    //   597: aload 5
    //   599: invokevirtual 299	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   602: getstatic 380	org/bukkit/Material:PAPER	Lorg/bukkit/Material;
    //   605: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   608: ifeq +10 -> 618
    //   611: aload_0
    //   612: aload_3
    //   613: aload 5
    //   615: invokespecial 382	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   618: aload 5
    //   620: getstatic 323	nano/spook1998/rust/data/Settings:STRUCTURAL_PLAN	Lorg/bukkit/inventory/ItemStack;
    //   623: invokevirtual 327	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
    //   626: ifeq +15 -> 641
    //   629: invokestatic 387	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   632: aload_3
    //   633: getstatic 393	nano/spook1998/rust/utils/type/GuiType:STRUCTURAL	Lnano/spook1998/rust/utils/type/GuiType;
    //   636: aconst_null
    //   637: dup
    //   638: invokevirtual 397	nano/spook1998/rust/utils/GuiUtil:openGui	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Lnano/spook1998/rust/object/Region;Lnano/spook1998/rust/object/Structural;)V
    //   641: aload_2
    //   642: getstatic 400	org/bukkit/event/block/Action:RIGHT_CLICK_BLOCK	Lorg/bukkit/event/block/Action;
    //   645: invokevirtual 260	org/bukkit/event/block/Action:equals	(Ljava/lang/Object;)Z
    //   648: ifeq +1144 -> 1792
    //   651: aload_3
    //   652: invokeinterface 264 1 0
    //   657: dup
    //   658: astore 5
    //   660: ifnull +467 -> 1127
    //   663: aload 5
    //   665: invokevirtual 299	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   668: getstatic 380	org/bukkit/Material:PAPER	Lorg/bukkit/Material;
    //   671: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   674: ifeq +10 -> 684
    //   677: aload_0
    //   678: aload_3
    //   679: aload 5
    //   681: invokespecial 382	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
    //   684: aload 5
    //   686: getstatic 323	nano/spook1998/rust/data/Settings:STRUCTURAL_PLAN	Lorg/bukkit/inventory/ItemStack;
    //   689: invokevirtual 327	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
    //   692: ifeq +15 -> 707
    //   695: invokestatic 387	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   698: aload_3
    //   699: getstatic 393	nano/spook1998/rust/utils/type/GuiType:STRUCTURAL	Lnano/spook1998/rust/utils/type/GuiType;
    //   702: aconst_null
    //   703: dup
    //   704: invokevirtual 397	nano/spook1998/rust/utils/GuiUtil:openGui	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Lnano/spook1998/rust/object/Region;Lnano/spook1998/rust/object/Structural;)V
    //   707: aload 5
    //   709: invokevirtual 299	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   712: getstatic 302	org/bukkit/Material:GOLD_AXE	Lorg/bukkit/Material;
    //   715: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   718: ifeq +73 -> 791
    //   721: aload_1
    //   722: invokevirtual 270	org/bukkit/event/player/PlayerInteractEvent:getClickedBlock	()Lorg/bukkit/block/Block;
    //   725: dup
    //   726: astore 6
    //   728: invokeinterface 276 1 0
    //   733: invokestatic 282	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
    //   736: dup
    //   737: astore 7
    //   739: ifnull +14 -> 753
    //   742: aload 7
    //   744: aload 4
    //   746: invokevirtual 288	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
    //   749: ifne +4 -> 753
    //   752: return
    //   753: aload 6
    //   755: invokestatic 403	nano/spook1998/rust/object/utils/StructuralUtil:checkBlock	(Lorg/bukkit/block/Block;)Lnano/spook1998/rust/object/Structural;
    //   758: dup
    //   759: astore 8
    //   761: ifnull +30 -> 791
    //   764: aload_3
    //   765: invokeinterface 21 1 0
    //   770: invokestatic 26	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   773: aload 8
    //   775: invokevirtual 406	nano/spook1998/rust/object/User:setLastStructural	(Lnano/spook1998/rust/object/Structural;)V
    //   778: invokestatic 387	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   781: aload_3
    //   782: getstatic 409	nano/spook1998/rust/utils/type/GuiType:MANAGER_STRUCTURAL	Lnano/spook1998/rust/utils/type/GuiType;
    //   785: aconst_null
    //   786: aload 8
    //   788: invokevirtual 397	nano/spook1998/rust/utils/GuiUtil:openGui	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Lnano/spook1998/rust/object/Region;Lnano/spook1998/rust/object/Structural;)V
    //   791: aload 5
    //   793: invokevirtual 299	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   796: getstatic 412	org/bukkit/Material:STICK	Lorg/bukkit/Material;
    //   799: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   802: ifeq +325 -> 1127
    //   805: aload_3
    //   806: ldc_w 414
    //   809: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   812: invokeinterface 417 2 0
    //   817: ifeq +310 -> 1127
    //   820: aload_1
    //   821: invokevirtual 270	org/bukkit/event/player/PlayerInteractEvent:getClickedBlock	()Lorg/bukkit/block/Block;
    //   824: dup
    //   825: astore 6
    //   827: getstatic 423	org/bukkit/block/BlockFace:UP	Lorg/bukkit/block/BlockFace;
    //   830: invokeinterface 427 2 0
    //   835: invokeinterface 430 1 0
    //   840: ifne +286 -> 1126
    //   843: aload 6
    //   845: invokeinterface 291 1 0
    //   850: getstatic 433	org/bukkit/Material:DIRT	Lorg/bukkit/Material;
    //   853: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   856: ifne +19 -> 875
    //   859: aload 6
    //   861: invokeinterface 291 1 0
    //   866: getstatic 436	org/bukkit/Material:GRASS	Lorg/bukkit/Material;
    //   869: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   872: ifeq +254 -> 1126
    //   875: aload 6
    //   877: invokeinterface 439 1 0
    //   882: iconst_5
    //   883: isub
    //   884: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   887: dup
    //   888: astore 7
    //   890: goto +221 -> 1111
    //   893: aload 6
    //   895: invokeinterface 442 1 0
    //   900: iconst_5
    //   901: isub
    //   902: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   905: dup
    //   906: astore 8
    //   908: goto +175 -> 1083
    //   911: aload 6
    //   913: invokeinterface 445 1 0
    //   918: iconst_5
    //   919: isub
    //   920: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   923: dup
    //   924: astore 9
    //   926: goto +129 -> 1055
    //   929: new 447	org/bukkit/Location
    //   932: dup
    //   933: aload 6
    //   935: invokeinterface 451 1 0
    //   940: aload 7
    //   942: invokevirtual 141	java/lang/Integer:intValue	()I
    //   945: i2d
    //   946: aload 8
    //   948: invokevirtual 141	java/lang/Integer:intValue	()I
    //   951: i2d
    //   952: aload 9
    //   954: invokevirtual 141	java/lang/Integer:intValue	()I
    //   957: i2d
    //   958: invokespecial 454	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
    //   961: invokevirtual 457	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
    //   964: dup
    //   965: astore_2
    //   966: invokeinterface 291 1 0
    //   971: getstatic 460	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   974: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   977: ifne +33 -> 1010
    //   980: aload_2
    //   981: invokeinterface 291 1 0
    //   986: getstatic 436	org/bukkit/Material:GRASS	Lorg/bukkit/Material;
    //   989: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   992: ifne +18 -> 1010
    //   995: aload_2
    //   996: invokeinterface 291 1 0
    //   1001: getstatic 463	org/bukkit/Material:LONG_GRASS	Lorg/bukkit/Material;
    //   1004: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1007: ifeq +35 -> 1042
    //   1010: aload_2
    //   1011: invokeinterface 276 1 0
    //   1016: aload 6
    //   1018: invokeinterface 276 1 0
    //   1023: invokevirtual 467	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
    //   1026: ldc2_w 468
    //   1029: dcmpg
    //   1030: ifgt +12 -> 1042
    //   1033: aload_2
    //   1034: getstatic 472	org/bukkit/Material:STONE	Lorg/bukkit/Material;
    //   1037: invokeinterface 476 2 0
    //   1042: aload 9
    //   1044: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1047: iconst_1
    //   1048: iadd
    //   1049: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1052: dup
    //   1053: astore 9
    //   1055: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1058: aload 6
    //   1060: invokeinterface 445 1 0
    //   1065: iconst_5
    //   1066: iadd
    //   1067: if_icmple -138 -> 929
    //   1070: aload 8
    //   1072: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1075: iconst_1
    //   1076: iadd
    //   1077: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1080: dup
    //   1081: astore 8
    //   1083: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1086: aload 6
    //   1088: invokeinterface 442 1 0
    //   1093: iconst_5
    //   1094: iadd
    //   1095: if_icmple -184 -> 911
    //   1098: aload 7
    //   1100: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1103: iconst_1
    //   1104: iadd
    //   1105: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1108: dup
    //   1109: astore 7
    //   1111: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1114: aload 6
    //   1116: invokeinterface 439 1 0
    //   1121: iconst_5
    //   1122: iadd
    //   1123: if_icmple -230 -> 893
    //   1126: return
    //   1127: aload_1
    //   1128: invokevirtual 270	org/bukkit/event/player/PlayerInteractEvent:getClickedBlock	()Lorg/bukkit/block/Block;
    //   1131: dup
    //   1132: astore 6
    //   1134: ifnull +658 -> 1792
    //   1137: aload 6
    //   1139: invokeinterface 276 1 0
    //   1144: invokestatic 282	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
    //   1147: dup
    //   1148: astore 7
    //   1150: ifnonnull +48 -> 1198
    //   1153: aload 6
    //   1155: invokeinterface 291 1 0
    //   1160: getstatic 479	org/bukkit/Material:SPONGE	Lorg/bukkit/Material;
    //   1163: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1166: ifeq +32 -> 1198
    //   1169: new 284	nano/spook1998/rust/object/Region
    //   1172: dup
    //   1173: aload 6
    //   1175: invokeinterface 276 1 0
    //   1180: invokespecial 482	nano/spook1998/rust/object/Region:<init>	(Lorg/bukkit/Location;)V
    //   1183: dup
    //   1184: astore 8
    //   1186: aload_3
    //   1187: invokeinterface 21 1 0
    //   1192: invokestatic 26	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   1195: invokevirtual 486	nano/spook1998/rust/object/Region:addUser	(Lnano/spook1998/rust/object/User;)V
    //   1198: aload 6
    //   1200: invokeinterface 291 1 0
    //   1205: getstatic 297	org/bukkit/Material:IRON_DOOR_BLOCK	Lorg/bukkit/Material;
    //   1208: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1211: ifeq +220 -> 1431
    //   1214: aload 7
    //   1216: ifnonnull +65 -> 1281
    //   1219: aload 6
    //   1221: invokeinterface 291 1 0
    //   1226: getstatic 489	org/bukkit/Material:BED_BLOCK	Lorg/bukkit/Material;
    //   1229: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1232: ifeq +49 -> 1281
    //   1235: aload_3
    //   1236: invokeinterface 490 1 0
    //   1241: aload 6
    //   1243: invokeinterface 276 1 0
    //   1248: invokevirtual 467	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
    //   1251: ldc2_w 491
    //   1254: dcmpl
    //   1255: iflt +13 -> 1268
    //   1258: aload 7
    //   1260: aload_1
    //   1261: iconst_1
    //   1262: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1265: goto +18 -> 1283
    //   1268: aload_3
    //   1269: aload 6
    //   1271: invokeinterface 276 1 0
    //   1276: invokeinterface 499 2 0
    //   1281: aload 7
    //   1283: ifnull +21 -> 1304
    //   1286: aload 7
    //   1288: aload_3
    //   1289: invokeinterface 21 1 0
    //   1294: invokestatic 26	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   1297: invokevirtual 288	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
    //   1300: ifne +4 -> 1304
    //   1303: return
    //   1304: aload 6
    //   1306: invokeinterface 503 1 0
    //   1311: bipush 8
    //   1313: if_icmplt +15 -> 1328
    //   1316: aload 6
    //   1318: getstatic 506	org/bukkit/block/BlockFace:DOWN	Lorg/bukkit/block/BlockFace;
    //   1321: invokeinterface 427 2 0
    //   1326: astore 6
    //   1328: aload 6
    //   1330: invokeinterface 291 1 0
    //   1335: getstatic 297	org/bukkit/Material:IRON_DOOR_BLOCK	Lorg/bukkit/Material;
    //   1338: if_acmpne +93 -> 1431
    //   1341: aload 6
    //   1343: invokeinterface 503 1 0
    //   1348: iconst_4
    //   1349: if_icmpge +44 -> 1393
    //   1352: aload 6
    //   1354: dup
    //   1355: dup_x1
    //   1356: invokeinterface 503 1 0
    //   1361: iconst_4
    //   1362: iadd
    //   1363: i2b
    //   1364: invokeinterface 510 2 0
    //   1369: invokeinterface 451 1 0
    //   1374: aload 6
    //   1376: invokeinterface 276 1 0
    //   1381: getstatic 516	org/bukkit/Effect:DOOR_TOGGLE	Lorg/bukkit/Effect;
    //   1384: iconst_0
    //   1385: invokeinterface 522 4 0
    //   1390: goto +41 -> 1431
    //   1393: aload 6
    //   1395: dup
    //   1396: dup_x1
    //   1397: invokeinterface 503 1 0
    //   1402: iconst_4
    //   1403: isub
    //   1404: i2b
    //   1405: invokeinterface 510 2 0
    //   1410: invokeinterface 451 1 0
    //   1415: aload 6
    //   1417: invokeinterface 276 1 0
    //   1422: getstatic 516	org/bukkit/Effect:DOOR_TOGGLE	Lorg/bukkit/Effect;
    //   1425: iconst_0
    //   1426: invokeinterface 522 4 0
    //   1431: iconst_0
    //   1432: invokestatic 111	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1435: astore 8
    //   1437: aload 6
    //   1439: invokeinterface 291 1 0
    //   1444: getstatic 489	org/bukkit/Material:BED_BLOCK	Lorg/bukkit/Material;
    //   1447: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1450: ifeq +39 -> 1489
    //   1453: aload 8
    //   1455: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   1458: aload_1
    //   1459: swap
    //   1460: ifeq +12 -> 1472
    //   1463: iconst_1
    //   1464: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1467: aload 6
    //   1469: goto +22 -> 1491
    //   1472: iconst_1
    //   1473: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1476: aload_3
    //   1477: aload 6
    //   1479: invokeinterface 276 1 0
    //   1484: invokeinterface 499 2 0
    //   1489: aload 6
    //   1491: invokeinterface 291 1 0
    //   1496: getstatic 525	org/bukkit/Material:DRAGON_EGG	Lorg/bukkit/Material;
    //   1499: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1502: ifeq +43 -> 1545
    //   1505: aload 6
    //   1507: dup
    //   1508: aload_1
    //   1509: iconst_1
    //   1510: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1513: getstatic 460	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   1516: invokeinterface 476 2 0
    //   1521: invokeinterface 451 1 0
    //   1526: aload 6
    //   1528: invokeinterface 276 1 0
    //   1533: invokestatic 529	nano/spook1998/rust/object/utils/SchematsUtil:getRandomSchemat	()Lnano/spook1998/rust/object/Schemat;
    //   1536: invokevirtual 532	nano/spook1998/rust/object/Schemat:getIR	()Lorg/bukkit/inventory/ItemStack;
    //   1539: invokeinterface 536 3 0
    //   1544: pop
    //   1545: aload 6
    //   1547: invokeinterface 291 1 0
    //   1552: getstatic 539	org/bukkit/Material:WORKBENCH	Lorg/bukkit/Material;
    //   1555: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1558: ifeq +28 -> 1586
    //   1561: aload 8
    //   1563: aload_1
    //   1564: iconst_1
    //   1565: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1568: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   1571: ifne +15 -> 1586
    //   1574: invokestatic 387	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   1577: aload_3
    //   1578: getstatic 542	nano/spook1998/rust/utils/type/GuiType:CRAFTING	Lnano/spook1998/rust/utils/type/GuiType;
    //   1581: aconst_null
    //   1582: dup
    //   1583: invokevirtual 397	nano/spook1998/rust/utils/GuiUtil:openGui	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Lnano/spook1998/rust/object/Region;Lnano/spook1998/rust/object/Structural;)V
    //   1586: aload 6
    //   1588: invokeinterface 291 1 0
    //   1593: getstatic 545	org/bukkit/Material:CHEST	Lorg/bukkit/Material;
    //   1596: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1599: ifne +19 -> 1618
    //   1602: aload 6
    //   1604: invokeinterface 291 1 0
    //   1609: getstatic 548	org/bukkit/Material:ENDER_CHEST	Lorg/bukkit/Material;
    //   1612: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1615: ifeq +16 -> 1631
    //   1618: aload 8
    //   1620: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   1623: ifeq +8 -> 1631
    //   1626: aload_1
    //   1627: iconst_1
    //   1628: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1631: aload 6
    //   1633: invokeinterface 291 1 0
    //   1638: getstatic 551	nano/spook1998/rust/data/Settings:WORDROBE	Lorg/bukkit/inventory/ItemStack;
    //   1641: invokevirtual 299	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
    //   1644: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1647: ifeq +29 -> 1676
    //   1650: aload 8
    //   1652: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   1655: ifne +16 -> 1671
    //   1658: invokestatic 387	nano/spook1998/rust/utils/GuiUtil:getInstance	()Lnano/spook1998/rust/utils/GuiUtil;
    //   1661: aload_3
    //   1662: getstatic 554	nano/spook1998/rust/utils/type/GuiType:WARDROBE	Lnano/spook1998/rust/utils/type/GuiType;
    //   1665: aload 7
    //   1667: aconst_null
    //   1668: invokevirtual 397	nano/spook1998/rust/utils/GuiUtil:openGui	(Lorg/bukkit/entity/Player;Lnano/spook1998/rust/utils/type/GuiType;Lnano/spook1998/rust/object/Region;Lnano/spook1998/rust/object/Structural;)V
    //   1671: aload_1
    //   1672: iconst_1
    //   1673: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1676: aload 6
    //   1678: invokeinterface 291 1 0
    //   1683: getstatic 557	org/bukkit/Material:FURNACE	Lorg/bukkit/Material;
    //   1686: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1689: ifne +19 -> 1708
    //   1692: aload 6
    //   1694: invokeinterface 291 1 0
    //   1699: getstatic 560	org/bukkit/Material:BURNING_FURNACE	Lorg/bukkit/Material;
    //   1702: invokevirtual 298	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
    //   1705: ifeq +16 -> 1721
    //   1708: aload 8
    //   1710: invokevirtual 44	java/lang/Boolean:booleanValue	()Z
    //   1713: ifeq +8 -> 1721
    //   1716: aload_1
    //   1717: iconst_1
    //   1718: invokevirtual 496	org/bukkit/event/player/PlayerInteractEvent:setCancelled	(Z)V
    //   1721: aload_1
    //   1722: invokevirtual 270	org/bukkit/event/player/PlayerInteractEvent:getClickedBlock	()Lorg/bukkit/block/Block;
    //   1725: invokestatic 308	nano/spook1998/rust/object/utils/StructuralUtil:checkBlockHP	(Lorg/bukkit/block/Block;)Lnano/spook1998/rust/object/Structural;
    //   1728: dup
    //   1729: astore 9
    //   1731: ifnull +61 -> 1792
    //   1734: aload 9
    //   1736: invokevirtual 313	nano/spook1998/rust/object/Structural:getHealth	()Ljava/lang/Integer;
    //   1739: invokevirtual 141	java/lang/Integer:intValue	()I
    //   1742: ifgt +9 -> 1751
    //   1745: aload 9
    //   1747: invokevirtual 316	nano/spook1998/rust/object/Structural:destroy	()V
    //   1750: return
    //   1751: aload_3
    //   1752: getstatic 50	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1755: ldc_w 318
    //   1758: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1761: invokeinterface 60 2 0
    //   1766: checkcast 62	java/lang/String
    //   1769: ldc_w 320
    //   1772: invokestatic 55	nano/spook1998/rust/listeners/PlayerInteractEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1775: aload 9
    //   1777: invokevirtual 313	nano/spook1998/rust/object/Structural:getHealth	()Ljava/lang/Integer;
    //   1780: invokevirtual 190	java/lang/Integer:toString	()Ljava/lang/String;
    //   1783: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1786: invokeinterface 66 2 0
    //   1791: return
    //   1792: return
    // Line number table:
    //   Java source line #47	-> byte code offset #0
    //   Java source line #113	-> byte code offset #6
    //   Java source line #110	-> byte code offset #11
    //   Java source line #68	-> byte code offset #21
    //   Java source line #141	-> byte code offset #31
    //   Java source line #180	-> byte code offset #40
    //   Java source line #56	-> byte code offset #45
    //   Java source line #24	-> byte code offset #51
    //   Java source line #194	-> byte code offset #56
    //   Java source line #142	-> byte code offset #69
    //   Java source line #3	-> byte code offset #98
    //   Java source line #89	-> byte code offset #100
    //   Java source line #72	-> byte code offset #105
    //   Java source line #5	-> byte code offset #119
    //   Java source line #86	-> byte code offset #129
    //   Java source line #29	-> byte code offset #132
    //   Java source line #163	-> byte code offset #143
    //   Java source line #193	-> byte code offset #148
    //   Java source line #129	-> byte code offset #149
    //   Java source line #21	-> byte code offset #189
    //   Java source line #158	-> byte code offset #190
    //   Java source line #138	-> byte code offset #201
    //   Java source line #91	-> byte code offset #217
    //   Java source line #39	-> byte code offset #231
    //   Java source line #59	-> byte code offset #244
    //   Java source line #174	-> byte code offset #260
    //   Java source line #19	-> byte code offset #269
    //   Java source line #18	-> byte code offset #280
    //   Java source line #120	-> byte code offset #283
    //   Java source line #11	-> byte code offset #286
    //   Java source line #176	-> byte code offset #298
    //   Java source line #66	-> byte code offset #321
    //   Java source line #173	-> byte code offset #322
    //   Java source line #139	-> byte code offset #329
    //   Java source line #71	-> byte code offset #340
    //   Java source line #106	-> byte code offset #343
    //   Java source line #64	-> byte code offset #346
    //   Java source line #186	-> byte code offset #369
    //   Java source line #133	-> byte code offset #379
    //   Java source line #121	-> byte code offset #385
    //   Java source line #57	-> byte code offset #393
    //   Java source line #192	-> byte code offset #396
    //   Java source line #99	-> byte code offset #407
    //   Java source line #28	-> byte code offset #423
    //   Java source line #94	-> byte code offset #437
    //   Java source line #157	-> byte code offset #450
    //   Java source line #50	-> byte code offset #466
    //   Java source line #124	-> byte code offset #475
    //   Java source line #140	-> byte code offset #486
    //   Java source line #85	-> byte code offset #489
    //   Java source line #14	-> byte code offset #492
    //   Java source line #67	-> byte code offset #504
    //   Java source line #125	-> byte code offset #527
    //   Java source line #108	-> byte code offset #528
    //   Java source line #137	-> byte code offset #535
    //   Java source line #165	-> byte code offset #546
    //   Java source line #154	-> byte code offset #549
    //   Java source line #87	-> byte code offset #552
    //   Java source line #116	-> byte code offset #575
    //   Java source line #15	-> byte code offset #585
    //   Java source line #181	-> byte code offset #594
    //   Java source line #102	-> byte code offset #597
    //   Java source line #159	-> byte code offset #618
    //   Java source line #128	-> byte code offset #629
    //   Java source line #126	-> byte code offset #641
    //   Java source line #6	-> byte code offset #651
    //   Java source line #53	-> byte code offset #660
    //   Java source line #166	-> byte code offset #663
    //   Java source line #17	-> byte code offset #684
    //   Java source line #37	-> byte code offset #707
    //   Java source line #149	-> byte code offset #721
    //   Java source line #63	-> byte code offset #728
    //   Java source line #131	-> byte code offset #739
    //   Java source line #136	-> byte code offset #753
    //   Java source line #183	-> byte code offset #761
    //   Java source line #143	-> byte code offset #764
    //   Java source line #33	-> byte code offset #778
    //   Java source line #44	-> byte code offset #791
    //   Java source line #52	-> byte code offset #820
    //   Java source line #114	-> byte code offset #827
    //   Java source line #55	-> byte code offset #875
    //   Java source line #185	-> byte code offset #893
    //   Java source line #198	-> byte code offset #911
    //   Java source line #10	-> byte code offset #929
    //   Java source line #200	-> byte code offset #966
    //   Java source line #103	-> byte code offset #1010
    //   Java source line #198	-> byte code offset #1042
    //   Java source line #185	-> byte code offset #1070
    //   Java source line #55	-> byte code offset #1098
    //   Java source line #40	-> byte code offset #1126
    //   Java source line #127	-> byte code offset #1127
    //   Java source line #76	-> byte code offset #1134
    //   Java source line #69	-> byte code offset #1137
    //   Java source line #118	-> byte code offset #1150
    //   Java source line #49	-> byte code offset #1153
    //   Java source line #130	-> byte code offset #1169
    //   Java source line #30	-> byte code offset #1186
    //   Java source line #1	-> byte code offset #1198
    //   Java source line #26	-> byte code offset #1214
    //   Java source line #107	-> byte code offset #1219
    //   Java source line #109	-> byte code offset #1235
    //   Java source line #81	-> byte code offset #1260
    //   Java source line #54	-> byte code offset #1265
    //   Java source line #62	-> byte code offset #1268
    //   Java source line #153	-> byte code offset #1281
    //   Java source line #82	-> byte code offset #1304
    //   Java source line #169	-> byte code offset #1316
    //   Java source line #199	-> byte code offset #1328
    //   Java source line #190	-> byte code offset #1341
    //   Java source line #135	-> byte code offset #1352
    //   Java source line #7	-> byte code offset #1369
    //   Java source line #151	-> byte code offset #1390
    //   Java source line #134	-> byte code offset #1393
    //   Java source line #187	-> byte code offset #1410
    //   Java source line #177	-> byte code offset #1431
    //   Java source line #42	-> byte code offset #1437
    //   Java source line #105	-> byte code offset #1453
    //   Java source line #88	-> byte code offset #1463
    //   Java source line #34	-> byte code offset #1469
    //   Java source line #152	-> byte code offset #1472
    //   Java source line #48	-> byte code offset #1476
    //   Java source line #144	-> byte code offset #1489
    //   Java source line #338	-> byte code offset #1508
    //   Java source line #260	-> byte code offset #1513
    //   Java source line #231	-> byte code offset #1521
    //   Java source line #376	-> byte code offset #1545
    //   Java source line #251	-> byte code offset #1563
    //   Java source line #370	-> byte code offset #1568
    //   Java source line #390	-> byte code offset #1586
    //   Java source line #418	-> byte code offset #1618
    //   Java source line #268	-> byte code offset #1631
    //   Java source line #205	-> byte code offset #1650
    //   Java source line #233	-> byte code offset #1671
    //   Java source line #406	-> byte code offset #1676
    //   Java source line #283	-> byte code offset #1708
    //   Java source line #258	-> byte code offset #1721
    //   Java source line #397	-> byte code offset #1731
    //   Java source line #389	-> byte code offset #1734
    //   Java source line #286	-> byte code offset #1745
    //   Java source line #335	-> byte code offset #1750
    //   Java source line #339	-> byte code offset #1751
    //   Java source line #246	-> byte code offset #1791
    //   Java source line #349	-> byte code offset #1792
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1793	0	a	PlayerInteractEvent
    //   0	1793	1	a	org.bukkit.event.player.PlayerInteractEvent
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PlayerInteractEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */