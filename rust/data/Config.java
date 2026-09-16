/*     */ package nano.spook1998.rust.data;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.bukkit.configuration.InvalidConfigurationException;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ 
/*     */ public class Config
/*     */ {
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp13_12 = 2;
/*     */     int tmp31_28 = a.length();
/*     */     int tmp35_34 = 1;
/*     */     tmp35_34;
/*     */     int j;
/*     */     int ? = tmp35_34;
/*     */     int k = tmp31_28;
/*     */     (j = new char[tmp31_28] - 1);
/*     */     int i = (0x2 ^ 0x5) << 4 ^ 5 << 1;
/*     */     if (((0x2 ^ 0x5) << 4 ^ tmp13_12 << tmp13_12 ^ 0x3) >= 0)
/*     */     {
/*     */       int tmp54_53 = j;
/*     */       j--;
/*     */       ?[tmp54_53] = ((char)(a.charAt(tmp54_53) ^ i));
/*     */       int tmp75_72 = (j--);
/*     */       ?[tmp75_72] = ((char)(a.charAt(tmp75_72) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static boolean save(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic 66	nano/spook1998/rust/data/Config:getConfig	(Ljava/lang/String;)Lnano/spook1998/rust/data/Config$RConfig;
/*     */     //   4: dup
/*     */     //   5: astore_1
/*     */     //   6: ifnonnull +6 -> 12
/*     */     //   9: iconst_0
/*     */     //   10: ireturn
/*     */     //   11: athrow
/*     */     //   12: aload_1
/*     */     //   13: invokevirtual 69	nano/spook1998/rust/data/Config$RConfig:save	()V
/*     */     //   16: goto +33 -> 49
/*     */     //   19: athrow
/*     */     //   20: astore_1
/*     */     //   21: new 20	java/lang/StringBuilder
/*     */     //   24: dup
/*     */     //   25: ldc 71
/*     */     //   27: invokestatic 25	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   30: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   33: aload_0
/*     */     //   34: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   37: invokevirtual 36	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   40: invokestatic 73	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   43: iconst_0
/*     */     //   44: aload_1
/*     */     //   45: invokevirtual 76	java/lang/Exception:printStackTrace	()V
/*     */     //   48: ireturn
/*     */     //   49: iconst_1
/*     */     //   50: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #89	-> byte code offset #0
/*     */     //   Java source line #72	-> byte code offset #6
/*     */     //   Java source line #86	-> byte code offset #12
/*     */     //   Java source line #29	-> byte code offset #16
/*     */     //   Java source line #163	-> byte code offset #21
/*     */     //   Java source line #193	-> byte code offset #44
/*     */     //   Java source line #60	-> byte code offset #48
/*     */     //   Java source line #21	-> byte code offset #49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	51	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	16	20	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static boolean loadAll()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   3: invokeinterface 88 1 0
/*     */     //   8: dup
/*     */     //   9: astore_1
/*     */     //   10: goto +19 -> 29
/*     */     //   13: athrow
/*     */     //   14: aload_1
/*     */     //   15: invokeinterface 94 1 0
/*     */     //   20: checkcast 7	nano/spook1998/rust/data/Config$RConfig
/*     */     //   23: astore_0
/*     */     //   24: aload_1
/*     */     //   25: aload_0
/*     */     //   26: invokevirtual 97	nano/spook1998/rust/data/Config$RConfig:load	()V
/*     */     //   29: invokeinterface 100 1 0
/*     */     //   34: ifne -20 -> 14
/*     */     //   37: goto +19 -> 56
/*     */     //   40: athrow
/*     */     //   41: astore_0
/*     */     //   42: ldc 102
/*     */     //   44: invokestatic 25	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   47: invokestatic 73	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   50: iconst_0
/*     */     //   51: aload_0
/*     */     //   52: invokevirtual 76	java/lang/Exception:printStackTrace	()V
/*     */     //   55: ireturn
/*     */     //   56: iconst_1
/*     */     //   57: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #121	-> byte code offset #0
/*     */     //   Java source line #57	-> byte code offset #25
/*     */     //   Java source line #121	-> byte code offset #29
/*     */     //   Java source line #99	-> byte code offset #37
/*     */     //   Java source line #28	-> byte code offset #42
/*     */     //   Java source line #94	-> byte code offset #51
/*     */     //   Java source line #157	-> byte code offset #55
/*     */     //   Java source line #124	-> byte code offset #56
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	13	41	java/lang/Exception
/*     */     //   14	37	41	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static RConfig getConfig(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   3: invokeinterface 88 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +29 -> 39
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 94 1 0
/*     */     //   20: checkcast 7	nano/spook1998/rust/data/Config$RConfig
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokevirtual 105	nano/spook1998/rust/data/Config$RConfig:getConfigId	()Ljava/lang/String;
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual 108	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*     */     //   32: ifeq +6 -> 38
/*     */     //   35: aload_1
/*     */     //   36: areturn
/*     */     //   37: athrow
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface 100 1 0
/*     */     //   44: ifne -30 -> 14
/*     */     //   47: aconst_null
/*     */     //   48: areturn
/*     */     // Line number table:
/*     */     //   Java source line #180	-> byte code offset #0
/*     */     //   Java source line #56	-> byte code offset #25
/*     */     //   Java source line #180	-> byte code offset #38
/*     */     //   Java source line #194	-> byte code offset #47
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	49	0	a	String
/*     */   }
/*     */   
/*     */   public static boolean unregisterConfig(String a)
/*     */   {
/* 113 */     return ALLATORIxDEMO.remove(getConfig(a));
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
/* 164 */   private static List<RConfig> ALLATORIxDEMO = new ArrayList();
/*     */   
/*     */   /* Error */
/*     */   public static boolean registerConfig(String a, String a, org.bukkit.plugin.java.JavaPlugin a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 117	java/io/File
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokevirtual 123	org/bukkit/plugin/java/JavaPlugin:getDataFolder	()Ljava/io/File;
/*     */     //   8: aload_1
/*     */     //   9: invokespecial 126	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
/*     */     //   12: dup
/*     */     //   13: astore_3
/*     */     //   14: invokevirtual 129	java/io/File:exists	()Z
/*     */     //   17: ifne +26 -> 43
/*     */     //   20: aload_3
/*     */     //   21: invokevirtual 132	java/io/File:getParentFile	()Ljava/io/File;
/*     */     //   24: invokevirtual 135	java/io/File:mkdirs	()Z
/*     */     //   27: pop
/*     */     //   28: aload_2
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual 139	org/bukkit/plugin/java/JavaPlugin:getResource	(Ljava/lang/String;)Ljava/io/InputStream;
/*     */     //   33: aload_3
/*     */     //   34: invokestatic 142	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/io/InputStream;Ljava/io/File;)V
/*     */     //   37: goto +6 -> 43
/*     */     //   40: athrow
/*     */     //   41: astore 4
/*     */     //   43: new 7	nano/spook1998/rust/data/Config$RConfig
/*     */     //   46: dup
/*     */     //   47: aload_0
/*     */     //   48: aload_3
/*     */     //   49: aconst_null
/*     */     //   50: invokespecial 145	nano/spook1998/rust/data/Config$RConfig:<init>	(Ljava/lang/String;Ljava/io/File;Lnano/spook1998/rust/data/Config$RConfig;)V
/*     */     //   53: astore 4
/*     */     //   55: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   58: invokeinterface 88 1 0
/*     */     //   63: dup
/*     */     //   64: astore_1
/*     */     //   65: goto +24 -> 89
/*     */     //   68: athrow
/*     */     //   69: aload_1
/*     */     //   70: invokeinterface 94 1 0
/*     */     //   75: checkcast 7	nano/spook1998/rust/data/Config$RConfig
/*     */     //   78: aload 4
/*     */     //   80: invokevirtual 149	nano/spook1998/rust/data/Config$RConfig:equals	(Lnano/spook1998/rust/data/Config$RConfig;)Z
/*     */     //   83: ifeq +5 -> 88
/*     */     //   86: iconst_0
/*     */     //   87: ireturn
/*     */     //   88: aload_1
/*     */     //   89: invokeinterface 100 1 0
/*     */     //   94: ifne -25 -> 69
/*     */     //   97: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   100: aload 4
/*     */     //   102: invokeinterface 152 2 0
/*     */     //   107: pop
/*     */     //   108: iconst_1
/*     */     //   109: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #171	-> byte code offset #0
/*     */     //   Java source line #93	-> byte code offset #14
/*     */     //   Java source line #119	-> byte code offset #20
/*     */     //   Java source line #170	-> byte code offset #28
/*     */     //   Java source line #32	-> byte code offset #43
/*     */     //   Java source line #13	-> byte code offset #55
/*     */     //   Java source line #155	-> byte code offset #78
/*     */     //   Java source line #13	-> byte code offset #88
/*     */     //   Java source line #182	-> byte code offset #108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	110	0	a	String
/*     */     //   0	110	1	a	String
/*     */     //   0	110	2	a	org.bukkit.plugin.java.JavaPlugin
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	37	41	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static boolean saveAll()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   3: invokeinterface 88 1 0
/*     */     //   8: dup
/*     */     //   9: astore_1
/*     */     //   10: goto +19 -> 29
/*     */     //   13: athrow
/*     */     //   14: aload_1
/*     */     //   15: invokeinterface 94 1 0
/*     */     //   20: checkcast 7	nano/spook1998/rust/data/Config$RConfig
/*     */     //   23: astore_0
/*     */     //   24: aload_1
/*     */     //   25: aload_0
/*     */     //   26: invokevirtual 69	nano/spook1998/rust/data/Config$RConfig:save	()V
/*     */     //   29: invokeinterface 100 1 0
/*     */     //   34: ifne -20 -> 14
/*     */     //   37: goto +19 -> 56
/*     */     //   40: athrow
/*     */     //   41: astore_0
/*     */     //   42: ldc -100
/*     */     //   44: invokestatic 25	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   47: invokestatic 73	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   50: iconst_0
/*     */     //   51: aload_0
/*     */     //   52: invokevirtual 76	java/lang/Exception:printStackTrace	()V
/*     */     //   55: ireturn
/*     */     //   56: iconst_1
/*     */     //   57: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #138	-> byte code offset #0
/*     */     //   Java source line #91	-> byte code offset #25
/*     */     //   Java source line #138	-> byte code offset #29
/*     */     //   Java source line #59	-> byte code offset #37
/*     */     //   Java source line #174	-> byte code offset #42
/*     */     //   Java source line #19	-> byte code offset #51
/*     */     //   Java source line #18	-> byte code offset #55
/*     */     //   Java source line #11	-> byte code offset #56
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	13	41	java/lang/Exception
/*     */     //   14	37	41	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void clear(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic 66	nano/spook1998/rust/data/Config:getConfig	(Ljava/lang/String;)Lnano/spook1998/rust/data/Config$RConfig;
/*     */     //   4: dup
/*     */     //   5: astore_1
/*     */     //   6: ifnonnull +5 -> 11
/*     */     //   9: return
/*     */     //   10: athrow
/*     */     //   11: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   14: aload_1
/*     */     //   15: invokeinterface 113 2 0
/*     */     //   20: getstatic 82	nano/spook1998/rust/data/Config:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   23: new 7	nano/spook1998/rust/data/Config$RConfig
/*     */     //   26: dup
/*     */     //   27: aload_1
/*     */     //   28: invokevirtual 105	nano/spook1998/rust/data/Config$RConfig:getConfigId	()Ljava/lang/String;
/*     */     //   31: aload_1
/*     */     //   32: invokevirtual 190	nano/spook1998/rust/data/Config$RConfig:getFile	()Ljava/io/File;
/*     */     //   35: aconst_null
/*     */     //   36: invokespecial 145	nano/spook1998/rust/data/Config$RConfig:<init>	(Ljava/lang/String;Ljava/io/File;Lnano/spook1998/rust/data/Config$RConfig;)V
/*     */     //   39: invokeinterface 152 2 0
/*     */     //   44: pop2
/*     */     //   45: return
/*     */     // Line number table:
/*     */     //   Java source line #67	-> byte code offset #0
/*     */     //   Java source line #125	-> byte code offset #6
/*     */     //   Java source line #108	-> byte code offset #11
/*     */     //   Java source line #137	-> byte code offset #20
/*     */     //   Java source line #165	-> byte code offset #45
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	46	0	a	String
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static boolean load(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic 66	nano/spook1998/rust/data/Config:getConfig	(Ljava/lang/String;)Lnano/spook1998/rust/data/Config$RConfig;
/*     */     //   4: dup
/*     */     //   5: astore_1
/*     */     //   6: ifnonnull +6 -> 12
/*     */     //   9: iconst_0
/*     */     //   10: ireturn
/*     */     //   11: athrow
/*     */     //   12: aload_1
/*     */     //   13: invokevirtual 97	nano/spook1998/rust/data/Config$RConfig:load	()V
/*     */     //   16: goto +33 -> 49
/*     */     //   19: athrow
/*     */     //   20: astore_1
/*     */     //   21: new 20	java/lang/StringBuilder
/*     */     //   24: dup
/*     */     //   25: ldc -64
/*     */     //   27: invokestatic 25	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   30: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   33: aload_0
/*     */     //   34: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   37: invokevirtual 36	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   40: invokestatic 73	nano/spook1998/rust/data/Config:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   43: iconst_0
/*     */     //   44: aload_1
/*     */     //   45: invokevirtual 76	java/lang/Exception:printStackTrace	()V
/*     */     //   48: ireturn
/*     */     //   49: iconst_1
/*     */     //   50: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #20	-> byte code offset #0
/*     */     //   Java source line #173	-> byte code offset #6
/*     */     //   Java source line #71	-> byte code offset #12
/*     */     //   Java source line #80	-> byte code offset #16
/*     */     //   Java source line #106	-> byte code offset #21
/*     */     //   Java source line #64	-> byte code offset #44
/*     */     //   Java source line #147	-> byte code offset #48
/*     */     //   Java source line #27	-> byte code offset #49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	51	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	16	20	java/lang/Exception
/*     */   }
/*     */   
/*     */   public static class RConfig
/*     */     extends YamlConfiguration
/*     */   {
/*     */     private String b;
/*     */     private File ALLATORIxDEMO;
/*     */     
/*     */     public String getConfigId()
/*     */     {
/*  15 */       return a.b;
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
/*     */     public void save()
/*     */       throws IOException
/*     */     {
/*  53 */       a.save(a.ALLATORIxDEMO);
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
/*     */     public void load()
/*     */       throws InvalidConfigurationException, FileNotFoundException, IOException
/*     */     {
/* 149 */       a.load(a.ALLATORIxDEMO);
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
/* 181 */     public File getFile() { return a.ALLATORIxDEMO; }
/*     */     
/* 183 */     public boolean equals(RConfig a) { return a.getConfigId().equalsIgnoreCase(a.b); }
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\data\Config.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */