/*     */ package nano.spook1998.rust.utils.tablist.v1_8.reflection.transition;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.utils.tablist.v1_8.reflection.ReflectionUtils;
/*     */ import net.minecraft.server.v1_8_R3.EntityPlayer;
/*     */ import net.minecraft.server.v1_8_R3.PlayerConnection;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Packets
/*     */ {
/*     */   public static EntityPlayer getPlayerEntity(Player a)
/*     */   {
/*  77 */     return ((CraftPlayer)a).getHandle();
/*     */   }
/*     */   
/*     */   public static void sendPacket(List<Player> a, Object a)
/*     */   {
/*     */     Iterator localIterator;
/*   5 */     for (goto 26; localIterator.hasNext();)
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       sendPacket((Player)localIterator.next(), a);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public static PlayerConnection getPlayerConnection(Player a)
/*     */   {
/* 110 */     return getPlayerEntity(a).playerConnection;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */   public static Class<?> ICHAT_BASE_COMPONENT = ReflectionUtils.getCraftClass(ALLATORIxDEMO("A6`\024|7i\006m6g\030x\032f\020f\001"));
/*     */   
/*     */ 
/*     */ 
/* 123 */   public static Class<?> PACKET_PLAY_OUT_PLAYER_INFO = ReflectionUtils.getCraftClass(ALLATORIxDEMO("%i\026c\020|%d\024q:}\001X\031i\fm\007A\033n\032"));
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */   public static Class<?> ICHAT_BASE_COMPONENT$CHAT_SERIALIZER = ReflectionUtils.getCraftClass(ALLATORIxDEMO("<K\035i\001J\024{\020K\032e\005g\033m\033|QK\035i\001[\020z\034i\031a\017m\007"));
/* 171 */   static { PACKET_PLAY_OUT_PLAYER_LIST_HEADER_FOOTER = ReflectionUtils.getCraftClass(ALLATORIxDEMO("%i\026c\020|%d\024q:}\001X\031i\fm\007D\034{\001@\020i\021m\007N\032g\001m\007"));PACKET_PLAY_OUT_PLAYER_INFO$ENUM_PLAYER_INFO_ACTION = ReflectionUtils.getCraftClass(ALLATORIxDEMO("X\024k\036m\001X\031i\fG\000|%d\024q\020z<f\023gQM\033}\030X\031i\fm\007A\033n\032I\026|\034g\033"));PACKET_PLAY_OUT_PLAYER_INFO$PLAYER_INFO_DATA = ReflectionUtils.getCraftClass(ALLATORIxDEMO("X\024k\036m\001X\031i\fG\000|%d\024q\020z<f\023gQX\031i\fm\007A\033n\032L\024|\024"));
/*     */   }
/*     */   
/*     */   public static Class<?> PACKET_PLAY_OUT_PLAYER_INFO$PLAYER_INFO_DATA;
/*     */   public static Class<?> PACKET_PLAY_OUT_PLAYER_LIST_HEADER_FOOTER;
/*     */   public static Class<?> PACKET_PLAY_OUT_PLAYER_INFO$ENUM_PLAYER_INFO_ACTION;
/*     */   public static void sendPacketRadius(Location a, int a, Object a)
/*     */   {
/*     */     Iterator localIterator;
/*  56 */     for (goto 57; localIterator.hasNext();) { Player localPlayer = (Player)localIterator.next(); int tmp43_42 = a;
/*  24 */       if (a.distanceSquared(localPlayer.getLocation()) < tmp43_42 * tmp43_42)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         sendPacket(localPlayer, a);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp19_16 = a.length();
/*     */     int tmp23_22 = 1;
/*     */     tmp23_22;
/*     */     int j;
/*     */     int ? = tmp23_22;
/*     */     int k = tmp19_16;
/*     */     (j = new char[tmp19_16] - 1);
/*     */     int i = 1 << 3;
/*     */     if ((1 << 3 ^ 0x1) >= 0)
/*     */     {
/*     */       int tmp42_41 = j;
/*     */       j--;
/*     */       ?[tmp42_41] = ((char)(a.charAt(tmp42_41) ^ i));
/*     */       int tmp63_60 = (j--);
/*     */       ?[tmp63_60] = ((char)(a.charAt(tmp63_60) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void sendPacket(Player a, Object a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic 60	nano/spook1998/rust/utils/tablist/v1_8/reflection/transition/Packets:getPlayerConnection	(Lorg/bukkit/entity/Player;)Lnet/minecraft/server/v1_8_R3/PlayerConnection;
/*     */     //   4: aload_1
/*     */     //   5: checkcast 62	net/minecraft/server/v1_8_R3/Packet
/*     */     //   8: invokevirtual 67	net/minecraft/server/v1_8_R3/PlayerConnection:sendPacket	(Lnet/minecraft/server/v1_8_R3/Packet;)V
/*     */     //   11: return
/*     */     //   12: athrow
/*     */     //   13: astore_1
/*     */     //   14: return
/*     */     // Line number table:
/*     */     //   Java source line #21	-> byte code offset #0
/*     */     //   Java source line #175	-> byte code offset #11
/*     */     //   Java source line #112	-> byte code offset #14
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	15	0	a	Player
/*     */     //   0	15	1	a	Object
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	11	13	java/lang/SecurityException
/*     */     //   0	11	13	java/lang/IllegalArgumentException
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_8\reflection\transition\Packets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */