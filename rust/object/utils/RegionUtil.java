/*     */ package nano.spook1998.rust.object.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.object.Region;
/*     */ 
/*     */ public class RegionUtil
/*     */ {
/*     */   /* Error */
/*     */   public static void move(org.bukkit.entity.Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: dup
/*     */     //   2: invokeinterface 101 1 0
/*     */     //   7: invokestatic 107	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   10: astore_1
/*     */     //   11: invokeinterface 155 1 0
/*     */     //   16: invokestatic 157	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   19: astore_2
/*     */     //   20: aload_1
/*     */     //   21: invokevirtual 126	nano/spook1998/rust/object/User:getLand	()Lnano/spook1998/rust/object/Region;
/*     */     //   24: astore_3
/*     */     //   25: aload_2
/*     */     //   26: ifnonnull +9 -> 35
/*     */     //   29: aload_3
/*     */     //   30: ifnonnull +5 -> 35
/*     */     //   33: return
/*     */     //   34: athrow
/*     */     //   35: aload_2
/*     */     //   36: ifnull +22 -> 58
/*     */     //   39: aload_3
/*     */     //   40: ifnonnull +18 -> 58
/*     */     //   43: aload_0
/*     */     //   44: iconst_1
/*     */     //   45: aload_1
/*     */     //   46: aload_2
/*     */     //   47: invokevirtual 160	nano/spook1998/rust/object/User:setLand	(Lnano/spook1998/rust/object/Region;)V
/*     */     //   50: invokestatic 53	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   53: invokestatic 162	nano/spook1998/rust/object/utils/RegionUtil:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;Ljava/lang/Boolean;)V
/*     */     //   56: return
/*     */     //   57: athrow
/*     */     //   58: aload_2
/*     */     //   59: ifnonnull +21 -> 80
/*     */     //   62: aload_3
/*     */     //   63: ifnull +17 -> 80
/*     */     //   66: aload_1
/*     */     //   67: aconst_null
/*     */     //   68: aload_0
/*     */     //   69: iconst_0
/*     */     //   70: invokestatic 53	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   73: invokestatic 162	nano/spook1998/rust/object/utils/RegionUtil:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;Ljava/lang/Boolean;)V
/*     */     //   76: invokevirtual 160	nano/spook1998/rust/object/User:setLand	(Lnano/spook1998/rust/object/Region;)V
/*     */     //   79: return
/*     */     //   80: aload_2
/*     */     //   81: ifnull +37 -> 118
/*     */     //   84: aload_3
/*     */     //   85: ifnull +33 -> 118
/*     */     //   88: aload_2
/*     */     //   89: aload_3
/*     */     //   90: invokevirtual 88	java/lang/Object:equals	(Ljava/lang/Object;)Z
/*     */     //   93: ifeq +4 -> 97
/*     */     //   96: return
/*     */     //   97: aload_0
/*     */     //   98: iconst_1
/*     */     //   99: aload_1
/*     */     //   100: aload_2
/*     */     //   101: aload_0
/*     */     //   102: iconst_0
/*     */     //   103: invokestatic 53	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   106: invokestatic 162	nano/spook1998/rust/object/utils/RegionUtil:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;Ljava/lang/Boolean;)V
/*     */     //   109: invokevirtual 160	nano/spook1998/rust/object/User:setLand	(Lnano/spook1998/rust/object/Region;)V
/*     */     //   112: invokestatic 53	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   115: invokestatic 162	nano/spook1998/rust/object/utils/RegionUtil:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;Ljava/lang/Boolean;)V
/*     */     //   118: return
/*     */     // Line number table:
/*     */     //   Java source line #86	-> byte code offset #0
/*     */     //   Java source line #29	-> byte code offset #11
/*     */     //   Java source line #163	-> byte code offset #20
/*     */     //   Java source line #193	-> byte code offset #25
/*     */     //   Java source line #60	-> byte code offset #35
/*     */     //   Java source line #129	-> byte code offset #45
/*     */     //   Java source line #21	-> byte code offset #50
/*     */     //   Java source line #175	-> byte code offset #56
/*     */     //   Java source line #70	-> byte code offset #58
/*     */     //   Java source line #158	-> byte code offset #68
/*     */     //   Java source line #138	-> byte code offset #76
/*     */     //   Java source line #91	-> byte code offset #79
/*     */     //   Java source line #59	-> byte code offset #80
/*     */     //   Java source line #174	-> byte code offset #88
/*     */     //   Java source line #19	-> byte code offset #97
/*     */     //   Java source line #18	-> byte code offset #109
/*     */     //   Java source line #120	-> byte code offset #112
/*     */     //   Java source line #176	-> byte code offset #118
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	119	0	a	org.bukkit.entity.Player
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Region getRegionAtLocation(org.bukkit.Location a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 20	nano/spook1998/rust/object/utils/RegionUtil:getRegions	()Ljava/util/List;
/*     */     //   3: invokeinterface 26 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +26 -> 36
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 32 1 0
/*     */     //   20: checkcast 12	nano/spook1998/rust/object/Region
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: aload_0
/*     */     //   26: invokevirtual 149	nano/spook1998/rust/object/Region:checkLocation	(Lorg/bukkit/Location;)Z
/*     */     //   29: ifeq +6 -> 35
/*     */     //   32: aload_1
/*     */     //   33: areturn
/*     */     //   34: athrow
/*     */     //   35: aload_2
/*     */     //   36: invokeinterface 56 1 0
/*     */     //   41: ifne -27 -> 14
/*     */     //   44: aconst_null
/*     */     //   45: areturn
/*     */     // Line number table:
/*     */     //   Java source line #32	-> byte code offset #0
/*     */     //   Java source line #13	-> byte code offset #25
/*     */     //   Java source line #32	-> byte code offset #35
/*     */     //   Java source line #162	-> byte code offset #44
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	46	0	a	org.bukkit.Location
/*     */   }
/*     */   
/*     */   public static List<Region> getRegions()
/*     */   {
/*  38 */     return ALLATORIxDEMO;
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
/*     */   public static void addRegion(Region a)
/*     */   {
/*  78 */     if (!ALLATORIxDEMO.contains(a)) { ALLATORIxDEMO.add(a);
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
/*  97 */   private static List<Region> ALLATORIxDEMO = new ArrayList();
/*     */   
/*     */   /* Error */
/*     */   public static Region getWordrobeAtLocation(org.bukkit.Location a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 84	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   4: astore_1
/*     */     //   5: invokestatic 20	nano/spook1998/rust/object/utils/RegionUtil:getRegions	()Ljava/util/List;
/*     */     //   8: invokeinterface 26 1 0
/*     */     //   13: dup
/*     */     //   14: astore_3
/*     */     //   15: goto +29 -> 44
/*     */     //   18: athrow
/*     */     //   19: aload_3
/*     */     //   20: invokeinterface 32 1 0
/*     */     //   25: checkcast 12	nano/spook1998/rust/object/Region
/*     */     //   28: astore_2
/*     */     //   29: aload_1
/*     */     //   30: aload_2
/*     */     //   31: invokevirtual 85	nano/spook1998/rust/object/Region:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   34: invokevirtual 88	java/lang/Object:equals	(Ljava/lang/Object;)Z
/*     */     //   37: ifeq +6 -> 43
/*     */     //   40: aload_2
/*     */     //   41: areturn
/*     */     //   42: athrow
/*     */     //   43: aload_3
/*     */     //   44: invokeinterface 56 1 0
/*     */     //   49: ifne -30 -> 19
/*     */     //   52: aconst_null
/*     */     //   53: areturn
/*     */     // Line number table:
/*     */     //   Java source line #182	-> byte code offset #0
/*     */     //   Java source line #77	-> byte code offset #5
/*     */     //   Java source line #104	-> byte code offset #29
/*     */     //   Java source line #77	-> byte code offset #43
/*     */     //   Java source line #113	-> byte code offset #52
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	54	0	a	org.bukkit.Location
/*     */   }
/*     */   
/*     */   public static void removeRegion(Region a)
/*     */   {
/* 170 */     if (ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.remove(a);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Boolean distanceWordrobe(org.bukkit.Location a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 12	nano/spook1998/rust/object/Region
/*     */     //   3: dup
/*     */     //   4: aload_0
/*     */     //   5: invokespecial 16	nano/spook1998/rust/object/Region:<init>	(Lorg/bukkit/Location;)V
/*     */     //   8: astore_1
/*     */     //   9: invokestatic 20	nano/spook1998/rust/object/utils/RegionUtil:getRegions	()Ljava/util/List;
/*     */     //   12: invokeinterface 26 1 0
/*     */     //   17: dup
/*     */     //   18: astore_2
/*     */     //   19: goto +37 -> 56
/*     */     //   22: athrow
/*     */     //   23: aload_2
/*     */     //   24: invokeinterface 32 1 0
/*     */     //   29: checkcast 12	nano/spook1998/rust/object/Region
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual 35	nano/spook1998/rust/object/Region:getLocations	()Ljava/util/List;
/*     */     //   36: invokevirtual 39	nano/spook1998/rust/object/Region:checkLocations	(Ljava/util/List;)Ljava/lang/Boolean;
/*     */     //   39: invokevirtual 45	java/lang/Boolean:booleanValue	()Z
/*     */     //   42: ifeq +13 -> 55
/*     */     //   45: iconst_0
/*     */     //   46: aload_1
/*     */     //   47: invokestatic 49	nano/spook1998/rust/object/utils/RegionUtil:removeRegion	(Lnano/spook1998/rust/object/Region;)V
/*     */     //   50: invokestatic 53	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   53: areturn
/*     */     //   54: athrow
/*     */     //   55: aload_2
/*     */     //   56: invokeinterface 56 1 0
/*     */     //   61: ifne -38 -> 23
/*     */     //   64: iconst_1
/*     */     //   65: aload_1
/*     */     //   66: invokestatic 49	nano/spook1998/rust/object/utils/RegionUtil:removeRegion	(Lnano/spook1998/rust/object/Region;)V
/*     */     //   69: invokestatic 53	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   72: areturn
/*     */     // Line number table:
/*     */     //   Java source line #141	-> byte code offset #0
/*     */     //   Java source line #180	-> byte code offset #9
/*     */     //   Java source line #56	-> byte code offset #32
/*     */     //   Java source line #24	-> byte code offset #46
/*     */     //   Java source line #194	-> byte code offset #50
/*     */     //   Java source line #180	-> byte code offset #55
/*     */     //   Java source line #160	-> byte code offset #65
/*     */     //   Java source line #89	-> byte code offset #69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	73	0	a	org.bukkit.Location
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\RegionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */