/*     */ package nano.spook1998.rust.listeners;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.bukkit.event.Listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PlayerToggleSneakEvent
/*     */   implements Listener
/*     */ {
/* 150 */   private static Map<String, Long> ALLATORIxDEMO = new HashMap();
/*     */   
/*     */   /* Error */
/*     */   @org.bukkit.event.EventHandler
/*     */   public void onToggleSneak(org.bukkit.event.player.PlayerToggleSneakEvent a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 31	org/bukkit/event/player/PlayerToggleSneakEvent:getPlayer	()Lorg/bukkit/entity/Player;
/*     */     //   4: astore_1
/*     */     //   5: invokestatic 37	java/lang/System:currentTimeMillis	()J
/*     */     //   8: invokestatic 43	java/lang/Long:valueOf	(J)Ljava/lang/Long;
/*     */     //   11: astore_2
/*     */     //   12: getstatic 22	nano/spook1998/rust/listeners/PlayerToggleSneakEvent:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   15: aload_1
/*     */     //   16: invokeinterface 49 1 0
/*     */     //   21: invokeinterface 55 2 0
/*     */     //   26: ifne +19 -> 45
/*     */     //   29: getstatic 22	nano/spook1998/rust/listeners/PlayerToggleSneakEvent:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   32: aload_1
/*     */     //   33: invokeinterface 49 1 0
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface 59 3 0
/*     */     //   44: pop
/*     */     //   45: aload_2
/*     */     //   46: invokevirtual 62	java/lang/Long:longValue	()J
/*     */     //   49: getstatic 22	nano/spook1998/rust/listeners/PlayerToggleSneakEvent:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface 49 1 0
/*     */     //   58: invokeinterface 66 2 0
/*     */     //   63: checkcast 39	java/lang/Long
/*     */     //   66: invokevirtual 62	java/lang/Long:longValue	()J
/*     */     //   69: lsub
/*     */     //   70: ldc2_w 67
/*     */     //   73: lcmp
/*     */     //   74: ifgt +5 -> 79
/*     */     //   77: return
/*     */     //   78: athrow
/*     */     //   79: aload_1
/*     */     //   80: invokeinterface 49 1 0
/*     */     //   85: invokestatic 73	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   88: dup
/*     */     //   89: astore_3
/*     */     //   90: invokevirtual 79	nano/spook1998/rust/object/User:getDirectionType	()Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   93: astore 4
/*     */     //   95: getstatic 22	nano/spook1998/rust/listeners/PlayerToggleSneakEvent:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface 49 1 0
/*     */     //   104: aload_2
/*     */     //   105: invokeinterface 59 3 0
/*     */     //   110: pop
/*     */     //   111: aload 4
/*     */     //   113: getstatic 85	nano/spook1998/rust/utils/type/DirectionType:Z	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   116: invokevirtual 88	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   119: ifeq +12 -> 131
/*     */     //   122: aload_3
/*     */     //   123: getstatic 91	nano/spook1998/rust/utils/type/DirectionType:X	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   126: invokevirtual 95	nano/spook1998/rust/object/User:setDirectionType	(Lnano/spook1998/rust/utils/type/DirectionType;)V
/*     */     //   129: return
/*     */     //   130: athrow
/*     */     //   131: aload 4
/*     */     //   133: getstatic 91	nano/spook1998/rust/utils/type/DirectionType:X	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   136: invokevirtual 88	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   139: ifeq +11 -> 150
/*     */     //   142: aload_3
/*     */     //   143: getstatic 98	nano/spook1998/rust/utils/type/DirectionType:C	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   146: invokevirtual 95	nano/spook1998/rust/object/User:setDirectionType	(Lnano/spook1998/rust/utils/type/DirectionType;)V
/*     */     //   149: return
/*     */     //   150: aload 4
/*     */     //   152: getstatic 98	nano/spook1998/rust/utils/type/DirectionType:C	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   155: invokevirtual 88	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   158: ifeq +11 -> 169
/*     */     //   161: aload_3
/*     */     //   162: getstatic 101	nano/spook1998/rust/utils/type/DirectionType:V	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   165: invokevirtual 95	nano/spook1998/rust/object/User:setDirectionType	(Lnano/spook1998/rust/utils/type/DirectionType;)V
/*     */     //   168: return
/*     */     //   169: aload 4
/*     */     //   171: getstatic 101	nano/spook1998/rust/utils/type/DirectionType:V	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   174: invokevirtual 88	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   177: ifeq +11 -> 188
/*     */     //   180: aload_3
/*     */     //   181: getstatic 85	nano/spook1998/rust/utils/type/DirectionType:Z	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   184: invokevirtual 95	nano/spook1998/rust/object/User:setDirectionType	(Lnano/spook1998/rust/utils/type/DirectionType;)V
/*     */     //   187: return
/*     */     //   188: return
/*     */     // Line number table:
/*     */     //   Java source line #164	-> byte code offset #0
/*     */     //   Java source line #38	-> byte code offset #5
/*     */     //   Java source line #123	-> byte code offset #12
/*     */     //   Java source line #171	-> byte code offset #45
/*     */     //   Java source line #78	-> byte code offset #79
/*     */     //   Java source line #93	-> byte code offset #90
/*     */     //   Java source line #119	-> byte code offset #95
/*     */     //   Java source line #170	-> byte code offset #111
/*     */     //   Java source line #96	-> byte code offset #122
/*     */     //   Java source line #92	-> byte code offset #129
/*     */     //   Java source line #13	-> byte code offset #131
/*     */     //   Java source line #155	-> byte code offset #142
/*     */     //   Java source line #162	-> byte code offset #149
/*     */     //   Java source line #182	-> byte code offset #161
/*     */     //   Java source line #77	-> byte code offset #168
/*     */     //   Java source line #47	-> byte code offset #169
/*     */     //   Java source line #113	-> byte code offset #180
/*     */     //   Java source line #110	-> byte code offset #187
/*     */     //   Java source line #141	-> byte code offset #188
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	189	0	a	PlayerToggleSneakEvent
/*     */     //   0	189	1	a	org.bukkit.event.player.PlayerToggleSneakEvent
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PlayerToggleSneakEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */