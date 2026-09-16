/*     */ package nano.spook1998.rust.object;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Clan
/*     */ {
/*     */   private List<User> F;
/*     */   private Boolean g;
/*     */   private Integer f;
/*     */   private String D;
/*     */   private String M;
/*     */   private List<User> b;
/*     */   private User ALLATORIxDEMO;
/*     */   
/*     */   public void addUser(User a)
/*     */   {
/* 142 */     if (!a.F.contains(a))
/*   3 */       a.F.add(a); }
/*     */   
/*   5 */   public Integer getPoints() { return a.f; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTag()
/*     */   {
/*  32 */     return a.D;
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
/*     */   public Boolean isPvP()
/*     */   {
/*  47 */     return a.g;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsers(List<User> a)
/*     */   {
/*  56 */     a.F = a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOwner(User a)
/*     */   {
/*  68 */     a.ALLATORIxDEMO = a;
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
/*     */   public void setPvP(Boolean a)
/*     */   {
/* 112 */     a.g = a;
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
/*     */   public void removeUser(User a)
/*     */   {
/* 129 */     a.F.remove(a);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<User> getInv()
/*     */   {
/* 138 */     return a.b;
/*     */   }
/*     */   
/*     */   public Clan(String a, String a, User a)
/*     */   {
/*  23 */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       a.M = a;a.D = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */     a.ALLATORIxDEMO = a;a; int tmp32_31 = 1;tmp32_31; int tmp34_32 = tmp32_31;tmp34_32[0] = a;new User[1].<init>(Arrays.asList(tmp34_32));a.F = a;a.g = Boolean.valueOf(false);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     a.b = new ArrayList();a.f = Integer.valueOf(0);
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
/* 162 */   public User getOwner() { return a.ALLATORIxDEMO; }
/* 163 */   public void setPoints(Integer a) { a.f = a; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 170 */     return a.M;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<User> getUsers()
/*     */   {
/* 182 */     return a.F;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean removeFromInv(User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 50	nano/spook1998/rust/object/Clan:b	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 34 2 0
/*     */     //   10: ifeq +20 -> 30
/*     */     //   13: iconst_1
/*     */     //   14: aload_0
/*     */     //   15: getfield 50	nano/spook1998/rust/object/Clan:b	Ljava/util/List;
/*     */     //   18: aload_1
/*     */     //   19: invokeinterface 53 2 0
/*     */     //   24: pop
/*     */     //   25: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   28: areturn
/*     */     //   29: athrow
/*     */     //   30: iconst_0
/*     */     //   31: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   34: areturn
/*     */     // Line number table:
/*     */     //   Java source line #66	-> byte code offset #0
/*     */     //   Java source line #20	-> byte code offset #14
/*     */     //   Java source line #173	-> byte code offset #25
/*     */     //   Java source line #71	-> byte code offset #30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	a	Clan
/*     */     //   0	35	1	a	User
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean addToInv(User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 50	nano/spook1998/rust/object/Clan:b	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 34 2 0
/*     */     //   10: ifne +20 -> 30
/*     */     //   13: iconst_1
/*     */     //   14: aload_0
/*     */     //   15: getfield 50	nano/spook1998/rust/object/Clan:b	Ljava/util/List;
/*     */     //   18: aload_1
/*     */     //   19: invokeinterface 37 2 0
/*     */     //   24: pop
/*     */     //   25: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   28: areturn
/*     */     //   29: athrow
/*     */     //   30: iconst_0
/*     */     //   31: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   34: areturn
/*     */     // Line number table:
/*     */     //   Java source line #59	-> byte code offset #0
/*     */     //   Java source line #174	-> byte code offset #14
/*     */     //   Java source line #19	-> byte code offset #25
/*     */     //   Java source line #120	-> byte code offset #30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	a	Clan
/*     */     //   0	35	1	a	User
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean isInClan(User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 28	nano/spook1998/rust/object/Clan:F	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 34 2 0
/*     */     //   10: ifeq +9 -> 19
/*     */     //   13: iconst_1
/*     */     //   14: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   17: areturn
/*     */     //   18: athrow
/*     */     //   19: iconst_0
/*     */     //   20: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   23: areturn
/*     */     // Line number table:
/*     */     //   Java source line #64	-> byte code offset #0
/*     */     //   Java source line #147	-> byte code offset #19
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	24	0	a	Clan
/*     */     //   0	24	1	a	User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\Clan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */