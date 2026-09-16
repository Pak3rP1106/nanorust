/*     */ package nano.spook1998.rust.data.manager;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.NanoRust;
/*     */ import nano.spook1998.rust.object.Region;
/*     */ import nano.spook1998.rust.utils.LocationUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.command.ConsoleCommandSender;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ 
/*     */ public class RegionManager
/*     */ {
/*     */   private static RegionManager M;
/*     */   private static List<File> b;
/*     */   private static String ALLATORIxDEMO;
/*     */   
/*     */   /* Error */
/*     */   public void save()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial 246	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	()V
/*     */     //   4: invokestatic 252	nano/spook1998/rust/object/utils/RegionUtil:getRegions	()Ljava/util/List;
/*     */     //   7: invokeinterface 93 1 0
/*     */     //   12: dup
/*     */     //   13: astore_2
/*     */     //   14: goto +136 -> 150
/*     */     //   17: athrow
/*     */     //   18: aload_2
/*     */     //   19: invokeinterface 99 1 0
/*     */     //   24: checkcast 162	nano/spook1998/rust/object/Region
/*     */     //   27: astore_1
/*     */     //   28: new 50	java/io/File
/*     */     //   31: dup
/*     */     //   32: new 37	java/lang/StringBuilder
/*     */     //   35: dup
/*     */     //   36: getstatic 70	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   39: invokestatic 255	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   42: invokespecial 256	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   45: ldc_w 258
/*     */     //   48: invokestatic 61	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   51: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   54: aload_0
/*     */     //   55: invokespecial 260	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	()Ljava/lang/String;
/*     */     //   58: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   61: ldc_w 262
/*     */     //   64: invokestatic 61	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   67: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   70: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   73: invokespecial 78	java/io/File:<init>	(Ljava/lang/String;)V
/*     */     //   76: astore_3
/*     */     //   77: aload_3
/*     */     //   78: invokevirtual 265	java/io/File:createNewFile	()Z
/*     */     //   81: pop
/*     */     //   82: goto +6 -> 88
/*     */     //   85: athrow
/*     */     //   86: astore 4
/*     */     //   88: getstatic 75	nano/spook1998/rust/data/manager/RegionManager:b	Ljava/util/List;
/*     */     //   91: aload_3
/*     */     //   92: invokeinterface 109 2 0
/*     */     //   97: aload_3
/*     */     //   98: invokestatic 131	org/bukkit/configuration/file/YamlConfiguration:loadConfiguration	(Ljava/io/File;)Lorg/bukkit/configuration/file/YamlConfiguration;
/*     */     //   101: astore 4
/*     */     //   103: ldc -85
/*     */     //   105: aload 4
/*     */     //   107: dup_x1
/*     */     //   108: ldc -123
/*     */     //   110: invokestatic 61	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   113: aload_1
/*     */     //   114: invokevirtual 266	nano/spook1998/rust/object/Region:getLocation	()Lorg/bukkit/Location;
/*     */     //   117: invokestatic 270	nano/spook1998/rust/utils/LocationUtil:LocationToString	(Lorg/bukkit/Location;)Ljava/lang/String;
/*     */     //   120: invokevirtual 276	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   123: invokestatic 61	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   126: aload_0
/*     */     //   127: aload_1
/*     */     //   128: invokevirtual 279	nano/spook1998/rust/object/Region:getUsers	()Ljava/util/List;
/*     */     //   131: invokespecial 281	nano/spook1998/rust/data/manager/RegionManager:ALLATORIxDEMO	(Ljava/util/List;)Ljava/util/List;
/*     */     //   134: invokevirtual 276	org/bukkit/configuration/file/FileConfiguration:set	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   137: pop
/*     */     //   138: aload 4
/*     */     //   140: aload_3
/*     */     //   141: invokevirtual 284	org/bukkit/configuration/file/FileConfiguration:save	(Ljava/io/File;)V
/*     */     //   144: aload_2
/*     */     //   145: goto +5 -> 150
/*     */     //   148: astore_1
/*     */     //   149: aload_2
/*     */     //   150: invokeinterface 112 1 0
/*     */     //   155: ifne -137 -> 18
/*     */     //   158: return
/*     */     // Line number table:
/*     */     //   Java source line #180	-> byte code offset #0
/*     */     //   Java source line #56	-> byte code offset #4
/*     */     //   Java source line #24	-> byte code offset #28
/*     */     //   Java source line #142	-> byte code offset #77
/*     */     //   Java source line #3	-> byte code offset #82
/*     */     //   Java source line #89	-> byte code offset #88
/*     */     //   Java source line #72	-> byte code offset #97
/*     */     //   Java source line #5	-> byte code offset #103
/*     */     //   Java source line #86	-> byte code offset #123
/*     */     //   Java source line #163	-> byte code offset #138
/*     */     //   Java source line #193	-> byte code offset #145
/*     */     //   Java source line #56	-> byte code offset #149
/*     */     //   Java source line #21	-> byte code offset #158
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	159	0	a	RegionManager
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   77	82	86	java/io/IOException
/*     */     //   138	144	148	java/io/IOException
/*     */   }
/*     */   
/*     */   public static RegionManager getInstance()
/*     */   {
/* 113 */     if (M == null) new RegionManager();
/* 110 */     return M; }
/*     */   
/* 112 */   public void load() { Integer localInteger = Integer.valueOf(0);
/*     */     File[] arrayOfFile;
/*  70 */     int j = (arrayOfFile = new File(ALLATORIxDEMO).listFiles()).length; int i; for (goto 122; i < j;) { Object localObject = arrayOfFile[i];
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       Block localBlock = LocationUtil.StringToLocation(
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         (localObject = YamlConfiguration.loadConfiguration((File)localObject)).getString(ALLATORIxDEMO("3\024<\032+\0220\025"))).getBlock();localBlock.setType(Material.SPONGE);new Region(localBlock.getLocation())
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         .setUsers(a.g(((YamlConfiguration)localObject).getStringList(ALLATORIxDEMO("\016,\036-\b"))));localInteger = Integer.valueOf(1 + i++);localInteger.intValue();
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
/* 120 */     Bukkit.getConsoleSender().sendMessage(ChatColor.RED + ALLATORIxDEMO("\021\0321\024\r\016,\017") + ChatColor.GRAY + ALLATORIxDEMO("\001>\027>\0370\f>\025&\0307[-\0368\0220\0250\fe[") + localInteger);
/*     */   }
/*     */   
/*     */   public RegionManager()
/*     */   {
/*  13 */     M = 
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  32 */       a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */     ALLATORIxDEMO = NanoRust.getInstance().getDataFolder().getAbsoluteFile() + ALLATORIxDEMO("Tp):\0346\0241\b");
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     b = new ArrayList();
/*     */     File localFile;
/*  73 */     if (!(localFile = new File(ALLATORIxDEMO)).exists())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       localFile.mkdir();
/*     */     }
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp9_8 = 2;
/*     */     int tmp27_24 = a.length();
/*     */     int tmp31_30 = 1;
/*     */     tmp31_30;
/*     */     int j;
/*     */     int ? = tmp31_30;
/*     */     int k = tmp27_24;
/*     */     int tmp41_37 = (j = new char[tmp27_24] - 1);
/*     */     tmp41_37;
/*     */     int i = 5 << 4 ^ 3 << 2 ^ 0x3;
/*     */     ((0x2 ^ 0x5) << 4 ^ tmp9_8 << tmp9_8 ^ 0x3);
/*     */     if (tmp41_37 >= 0)
/*     */     {
/*     */       int tmp51_50 = j;
/*     */       j--;
/*     */       ?[tmp51_50] = ((char)(a.charAt(tmp51_50) ^ i));
/*     */       int tmp72_69 = (j--);
/*     */       ?[tmp72_69] = ((char)(a.charAt(tmp72_69) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\data\manager\RegionManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */