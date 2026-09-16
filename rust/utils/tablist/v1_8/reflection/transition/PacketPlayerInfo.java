/*     */ package nano.spook1998.rust.utils.tablist.v1_8.reflection.transition;
/*     */ 
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import nano.spook1998.rust.data.Settings;
/*     */ import nano.spook1998.rust.utils.ColorUtil;
/*     */ import nano.spook1998.rust.utils.tablist.v1_8.json.JSONPacketBuilder;
/*     */ import nano.spook1998.rust.utils.tablist.v1_8.reflection.ReflectionUtils;
/*     */ import net.minecraft.server.v1_8_R3.WorldSettings.EnumGamemode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PacketPlayerInfo
/*     */ {
/*     */   static
/*     */   {
/*  38 */     int tmp8_7 = 1;tmp8_7; } private static final Object ALLATORIxDEMO = ReflectionUtils.getConstructor(new Object[0], tmp8_7);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Object getPlayerInfo(GameProfile a, String a)
/*     */   {
/*  78 */     Constructor localConstructor = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 119 */       int tmp10_9 = 1;tmp10_9; int tmp12_10 = tmp10_9;tmp12_10[0] = Packets.PACKET_PLAY_OUT_PLAYER_INFO; int tmp18_12 = tmp12_10;tmp18_12[1] = GameProfile.class; int tmp23_18 = tmp18_12;tmp23_18[2] = Integer.TYPE; int tmp29_23 = tmp23_18;tmp29_23[3] = WorldSettings.EnumGamemode.class; int tmp34_29 = tmp29_23;tmp34_29[4] = Packets.ICHAT_BASE_COMPONENT;localConstructor = new Class[5].getDeclaredConstructor(tmp34_29);
/*     */     }
/*     */     catch (NoSuchMethodException|SecurityException localNoSuchMethodException)
/*     */     {
/*     */       try
/*     */       {
/*  92 */         int tmp56_55 = 1;tmp56_55; int tmp58_56 = tmp56_55;tmp58_56[0] = ALLATORIxDEMO; int tmp64_58 = tmp58_56;tmp64_58[1] = a; int tmp68_64 = tmp64_58;tmp68_64[2] = Settings.TABLIST_PING; int tmp74_68 = tmp68_64;tmp74_68[3] = WorldSettings.EnumGamemode.SURVIVAL; int tmp80_74 = tmp74_68; int tmp85_84 = 4; int tmp86_85 = tmp85_84;tmp86_85;tmp86_85.<init>(ALLATORIxDEMO("*\013%L)]s\023q\013"));tmp85_84[new java/lang/StringBuilder] = JSONPacketBuilder.build(ColorUtil.fixColor(a) + ALLATORIxDEMO("sT"));return tmp80_74.newInstance(tmp80_74); } catch (InstantiationException|IllegalAccessException|IllegalArgumentException|InvocationTargetException localInstantiationException) {} throw new Object[5];
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
/* 170 */     throw localConstructor;return null;
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp21_18 = a.length();
/*     */     int tmp25_24 = 1;
/*     */     tmp25_24;
/*     */     int j;
/*     */     int ? = tmp25_24;
/*     */     int k = tmp21_18;
/*     */     (j = new char[tmp21_18] - 1);
/*     */     int i = 5 << 4 ^ 0x1;
/*     */     if (((0x3 ^ 0x5) << 4 ^ 0x3) >= 0)
/*     */     {
/*     */       int tmp44_43 = j;
/*     */       j--;
/*     */       ?[tmp44_43] = ((char)(a.charAt(tmp44_43) ^ i));
/*     */       int tmp65_62 = (j--);
/*     */       ?[tmp65_62] = ((char)(a.charAt(tmp65_62) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_8\reflection\transition\PacketPlayerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */