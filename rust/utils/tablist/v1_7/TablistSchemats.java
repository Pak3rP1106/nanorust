/*     */ package nano.spook1998.rust.utils.tablist.v1_7;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TablistSchemats
/*     */ {
/*     */   public static String[] getScheme()
/*     */   {
/*  32 */     return (String[])ALLATORIxDEMO.clone();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String[] uniqueFields()
/*     */   {
/* 182 */     LinkedList localLinkedList = new LinkedList();Random localRandom = new Random();
/*     */     StringBuilder localStringBuilder;
/* 113 */     int i = 0;
/* 104 */     for ((localStringBuilder = new StringBuilder()).append(ALLATORIxDEMO("Ã>")); i < 60;) { throw i;
/*     */       int j;
/* 110 */       for (; localLinkedList.contains(localStringBuilder.toString()); 
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */           ++j < 3)
/*     */       {
/*  68 */         localStringBuilder.setLength(0);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         continue;throw (j = 0);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */         String str = b[localRandom.nextInt(b.length)];localStringBuilder.append(str);
/*     */       }
/* 113 */       (i++).add(localStringBuilder.toString());
/*     */     }
/*  89 */     Collections.sort(localLinkedList); int tmp137_136 = 1;tmp137_136;return (String[])new String[60].toArray(tmp137_136);
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
/*     */   static
/*     */   {
/* 146 */     int tmp6_5 = 1;tmp6_5; int tmp8_6 = tmp6_5;tmp8_6[0] = ALLATORIxDEMO("|"); int tmp16_8 = tmp8_6;tmp16_8[1] = ALLATORIxDEMO("}"); int tmp24_16 = tmp16_8;tmp24_16[2] = ALLATORIxDEMO("~"); int tmp32_24 = tmp24_16;tmp32_24[3] = ALLATORIxDEMO(""); int tmp40_32 = tmp32_24;tmp40_32[4] = ALLATORIxDEMO("x"); int tmp48_40 = tmp40_32;tmp48_40[5] = ALLATORIxDEMO("y"); int tmp56_48 = tmp48_40;tmp56_48[6] = ALLATORIxDEMO("z"); int tmp65_56 = tmp56_48;tmp65_56[7] = ALLATORIxDEMO("{"); int tmp74_65 = tmp65_56;tmp74_65[8] = ALLATORIxDEMO("t"); int tmp83_74 = tmp74_65;tmp83_74[9] = ALLATORIxDEMO("u");b = tmp83_74; int tmp101_100 = 1;tmp101_100;ALLATORIxDEMO = tmp101_100;
/*     */   }
/*     */   
/*     */   public TablistSchemats(String[] a) {
/* 150 */     ALLATORIxDEMO = a;a.ALLATORIxDEMO();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static List<Integer> getEdit()
/*     */   {
/* 162 */     return M;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 167 */   private static List<Integer> M = new ArrayList();
/*     */   private static final String[] b;
/*     */   private static String[] ALLATORIxDEMO;
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp8_7 = 4;
/*     */     int tmp29_26 = a.length();
/*     */     int tmp33_32 = 1;
/*     */     tmp33_32;
/*     */     int j;
/*     */     int ? = tmp33_32;
/*     */     int k = tmp29_26;
/*     */     int tmp43_39 = (j = new char[tmp29_26] - 1);
/*     */     tmp43_39;
/*     */     int i = (0x3 ^ 0x5) << 4 ^ 2 << 1;
/*     */     (tmp8_7 << tmp8_7 ^ (0x3 ^ 0x5) << 1);
/*     */     if (tmp43_39 >= 0)
/*     */     {
/*     */       int tmp53_52 = j;
/*     */       j--;
/*     */       ?[tmp53_52] = ((char)(a.charAt(tmp53_52) ^ i));
/*     */       int tmp74_71 = (j--);
/*     */       ?[tmp74_71] = ((char)(a.charAt(tmp74_71) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_7\TablistSchemats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */