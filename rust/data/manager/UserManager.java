/*     */ package nano.spook1998.rust.data.manager;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.NanoRust;
/*     */ import nano.spook1998.rust.object.User;
/*     */ import nano.spook1998.rust.object.utils.UserUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
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
/*     */ 
/*     */ public class UserManager
/*     */ {
/*     */   private static UserManager M;
/*     */   private static List<File> b;
/*     */   private static String ALLATORIxDEMO;
/*     */   
/*     */   public UserManager()
/*     */   {
/* 119 */     M = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */     ALLATORIxDEMO = NanoRust.getInstance().getDataFolder().getAbsoluteFile() + ALLATORIxDEMO("R%(y\030x\016");b = new ArrayList();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  91 */     Integer localInteger = Integer.valueOf(0);
/*     */     File[] arrayOfFile;
/*  39 */     int j = (arrayOfFile = new File(ALLATORIxDEMO).listFiles()).length; int i; for (goto 199; i < j;) { Object localObject = arrayOfFile[i]; Object 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         tmp46_45 = localObject;localObject = YamlConfiguration.loadConfiguration(tmp46_45);User localUser = UserUtil.get(tmp46_45.getName().replace(ALLATORIxDEMO("$\004g\021"), "").replace(ALLATORIxDEMO("]"), ""));Iterator localIterator = ((YamlConfiguration)localObject).getStringList(ALLATORIxDEMO("y\036b\030g\034~\016")).iterator();b.add(localObject);
/*  18 */       for (goto 127; localIterator.hasNext();) { String str = (String)localIterator.next();
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         localUser.addSchemat(Material.getMaterial(str));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */       User tmp141_139 = localUser; Object tmp147_146 = localObject;localUser.setPoints(Integer.valueOf(tmp147_146.getInt(ALLATORIxDEMO("z\022c\023~\016"))));tmp141_139.setKill(Integer.valueOf(tmp147_146.getInt(ALLATORIxDEMO("a\024f\021"))));tmp141_139.setDeath(Integer.valueOf(((YamlConfiguration)localObject).getInt(ALLATORIxDEMO("\031o\034~\025"))));localInteger = Integer.valueOf(1 + i++);
/*     */     }
/*  71 */     Bukkit.getConsoleSender().sendMessage(ChatColor.RED + ALLATORIxDEMO("D\034d\022X\by\t") + ChatColor.GRAY + ALLATORIxDEMO("*\007k\021k\031e\nk\023s\036b]\007s\ta\022}\023c\026e\n0]") + localInteger);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static UserManager getInstance()
/*     */   {
/* 182 */     if (M == null) new UserManager(); return M;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void save()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial 183	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	()V
/*     */     //   4: invokestatic 187	nano/spook1998/rust/object/utils/UserUtil:getUsers	()Ljava/util/List;
/*     */     //   7: invokeinterface 21 1 0
/*     */     //   12: dup
/*     */     //   13: astore_2
/*     */     //   14: goto +227 -> 241
/*     */     //   17: athrow
/*     */     //   18: aload_2
/*     */     //   19: invokeinterface 27 1 0
/*     */     //   24: checkcast 105	nano/spook1998/rust/object/User
/*     */     //   27: dup
/*     */     //   28: astore_1
/*     */     //   29: invokevirtual 191	nano/spook1998/rust/object/User:getHumanBuilder	()Lnano/spook1998/rust/utils/HumanBuilder;
/*     */     //   32: ifnull +10 -> 42
/*     */     //   35: aload_1
/*     */     //   36: invokevirtual 192	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   39: invokestatic 197	nano/spook1998/rust/utils/HumanUtil:spawnDespawn	(Ljava/lang/String;)V
/*     */     //   42: new 29	java/io/File
/*     */     //   45: dup
/*     */     //   46: new 141	java/lang/StringBuilder
/*     */     //   49: dup
/*     */     //   50: getstatic 48	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   53: invokestatic 200	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   56: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   59: ldc -53
/*     */     //   61: invokestatic 75	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   67: aload_1
/*     */     //   68: invokevirtual 192	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   71: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   74: ldc 72
/*     */     //   76: invokestatic 75	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   79: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   82: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   85: invokespecial 52	java/io/File:<init>	(Ljava/lang/String;)V
/*     */     //   88: astore_3
/*     */     //   89: aload_3
/*     */     //   90: invokevirtual 206	java/io/File:createNewFile	()Z
/*     */     //   93: pop
/*     */     //   94: goto +6 -> 100
/*     */     //   97: athrow
/*     */     //   98: astore 4
/*     */     //   100: getstatic 15	nano/spook1998/rust/data/manager/UserManager:b	Ljava/util/List;
/*     */     //   103: aload_3
/*     */     //   104: invokeinterface 60 2 0
/*     */     //   109: aload_3
/*     */     //   110: invokestatic 66	org/bukkit/configuration/file/YamlConfiguration:loadConfiguration	(Ljava/io/File;)Lorg/bukkit/configuration/file/YamlConfiguration;
/*     */     //   113: astore 4
/*     */     //   115: new 208	java/util/ArrayList
/*     */     //   118: dup
/*     */     //   119: invokespecial 209	java/util/ArrayList:<init>	()V
/*     */     //   122: astore 5
/*     */     //   124: aload_1
/*     */     //   125: invokevirtual 212	nano/spook1998/rust/object/User:getSchemats	()Ljava/util/List;
/*     */     //   128: invokeinterface 21 1 0
/*     */     //   133: astore 7
/*     */     //   135: pop
/*     */     //   136: aload 7
/*     */     //   138: goto +30 -> 168
/*     */     //   141: aload 7
/*     */     //   143: invokeinterface 27 1 0
/*     */     //   148: checkcast 99	org/bukkit/Material
/*     */     //   151: astore 6
/*     */     //   153: aload 7
/*     */     //   155: aload 5
/*     */     //   157: aload 6
/*     */     //   159: invokevirtual 213	org/bukkit/Material:toString	()Ljava/lang/String;
/*     */     //   162: invokeinterface 60 2 0
/*     */     //   167: pop
/*     */     //   168: invokeinterface 36 1 0
/*     */     //   173: ifne -32 -> 141
/*     */     //   176: ldc 113
/*     */     //   178: aload 4
/*     */     //   180: dup_x1
/*     */     //   181: ldc 111
/*     */     //   183: ldc 115
/*     */     //   185: aload 4
/*     */     //   187: dup_x1
/*     */     //   188: ldc 93
/*     */     //   190: invokestatic 75	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   193: aload 5
/*     */     //   195: invokevirtual 219	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   198: invokestatic 75	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   201: aload_1
/*     */     //   202: invokevirtual 223	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
/*     */     //   205: invokevirtual 219	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   208: invokestatic 75	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   211: aload_1
/*     */     //   212: invokevirtual 226	nano/spook1998/rust/object/User:getDeath	()Ljava/lang/Integer;
/*     */     //   215: invokevirtual 219	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   218: invokestatic 75	nano/spook1998/rust/data/manager/UserManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   221: aload_1
/*     */     //   222: invokevirtual 229	nano/spook1998/rust/object/User:getKill	()Ljava/lang/Integer;
/*     */     //   225: invokevirtual 219	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   228: aload 4
/*     */     //   230: aload_3
/*     */     //   231: invokevirtual 232	org/bukkit/configuration/file/FileConfiguration:save	(Ljava/io/File;)V
/*     */     //   234: aload_2
/*     */     //   235: goto +6 -> 241
/*     */     //   238: astore 6
/*     */     //   240: aload_2
/*     */     //   241: invokeinterface 36 1 0
/*     */     //   246: ifne -228 -> 18
/*     */     //   249: return
/*     */     // Line number table:
/*     */     //   Java source line #47	-> byte code offset #0
/*     */     //   Java source line #113	-> byte code offset #4
/*     */     //   Java source line #110	-> byte code offset #29
/*     */     //   Java source line #68	-> byte code offset #35
/*     */     //   Java source line #180	-> byte code offset #42
/*     */     //   Java source line #24	-> byte code offset #89
/*     */     //   Java source line #194	-> byte code offset #94
/*     */     //   Java source line #3	-> byte code offset #100
/*     */     //   Java source line #160	-> byte code offset #109
/*     */     //   Java source line #89	-> byte code offset #115
/*     */     //   Java source line #72	-> byte code offset #124
/*     */     //   Java source line #5	-> byte code offset #155
/*     */     //   Java source line #72	-> byte code offset #168
/*     */     //   Java source line #29	-> byte code offset #176
/*     */     //   Java source line #163	-> byte code offset #198
/*     */     //   Java source line #193	-> byte code offset #208
/*     */     //   Java source line #60	-> byte code offset #218
/*     */     //   Java source line #21	-> byte code offset #228
/*     */     //   Java source line #175	-> byte code offset #235
/*     */     //   Java source line #113	-> byte code offset #240
/*     */     //   Java source line #158	-> byte code offset #249
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	250	0	a	UserManager
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   89	94	98	java/io/IOException
/*     */     //   228	234	238	java/io/IOException
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp31_28 = a.length();
/*     */     int tmp35_34 = 1;
/*     */     tmp35_34;
/*     */     int j;
/*     */     int ? = tmp35_34;
/*     */     int k = tmp31_28;
/*     */     (j = new char[tmp31_28] - 1);
/*     */     int i = 1 << 3 ^ 0x2;
/*     */     if (((0x3 ^ 0x5) << 4 ^ (0x3 ^ 0x5) << 1) >= 0)
/*     */     {
/*     */       int tmp54_53 = j;
/*     */       j--;
/*     */       ?[tmp54_53] = ((char)(a.charAt(tmp54_53) ^ i));
/*     */       int tmp75_72 = (j--);
/*     */       ?[tmp75_72] = ((char)(a.charAt(tmp75_72) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\data\manager\UserManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */