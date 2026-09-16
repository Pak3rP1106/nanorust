/*     */ package nano.spook1998.rust.utils.tablist.v1_7;
/*     */ 
/*     */ import nano.spook1998.rust.object.User;
/*     */ 
/*     */ public class Tablist {
/*     */   private String[] f;
/*     */   private boolean D;
/*     */   
/*     */   public boolean getInit() {
/*  10 */     return a.D;
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
/*     */   private String[] M;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private String[] b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final User ALLATORIxDEMO;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String[] getSuffix()
/*     */   {
/* 114 */     return (String[])a.b.clone();
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
/*     */   public void init(boolean a)
/*     */   {
/* 136 */     a.D = a;
/*     */   }
/*     */   
/*     */   public Tablist(User a)
/*     */   {
/*  78 */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       a.ALLATORIxDEMO = a;a.f = TablistSchemats.getScheme(); int tmp23_22 = 1;tmp23_22;new String[60].M = tmp23_22; int tmp35_34 = 1;tmp35_34;new String[60].b = tmp35_34;a.setTablist(a);
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
/*     */   public String[] getPrefix()
/*     */   {
/* 184 */     return (String[])a.M.clone();
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void send()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 74	nano/spook1998/rust/utils/tablist/v1_7/Tablist:ALLATORIxDEMO	Lnano/spook1998/rust/object/User;
/*     */     //   4: invokevirtual 79	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   7: invokestatic 85	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   10: dup
/*     */     //   11: astore_1
/*     */     //   12: ifnonnull +5 -> 17
/*     */     //   15: return
/*     */     //   16: athrow
/*     */     //   17: aload_0
/*     */     //   18: dup
/*     */     //   19: invokespecial 87	nano/spook1998/rust/utils/tablist/v1_7/Tablist:ALLATORIxDEMO	()V
/*     */     //   22: invokespecial 89	nano/spook1998/rust/utils/tablist/v1_7/Tablist:g	()V
/*     */     //   25: aload_1
/*     */     //   26: invokestatic 94	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:send	(Lorg/bukkit/entity/Player;)V
/*     */     //   29: return
/*     */     // Line number table:
/*     */     //   Java source line #128	-> byte code offset #0
/*     */     //   Java source line #197	-> byte code offset #12
/*     */     //   Java source line #126	-> byte code offset #15
/*     */     //   Java source line #166	-> byte code offset #17
/*     */     //   Java source line #17	-> byte code offset #22
/*     */     //   Java source line #37	-> byte code offset #25
/*     */     //   Java source line #149	-> byte code offset #29
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	30	0	a	Tablist
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp23_20 = a.length();
/*     */     int tmp27_26 = 1;
/*     */     tmp27_26;
/*     */     int j;
/*     */     int ? = tmp27_26;
/*     */     int k = tmp23_20;
/*     */     int tmp37_33 = (j = new char[tmp23_20] - 1);
/*     */     tmp37_33;
/*     */     int i = 0x3 ^ 0x5;
/*     */     (2 << 3 ^ 0x2 ^ 0x5);
/*     */     if (tmp37_33 >= 0)
/*     */     {
/*     */       int tmp47_46 = j;
/*     */       j--;
/*     */       ?[tmp47_46] = ((char)(a.charAt(tmp47_46) ^ i));
/*     */       int tmp68_65 = (j--);
/*     */       ?[tmp68_65] = ((char)(a.charAt(tmp68_65) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_7\Tablist.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */