/*     */ package nano.spook1998.rust.data.manager;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.NanoRust;
/*     */ import nano.spook1998.rust.object.Clan;
/*     */ import nano.spook1998.rust.object.User;
/*     */ import nano.spook1998.rust.object.utils.ClanUtil;
/*     */ import nano.spook1998.rust.object.utils.UserUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.ConsoleCommandSender;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ClanManager
/*     */ {
/*     */   private static List<File> M;
/*     */   private static ClanManager b;
/*     */   private static String ALLATORIxDEMO;
/*     */   
/*     */   public ClanManager()
/*     */   {
/* 119 */     b = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */     ALLATORIxDEMO = NanoRust.getInstance().getDataFolder().getAbsoluteFile() + ALLATORIxDEMO("fn\n-(/:");M = new ArrayList();
/*     */     File localFile;
/*  32 */     if (!
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       (localFile = new File(ALLATORIxDEMO)).exists()) {
/*  13 */       localFile.mkdir();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void load()
/*     */   {
/*  70 */     Integer localInteger = Integer.valueOf(0);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     File[] arrayOfFile;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */     int j = (arrayOfFile = new File(ALLATORIxDEMO).listFiles()).length; int i; for (goto 172; i < j;) { Object localObject1 = arrayOfFile[i]; YamlConfiguration tmp51_50 = (localObject1 = YamlConfiguration.loadConfiguration((File)localObject1));Object localObject2 = UserUtil.get(tmp51_50.getString(ALLATORIxDEMO("&6'$;"))); Object tmp74_73 = localObject1;localObject1 = ClanUtil.createClan(tmp51_50.getString(ALLATORIxDEMO("/(,,")), tmp74_73.getString(ALLATORIxDEMO("= .")), (User)localObject2); Object tmp93_91 = localObject2; Object tmp95_94 = localObject1;tmp93_91.setClan(tmp95_94);tmp95_94.addUser(tmp93_91);localObject2 = tmp74_73.getStringList(ALLATORIxDEMO("$$$#,3:")).iterator();M.add(localObject1);
/*  18 */       for (goto 150; 
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */             ((Iterator)localObject2).hasNext();)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         User localUser = UserUtil.get((String)((Iterator)localObject2).next()); User tmp141_139 = localUser; Object tmp143_142 = localObject1;tmp141_139.setClan(tmp143_142);tmp143_142
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           .addUser(tmp141_139);
/*     */       }
/*  20 */       localInteger = Integer.valueOf(1 + i++);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */     Bukkit.getConsoleSender().sendMessage(ChatColor.RED + ALLATORIxDEMO("\017(/&\023<2=") + ChatColor.GRAY + ALLATORIxDEMO("a3 % -.> '8*)i*% '.>{i") + localInteger);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static ClanManager getInstance()
/*     */   {
/* 182 */     if (b == null) new ClanManager(); return b;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void save()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial 44	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	()V
/*     */     //   4: invokestatic 50	nano/spook1998/rust/object/utils/ClanUtil:getClans	()Ljava/util/List;
/*     */     //   7: invokeinterface 21 1 0
/*     */     //   12: dup
/*     */     //   13: astore_2
/*     */     //   14: goto +219 -> 233
/*     */     //   17: athrow
/*     */     //   18: aload_2
/*     */     //   19: invokeinterface 27 1 0
/*     */     //   24: checkcast 52	nano/spook1998/rust/object/Clan
/*     */     //   27: astore_1
/*     */     //   28: new 29	java/io/File
/*     */     //   31: dup
/*     */     //   32: new 54	java/lang/StringBuilder
/*     */     //   35: dup
/*     */     //   36: getstatic 56	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   39: invokestatic 62	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   42: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   45: ldc 68
/*     */     //   47: invokestatic 71	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   50: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   53: aload_1
/*     */     //   54: invokevirtual 79	nano/spook1998/rust/object/Clan:getName	()Ljava/lang/String;
/*     */     //   57: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   60: ldc 81
/*     */     //   62: invokestatic 71	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   65: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   68: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   71: invokespecial 85	java/io/File:<init>	(Ljava/lang/String;)V
/*     */     //   74: astore_3
/*     */     //   75: aload_3
/*     */     //   76: invokevirtual 88	java/io/File:createNewFile	()Z
/*     */     //   79: pop
/*     */     //   80: goto +6 -> 86
/*     */     //   83: athrow
/*     */     //   84: astore 4
/*     */     //   86: getstatic 15	nano/spook1998/rust/data/manager/ClanManager:M	Ljava/util/List;
/*     */     //   89: aload_3
/*     */     //   90: invokeinterface 92 2 0
/*     */     //   95: aload_3
/*     */     //   96: invokestatic 98	org/bukkit/configuration/file/YamlConfiguration:loadConfiguration	(Ljava/io/File;)Lorg/bukkit/configuration/file/YamlConfiguration;
/*     */     //   99: astore 4
/*     */     //   101: new 100	java/util/ArrayList
/*     */     //   104: dup
/*     */     //   105: invokespecial 102	java/util/ArrayList:<init>	()V
/*     */     //   108: astore 5
/*     */     //   110: aload_1
/*     */     //   111: invokevirtual 105	nano/spook1998/rust/object/Clan:getUsers	()Ljava/util/List;
/*     */     //   114: invokeinterface 21 1 0
/*     */     //   119: astore 7
/*     */     //   121: pop
/*     */     //   122: aload 7
/*     */     //   124: goto +33 -> 157
/*     */     //   127: aload 7
/*     */     //   129: invokeinterface 27 1 0
/*     */     //   134: checkcast 107	nano/spook1998/rust/object/User
/*     */     //   137: astore 6
/*     */     //   139: aload 7
/*     */     //   141: aload 5
/*     */     //   143: aload 6
/*     */     //   145: invokevirtual 108	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   148: invokevirtual 109	java/lang/String:toString	()Ljava/lang/String;
/*     */     //   151: invokeinterface 92 2 0
/*     */     //   156: pop
/*     */     //   157: invokeinterface 36 1 0
/*     */     //   162: ifne -35 -> 127
/*     */     //   165: ldc 111
/*     */     //   167: aload 4
/*     */     //   169: dup_x1
/*     */     //   170: ldc 113
/*     */     //   172: ldc 115
/*     */     //   174: aload 4
/*     */     //   176: dup_x1
/*     */     //   177: ldc 117
/*     */     //   179: invokestatic 71	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   182: aload_1
/*     */     //   183: invokevirtual 79	nano/spook1998/rust/object/Clan:getName	()Ljava/lang/String;
/*     */     //   186: invokevirtual 123	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   189: invokestatic 71	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   192: aload_1
/*     */     //   193: invokevirtual 126	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
/*     */     //   196: invokevirtual 123	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   199: invokestatic 71	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   202: aload_1
/*     */     //   203: invokevirtual 130	nano/spook1998/rust/object/Clan:getOwner	()Lnano/spook1998/rust/object/User;
/*     */     //   206: invokevirtual 108	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   209: invokevirtual 123	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   212: invokestatic 71	nano/spook1998/rust/data/manager/ClanManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   215: aload 5
/*     */     //   217: invokevirtual 123	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   220: aload 4
/*     */     //   222: aload_3
/*     */     //   223: invokevirtual 133	org/bukkit/configuration/file/FileConfiguration:save	(Ljava/io/File;)V
/*     */     //   226: aload_2
/*     */     //   227: goto +6 -> 233
/*     */     //   230: astore 6
/*     */     //   232: aload_2
/*     */     //   233: invokeinterface 36 1 0
/*     */     //   238: ifne -220 -> 18
/*     */     //   241: return
/*     */     // Line number table:
/*     */     //   Java source line #47	-> byte code offset #0
/*     */     //   Java source line #113	-> byte code offset #4
/*     */     //   Java source line #110	-> byte code offset #28
/*     */     //   Java source line #141	-> byte code offset #75
/*     */     //   Java source line #180	-> byte code offset #80
/*     */     //   Java source line #24	-> byte code offset #86
/*     */     //   Java source line #194	-> byte code offset #95
/*     */     //   Java source line #142	-> byte code offset #101
/*     */     //   Java source line #3	-> byte code offset #110
/*     */     //   Java source line #160	-> byte code offset #141
/*     */     //   Java source line #3	-> byte code offset #157
/*     */     //   Java source line #72	-> byte code offset #165
/*     */     //   Java source line #5	-> byte code offset #189
/*     */     //   Java source line #86	-> byte code offset #199
/*     */     //   Java source line #29	-> byte code offset #212
/*     */     //   Java source line #193	-> byte code offset #220
/*     */     //   Java source line #60	-> byte code offset #227
/*     */     //   Java source line #113	-> byte code offset #232
/*     */     //   Java source line #175	-> byte code offset #241
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	242	0	a	ClanManager
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   75	80	84	java/io/IOException
/*     */     //   220	226	230	java/io/IOException
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp15_14 = 2;
/*     */     int tmp21_20 = 4;
/*     */     int tmp29_26 = a.length();
/*     */     int tmp33_32 = 1;
/*     */     tmp33_32;
/*     */     int j;
/*     */     int ? = tmp33_32;
/*     */     int k = tmp29_26;
/*     */     (j = new char[tmp29_26] - 1);
/*     */     int i = tmp21_20 << tmp21_20 ^ 0x1;
/*     */     if (((0x3 ^ 0x5) << 4 ^ tmp15_14 << tmp15_14 ^ 0x3) >= 0)
/*     */     {
/*     */       int tmp52_51 = j;
/*     */       j--;
/*     */       ?[tmp52_51] = ((char)(a.charAt(tmp52_51) ^ i));
/*     */       int tmp73_70 = (j--);
/*     */       ?[tmp73_70] = ((char)(a.charAt(tmp73_70) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\data\manager\ClanManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */