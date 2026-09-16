/*     */ package nano.spook1998.rust.object.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.object.Clan;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ClanUtil
/*     */ {
/* 146 */   private static List<Clan> ALLATORIxDEMO = new ArrayList();
/*     */   
/*     */   /* Error */
/*     */   public static Clan createClan(String a, String a, nano.spook1998.rust.object.User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic 79	nano/spook1998/rust/object/utils/ClanUtil:getByTag	(Ljava/lang/String;)Lnano/spook1998/rust/object/Clan;
/*     */     //   4: dup
/*     */     //   5: astore_3
/*     */     //   6: ifnull +6 -> 12
/*     */     //   9: aconst_null
/*     */     //   10: areturn
/*     */     //   11: athrow
/*     */     //   12: aload_0
/*     */     //   13: invokestatic 81	nano/spook1998/rust/object/utils/ClanUtil:getByName	(Ljava/lang/String;)Lnano/spook1998/rust/object/Clan;
/*     */     //   16: dup
/*     */     //   17: astore_3
/*     */     //   18: ifnull +6 -> 24
/*     */     //   21: aconst_null
/*     */     //   22: areturn
/*     */     //   23: athrow
/*     */     //   24: new 34	nano/spook1998/rust/object/Clan
/*     */     //   27: dup
/*     */     //   28: aload_0
/*     */     //   29: aload_1
/*     */     //   30: aload_2
/*     */     //   31: invokespecial 84	nano/spook1998/rust/object/Clan:<init>	(Ljava/lang/String;Ljava/lang/String;Lnano/spook1998/rust/object/User;)V
/*     */     //   34: dup
/*     */     //   35: astore_3
/*     */     //   36: dup
/*     */     //   37: invokestatic 86	nano/spook1998/rust/object/utils/ClanUtil:addClan	(Lnano/spook1998/rust/object/Clan;)V
/*     */     //   40: areturn
/*     */     // Line number table:
/*     */     //   Java source line #182	-> byte code offset #6
/*     */     //   Java source line #77	-> byte code offset #12
/*     */     //   Java source line #104	-> byte code offset #18
/*     */     //   Java source line #47	-> byte code offset #24
/*     */     //   Java source line #113	-> byte code offset #36
/*     */     //   Java source line #110	-> byte code offset #40
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	41	0	a	String
/*     */     //   0	41	1	a	String
/*     */     //   0	41	2	a	nano.spook1998.rust.object.User
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Clan getByName(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 20	nano/spook1998/rust/object/utils/ClanUtil:getClans	()Ljava/util/List;
/*     */     //   3: invokeinterface 26 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +29 -> 39
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 32 1 0
/*     */     //   20: checkcast 34	nano/spook1998/rust/object/Clan
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokevirtual 75	nano/spook1998/rust/object/Clan:getName	()Ljava/lang/String;
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual 44	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*     */     //   32: ifeq +6 -> 38
/*     */     //   35: aload_1
/*     */     //   36: areturn
/*     */     //   37: athrow
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface 48 1 0
/*     */     //   44: ifne -30 -> 14
/*     */     //   47: aconst_null
/*     */     //   48: areturn
/*     */     // Line number table:
/*     */     //   Java source line #92	-> byte code offset #0
/*     */     //   Java source line #32	-> byte code offset #25
/*     */     //   Java source line #92	-> byte code offset #38
/*     */     //   Java source line #155	-> byte code offset #47
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	49	0	a	String
/*     */   }
/*     */   
/*     */   public static void removeClan(Clan a)
/*     */   {
/* 150 */     if (ALLATORIxDEMO.contains(a)) { ALLATORIxDEMO.remove(a);
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
/* 164 */   public static List<Clan> getClans() { return ALLATORIxDEMO; }
/*     */   
/*     */   public static void addClan(Clan a) {
/* 167 */     if (!ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.add(a);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Clan getByTag(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 20	nano/spook1998/rust/object/utils/ClanUtil:getClans	()Ljava/util/List;
/*     */     //   3: invokeinterface 26 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +29 -> 39
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 32 1 0
/*     */     //   20: checkcast 34	nano/spook1998/rust/object/Clan
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokevirtual 38	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual 44	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*     */     //   32: ifeq +6 -> 38
/*     */     //   35: aload_1
/*     */     //   36: areturn
/*     */     //   37: athrow
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface 48 1 0
/*     */     //   44: ifne -30 -> 14
/*     */     //   47: aconst_null
/*     */     //   48: areturn
/*     */     // Line number table:
/*     */     //   Java source line #171	-> byte code offset #0
/*     */     //   Java source line #78	-> byte code offset #25
/*     */     //   Java source line #171	-> byte code offset #38
/*     */     //   Java source line #119	-> byte code offset #47
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	49	0	a	String
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\ClanUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */