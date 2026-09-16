/*    */ package nano.spook1998.rust.utils;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import nano.spook1998.rust.object.User;
/*    */ import nano.spook1998.rust.object.utils.UserUtil;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HumanUtil
/*    */ {
/*    */   public static void spawnDespawn(String a)
/*    */   {
/* 72 */     ALLATORIxDEMO(a);
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static void spawnAllBot(Player a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokeinterface 70 1 0
/*    */     //   6: invokestatic 13	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*    */     //   9: invokevirtual 19	nano/spook1998/rust/object/User:getHumanBuilder	()Lnano/spook1998/rust/utils/HumanBuilder;
/*    */     //   12: ifnull +7 -> 19
/*    */     //   15: aload_0
/*    */     //   16: invokestatic 199	nano/spook1998/rust/utils/HumanUtil:ALLATORIxDEMO	(Lorg/bukkit/entity/Player;)V
/*    */     //   19: invokestatic 166	nano/spook1998/rust/object/utils/UserUtil:getUsers	()Ljava/util/List;
/*    */     //   22: invokeinterface 169 1 0
/*    */     //   27: dup
/*    */     //   28: astore_2
/*    */     //   29: goto +30 -> 59
/*    */     //   32: athrow
/*    */     //   33: aload_2
/*    */     //   34: invokeinterface 37 1 0
/*    */     //   39: checkcast 15	nano/spook1998/rust/object/User
/*    */     //   42: dup
/*    */     //   43: astore_1
/*    */     //   44: invokevirtual 19	nano/spook1998/rust/object/User:getHumanBuilder	()Lnano/spook1998/rust/utils/HumanBuilder;
/*    */     //   47: ifnull +11 -> 58
/*    */     //   50: aload_1
/*    */     //   51: invokevirtual 19	nano/spook1998/rust/object/User:getHumanBuilder	()Lnano/spook1998/rust/utils/HumanBuilder;
/*    */     //   54: aload_0
/*    */     //   55: invokevirtual 66	nano/spook1998/rust/utils/HumanBuilder:sendTo	(Lorg/bukkit/entity/Player;)V
/*    */     //   58: aload_2
/*    */     //   59: invokeinterface 49 1 0
/*    */     //   64: ifne -31 -> 33
/*    */     //   67: return
/*    */     // Line number table:
/*    */     //   Java source line #24	-> byte code offset #0
/*    */     //   Java source line #194	-> byte code offset #19
/*    */     //   Java source line #142	-> byte code offset #44
/*    */     //   Java source line #194	-> byte code offset #58
/*    */     //   Java source line #160	-> byte code offset #67
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	68	0	a	Player
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static User getTarget(Player a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: invokestatic 79	java/lang/System:currentTimeMillis	()J
/*    */     //   3: aload_0
/*    */     //   4: invokeinterface 70 1 0
/*    */     //   9: invokestatic 13	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*    */     //   12: invokevirtual 83	nano/spook1998/rust/object/User:getTimeOpen	()Ljava/lang/Long;
/*    */     //   15: invokevirtual 88	java/lang/Long:longValue	()J
/*    */     //   18: lsub
/*    */     //   19: getstatic 94	nano/spook1998/rust/data/Settings:TIME_OPEN	Ljava/lang/Integer;
/*    */     //   22: invokevirtual 100	java/lang/Integer:intValue	()I
/*    */     //   25: i2l
/*    */     //   26: lcmp
/*    */     //   27: ifgt +6 -> 33
/*    */     //   30: aconst_null
/*    */     //   31: areturn
/*    */     //   32: athrow
/*    */     //   33: aload_0
/*    */     //   34: invokeinterface 104 1 0
/*    */     //   39: dup
/*    */     //   40: astore_1
/*    */     //   41: invokevirtual 110	org/bukkit/Location:getDirection	()Lorg/bukkit/util/Vector;
/*    */     //   44: invokevirtual 115	org/bukkit/util/Vector:normalize	()Lorg/bukkit/util/Vector;
/*    */     //   47: astore_2
/*    */     //   48: iconst_0
/*    */     //   49: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   52: dup
/*    */     //   53: astore_3
/*    */     //   54: goto +230 -> 284
/*    */     //   57: athrow
/*    */     //   58: aload_2
/*    */     //   59: dup
/*    */     //   60: dup_x1
/*    */     //   61: invokevirtual 123	org/bukkit/util/Vector:getX	()D
/*    */     //   64: aload_3
/*    */     //   65: invokevirtual 100	java/lang/Integer:intValue	()I
/*    */     //   68: i2d
/*    */     //   69: dmul
/*    */     //   70: dstore 4
/*    */     //   72: invokevirtual 126	org/bukkit/util/Vector:getY	()D
/*    */     //   75: aload_3
/*    */     //   76: invokevirtual 100	java/lang/Integer:intValue	()I
/*    */     //   79: i2d
/*    */     //   80: dmul
/*    */     //   81: dstore 6
/*    */     //   83: invokevirtual 129	org/bukkit/util/Vector:getZ	()D
/*    */     //   86: aload_3
/*    */     //   87: invokevirtual 100	java/lang/Integer:intValue	()I
/*    */     //   90: i2d
/*    */     //   91: dmul
/*    */     //   92: dstore 8
/*    */     //   94: aload_1
/*    */     //   95: invokevirtual 132	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*    */     //   98: dload 4
/*    */     //   100: dload 6
/*    */     //   102: dload 8
/*    */     //   104: invokevirtual 136	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*    */     //   107: dup
/*    */     //   108: astore 4
/*    */     //   110: invokevirtual 140	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   113: dup
/*    */     //   114: astore 5
/*    */     //   116: invokeinterface 146 1 0
/*    */     //   121: getstatic 152	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*    */     //   124: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*    */     //   127: ifne +37 -> 164
/*    */     //   130: aload 5
/*    */     //   132: invokeinterface 146 1 0
/*    */     //   137: getstatic 159	org/bukkit/Material:STATIONARY_WATER	Lorg/bukkit/Material;
/*    */     //   140: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*    */     //   143: ifne +21 -> 164
/*    */     //   146: aload 5
/*    */     //   148: invokeinterface 146 1 0
/*    */     //   153: getstatic 162	org/bukkit/Material:STATIONARY_LAVA	Lorg/bukkit/Material;
/*    */     //   156: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*    */     //   159: ifne +5 -> 164
/*    */     //   162: aconst_null
/*    */     //   163: areturn
/*    */     //   164: invokestatic 166	nano/spook1998/rust/object/utils/UserUtil:getUsers	()Ljava/util/List;
/*    */     //   167: invokeinterface 169 1 0
/*    */     //   172: dup
/*    */     //   173: astore 6
/*    */     //   175: goto +90 -> 265
/*    */     //   178: aload 6
/*    */     //   180: invokeinterface 37 1 0
/*    */     //   185: checkcast 15	nano/spook1998/rust/object/User
/*    */     //   188: dup
/*    */     //   189: astore 10
/*    */     //   191: invokevirtual 173	nano/spook1998/rust/object/User:getOnline	()Ljava/lang/Boolean;
/*    */     //   194: invokevirtual 178	java/lang/Boolean:booleanValue	()Z
/*    */     //   197: ifne +66 -> 263
/*    */     //   200: aload 10
/*    */     //   202: invokevirtual 19	nano/spook1998/rust/object/User:getHumanBuilder	()Lnano/spook1998/rust/utils/HumanBuilder;
/*    */     //   205: dup
/*    */     //   206: astore 7
/*    */     //   208: ifnull +55 -> 263
/*    */     //   211: aload 7
/*    */     //   213: invokevirtual 181	nano/spook1998/rust/utils/HumanBuilder:getLocation	()Lorg/bukkit/Location;
/*    */     //   216: invokevirtual 140	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   219: aload 4
/*    */     //   221: invokevirtual 140	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   224: invokevirtual 182	java/lang/Object:equals	(Ljava/lang/Object;)Z
/*    */     //   227: ifne +33 -> 260
/*    */     //   230: aload 7
/*    */     //   232: invokevirtual 181	nano/spook1998/rust/utils/HumanBuilder:getLocation	()Lorg/bukkit/Location;
/*    */     //   235: invokevirtual 132	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*    */     //   238: invokevirtual 140	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   241: getstatic 188	org/bukkit/block/BlockFace:UP	Lorg/bukkit/block/BlockFace;
/*    */     //   244: invokeinterface 192 2 0
/*    */     //   249: aload 4
/*    */     //   251: invokevirtual 140	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   254: invokevirtual 182	java/lang/Object:equals	(Ljava/lang/Object;)Z
/*    */     //   257: ifeq +6 -> 263
/*    */     //   260: aload 10
/*    */     //   262: areturn
/*    */     //   263: aload 6
/*    */     //   265: invokeinterface 49 1 0
/*    */     //   270: ifne -92 -> 178
/*    */     //   273: aload_3
/*    */     //   274: invokevirtual 100	java/lang/Integer:intValue	()I
/*    */     //   277: iconst_1
/*    */     //   278: iadd
/*    */     //   279: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   282: dup
/*    */     //   283: astore_3
/*    */     //   284: invokevirtual 100	java/lang/Integer:intValue	()I
/*    */     //   287: iconst_5
/*    */     //   288: if_icmplt -230 -> 58
/*    */     //   291: aconst_null
/*    */     //   292: areturn
/*    */     // Line number table:
/*    */     //   Java source line #29	-> byte code offset #0
/*    */     //   Java source line #163	-> byte code offset #33
/*    */     //   Java source line #193	-> byte code offset #41
/*    */     //   Java source line #60	-> byte code offset #48
/*    */     //   Java source line #129	-> byte code offset #58
/*    */     //   Java source line #21	-> byte code offset #72
/*    */     //   Java source line #175	-> byte code offset #83
/*    */     //   Java source line #112	-> byte code offset #94
/*    */     //   Java source line #70	-> byte code offset #110
/*    */     //   Java source line #158	-> byte code offset #116
/*    */     //   Java source line #138	-> byte code offset #164
/*    */     //   Java source line #91	-> byte code offset #191
/*    */     //   Java source line #39	-> byte code offset #200
/*    */     //   Java source line #59	-> byte code offset #208
/*    */     //   Java source line #174	-> byte code offset #211
/*    */     //   Java source line #19	-> byte code offset #260
/*    */     //   Java source line #138	-> byte code offset #263
/*    */     //   Java source line #60	-> byte code offset #273
/*    */     //   Java source line #173	-> byte code offset #291
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	293	0	a	Player
/*    */   }
/*    */   
/*    */   public static void spawn(Player a)
/*    */   {
/* 38 */     HumanBuilder localHumanBuilder = new HumanBuilder(a);
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     Iterator localIterator;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* <3 */     for (goto 39; localIterator.hasNext();) { Player localPlayer = (Player)localIterator.next();
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* A1 */       localHumanBuilder.sendTo(localPlayer);
/*    */     }
/* 93 */     UserUtil.get(a.getName()).setHumanBuilder(localHumanBuilder);
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\HumanUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */