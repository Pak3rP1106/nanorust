package nano.spook1998.rust.listeners;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class F
  extends BukkitRunnable
{
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup_x1
    //   3: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   6: invokeinterface 23 1 0
    //   11: invokestatic 29	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
    //   14: astore_1
    //   15: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   18: invokestatic 34	nano/spook1998/rust/utils/tablist/Tab:showTab	(Lorg/bukkit/entity/Player;)V
    //   21: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   24: invokeinterface 38 1 0
    //   29: getstatic 44	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
    //   32: invokeinterface 50 2 0
    //   37: ifnull +20 -> 57
    //   40: aload_0
    //   41: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   44: invokeinterface 38 1 0
    //   49: getstatic 44	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
    //   52: invokeinterface 54 2 0
    //   57: aload_1
    //   58: invokevirtual 60	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
    //   61: invokevirtual 66	java/lang/Integer:intValue	()I
    //   64: ifgt +10 -> 74
    //   67: aload_1
    //   68: getstatic 72	nano/spook1998/rust/data/Settings:DEFAULT_POINTS	Ljava/lang/Integer;
    //   71: invokevirtual 76	nano/spook1998/rust/object/User:setPoints	(Ljava/lang/Integer;)V
    //   74: invokestatic 82	nano/spook1998/rust/object/utils/SchematsUtil:getDefaultSchemats	()Ljava/util/List;
    //   77: invokeinterface 88 1 0
    //   82: dup
    //   83: astore_3
    //   84: goto +24 -> 108
    //   87: athrow
    //   88: aload_3
    //   89: invokeinterface 94 1 0
    //   94: checkcast 96	nano/spook1998/rust/object/Schemat
    //   97: astore_2
    //   98: aload_3
    //   99: aload_1
    //   100: aload_2
    //   101: invokevirtual 100	nano/spook1998/rust/object/Schemat:getMaterial	()Lorg/bukkit/Material;
    //   104: invokevirtual 104	nano/spook1998/rust/object/User:addSchemat	(Lorg/bukkit/Material;)Ljava/lang/Boolean;
    //   107: pop
    //   108: invokeinterface 108 1 0
    //   113: ifne -25 -> 88
    //   116: aload_0
    //   117: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   120: ldc 110
    //   122: invokestatic 113	nano/spook1998/rust/listeners/PlayerJoinEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokeinterface 117 2 0
    //   130: ifne +23 -> 153
    //   133: aload_0
    //   134: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   137: invokeinterface 23 1 0
    //   142: ldc 119
    //   144: invokestatic 113	nano/spook1998/rust/listeners/PlayerJoinEvent:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   147: invokevirtual 124	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   150: ifeq +45 -> 195
    //   153: invokestatic 127	nano/spook1998/rust/object/utils/SchematsUtil:getFindSchemats	()Ljava/util/List;
    //   156: invokeinterface 88 1 0
    //   161: dup
    //   162: astore_3
    //   163: goto +24 -> 187
    //   166: athrow
    //   167: aload_3
    //   168: invokeinterface 94 1 0
    //   173: checkcast 96	nano/spook1998/rust/object/Schemat
    //   176: astore_2
    //   177: aload_3
    //   178: aload_1
    //   179: aload_2
    //   180: invokevirtual 100	nano/spook1998/rust/object/Schemat:getMaterial	()Lorg/bukkit/Material;
    //   183: invokevirtual 104	nano/spook1998/rust/object/User:addSchemat	(Lorg/bukkit/Material;)Ljava/lang/Boolean;
    //   186: pop
    //   187: invokeinterface 108 1 0
    //   192: ifne -25 -> 167
    //   195: aload_1
    //   196: dup
    //   197: iconst_1
    //   198: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   201: invokevirtual 137	nano/spook1998/rust/object/User:setOnline	(Ljava/lang/Boolean;)V
    //   204: invokevirtual 141	nano/spook1998/rust/object/User:getDeathStatus	()Ljava/lang/Boolean;
    //   207: invokevirtual 144	java/lang/Boolean:booleanValue	()Z
    //   210: ifeq +121 -> 331
    //   213: aload_0
    //   214: dup
    //   215: dup2
    //   216: dup2
    //   217: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   220: invokeinterface 148 1 0
    //   225: invokeinterface 153 1 0
    //   230: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   233: invokeinterface 148 1 0
    //   238: new 155	org/bukkit/inventory/ItemStack
    //   241: dup
    //   242: getstatic 161	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   245: invokespecial 165	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   248: invokeinterface 169 2 0
    //   253: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   256: invokeinterface 148 1 0
    //   261: new 155	org/bukkit/inventory/ItemStack
    //   264: dup
    //   265: getstatic 161	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   268: invokespecial 165	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   271: invokeinterface 172 2 0
    //   276: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   279: invokeinterface 148 1 0
    //   284: new 155	org/bukkit/inventory/ItemStack
    //   287: dup
    //   288: getstatic 161	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   291: invokespecial 165	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   294: invokeinterface 175 2 0
    //   299: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   302: invokeinterface 148 1 0
    //   307: new 155	org/bukkit/inventory/ItemStack
    //   310: dup
    //   311: getstatic 161	org/bukkit/Material:AIR	Lorg/bukkit/Material;
    //   314: invokespecial 165	org/bukkit/inventory/ItemStack:<init>	(Lorg/bukkit/Material;)V
    //   317: invokeinterface 178 2 0
    //   322: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   325: dconst_0
    //   326: invokeinterface 182 3 0
    //   331: aload_1
    //   332: iconst_0
    //   333: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   336: invokevirtual 185	nano/spook1998/rust/object/User:setDeathStatus	(Ljava/lang/Boolean;)V
    //   339: aload_0
    //   340: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   343: invokestatic 190	nano/spook1998/rust/utils/HumanUtil:spawnAllBot	(Lorg/bukkit/entity/Player;)V
    //   346: new 192	nano/spook1998/rust/utils/tag/Tag
    //   349: aload_0
    //   350: getfield 17	nano/spook1998/rust/listeners/F:ALLATORIxDEMO	Lorg/bukkit/entity/Player;
    //   353: invokespecial 194	nano/spook1998/rust/utils/tag/Tag:<init>	(Lorg/bukkit/entity/Player;)V
    //   356: return
    // Line number table:
    //   Java source line #24	-> byte code offset #0
    //   Java source line #194	-> byte code offset #15
    //   Java source line #142	-> byte code offset #21
    //   Java source line #3	-> byte code offset #57
    //   Java source line #160	-> byte code offset #74
    //   Java source line #89	-> byte code offset #99
    //   Java source line #160	-> byte code offset #108
    //   Java source line #5	-> byte code offset #116
    //   Java source line #86	-> byte code offset #153
    //   Java source line #29	-> byte code offset #178
    //   Java source line #86	-> byte code offset #187
    //   Java source line #60	-> byte code offset #195
    //   Java source line #129	-> byte code offset #204
    //   Java source line #21	-> byte code offset #213
    //   Java source line #175	-> byte code offset #230
    //   Java source line #112	-> byte code offset #253
    //   Java source line #70	-> byte code offset #276
    //   Java source line #158	-> byte code offset #299
    //   Java source line #138	-> byte code offset #322
    //   Java source line #39	-> byte code offset #331
    //   Java source line #59	-> byte code offset #339
    //   Java source line #174	-> byte code offset #346
    //   Java source line #18	-> byte code offset #356
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	a	F
  }
  
  F(PlayerJoinEvent paramPlayerJoinEvent, Player paramPlayer) {}
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */