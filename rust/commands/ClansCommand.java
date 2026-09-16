package nano.spook1998.rust.commands;

import org.bukkit.command.CommandExecutor;

public class ClansCommand
  implements CommandExecutor
{
  public static String ALLATORIxDEMO(String a)
  {
    int tmp13_12 = 3;
    int tmp21_18 = a.length();
    int tmp25_24 = 1;
    tmp25_24;
    int j;
    int ? = tmp25_24;
    int k = tmp21_18;
    int tmp35_31 = (j = new char[tmp21_18] - 1);
    tmp35_31;
    int i = tmp13_12 << tmp13_12 ^ 0x2;
    (5 << 3 ^ 0x4);
    if (tmp35_31 >= 0)
    {
      int tmp45_44 = j;
      j--;
      ?[tmp45_44] = ((char)(a.charAt(tmp45_44) ^ i));
      int tmp66_63 = (j--);
      ?[tmp66_63] = ((char)(a.charAt(tmp66_63) ^ k));
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
    //   7: iconst_1
    //   8: ireturn
    //   9: athrow
    //   10: aload_1
    //   11: checkcast 35	org/bukkit/entity/Player
    //   14: astore_1
    //   15: aload 4
    //   17: arraylength
    //   18: ifne +45 -> 63
    //   21: getstatic 41	nano/spook1998/rust/data/Settings:CLANS_COMMAND	Ljava/util/List;
    //   24: invokeinterface 47 1 0
    //   29: dup
    //   30: astore_3
    //   31: goto +22 -> 53
    //   34: athrow
    //   35: aload_3
    //   36: invokeinterface 53 1 0
    //   41: checkcast 17	java/lang/String
    //   44: astore_2
    //   45: aload_3
    //   46: aload_1
    //   47: aload_2
    //   48: invokeinterface 57 2 0
    //   53: invokeinterface 61 1 0
    //   58: ifne -23 -> 35
    //   61: iconst_1
    //   62: ireturn
    //   63: aload_1
    //   64: invokeinterface 65 1 0
    //   69: invokestatic 71	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   72: astore_2
    //   73: aload 4
    //   75: arraylength
    //   76: iconst_3
    //   77: if_icmpne +362 -> 439
    //   80: aload 4
    //   82: iconst_0
    //   83: aaload
    //   84: ldc 73
    //   86: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   89: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   92: ifeq +303 -> 395
    //   95: aload_2
    //   96: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   99: ifnull +27 -> 126
    //   102: aload_1
    //   103: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   106: ldc 91
    //   108: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   111: invokeinterface 96 2 0
    //   116: checkcast 17	java/lang/String
    //   119: invokeinterface 57 2 0
    //   124: iconst_0
    //   125: ireturn
    //   126: aload_2
    //   127: invokevirtual 100	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   130: invokevirtual 105	java/lang/Integer:intValue	()I
    //   133: getstatic 109	nano/spook1998/rust/data/Settings:POINTS_CLAN	Ljava/lang/Integer;
    //   136: invokevirtual 105	java/lang/Integer:intValue	()I
    //   139: if_icmpge +27 -> 166
    //   142: aload_1
    //   143: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   146: ldc 111
    //   148: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   151: invokeinterface 96 2 0
    //   156: checkcast 17	java/lang/String
    //   159: invokeinterface 57 2 0
    //   164: iconst_0
    //   165: ireturn
    //   166: aload 4
    //   168: iconst_1
    //   169: aaload
    //   170: invokevirtual 114	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   173: dup
    //   174: astore_3
    //   175: invokevirtual 21	java/lang/String:length	()I
    //   178: getstatic 117	nano/spook1998/rust/data/Settings:TAG_MIN	Ljava/lang/Integer;
    //   181: invokevirtual 105	java/lang/Integer:intValue	()I
    //   184: if_icmplt +16 -> 200
    //   187: aload_3
    //   188: invokevirtual 21	java/lang/String:length	()I
    //   191: getstatic 120	nano/spook1998/rust/data/Settings:TAG_MAX	Ljava/lang/Integer;
    //   194: invokevirtual 105	java/lang/Integer:intValue	()I
    //   197: if_icmple +27 -> 224
    //   200: aload_1
    //   201: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   204: ldc 122
    //   206: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   209: invokeinterface 96 2 0
    //   214: checkcast 17	java/lang/String
    //   217: invokeinterface 57 2 0
    //   222: iconst_0
    //   223: ireturn
    //   224: aload 4
    //   226: iconst_2
    //   227: aaload
    //   228: dup
    //   229: astore 5
    //   231: invokevirtual 21	java/lang/String:length	()I
    //   234: getstatic 125	nano/spook1998/rust/data/Settings:NAME_MIN	Ljava/lang/Integer;
    //   237: invokevirtual 105	java/lang/Integer:intValue	()I
    //   240: if_icmplt +17 -> 257
    //   243: aload 5
    //   245: invokevirtual 21	java/lang/String:length	()I
    //   248: getstatic 128	nano/spook1998/rust/data/Settings:NAME_MAX	Ljava/lang/Integer;
    //   251: invokevirtual 105	java/lang/Integer:intValue	()I
    //   254: if_icmple +27 -> 281
    //   257: aload_1
    //   258: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   261: ldc -126
    //   263: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   266: invokeinterface 96 2 0
    //   271: checkcast 17	java/lang/String
    //   274: invokeinterface 57 2 0
    //   279: iconst_0
    //   280: ireturn
    //   281: aload 5
    //   283: aload_3
    //   284: aload_2
    //   285: invokestatic 136	nano/spook1998/rust/object/utils/ClanUtil:createClan	(Ljava/lang/String;Ljava/lang/String;Lnano/spook1998/rust/object/User;)Lnano/spook1998/rust/object/Clan;
    //   288: dup
    //   289: astore 6
    //   291: ifnonnull +27 -> 318
    //   294: aload_1
    //   295: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   298: ldc -118
    //   300: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   303: invokeinterface 96 2 0
    //   308: checkcast 17	java/lang/String
    //   311: invokeinterface 57 2 0
    //   316: iconst_0
    //   317: ireturn
    //   318: aload_2
    //   319: aload 6
    //   321: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   324: aload_2
    //   325: aload 6
    //   327: dup_x1
    //   328: aload_2
    //   329: invokevirtual 148	nano/spook1998/rust/object/Clan:addUser	(Lnano/spook1998/rust/object/User;)V
    //   332: invokevirtual 151	nano/spook1998/rust/object/Clan:setOwner	(Lnano/spook1998/rust/object/User;)V
    //   335: new 153	nano/spook1998/rust/utils/tag/Tag
    //   338: aload_1
    //   339: invokespecial 156	nano/spook1998/rust/utils/tag/Tag:<init>	(Lorg/bukkit/entity/Player;)V
    //   342: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   345: ldc -98
    //   347: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   350: invokeinterface 96 2 0
    //   355: checkcast 17	java/lang/String
    //   358: ldc -96
    //   360: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   363: aload_3
    //   364: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   367: ldc -90
    //   369: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   372: aload 5
    //   374: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   377: ldc -88
    //   379: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   382: aload_2
    //   383: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   386: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   389: invokestatic 175	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
    //   392: pop
    //   393: iconst_1
    //   394: ireturn
    //   395: getstatic 41	nano/spook1998/rust/data/Settings:CLANS_COMMAND	Ljava/util/List;
    //   398: invokeinterface 47 1 0
    //   403: dup
    //   404: astore 5
    //   406: goto +23 -> 429
    //   409: aload 5
    //   411: invokeinterface 53 1 0
    //   416: checkcast 17	java/lang/String
    //   419: astore_3
    //   420: aload 5
    //   422: aload_1
    //   423: aload_3
    //   424: invokeinterface 57 2 0
    //   429: invokeinterface 61 1 0
    //   434: ifne -25 -> 409
    //   437: iconst_1
    //   438: ireturn
    //   439: aload 4
    //   441: arraylength
    //   442: iconst_2
    //   443: if_icmpne +1383 -> 1826
    //   446: aload 4
    //   448: iconst_0
    //   449: aaload
    //   450: ldc -79
    //   452: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   455: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   458: ifeq +243 -> 701
    //   461: aload 4
    //   463: iconst_1
    //   464: aaload
    //   465: invokevirtual 114	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   468: invokestatic 181	nano/spook1998/rust/object/utils/ClanUtil:getByTag	(Ljava/lang/String;)Lnano/spook1998/rust/object/Clan;
    //   471: dup
    //   472: astore_3
    //   473: ifnonnull +27 -> 500
    //   476: aload_1
    //   477: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   480: ldc -73
    //   482: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   485: invokeinterface 96 2 0
    //   490: checkcast 17	java/lang/String
    //   493: invokeinterface 57 2 0
    //   498: iconst_0
    //   499: ireturn
    //   500: ldc -71
    //   502: astore 5
    //   504: aload_3
    //   505: invokevirtual 189	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
    //   508: invokeinterface 47 1 0
    //   513: dup
    //   514: astore 7
    //   516: goto +50 -> 566
    //   519: aload 7
    //   521: invokeinterface 53 1 0
    //   526: checkcast 81	nano/spook1998/rust/object/User
    //   529: astore 6
    //   531: new 191	java/lang/StringBuilder
    //   534: dup
    //   535: aload 5
    //   537: invokestatic 195	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   540: invokespecial 197	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   543: aload 6
    //   545: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   548: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   551: ldc -53
    //   553: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   556: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   559: invokevirtual 206	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   562: astore 5
    //   564: aload 7
    //   566: invokeinterface 61 1 0
    //   571: ifne -52 -> 519
    //   574: getstatic 209	nano/spook1998/rust/data/Settings:CLAN_INFO	Ljava/util/List;
    //   577: invokeinterface 47 1 0
    //   582: dup
    //   583: astore 7
    //   585: goto +106 -> 691
    //   588: aload 7
    //   590: invokeinterface 53 1 0
    //   595: checkcast 17	java/lang/String
    //   598: dup
    //   599: astore 6
    //   601: ldc -96
    //   603: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   606: aload_3
    //   607: invokevirtual 212	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
    //   610: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   613: ldc -90
    //   615: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   618: aload_3
    //   619: invokevirtual 213	nano/spook1998/rust/object/Clan:getName	()Ljava/lang/String;
    //   622: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   625: ldc -41
    //   627: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   630: aload_3
    //   631: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   634: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   637: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   640: ldc -35
    //   642: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   645: new 191	java/lang/StringBuilder
    //   648: dup
    //   649: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   652: iconst_0
    //   653: aload 5
    //   655: invokevirtual 226	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   658: invokevirtual 206	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   661: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   664: ldc -28
    //   666: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   669: aload_3
    //   670: invokevirtual 229	nano/spook1998/rust/object/Clan:getPoints	()Ljava/lang/Integer;
    //   673: invokevirtual 230	java/lang/Integer:toString	()Ljava/lang/String;
    //   676: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   679: astore 8
    //   681: aload 7
    //   683: aload_1
    //   684: aload 8
    //   686: invokeinterface 57 2 0
    //   691: invokeinterface 61 1 0
    //   696: ifne -108 -> 588
    //   699: iconst_1
    //   700: ireturn
    //   701: aload 4
    //   703: iconst_0
    //   704: aaload
    //   705: ldc -24
    //   707: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   710: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   713: ifeq +196 -> 909
    //   716: aload_1
    //   717: ldc -22
    //   719: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   722: invokeinterface 237 2 0
    //   727: ifne +47 -> 774
    //   730: getstatic 41	nano/spook1998/rust/data/Settings:CLANS_COMMAND	Ljava/util/List;
    //   733: invokeinterface 47 1 0
    //   738: dup
    //   739: astore 5
    //   741: goto +23 -> 764
    //   744: aload 5
    //   746: invokeinterface 53 1 0
    //   751: checkcast 17	java/lang/String
    //   754: astore_3
    //   755: aload 5
    //   757: aload_1
    //   758: aload_3
    //   759: invokeinterface 57 2 0
    //   764: invokeinterface 61 1 0
    //   769: ifne -25 -> 744
    //   772: iconst_0
    //   773: ireturn
    //   774: aload 4
    //   776: iconst_1
    //   777: aaload
    //   778: invokevirtual 114	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   781: invokestatic 181	nano/spook1998/rust/object/utils/ClanUtil:getByTag	(Ljava/lang/String;)Lnano/spook1998/rust/object/Clan;
    //   784: dup
    //   785: astore_3
    //   786: ifnonnull +27 -> 813
    //   789: aload_1
    //   790: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   793: ldc -73
    //   795: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   798: invokeinterface 96 2 0
    //   803: checkcast 17	java/lang/String
    //   806: invokeinterface 57 2 0
    //   811: iconst_0
    //   812: ireturn
    //   813: aload_3
    //   814: invokevirtual 189	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
    //   817: invokeinterface 47 1 0
    //   822: dup
    //   823: astore 6
    //   825: goto +23 -> 848
    //   828: aload 6
    //   830: invokeinterface 53 1 0
    //   835: checkcast 81	nano/spook1998/rust/object/User
    //   838: astore 5
    //   840: aload 6
    //   842: aload 5
    //   844: aconst_null
    //   845: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   848: invokeinterface 61 1 0
    //   853: ifne -25 -> 828
    //   856: aload_3
    //   857: dup
    //   858: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   861: aconst_null
    //   862: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   865: invokestatic 240	nano/spook1998/rust/object/utils/ClanUtil:removeClan	(Lnano/spook1998/rust/object/Clan;)V
    //   868: new 153	nano/spook1998/rust/utils/tag/Tag
    //   871: aload_1
    //   872: invokespecial 156	nano/spook1998/rust/utils/tag/Tag:<init>	(Lorg/bukkit/entity/Player;)V
    //   875: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   878: ldc -14
    //   880: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   883: invokeinterface 96 2 0
    //   888: checkcast 17	java/lang/String
    //   891: ldc -96
    //   893: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   896: aload_3
    //   897: invokevirtual 213	nano/spook1998/rust/object/Clan:getName	()Ljava/lang/String;
    //   900: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   903: invokestatic 175	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
    //   906: pop
    //   907: iconst_1
    //   908: ireturn
    //   909: aload 4
    //   911: iconst_0
    //   912: aaload
    //   913: ldc -12
    //   915: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   918: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   921: ifeq +268 -> 1189
    //   924: aload_2
    //   925: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   928: ifnonnull +27 -> 955
    //   931: aload_1
    //   932: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   935: ldc -10
    //   937: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   940: invokeinterface 96 2 0
    //   945: checkcast 17	java/lang/String
    //   948: invokeinterface 57 2 0
    //   953: iconst_0
    //   954: ireturn
    //   955: aload_2
    //   956: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   959: dup
    //   960: astore_3
    //   961: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   964: aload_2
    //   965: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   968: ifne +27 -> 995
    //   971: aload_1
    //   972: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   975: ldc -4
    //   977: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   980: invokeinterface 96 2 0
    //   985: checkcast 17	java/lang/String
    //   988: invokeinterface 57 2 0
    //   993: iconst_0
    //   994: ireturn
    //   995: aload 4
    //   997: iconst_1
    //   998: aaload
    //   999: invokestatic 256	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   1002: dup
    //   1003: astore 5
    //   1005: ifnonnull +28 -> 1033
    //   1008: aload_1
    //   1009: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1012: ldc_w 258
    //   1015: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1018: invokeinterface 96 2 0
    //   1023: checkcast 17	java/lang/String
    //   1026: invokeinterface 57 2 0
    //   1031: iconst_0
    //   1032: ireturn
    //   1033: aload 4
    //   1035: iconst_1
    //   1036: aaload
    //   1037: invokestatic 71	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   1040: astore 6
    //   1042: aload_3
    //   1043: invokevirtual 189	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
    //   1046: aload 6
    //   1048: invokeinterface 261 2 0
    //   1053: ifeq +28 -> 1081
    //   1056: aload_1
    //   1057: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1060: ldc_w 263
    //   1063: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1066: invokeinterface 96 2 0
    //   1071: checkcast 17	java/lang/String
    //   1074: invokeinterface 57 2 0
    //   1079: iconst_0
    //   1080: ireturn
    //   1081: aload 6
    //   1083: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1086: ifnull +28 -> 1114
    //   1089: aload_1
    //   1090: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1093: ldc_w 265
    //   1096: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1099: invokeinterface 96 2 0
    //   1104: checkcast 17	java/lang/String
    //   1107: invokeinterface 57 2 0
    //   1112: iconst_0
    //   1113: ireturn
    //   1114: aload_3
    //   1115: aload 6
    //   1117: invokevirtual 269	nano/spook1998/rust/object/Clan:addToInv	(Lnano/spook1998/rust/object/User;)Ljava/lang/Boolean;
    //   1120: invokevirtual 274	java/lang/Boolean:booleanValue	()Z
    //   1123: ifne +28 -> 1151
    //   1126: aload_1
    //   1127: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1130: ldc_w 276
    //   1133: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1136: invokeinterface 96 2 0
    //   1141: checkcast 17	java/lang/String
    //   1144: invokeinterface 57 2 0
    //   1149: iconst_0
    //   1150: ireturn
    //   1151: aload 5
    //   1153: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1156: ldc_w 278
    //   1159: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1162: invokeinterface 96 2 0
    //   1167: checkcast 17	java/lang/String
    //   1170: ldc -96
    //   1172: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1175: aload_3
    //   1176: invokevirtual 212	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
    //   1179: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1182: invokeinterface 57 2 0
    //   1187: iconst_1
    //   1188: ireturn
    //   1189: aload 4
    //   1191: iconst_0
    //   1192: aaload
    //   1193: ldc_w 280
    //   1196: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1199: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1202: ifeq +175 -> 1377
    //   1205: aload_2
    //   1206: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1209: ifnull +28 -> 1237
    //   1212: aload_1
    //   1213: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1216: ldc_w 282
    //   1219: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1222: invokeinterface 96 2 0
    //   1227: checkcast 17	java/lang/String
    //   1230: invokeinterface 57 2 0
    //   1235: iconst_0
    //   1236: ireturn
    //   1237: aload 4
    //   1239: iconst_1
    //   1240: aaload
    //   1241: invokevirtual 114	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   1244: invokestatic 181	nano/spook1998/rust/object/utils/ClanUtil:getByTag	(Ljava/lang/String;)Lnano/spook1998/rust/object/Clan;
    //   1247: dup
    //   1248: astore_3
    //   1249: ifnonnull +28 -> 1277
    //   1252: aload_1
    //   1253: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1256: ldc_w 284
    //   1259: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1262: invokeinterface 96 2 0
    //   1267: checkcast 17	java/lang/String
    //   1270: invokeinterface 57 2 0
    //   1275: iconst_0
    //   1276: ireturn
    //   1277: aload_3
    //   1278: aload_2
    //   1279: invokevirtual 287	nano/spook1998/rust/object/Clan:removeFromInv	(Lnano/spook1998/rust/object/User;)Ljava/lang/Boolean;
    //   1282: invokevirtual 274	java/lang/Boolean:booleanValue	()Z
    //   1285: ifne +28 -> 1313
    //   1288: aload_1
    //   1289: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1292: ldc_w 289
    //   1295: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1298: invokeinterface 96 2 0
    //   1303: checkcast 17	java/lang/String
    //   1306: invokeinterface 57 2 0
    //   1311: iconst_0
    //   1312: ireturn
    //   1313: aload_3
    //   1314: aload_2
    //   1315: invokevirtual 148	nano/spook1998/rust/object/Clan:addUser	(Lnano/spook1998/rust/object/User;)V
    //   1318: aload_2
    //   1319: aload_3
    //   1320: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   1323: new 153	nano/spook1998/rust/utils/tag/Tag
    //   1326: aload_1
    //   1327: invokespecial 156	nano/spook1998/rust/utils/tag/Tag:<init>	(Lorg/bukkit/entity/Player;)V
    //   1330: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1333: ldc_w 291
    //   1336: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1339: invokeinterface 96 2 0
    //   1344: checkcast 17	java/lang/String
    //   1347: ldc -96
    //   1349: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1352: aload_3
    //   1353: invokevirtual 212	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
    //   1356: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1359: ldc -88
    //   1361: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1364: aload_2
    //   1365: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   1368: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1371: invokestatic 175	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
    //   1374: pop
    //   1375: iconst_1
    //   1376: ireturn
    //   1377: aload 4
    //   1379: iconst_0
    //   1380: aaload
    //   1381: ldc_w 293
    //   1384: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1387: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1390: ifeq +234 -> 1624
    //   1393: aload_2
    //   1394: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1397: ifnonnull +27 -> 1424
    //   1400: aload_1
    //   1401: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1404: ldc -10
    //   1406: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1409: invokeinterface 96 2 0
    //   1414: checkcast 17	java/lang/String
    //   1417: invokeinterface 57 2 0
    //   1422: iconst_0
    //   1423: ireturn
    //   1424: aload_2
    //   1425: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1428: dup
    //   1429: astore_3
    //   1430: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   1433: aload_2
    //   1434: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1437: ifne +27 -> 1464
    //   1440: aload_1
    //   1441: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1444: ldc -4
    //   1446: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1449: invokeinterface 96 2 0
    //   1454: checkcast 17	java/lang/String
    //   1457: invokeinterface 57 2 0
    //   1462: iconst_0
    //   1463: ireturn
    //   1464: aload 4
    //   1466: iconst_1
    //   1467: aaload
    //   1468: invokestatic 71	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   1471: astore 5
    //   1473: aload_3
    //   1474: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   1477: aload 5
    //   1479: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1482: ifeq +28 -> 1510
    //   1485: aload_1
    //   1486: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1489: ldc_w 295
    //   1492: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1495: invokeinterface 96 2 0
    //   1500: checkcast 17	java/lang/String
    //   1503: invokeinterface 57 2 0
    //   1508: iconst_0
    //   1509: ireturn
    //   1510: aload_3
    //   1511: invokevirtual 189	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
    //   1514: aload 5
    //   1516: invokeinterface 261 2 0
    //   1521: ifne +28 -> 1549
    //   1524: aload_1
    //   1525: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1528: ldc_w 297
    //   1531: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1534: invokeinterface 96 2 0
    //   1539: checkcast 17	java/lang/String
    //   1542: invokeinterface 57 2 0
    //   1547: iconst_0
    //   1548: ireturn
    //   1549: aload_3
    //   1550: aload 5
    //   1552: invokevirtual 300	nano/spook1998/rust/object/Clan:removeUser	(Lnano/spook1998/rust/object/User;)V
    //   1555: aload 5
    //   1557: dup
    //   1558: aconst_null
    //   1559: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   1562: new 153	nano/spook1998/rust/utils/tag/Tag
    //   1565: aload_1
    //   1566: invokespecial 156	nano/spook1998/rust/utils/tag/Tag:<init>	(Lorg/bukkit/entity/Player;)V
    //   1569: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   1572: invokestatic 256	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   1575: astore 6
    //   1577: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1580: ldc_w 302
    //   1583: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1586: invokeinterface 96 2 0
    //   1591: checkcast 17	java/lang/String
    //   1594: ldc -96
    //   1596: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1599: aload_3
    //   1600: invokevirtual 212	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
    //   1603: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1606: ldc -88
    //   1608: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1611: aload_2
    //   1612: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   1615: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1618: invokestatic 175	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
    //   1621: pop
    //   1622: iconst_1
    //   1623: ireturn
    //   1624: aload 4
    //   1626: iconst_0
    //   1627: aaload
    //   1628: ldc_w 304
    //   1631: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1634: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1637: ifeq +145 -> 1782
    //   1640: aload_2
    //   1641: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1644: ifnonnull +27 -> 1671
    //   1647: aload_1
    //   1648: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1651: ldc -10
    //   1653: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1656: invokeinterface 96 2 0
    //   1661: checkcast 17	java/lang/String
    //   1664: invokeinterface 57 2 0
    //   1669: iconst_0
    //   1670: ireturn
    //   1671: aload_2
    //   1672: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1675: dup
    //   1676: astore_3
    //   1677: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   1680: aload_2
    //   1681: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1684: ifne +27 -> 1711
    //   1687: aload_1
    //   1688: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1691: ldc -4
    //   1693: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1696: invokeinterface 96 2 0
    //   1701: checkcast 17	java/lang/String
    //   1704: invokeinterface 57 2 0
    //   1709: iconst_0
    //   1710: ireturn
    //   1711: aload 4
    //   1713: iconst_1
    //   1714: aaload
    //   1715: invokestatic 71	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   1718: astore 5
    //   1720: aload_3
    //   1721: aload 5
    //   1723: invokevirtual 287	nano/spook1998/rust/object/Clan:removeFromInv	(Lnano/spook1998/rust/object/User;)Ljava/lang/Boolean;
    //   1726: invokevirtual 274	java/lang/Boolean:booleanValue	()Z
    //   1729: ifne +28 -> 1757
    //   1732: aload_1
    //   1733: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1736: ldc_w 289
    //   1739: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1742: invokeinterface 96 2 0
    //   1747: checkcast 17	java/lang/String
    //   1750: invokeinterface 57 2 0
    //   1755: iconst_0
    //   1756: ireturn
    //   1757: aload_1
    //   1758: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1761: ldc_w 306
    //   1764: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1767: invokeinterface 96 2 0
    //   1772: checkcast 17	java/lang/String
    //   1775: invokeinterface 57 2 0
    //   1780: iconst_1
    //   1781: ireturn
    //   1782: getstatic 41	nano/spook1998/rust/data/Settings:CLANS_COMMAND	Ljava/util/List;
    //   1785: invokeinterface 47 1 0
    //   1790: dup
    //   1791: astore 5
    //   1793: goto +23 -> 1816
    //   1796: aload 5
    //   1798: invokeinterface 53 1 0
    //   1803: checkcast 17	java/lang/String
    //   1806: astore_3
    //   1807: aload 5
    //   1809: aload_1
    //   1810: aload_3
    //   1811: invokeinterface 57 2 0
    //   1816: invokeinterface 61 1 0
    //   1821: ifne -25 -> 1796
    //   1824: iconst_1
    //   1825: ireturn
    //   1826: aload 4
    //   1828: arraylength
    //   1829: iconst_1
    //   1830: if_icmpne +553 -> 2383
    //   1833: aload 4
    //   1835: iconst_0
    //   1836: aaload
    //   1837: ldc -24
    //   1839: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1842: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1845: ifeq +155 -> 2000
    //   1848: aload_2
    //   1849: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1852: ifnonnull +27 -> 1879
    //   1855: aload_1
    //   1856: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1859: ldc -10
    //   1861: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1864: invokeinterface 96 2 0
    //   1869: checkcast 17	java/lang/String
    //   1872: invokeinterface 57 2 0
    //   1877: iconst_0
    //   1878: ireturn
    //   1879: aload_2
    //   1880: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   1883: dup
    //   1884: astore_3
    //   1885: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   1888: aload_2
    //   1889: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1892: ifne +27 -> 1919
    //   1895: aload_1
    //   1896: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1899: ldc -4
    //   1901: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1904: invokeinterface 96 2 0
    //   1909: checkcast 17	java/lang/String
    //   1912: invokeinterface 57 2 0
    //   1917: iconst_0
    //   1918: ireturn
    //   1919: aload_3
    //   1920: invokevirtual 189	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
    //   1923: invokeinterface 47 1 0
    //   1928: dup
    //   1929: astore 6
    //   1931: goto +23 -> 1954
    //   1934: aload 6
    //   1936: invokeinterface 53 1 0
    //   1941: checkcast 81	nano/spook1998/rust/object/User
    //   1944: astore 5
    //   1946: aload 6
    //   1948: aload 5
    //   1950: aconst_null
    //   1951: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   1954: invokeinterface 61 1 0
    //   1959: ifne -25 -> 1934
    //   1962: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   1965: ldc -14
    //   1967: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1970: invokeinterface 96 2 0
    //   1975: checkcast 17	java/lang/String
    //   1978: ldc -96
    //   1980: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   1983: aload_3
    //   1984: invokevirtual 213	nano/spook1998/rust/object/Clan:getName	()Ljava/lang/String;
    //   1987: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1990: invokestatic 175	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
    //   1993: aload_3
    //   1994: invokestatic 240	nano/spook1998/rust/object/utils/ClanUtil:removeClan	(Lnano/spook1998/rust/object/Clan;)V
    //   1997: pop
    //   1998: iconst_1
    //   1999: ireturn
    //   2000: aload 4
    //   2002: iconst_0
    //   2003: aaload
    //   2004: ldc_w 308
    //   2007: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2010: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   2013: ifeq +218 -> 2231
    //   2016: aload_2
    //   2017: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   2020: ifnonnull +27 -> 2047
    //   2023: aload_1
    //   2024: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   2027: ldc -10
    //   2029: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2032: invokeinterface 96 2 0
    //   2037: checkcast 17	java/lang/String
    //   2040: invokeinterface 57 2 0
    //   2045: iconst_0
    //   2046: ireturn
    //   2047: aload_2
    //   2048: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   2051: dup
    //   2052: astore_3
    //   2053: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   2056: aload_2
    //   2057: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   2060: ifne +27 -> 2087
    //   2063: aload_1
    //   2064: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   2067: ldc -4
    //   2069: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2072: invokeinterface 96 2 0
    //   2077: checkcast 17	java/lang/String
    //   2080: invokeinterface 57 2 0
    //   2085: iconst_0
    //   2086: ireturn
    //   2087: aload_3
    //   2088: invokevirtual 312	nano/spook1998/rust/object/Clan:isPvP	()Ljava/lang/Boolean;
    //   2091: invokevirtual 274	java/lang/Boolean:booleanValue	()Z
    //   2094: ifeq +7 -> 2101
    //   2097: iconst_0
    //   2098: goto +4 -> 2102
    //   2101: iconst_1
    //   2102: invokestatic 315	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2105: astore 5
    //   2107: ldc_w 317
    //   2110: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2113: astore 6
    //   2115: aload 5
    //   2117: invokevirtual 274	java/lang/Boolean:booleanValue	()Z
    //   2120: ifeq +11 -> 2131
    //   2123: ldc_w 319
    //   2126: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2129: astore 6
    //   2131: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   2134: ldc_w 321
    //   2137: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2140: invokeinterface 96 2 0
    //   2145: checkcast 17	java/lang/String
    //   2148: ldc_w 323
    //   2151: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2154: aload 6
    //   2156: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2159: astore 7
    //   2161: aload_3
    //   2162: invokevirtual 189	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
    //   2165: invokeinterface 47 1 0
    //   2170: dup
    //   2171: astore 6
    //   2173: goto +42 -> 2215
    //   2176: aload 6
    //   2178: invokeinterface 53 1 0
    //   2183: checkcast 81	nano/spook1998/rust/object/User
    //   2186: dup
    //   2187: astore 8
    //   2189: invokevirtual 326	nano/spook1998/rust/object/User:getOnline	()Ljava/lang/Boolean;
    //   2192: invokevirtual 274	java/lang/Boolean:booleanValue	()Z
    //   2195: ifeq +18 -> 2213
    //   2198: aload 8
    //   2200: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   2203: invokestatic 256	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   2206: aload 7
    //   2208: invokeinterface 57 2 0
    //   2213: aload 6
    //   2215: invokeinterface 61 1 0
    //   2220: ifne -44 -> 2176
    //   2223: iconst_1
    //   2224: aload_3
    //   2225: aload 5
    //   2227: invokevirtual 330	nano/spook1998/rust/object/Clan:setPvP	(Ljava/lang/Boolean;)V
    //   2230: ireturn
    //   2231: aload 4
    //   2233: iconst_0
    //   2234: aaload
    //   2235: ldc_w 332
    //   2238: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2241: invokevirtual 79	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   2244: ifeq +139 -> 2383
    //   2247: aload_2
    //   2248: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   2251: ifnonnull +27 -> 2278
    //   2254: aload_1
    //   2255: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   2258: ldc -10
    //   2260: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2263: invokeinterface 96 2 0
    //   2268: checkcast 17	java/lang/String
    //   2271: invokeinterface 57 2 0
    //   2276: iconst_0
    //   2277: ireturn
    //   2278: aload_2
    //   2279: invokevirtual 85	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
    //   2282: dup
    //   2283: astore_3
    //   2284: invokevirtual 219	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
    //   2287: aload_2
    //   2288: invokevirtual 250	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   2291: ifeq +28 -> 2319
    //   2294: aload_1
    //   2295: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   2298: ldc_w 334
    //   2301: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2304: invokeinterface 96 2 0
    //   2309: checkcast 17	java/lang/String
    //   2312: invokeinterface 57 2 0
    //   2317: iconst_0
    //   2318: ireturn
    //   2319: aload_3
    //   2320: aload_2
    //   2321: invokevirtual 300	nano/spook1998/rust/object/Clan:removeUser	(Lnano/spook1998/rust/object/User;)V
    //   2324: aload_2
    //   2325: aconst_null
    //   2326: invokevirtual 142	nano/spook1998/rust/object/User:setClan	(Lnano/spook1998/rust/object/Clan;)V
    //   2329: new 153	nano/spook1998/rust/utils/tag/Tag
    //   2332: aload_1
    //   2333: invokespecial 156	nano/spook1998/rust/utils/tag/Tag:<init>	(Lorg/bukkit/entity/Player;)V
    //   2336: getstatic 89	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
    //   2339: ldc_w 302
    //   2342: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2345: invokeinterface 96 2 0
    //   2350: checkcast 17	java/lang/String
    //   2353: ldc -96
    //   2355: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2358: aload_3
    //   2359: invokevirtual 212	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
    //   2362: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2365: ldc -88
    //   2367: invokestatic 75	nano/spook1998/rust/commands/ClansCommand:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   2370: aload_2
    //   2371: invokevirtual 169	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
    //   2374: invokevirtual 164	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2377: invokestatic 175	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
    //   2380: pop
    //   2381: iconst_1
    //   2382: ireturn
    //   2383: getstatic 41	nano/spook1998/rust/data/Settings:CLANS_COMMAND	Ljava/util/List;
    //   2386: invokeinterface 47 1 0
    //   2391: dup
    //   2392: astore 5
    //   2394: goto +23 -> 2417
    //   2397: aload 5
    //   2399: invokeinterface 53 1 0
    //   2404: checkcast 17	java/lang/String
    //   2407: astore_3
    //   2408: aload 5
    //   2410: aload_1
    //   2411: aload_3
    //   2412: invokeinterface 57 2 0
    //   2417: invokeinterface 61 1 0
    //   2422: ifne -25 -> 2397
    //   2425: iconst_1
    //   2426: ireturn
    // Line number table:
    //   Java source line #164	-> byte code offset #0
    //   Java source line #38	-> byte code offset #10
    //   Java source line #123	-> byte code offset #15
    //   Java source line #171	-> byte code offset #21
    //   Java source line #78	-> byte code offset #46
    //   Java source line #171	-> byte code offset #53
    //   Java source line #119	-> byte code offset #61
    //   Java source line #96	-> byte code offset #63
    //   Java source line #92	-> byte code offset #73
    //   Java source line #32	-> byte code offset #80
    //   Java source line #13	-> byte code offset #95
    //   Java source line #155	-> byte code offset #102
    //   Java source line #162	-> byte code offset #124
    //   Java source line #182	-> byte code offset #142
    //   Java source line #77	-> byte code offset #164
    //   Java source line #47	-> byte code offset #166
    //   Java source line #113	-> byte code offset #175
    //   Java source line #110	-> byte code offset #200
    //   Java source line #68	-> byte code offset #222
    //   Java source line #180	-> byte code offset #224
    //   Java source line #56	-> byte code offset #231
    //   Java source line #24	-> byte code offset #257
    //   Java source line #194	-> byte code offset #279
    //   Java source line #3	-> byte code offset #281
    //   Java source line #160	-> byte code offset #291
    //   Java source line #89	-> byte code offset #294
    //   Java source line #72	-> byte code offset #316
    //   Java source line #86	-> byte code offset #318
    //   Java source line #29	-> byte code offset #324
    //   Java source line #163	-> byte code offset #332
    //   Java source line #193	-> byte code offset #335
    //   Java source line #60	-> byte code offset #342
    //   Java source line #129	-> byte code offset #393
    //   Java source line #175	-> byte code offset #395
    //   Java source line #112	-> byte code offset #422
    //   Java source line #175	-> byte code offset #429
    //   Java source line #158	-> byte code offset #437
    //   Java source line #91	-> byte code offset #439
    //   Java source line #39	-> byte code offset #446
    //   Java source line #59	-> byte code offset #461
    //   Java source line #174	-> byte code offset #473
    //   Java source line #19	-> byte code offset #476
    //   Java source line #18	-> byte code offset #498
    //   Java source line #11	-> byte code offset #500
    //   Java source line #176	-> byte code offset #504
    //   Java source line #66	-> byte code offset #531
    //   Java source line #176	-> byte code offset #564
    //   Java source line #173	-> byte code offset #574
    //   Java source line #139	-> byte code offset #601
    //   Java source line #71	-> byte code offset #683
    //   Java source line #173	-> byte code offset #691
    //   Java source line #106	-> byte code offset #699
    //   Java source line #74	-> byte code offset #701
    //   Java source line #27	-> byte code offset #716
    //   Java source line #132	-> byte code offset #730
    //   Java source line #186	-> byte code offset #757
    //   Java source line #132	-> byte code offset #764
    //   Java source line #121	-> byte code offset #772
    //   Java source line #192	-> byte code offset #774
    //   Java source line #99	-> byte code offset #786
    //   Java source line #28	-> byte code offset #789
    //   Java source line #94	-> byte code offset #811
    //   Java source line #50	-> byte code offset #813
    //   Java source line #124	-> byte code offset #842
    //   Java source line #50	-> byte code offset #848
    //   Java source line #85	-> byte code offset #856
    //   Java source line #14	-> byte code offset #865
    //   Java source line #67	-> byte code offset #868
    //   Java source line #125	-> byte code offset #875
    //   Java source line #122	-> byte code offset #907
    //   Java source line #137	-> byte code offset #909
    //   Java source line #165	-> byte code offset #924
    //   Java source line #4	-> byte code offset #931
    //   Java source line #154	-> byte code offset #953
    //   Java source line #22	-> byte code offset #955
    //   Java source line #179	-> byte code offset #961
    //   Java source line #16	-> byte code offset #971
    //   Java source line #43	-> byte code offset #993
    //   Java source line #116	-> byte code offset #995
    //   Java source line #15	-> byte code offset #1005
    //   Java source line #181	-> byte code offset #1008
    //   Java source line #102	-> byte code offset #1031
    //   Java source line #159	-> byte code offset #1033
    //   Java source line #128	-> byte code offset #1042
    //   Java source line #191	-> byte code offset #1056
    //   Java source line #197	-> byte code offset #1079
    //   Java source line #6	-> byte code offset #1081
    //   Java source line #53	-> byte code offset #1089
    //   Java source line #166	-> byte code offset #1112
    //   Java source line #37	-> byte code offset #1114
    //   Java source line #149	-> byte code offset #1126
    //   Java source line #63	-> byte code offset #1149
    //   Java source line #136	-> byte code offset #1151
    //   Java source line #183	-> byte code offset #1187
    //   Java source line #33	-> byte code offset #1189
    //   Java source line #184	-> byte code offset #1205
    //   Java source line #84	-> byte code offset #1212
    //   Java source line #44	-> byte code offset #1235
    //   Java source line #114	-> byte code offset #1237
    //   Java source line #55	-> byte code offset #1249
    //   Java source line #185	-> byte code offset #1252
    //   Java source line #198	-> byte code offset #1275
    //   Java source line #200	-> byte code offset #1277
    //   Java source line #103	-> byte code offset #1288
    //   Java source line #115	-> byte code offset #1311
    //   Java source line #65	-> byte code offset #1313
    //   Java source line #83	-> byte code offset #1318
    //   Java source line #79	-> byte code offset #1323
    //   Java source line #40	-> byte code offset #1330
    //   Java source line #188	-> byte code offset #1375
    //   Java source line #51	-> byte code offset #1377
    //   Java source line #127	-> byte code offset #1393
    //   Java source line #76	-> byte code offset #1400
    //   Java source line #69	-> byte code offset #1422
    //   Java source line #49	-> byte code offset #1424
    //   Java source line #130	-> byte code offset #1430
    //   Java source line #30	-> byte code offset #1440
    //   Java source line #12	-> byte code offset #1462
    //   Java source line #1	-> byte code offset #1464
    //   Java source line #26	-> byte code offset #1473
    //   Java source line #107	-> byte code offset #1485
    //   Java source line #109	-> byte code offset #1508
    //   Java source line #54	-> byte code offset #1510
    //   Java source line #62	-> byte code offset #1524
    //   Java source line #90	-> byte code offset #1547
    //   Java source line #111	-> byte code offset #1549
    //   Java source line #153	-> byte code offset #1555
    //   Java source line #82	-> byte code offset #1562
    //   Java source line #169	-> byte code offset #1569
    //   Java source line #156	-> byte code offset #1577
    //   Java source line #199	-> byte code offset #1622
    //   Java source line #135	-> byte code offset #1624
    //   Java source line #7	-> byte code offset #1640
    //   Java source line #151	-> byte code offset #1647
    //   Java source line #134	-> byte code offset #1669
    //   Java source line #161	-> byte code offset #1671
    //   Java source line #168	-> byte code offset #1677
    //   Java source line #101	-> byte code offset #1687
    //   Java source line #177	-> byte code offset #1709
    //   Java source line #189	-> byte code offset #1711
    //   Java source line #75	-> byte code offset #1720
    //   Java source line #42	-> byte code offset #1732
    //   Java source line #105	-> byte code offset #1755
    //   Java source line #34	-> byte code offset #1757
    //   Java source line #152	-> byte code offset #1780
    //   Java source line #35	-> byte code offset #1782
    //   Java source line #36	-> byte code offset #1809
    //   Java source line #35	-> byte code offset #1816
    //   Java source line #338	-> byte code offset #1824
    //   Java source line #231	-> byte code offset #1826
    //   Java source line #330	-> byte code offset #1833
    //   Java source line #376	-> byte code offset #1848
    //   Java source line #251	-> byte code offset #1855
    //   Java source line #370	-> byte code offset #1877
    //   Java source line #390	-> byte code offset #1879
    //   Java source line #418	-> byte code offset #1885
    //   Java source line #312	-> byte code offset #1895
    //   Java source line #268	-> byte code offset #1917
    //   Java source line #233	-> byte code offset #1919
    //   Java source line #304	-> byte code offset #1948
    //   Java source line #233	-> byte code offset #1954
    //   Java source line #283	-> byte code offset #1962
    //   Java source line #329	-> byte code offset #1993
    //   Java source line #258	-> byte code offset #1998
    //   Java source line #389	-> byte code offset #2000
    //   Java source line #286	-> byte code offset #2016
    //   Java source line #335	-> byte code offset #2023
    //   Java source line #417	-> byte code offset #2045
    //   Java source line #246	-> byte code offset #2047
    //   Java source line #234	-> byte code offset #2053
    //   Java source line #272	-> byte code offset #2063
    //   Java source line #226	-> byte code offset #2085
    //   Java source line #375	-> byte code offset #2087
    //   Java source line #259	-> byte code offset #2107
    //   Java source line #238	-> byte code offset #2115
    //   Java source line #301	-> byte code offset #2131
    //   Java source line #356	-> byte code offset #2161
    //   Java source line #309	-> byte code offset #2189
    //   Java source line #356	-> byte code offset #2213
    //   Java source line #393	-> byte code offset #2224
    //   Java source line #252	-> byte code offset #2230
    //   Java source line #366	-> byte code offset #2231
    //   Java source line #239	-> byte code offset #2247
    //   Java source line #204	-> byte code offset #2254
    //   Java source line #382	-> byte code offset #2276
    //   Java source line #228	-> byte code offset #2278
    //   Java source line #409	-> byte code offset #2284
    //   Java source line #215	-> byte code offset #2294
    //   Java source line #311	-> byte code offset #2317
    //   Java source line #388	-> byte code offset #2319
    //   Java source line #334	-> byte code offset #2324
    //   Java source line #344	-> byte code offset #2329
    //   Java source line #298	-> byte code offset #2336
    //   Java source line #326	-> byte code offset #2381
    //   Java source line #372	-> byte code offset #2383
    //   Java source line #381	-> byte code offset #2410
    //   Java source line #372	-> byte code offset #2417
    //   Java source line #398	-> byte code offset #2425
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2427	0	a	ClansCommand
    //   0	2427	1	a	org.bukkit.command.CommandSender
    //   0	2427	2	a	org.bukkit.command.Command
    //   0	2427	3	a	String
    //   0	2427	4	a	String[]
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\commands\ClansCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */