/*     */ package nano.spook1998.rust.object;
/*     */ 
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.util.UUID;
/*     */ import org.bukkit.OfflinePlayer;
/*     */ 
/*     */ @org.bukkit.configuration.serialization.SerializableAs("Player")
/*     */ public class OfflineUser implements OfflinePlayer, org.bukkit.configuration.serialization.ConfigurationSerializable
/*     */ {
/*     */   private static int D;
/*     */   private String M;
/*     */   private GameProfile b;
/*     */   private UUID ALLATORIxDEMO;
/*     */   
/*     */   public boolean isWhitelisted()
/*     */   {
/*  17 */     return org.bukkit.Bukkit.getWhitelistedPlayers().contains(a);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  27 */   public void setBanned(boolean a) { a.getReal().setBanned(a); }
/*  28 */   public GameProfile getProfile() { return a.b; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public OfflinePlayer getReal()
/*     */   {
/*  43 */     return org.bukkit.Bukkit.getOfflinePlayer(a.getName());
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
/*  61 */   public org.bukkit.Location getBedSpawnLocation() { return a.getReal().getBedSpawnLocation(); }
/*  62 */   public String toString() { return a.getClass().getSimpleName() + ALLATORIxDEMO("`2n.Z") + a.b.getId() + ALLATORIxDEMO(":"); }
/*     */   
/*     */ 
/*     */   public String getName()
/*     */   {
/*  67 */     return a.M;
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
/*     */   public void setOp(boolean a)
/*     */   {
/*  80 */     a.getReal().setOp(a);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public org.bukkit.Server getServer()
/*     */   {
/*  87 */     return org.bukkit.Bukkit.getServer();
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
/*     */   public void setWhitelisted(boolean a)
/*     */   {
/* 121 */     org.bukkit.Bukkit.getWhitelistedPlayers().add(a);
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
/*     */   public UUID getUniqueId()
/*     */   {
/* 137 */     return a.ALLATORIxDEMO;
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
/*     */   public OfflineUser(String a)
/*     */   {
/* 155 */     a.M = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     a;a.<init>(ALLATORIxDEMO("t\001]\013R\t^7W\006B\002I]"));new java/lang/StringBuilder.ALLATORIxDEMO = UUID.nameUUIDFromBytes(a.getBytes(com.google.common.base.Charsets.UTF_8));a.ALLATORIxDEMO();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 182 */       if (D == 1)
/*     */       {
/*  77 */         int tmp63_62 = 1;tmp63_62; int tmp65_63 = tmp63_62;tmp65_63[0] = 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           String.class; int tmp70_65 = tmp65_63;tmp70_65[1] = String.class; int tmp83_82 = 1;tmp83_82; int tmp85_83 = tmp83_82;tmp85_83[0] = 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */           a.ALLATORIxDEMO.toString(); int tmp95_85 = tmp85_83;tmp95_85[1] = a;new Class[2].getConstructor(tmp70_65).b = ((GameProfile)new Object[2].newInstance(tmp95_85));return;throw GameProfile.class;
/*     */       }
/*  68 */       if (D != 2) {
/*     */         return;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       int tmp125_124 = 1;tmp125_124; int tmp127_125 = tmp125_124;tmp127_125[0] = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */         UUID.class; int tmp132_127 = tmp127_125;tmp132_127[1] = String.class; int tmp145_144 = 1;tmp145_144; int tmp147_145 = tmp145_144;tmp147_145[0] = a.ALLATORIxDEMO; int tmp154_147 = tmp147_145;tmp154_147[1] = a;new Class[2].getConstructor(tmp132_127).b = ((GameProfile)new Object[2].newInstance(tmp154_147)); return;
/*     */     }
/*     */     catch (Exception a)
/*     */     {
/*   3 */       a.printStackTrace();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */     throw GameProfile.class;
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
/*     */   public boolean isOp()
/*     */   {
/* 181 */     return a.getReal().isOp();
/*     */   }
/*     */   
/*     */   public java.util.Map<String, Object> serialize()
/*     */   {
/*     */     java.util.LinkedHashMap localLinkedHashMap;
/* 163 */     localLinkedHashMap.put(ALLATORIxDEMO("U\006V\002"), a.b.getName());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */     return (java.util.Map<String, Object>)(localLinkedHashMap = new java.util.LinkedHashMap()).put(ALLATORIxDEMO("n2r#"), a.b.getId().toString());
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public long getFirstPlayed()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 26	nano/spook1998/rust/object/OfflineUser:getPlayer	()Lorg/bukkit/entity/Player;
/*     */     //   4: dup
/*     */     //   5: astore_1
/*     */     //   6: ifnull +11 -> 17
/*     */     //   9: aload_1
/*     */     //   10: invokeinterface 30 1 0
/*     */     //   15: lreturn
/*     */     //   16: athrow
/*     */     //   17: lconst_0
/*     */     //   18: lreturn
/*     */     // Line number table:
/*     */     //   Java source line #44	-> byte code offset #0
/*     */     //   Java source line #52	-> byte code offset #6
/*     */     //   Java source line #114	-> byte code offset #9
/*     */     //   Java source line #185	-> byte code offset #17
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	19	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public org.bukkit.entity.Player getPlayer()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 38	nano/spook1998/rust/object/OfflineUser:getName	()Ljava/lang/String;
/*     */     //   4: ifnonnull +6 -> 10
/*     */     //   7: aconst_null
/*     */     //   8: areturn
/*     */     //   9: athrow
/*     */     //   10: aload_0
/*     */     //   11: invokevirtual 38	nano/spook1998/rust/object/OfflineUser:getName	()Ljava/lang/String;
/*     */     //   14: invokestatic 43	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   17: areturn
/*     */     // Line number table:
/*     */     //   Java source line #131	-> byte code offset #0
/*     */     //   Java source line #136	-> byte code offset #7
/*     */     //   Java source line #143	-> byte code offset #10
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	18	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public int hashCode()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_5
/*     */     //   1: istore_1
/*     */     //   2: bipush 97
/*     */     //   4: iload_1
/*     */     //   5: imul
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual 65	nano/spook1998/rust/object/OfflineUser:getUniqueId	()Ljava/util/UUID;
/*     */     //   10: ifnull +14 -> 24
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual 65	nano/spook1998/rust/object/OfflineUser:getUniqueId	()Ljava/util/UUID;
/*     */     //   17: invokevirtual 69	java/util/UUID:hashCode	()I
/*     */     //   20: goto +5 -> 25
/*     */     //   23: athrow
/*     */     //   24: iconst_0
/*     */     //   25: iadd
/*     */     //   26: dup
/*     */     //   27: istore_1
/*     */     //   28: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #69	-> byte code offset #0
/*     */     //   Java source line #118	-> byte code offset #2
/*     */     //   Java source line #49	-> byte code offset #28
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	29	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean hasPlayedBefore()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 73	nano/spook1998/rust/object/OfflineUser:getLastPlayed	()J
/*     */     //   4: lconst_0
/*     */     //   5: lcmp
/*     */     //   6: ifeq +6 -> 12
/*     */     //   9: iconst_1
/*     */     //   10: ireturn
/*     */     //   11: athrow
/*     */     //   12: iconst_0
/*     */     //   13: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #175	-> byte code offset #0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	14	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static OfflinePlayer deserialize(java.util.Map<String, Object> a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 92
/*     */     //   3: invokestatic 95	nano/spook1998/rust/object/OfflineUser:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   6: invokeinterface 101 2 0
/*     */     //   11: ifnonnull +6 -> 17
/*     */     //   14: aconst_null
/*     */     //   15: areturn
/*     */     //   16: athrow
/*     */     //   17: new 2	nano/spook1998/rust/object/OfflineUser
/*     */     //   20: dup
/*     */     //   21: aload_0
/*     */     //   22: ldc 92
/*     */     //   24: invokestatic 95	nano/spook1998/rust/object/OfflineUser:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   27: invokeinterface 101 2 0
/*     */     //   32: checkcast 103	java/lang/String
/*     */     //   35: invokespecial 107	nano/spook1998/rust/object/OfflineUser:<init>	(Ljava/lang/String;)V
/*     */     //   38: areturn
/*     */     // Line number table:
/*     */     //   Java source line #153	-> byte code offset #0
/*     */     //   Java source line #82	-> byte code offset #14
/*     */     //   Java source line #156	-> byte code offset #17
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	a	java.util.Map
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public long getLastPlayed()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 26	nano/spook1998/rust/object/OfflineUser:getPlayer	()Lorg/bukkit/entity/Player;
/*     */     //   4: dup
/*     */     //   5: astore_1
/*     */     //   6: ifnull +11 -> 17
/*     */     //   9: aload_1
/*     */     //   10: invokeinterface 109 1 0
/*     */     //   15: lreturn
/*     */     //   16: athrow
/*     */     //   17: lconst_0
/*     */     //   18: lreturn
/*     */     // Line number table:
/*     */     //   Java source line #103	-> byte code offset #0
/*     */     //   Java source line #115	-> byte code offset #6
/*     */     //   Java source line #178	-> byte code offset #9
/*     */     //   Java source line #83	-> byte code offset #17
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	19	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean isOnline()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 26	nano/spook1998/rust/object/OfflineUser:getPlayer	()Lorg/bukkit/entity/Player;
/*     */     //   4: ifnull +6 -> 10
/*     */     //   7: iconst_1
/*     */     //   8: ireturn
/*     */     //   9: athrow
/*     */     //   10: iconst_0
/*     */     //   11: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #124	-> byte code offset #0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	12	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean equals(Object a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof 6
/*     */     //   4: ifeq +21 -> 25
/*     */     //   7: aload_1
/*     */     //   8: checkcast 6	org/bukkit/OfflinePlayer
/*     */     //   11: invokeinterface 188 1 0
/*     */     //   16: aload_0
/*     */     //   17: invokevirtual 38	nano/spook1998/rust/object/OfflineUser:getName	()Ljava/lang/String;
/*     */     //   20: invokevirtual 192	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*     */     //   23: ireturn
/*     */     //   24: athrow
/*     */     //   25: iconst_0
/*     */     //   26: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #58	-> byte code offset #0
/*     */     //   Java source line #1	-> byte code offset #7
/*     */     //   Java source line #107	-> byte code offset #25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	27	0	a	OfflineUser
/*     */     //   0	27	1	a	Object
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean isBanned()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 38	nano/spook1998/rust/object/OfflineUser:getName	()Ljava/lang/String;
/*     */     //   4: ifnonnull +6 -> 10
/*     */     //   7: iconst_0
/*     */     //   8: ireturn
/*     */     //   9: athrow
/*     */     //   10: invokestatic 202	org/bukkit/Bukkit:getServer	()Lorg/bukkit/Server;
/*     */     //   13: invokeinterface 207 1 0
/*     */     //   18: aload_0
/*     */     //   19: invokeinterface 59 2 0
/*     */     //   24: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #128	-> byte code offset #0
/*     */     //   Java source line #191	-> byte code offset #7
/*     */     //   Java source line #126	-> byte code offset #10
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	25	0	a	OfflineUser
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp25_22 = a.length();
/*     */     int tmp29_28 = 1;
/*     */     tmp29_28;
/*     */     int j;
/*     */     int ? = tmp29_28;
/*     */     int k = tmp25_22;
/*     */     (j = new char[tmp25_22] - 1);
/*     */     int i = (0x2 ^ 0x5) << 3 ^ 0x3;
/*     */     if ((5 << 3 ^ 0x5) >= 0)
/*     */     {
/*     */       int tmp48_47 = j;
/*     */       j--;
/*     */       ?[tmp48_47] = ((char)(a.charAt(tmp48_47) ^ i));
/*     */       int tmp69_66 = (j--);
/*     */       ?[tmp69_66] = ((char)(a.charAt(tmp69_66) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\OfflineUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */