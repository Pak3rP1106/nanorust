/*     */ package nano.spook1998.rust.object;
/*     */ import java.util.List;
/*     */ 
/*   4 */ public class User { public void setClan(Clan a) { a.I = a; }
/*     */   
/*   6 */   public nano.spook1998.rust.utils.tablist.v1_7.Tablist getTablist() { return a.j; }
/*     */   
/*     */   public void addCrafting(Crafting a) {
/*   9 */     a.M.add(a);
/*     */   }
/*     */   
/*  12 */   public String getName() { return a.b; }
/*     */   
/*     */ 
/*  15 */   public String getLastKill() { return a.f; }
/*     */   
/*  17 */   public void setPoints(Integer a) { a.E = a; }
/*  18 */   public void setDirectionType(nano.spook1998.rust.utils.type.DirectionType a) { a.h = a; }
/*     */   
/*     */   public void setStatusChat(Boolean a)
/*     */   {
/*  22 */     a.l = a;
/*     */   }
/*     */   
/*     */   public void setOnline(Boolean a) {
/*  26 */     a.g = a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void removeCrafting(Crafting a)
/*     */   {
/*  35 */     if (a.M.contains(a)) { a.M.remove(a);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setLastKill(String a)
/*     */   {
/*  43 */     a.f = a;
/*     */   }
/*     */   
/*     */ 
/*     */   public Structural getStructural()
/*     */   {
/*  49 */     return a.k;
/*     */   }
/*     */   
/*  52 */   public void setDeath(Integer a) { a.J = a; }
/*     */   
/*     */ 
/*     */   private Scoreboard L;
/*     */   
/*     */   public Boolean getDeathStatus()
/*     */   {
/*  59 */     return a.H; }
/*     */   
/*  61 */   public Structural getLastStructural() { return a.d; }
/*     */   
/*  63 */   public Integer getPoints() { return a.E; }
/*     */   
/*     */   public org.bukkit.scheduler.BukkitTask getBukkitTask()
/*     */   {
/*  67 */     return a.F;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStructural(Structural a)
/*     */   {
/*  76 */     a.k = a;
/*     */   }
/*     */   
/*  79 */   public void setLastStructural(Structural a) { a.d = a; }
/*  80 */   public void setHumanBuilder(nano.spook1998.rust.utils.HumanBuilder a) { a.A = a; }
/*  81 */   public Boolean getOnline() { return a.g;
/*     */   }
/*     */   
/*     */   public void updateCrafting()
/*     */   {
/*  42 */     if (a.M.size() > 0)
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
/*  88 */       Crafting tmp25_22 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         ((Crafting)a.M.get(0));tmp25_22.setTime(Integer.valueOf(tmp25_22.getTime().intValue() - 1)); } }
/*     */   
/*  90 */   public void setWordrobe(Region a) { a.e = a; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getTimeRespawn()
/*     */   {
/*  99 */     return a.B;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Clan getClan()
/*     */   {
/* 108 */     return a.I;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Structural k;
/*     */   
/*     */ 
/*     */ 
/*     */   public void setTimeRespawn(Long a)
/*     */   {
/* 121 */     a.B = a;
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
/* 132 */   public void setTimeOpen(Long a) { a.K = a; }
/*     */   
/* 134 */   public void setScoreboard(Scoreboard a) { a.L = a; }
/* 135 */   public void setLand(Region a) { a.ALLATORIxDEMO = a; }
/*     */   
/*     */ 
/*     */   public void setBukkiTask(org.bukkit.scheduler.BukkitTask a)
/*     */   {
/* 140 */     a.F = a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public nano.spook1998.rust.utils.HumanBuilder getHumanBuilder()
/*     */   {
/* 147 */     return a.A;
/*     */   }
/*     */   
/*     */ 
/*     */   public Region getWordrobe()
/*     */   {
/* 153 */     return a.e;
/*     */   }
/*     */   
/* 156 */   public Region getLand() { return a.ALLATORIxDEMO; }
/* 157 */   public Long getTimeOpen() { return a.K; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Scoreboard getScoreboard()
/*     */   {
/* 168 */     return a.L;
/*     */   }
/*     */   
/*     */   public void setDeathStatus(Boolean a)
/*     */   {
/* 173 */     a.H = a;
/*     */   }
/*     */   
/* 176 */   public nano.spook1998.rust.utils.type.DirectionType getDirectionType() { return a.h; }
/*     */   
/* 178 */   public nano.spook1998.rust.utils.type.StructuralType getStructuralType() { return a.G; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/* 183 */   public void setKill(Integer a) { a.m = a; }
/* 184 */   public Integer getKill() { return a.m; }
/* 185 */   public Integer getDeath() { return a.J; }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setTablist(nano.spook1998.rust.utils.tablist.v1_7.Tablist a)
/*     */   {
/* 191 */     a.j = a;
/*     */   }
/*     */   
/*     */   public Boolean getStatusChat()
/*     */   {
/* 196 */     return a.l;
/*     */   }
/*     */   
/*     */   public void setStructuralType(nano.spook1998.rust.utils.type.StructuralType a) {
/* 200 */     a.G = a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private Long B;
/*     */   
/*     */ 
/*     */   private Clan I;
/*     */   
/*     */ 
/*     */   private Boolean l;
/*     */   
/*     */ 
/*     */   private nano.spook1998.rust.utils.HumanBuilder A;
/*     */   
/*     */ 
/*     */   private Region e;
/*     */   
/*     */ 
/*     */   private Integer J;
/*     */   
/*     */ 
/*     */   private nano.spook1998.rust.utils.type.DirectionType h;
/*     */   
/*     */ 
/*     */   private nano.spook1998.rust.utils.type.StructuralType G;
/*     */   
/*     */ 
/*     */   private Integer E;
/*     */   
/*     */   public List<org.bukkit.Material> getSchemats()
/*     */   {
/* 233 */     return a.D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private nano.spook1998.rust.utils.tablist.v1_7.Tablist j;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Boolean H;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Structural d;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Long K;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Integer m;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private org.bukkit.scheduler.BukkitTask F;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Boolean g;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private String f;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private List<org.bukkit.Material> D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private List<Crafting> M;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private String b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private Region ALLATORIxDEMO;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSchemat(List<org.bukkit.Material> a)
/*     */   {
/* 312 */     a.D = a;
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
/*     */   public List<Crafting> getCrafting()
/*     */   {
/* 338 */     return a.M;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean addSchemat(org.bukkit.Material a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 71	nano/spook1998/rust/object/User:D	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 84 2 0
/*     */     //   10: ifne +20 -> 30
/*     */     //   13: iconst_1
/*     */     //   14: aload_0
/*     */     //   15: getfield 71	nano/spook1998/rust/object/User:D	Ljava/util/List;
/*     */     //   18: aload_1
/*     */     //   19: invokeinterface 103 2 0
/*     */     //   24: pop
/*     */     //   25: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   28: areturn
/*     */     //   29: athrow
/*     */     //   30: iconst_0
/*     */     //   31: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   34: areturn
/*     */     // Line number table:
/*     */     //   Java source line #330	-> byte code offset #0
/*     */     //   Java source line #376	-> byte code offset #14
/*     */     //   Java source line #251	-> byte code offset #25
/*     */     //   Java source line #243	-> byte code offset #30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	a	User
/*     */     //   0	35	1	a	org.bukkit.Material
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public User(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: dup
/*     */     //   2: aconst_null
/*     */     //   3: aload_0
/*     */     //   4: dup_x2
/*     */     //   5: iconst_0
/*     */     //   6: aload_0
/*     */     //   7: dup_x1
/*     */     //   8: dup_x2
/*     */     //   9: aconst_null
/*     */     //   10: dup
/*     */     //   11: aload_0
/*     */     //   12: dup_x1
/*     */     //   13: ldc -107
/*     */     //   15: iconst_1
/*     */     //   16: aload_0
/*     */     //   17: dup_x1
/*     */     //   18: aconst_null
/*     */     //   19: iconst_0
/*     */     //   20: aload_0
/*     */     //   21: dup_x1
/*     */     //   22: iconst_0
/*     */     //   23: aconst_null
/*     */     //   24: aload_0
/*     */     //   25: dup_x1
/*     */     //   26: dup_x2
/*     */     //   27: aconst_null
/*     */     //   28: dup
/*     */     //   29: aload_0
/*     */     //   30: dup
/*     */     //   31: dup_x2
/*     */     //   32: iconst_0
/*     */     //   33: aconst_null
/*     */     //   34: aload_0
/*     */     //   35: dup
/*     */     //   36: dup_x2
/*     */     //   37: aconst_null
/*     */     //   38: aload_1
/*     */     //   39: aload_0
/*     */     //   40: dup_x1
/*     */     //   41: invokespecial 152	java/lang/Object:<init>	()V
/*     */     //   44: putfield 154	nano/spook1998/rust/object/User:b	Ljava/lang/String;
/*     */     //   47: putfield 131	nano/spook1998/rust/object/User:ALLATORIxDEMO	Lnano/spook1998/rust/object/Region;
/*     */     //   50: new 156	java/util/ArrayList
/*     */     //   53: aload_0
/*     */     //   54: dup
/*     */     //   55: pop2
/*     */     //   56: dup
/*     */     //   57: invokespecial 157	java/util/ArrayList:<init>	()V
/*     */     //   60: putfield 78	nano/spook1998/rust/object/User:M	Ljava/util/List;
/*     */     //   63: putfield 94	nano/spook1998/rust/object/User:e	Lnano/spook1998/rust/object/Region;
/*     */     //   66: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   69: putfield 54	nano/spook1998/rust/object/User:g	Ljava/lang/Boolean;
/*     */     //   72: new 156	java/util/ArrayList
/*     */     //   75: dup
/*     */     //   76: invokespecial 157	java/util/ArrayList:<init>	()V
/*     */     //   79: putfield 71	nano/spook1998/rust/object/User:D	Ljava/util/List;
/*     */     //   82: putfield 139	nano/spook1998/rust/object/User:G	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   85: putfield 48	nano/spook1998/rust/object/User:k	Lnano/spook1998/rust/object/Structural;
/*     */     //   88: putfield 159	nano/spook1998/rust/object/User:d	Lnano/spook1998/rust/object/Structural;
/*     */     //   91: getstatic 164	nano/spook1998/rust/data/Settings:DEFAULT_POINTS	Ljava/lang/Integer;
/*     */     //   94: putfield 125	nano/spook1998/rust/object/User:E	Ljava/lang/Integer;
/*     */     //   97: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   100: putfield 74	nano/spook1998/rust/object/User:m	Ljava/lang/Integer;
/*     */     //   103: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   106: putfield 62	nano/spook1998/rust/object/User:J	Ljava/lang/Integer;
/*     */     //   109: putfield 171	nano/spook1998/rust/object/User:j	Lnano/spook1998/rust/utils/tablist/v1_7/Tablist;
/*     */     //   112: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   115: putfield 121	nano/spook1998/rust/object/User:l	Ljava/lang/Boolean;
/*     */     //   118: putfield 58	nano/spook1998/rust/object/User:f	Ljava/lang/String;
/*     */     //   121: putfield 173	nano/spook1998/rust/object/User:I	Lnano/spook1998/rust/object/Clan;
/*     */     //   124: putfield 175	nano/spook1998/rust/object/User:F	Lorg/bukkit/scheduler/BukkitTask;
/*     */     //   127: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   130: putfield 66	nano/spook1998/rust/object/User:H	Ljava/lang/Boolean;
/*     */     //   133: invokestatic 181	java/lang/System:currentTimeMillis	()J
/*     */     //   136: invokestatic 186	java/lang/Long:valueOf	(J)Ljava/lang/Long;
/*     */     //   139: putfield 128	nano/spook1998/rust/object/User:K	Ljava/lang/Long;
/*     */     //   142: invokestatic 181	java/lang/System:currentTimeMillis	()J
/*     */     //   145: invokestatic 186	java/lang/Long:valueOf	(J)Ljava/lang/Long;
/*     */     //   148: putfield 118	nano/spook1998/rust/object/User:B	Ljava/lang/Long;
/*     */     //   151: putfield 188	nano/spook1998/rust/object/User:A	Lnano/spook1998/rust/utils/HumanBuilder;
/*     */     //   154: getstatic 193	nano/spook1998/rust/utils/type/DirectionType:Z	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   157: putfield 98	nano/spook1998/rust/object/User:h	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   160: invokestatic 199	nano/spook1998/rust/object/utils/UserUtil:addUser	(Lnano/spook1998/rust/object/User;)V
/*     */     //   163: return
/*     */     // Line number table:
/*     */     //   Java source line #68	-> byte code offset #0
/*     */     //   Java source line #141	-> byte code offset #44
/*     */     //   Java source line #180	-> byte code offset #47
/*     */     //   Java source line #56	-> byte code offset #50
/*     */     //   Java source line #24	-> byte code offset #63
/*     */     //   Java source line #194	-> byte code offset #66
/*     */     //   Java source line #142	-> byte code offset #72
/*     */     //   Java source line #3	-> byte code offset #82
/*     */     //   Java source line #160	-> byte code offset #85
/*     */     //   Java source line #89	-> byte code offset #88
/*     */     //   Java source line #72	-> byte code offset #91
/*     */     //   Java source line #5	-> byte code offset #97
/*     */     //   Java source line #86	-> byte code offset #103
/*     */     //   Java source line #29	-> byte code offset #109
/*     */     //   Java source line #163	-> byte code offset #112
/*     */     //   Java source line #193	-> byte code offset #118
/*     */     //   Java source line #60	-> byte code offset #121
/*     */     //   Java source line #129	-> byte code offset #124
/*     */     //   Java source line #21	-> byte code offset #127
/*     */     //   Java source line #175	-> byte code offset #133
/*     */     //   Java source line #112	-> byte code offset #142
/*     */     //   Java source line #70	-> byte code offset #151
/*     */     //   Java source line #158	-> byte code offset #154
/*     */     //   Java source line #138	-> byte code offset #160
/*     */     //   Java source line #91	-> byte code offset #163
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	164	0	a	User
/*     */     //   0	164	1	a	String
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */