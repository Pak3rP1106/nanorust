/*     */ package nano.spook1998.rust.data;
/*     */ 
/*     */ import org.bukkit.scheduler.BukkitRunnable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LicenseSystem
/*     */   extends BukkitRunnable
/*     */ {
/*  38 */   private static String ALLATORIxDEMO = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */   private static String b = null;
/*     */   
/*     */   /* Error */
/*     */   public void run()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 58	nano/spook1998/rust/data/LicenseSystem:b	Ljava/lang/String;
/*     */     //   3: ifnonnull +7 -> 10
/*     */     //   6: aload_0
/*     */     //   7: invokespecial 61	nano/spook1998/rust/data/LicenseSystem:g	()V
/*     */     //   10: getstatic 63	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   13: ifnonnull +7 -> 20
/*     */     //   16: aload_0
/*     */     //   17: invokespecial 66	nano/spook1998/rust/data/LicenseSystem:c	()V
/*     */     //   20: new 17	java/lang/StringBuilder
/*     */     //   23: dup
/*     */     //   24: invokespecial 21	java/lang/StringBuilder:<init>	()V
/*     */     //   27: astore_1
/*     */     //   28: new 68	java/net/URL
/*     */     //   31: dup
/*     */     //   32: getstatic 58	nano/spook1998/rust/data/LicenseSystem:b	Ljava/lang/String;
/*     */     //   35: invokespecial 70	java/net/URL:<init>	(Ljava/lang/String;)V
/*     */     //   38: invokevirtual 74	java/net/URL:openConnection	()Ljava/net/URLConnection;
/*     */     //   41: astore_2
/*     */     //   42: new 76	java/io/BufferedReader
/*     */     //   45: dup
/*     */     //   46: new 78	java/io/InputStreamReader
/*     */     //   49: dup
/*     */     //   50: aload_2
/*     */     //   51: invokevirtual 84	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
/*     */     //   54: invokespecial 87	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
/*     */     //   57: invokespecial 90	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
/*     */     //   60: dup
/*     */     //   61: astore_3
/*     */     //   62: goto +12 -> 74
/*     */     //   65: athrow
/*     */     //   66: aload_1
/*     */     //   67: aload 4
/*     */     //   69: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   72: pop
/*     */     //   73: aload_3
/*     */     //   74: invokevirtual 93	java/io/BufferedReader:readLine	()Ljava/lang/String;
/*     */     //   77: dup
/*     */     //   78: astore 4
/*     */     //   80: ifnonnull -14 -> 66
/*     */     //   83: aload_3
/*     */     //   84: invokevirtual 96	java/io/BufferedReader:close	()V
/*     */     //   87: aload_0
/*     */     //   88: goto +20 -> 108
/*     */     //   91: athrow
/*     */     //   92: astore_2
/*     */     //   93: aload_0
/*     */     //   94: dup
/*     */     //   95: ldc 98
/*     */     //   97: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   100: invokespecial 100	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   103: invokespecial 102	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	()V
/*     */     //   106: return
/*     */     //   107: athrow
/*     */     //   108: aload_1
/*     */     //   109: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   112: invokespecial 105	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Lorg/json/simple/JSONObject;
/*     */     //   115: dup
/*     */     //   116: astore_2
/*     */     //   117: ifnonnull +4 -> 121
/*     */     //   120: return
/*     */     //   121: aload_2
/*     */     //   122: ldc 107
/*     */     //   124: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   127: invokevirtual 113	org/json/simple/JSONObject:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   130: invokevirtual 116	java/lang/Object:toString	()Ljava/lang/String;
/*     */     //   133: getstatic 63	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   136: invokevirtual 122	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*     */     //   139: ifne +44 -> 183
/*     */     //   142: aload_0
/*     */     //   143: dup
/*     */     //   144: ldc 124
/*     */     //   146: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   149: invokespecial 100	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   152: new 17	java/lang/StringBuilder
/*     */     //   155: aload_0
/*     */     //   156: dup_x2
/*     */     //   157: dup
/*     */     //   158: pop2
/*     */     //   159: dup
/*     */     //   160: ldc 126
/*     */     //   162: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   165: invokespecial 127	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   168: getstatic 63	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   171: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   174: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   177: invokespecial 100	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   180: invokespecial 102	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	()V
/*     */     //   183: aload_2
/*     */     //   184: ldc -127
/*     */     //   186: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   189: invokevirtual 113	org/json/simple/JSONObject:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   192: invokevirtual 116	java/lang/Object:toString	()Ljava/lang/String;
/*     */     //   195: invokevirtual 132	java/lang/String:toLowerCase	()Ljava/lang/String;
/*     */     //   198: ldc -122
/*     */     //   200: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   203: invokevirtual 122	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*     */     //   206: ifne +16 -> 222
/*     */     //   209: aload_0
/*     */     //   210: dup
/*     */     //   211: ldc -120
/*     */     //   213: invokestatic 36	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   216: invokespecial 100	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	(Ljava/lang/String;)V
/*     */     //   219: invokespecial 102	nano/spook1998/rust/data/LicenseSystem:ALLATORIxDEMO	()V
/*     */     //   222: return
/*     */     // Line number table:
/*     */     //   Java source line #78	-> byte code offset #0
/*     */     //   Java source line #93	-> byte code offset #10
/*     */     //   Java source line #119	-> byte code offset #20
/*     */     //   Java source line #96	-> byte code offset #28
/*     */     //   Java source line #92	-> byte code offset #42
/*     */     //   Java source line #13	-> byte code offset #62
/*     */     //   Java source line #155	-> byte code offset #66
/*     */     //   Java source line #13	-> byte code offset #73
/*     */     //   Java source line #73	-> byte code offset #83
/*     */     //   Java source line #182	-> byte code offset #93
/*     */     //   Java source line #77	-> byte code offset #103
/*     */     //   Java source line #104	-> byte code offset #106
/*     */     //   Java source line #113	-> byte code offset #107
/*     */     //   Java source line #110	-> byte code offset #117
/*     */     //   Java source line #68	-> byte code offset #121
/*     */     //   Java source line #141	-> byte code offset #142
/*     */     //   Java source line #180	-> byte code offset #152
/*     */     //   Java source line #56	-> byte code offset #180
/*     */     //   Java source line #194	-> byte code offset #183
/*     */     //   Java source line #142	-> byte code offset #209
/*     */     //   Java source line #3	-> byte code offset #219
/*     */     //   Java source line #72	-> byte code offset #222
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	223	0	a	LicenseSystem
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	65	92	java/io/IOException
/*     */     //   66	87	92	java/io/IOException
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp21_18 = a.length();
/*     */     int tmp25_24 = 1;
/*     */     tmp25_24;
/*     */     int j;
/*     */     int ? = tmp25_24;
/*     */     int k = tmp21_18;
/*     */     (j = new char[tmp21_18] - 1);
/*     */     int i = 5 << 4;
/*     */     if (((0x2 ^ 0x5) << 4 ^ 0x2 ^ 0x5) >= 0)
/*     */     {
/*     */       int tmp44_43 = j;
/*     */       j--;
/*     */       ?[tmp44_43] = ((char)(a.charAt(tmp44_43) ^ i));
/*     */       int tmp65_62 = (j--);
/*     */       ?[tmp65_62] = ((char)(a.charAt(tmp65_62) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\data\LicenseSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */