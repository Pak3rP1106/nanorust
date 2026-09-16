/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.bukkit.enchantments.Enchantment;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EnchantmentsUtil
/*     */ {
/*     */   public static EnchantmentsUtil getInstance()
/*     */   {
/*  23 */     if (ALLATORIxDEMO == null)
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
/*  97 */       new EnchantmentsUtil();
/*     */     }
/*  38 */     return ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */   public void loadEnchantments()
/*     */   {
/*   6 */     b.put(ALLATORIxDEMO("\001F"), Enchantment.ARROW_INFINITE);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */     b.put(ALLATORIxDEMO("Z\016C\tB\t[\005K\001]\022@\027\\"), Enchantment.ARROW_INFINITE);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */     b.put(ALLATORIxDEMO("Z\016C\tB\t[\005K"), Enchantment.ARROW_INFINITE);b.put(ALLATORIxDEMO("\tA\006F\016F\024J"), Enchantment.ARROW_INFINITE);b.put(ALLATORIxDEMO("\tA\006F\016F\024V"), Enchantment.ARROW_INFINITE);b.put(ALLATORIxDEMO("F\016I\001]\022@\027\\"), Enchantment.ARROW_INFINITE);b.put(ALLATORIxDEMO("\tA\006F\016F\024J\001]\022@\027\\"), Enchantment.ARROW_INFINITE);b.put(ALLATORIxDEMO("\001D"), Enchantment.ARROW_KNOCKBACK);b.put(ALLATORIxDEMO("\001]\022@\027_\025A\003G"), Enchantment.ARROW_KNOCKBACK);b.put(ALLATORIxDEMO("_\025A\003G"), Enchantment.ARROW_KNOCKBACK);b.put(ALLATORIxDEMO("N\022]\017X\013M"), Enchantment.ARROW_KNOCKBACK);b.put(ALLATORIxDEMO("\001]\022@\027D\016@\003D\002N\003D"), Enchantment.ARROW_KNOCKBACK);b.put(ALLATORIxDEMO("\001K"), Enchantment.ARROW_DAMAGE);b.put(ALLATORIxDEMO("\001]\022@\027_\017X\005]"), Enchantment.ARROW_DAMAGE);b.put(ALLATORIxDEMO("_\017X\005]"), Enchantment.ARROW_DAMAGE);b.put(ALLATORIxDEMO("N\022]\017X\004N\rN\007J"), Enchantment.ARROW_DAMAGE);b.put(ALLATORIxDEMO("\001I"), Enchantment.ARROW_FIRE);b.put(ALLATORIxDEMO("\006C\001B\005N\022]\017X"), Enchantment.ARROW_FIRE);b.put(ALLATORIxDEMO("I\fN\rJ"), Enchantment.ARROW_FIRE);b.put(ALLATORIxDEMO("I\t]\005N\022]\017X"), Enchantment.ARROW_FIRE);b.put(ALLATORIxDEMO("\027X"), Enchantment.WATER_WORKER);b.put(ALLATORIxDEMO("X\001[\005]\rF\016J"), Enchantment.WATER_WORKER);b.put(ALLATORIxDEMO("\001^\025N\001I\006F\016F\024V"), Enchantment.WATER_WORKER);b.put(ALLATORIxDEMO("X\001[\005]\027@\022D\005]"), Enchantment.WATER_WORKER);b.put(ALLATORIxDEMO("\023["), Enchantment.SILK_TOUCH);b.put(ALLATORIxDEMO("\\\017I\024[\017Z\003G"), Enchantment.SILK_TOUCH);b.put(ALLATORIxDEMO("\\\tC\013[\017Z\003G"), Enchantment.SILK_TOUCH);b.put(ALLATORIxDEMO("\020_"), Enchantment.PROTECTION_PROJECTILE);b.put(ALLATORIxDEMO("\020]\017E\020]\017["), Enchantment.PROTECTION_PROJECTILE);b.put(ALLATORIxDEMO("\020]\017E\005L\024F\fJ\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_PROJECTILE);b.put(ALLATORIxDEMO("\020I"), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("I\fN\rJ\020]\017["), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("\006F\022J\020]\017["), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("\006C\001B\005_\022@\024J\003["), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("I\t]\005_\022@\024J\003["), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("I\fN\rJ\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("\006F\022J\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_FIRE);b.put(ALLATORIxDEMO("_\006N"), Enchantment.PROTECTION_FALL);b.put(ALLATORIxDEMO("\006J\001[\bJ\022I\001C\fF\016H"), Enchantment.PROTECTION_FALL);b.put(ALLATORIxDEMO("I\005N\024G\005]\006N\fC"), Enchantment.PROTECTION_FALL);b.put(ALLATORIxDEMO("\006N\fC\020]\017["), Enchantment.PROTECTION_FALL);b.put(ALLATORIxDEMO("\006N\fC\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_FALL);b.put(ALLATORIxDEMO("\020J"), Enchantment.PROTECTION_EXPLOSIONS);b.put(ALLATORIxDEMO("\002C\001\\\024_\022@\024J\003["), Enchantment.PROTECTION_EXPLOSIONS);b.put(ALLATORIxDEMO("M\fN\023[\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_EXPLOSIONS);b.put(ALLATORIxDEMO("J\030_\020]\017["), Enchantment.PROTECTION_EXPLOSIONS);b.put(ALLATORIxDEMO("J\030_\f@\023F\017A\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_EXPLOSIONS);b.put(ALLATORIxDEMO("\005W\020C\017\\\t@\016\\\020]\017[\005L\024F\017A"), Enchantment.PROTECTION_EXPLOSIONS);b.put(ALLATORIxDEMO("_"), Enchantment.PROTECTION_ENVIRONMENTAL);b.put(ALLATORIxDEMO("_\022@\024J\003["), Enchantment.PROTECTION_ENVIRONMENTAL);b.put(ALLATORIxDEMO("\020]\017["), Enchantment.PROTECTION_ENVIRONMENTAL);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */   private static Map<String, Enchantment> b = new HashMap();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static EnchantmentsUtil ALLATORIxDEMO;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EnchantmentsUtil()
/*     */   {
/* 167 */     ALLATORIxDEMO = a;a.loadEnchantments();
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Enchantment getEnchant(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 14	nano/spook1998/rust/utils/EnchantmentsUtil:b	Ljava/util/Map;
/*     */     //   3: aload_1
/*     */     //   4: invokeinterface 20 2 0
/*     */     //   9: ifeq +17 -> 26
/*     */     //   12: getstatic 14	nano/spook1998/rust/utils/EnchantmentsUtil:b	Ljava/util/Map;
/*     */     //   15: aload_1
/*     */     //   16: invokeinterface 24 2 0
/*     */     //   21: checkcast 26	org/bukkit/enchantments/Enchantment
/*     */     //   24: areturn
/*     */     //   25: athrow
/*     */     //   26: aconst_null
/*     */     //   27: areturn
/*     */     // Line number table:
/*     */     //   Java source line #17	-> byte code offset #0
/*     */     //   Java source line #37	-> byte code offset #12
/*     */     //   Java source line #63	-> byte code offset #26
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	28	0	a	EnchantmentsUtil
/*     */     //   0	28	1	a	String
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
/*     */     int i = (0x3 ^ 0x5) << 4;
/*     */     if ((5 << 3 ^ 0x1) >= 0)
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


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\EnchantmentsUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */