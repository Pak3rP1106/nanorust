/*     */ package nano.spook1998.rust.utils.tablist.v1_8.json;
/*     */ 
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import nano.spook1998.rust.utils.tablist.v1_8.reflection.transition.Packets;
/*     */ 
/*     */ public class JSONPacketBuilder
/*     */ {
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp6_5 = 3;
/*     */     int tmp23_20 = a.length();
/*     */     int tmp27_26 = 1;
/*     */     tmp27_26;
/*     */     int j;
/*     */     int ? = tmp27_26;
/*     */     int k = tmp23_20;
/*     */     int tmp37_33 = (j = new char[tmp23_20] - 1);
/*     */     tmp37_33;
/*     */     int i = 2 << 3 ^ 0x3 ^ 0x5;
/*     */     (tmp6_5 << tmp6_5 ^ 0x2 ^ 0x5);
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
/*     */   
/*     */   public static Object build(String a)
/*     */   {
/*  23 */     int tmp16_15 = 1;tmp16_15; int tmp18_16 = tmp16_15;tmp18_16[0] = String.class;Method localMethod = nano.spook1998.rust.utils.tablist.v1_8.reflection.ReflectionUtils.getTypedMethod(ALLATORIxDEMO("~"), Packets.ICHAT_BASE_COMPONENT, new Class[1], tmp18_16);
/*     */     
/*     */ 
/*     */ 
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
/*  38 */       int tmp34_33 = 1;tmp34_33; int tmp36_34 = tmp34_33;tmp36_34[0] = a;return null.invoke(new Object[1], tmp36_34); } catch (IllegalAccessException|IllegalArgumentException|InvocationTargetException localIllegalAccessException1) {} throw localMethod;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_8\json\JSONPacketBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */