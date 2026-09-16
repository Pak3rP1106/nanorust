/*     */ package nano.spook1998.rust.utils;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RandomUtil
/*     */ {
/*     */   public static RandomUtil instance;
/*     */   private static Random ALLATORIxDEMO;
/*     */   
/*     */   public static RandomUtil getInstance()
/*     */   {
/* 150 */     if (instance == null) new RandomUtil();
/*  23 */     return instance;
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
/*     */   public int nextInt(int a)
/*     */   {
/*  93 */     return ALLATORIxDEMO.nextInt(a);
/*     */   }
/*     */   
/*     */   public RandomUtil()
/*     */   {
/*  46 */     instance = 
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */     ALLATORIxDEMO = new Random();
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp25_22 = a.length();
/*     */     int tmp29_28 = 1;
/*     */     tmp29_28;
/*     */     int j;
/*     */     int ? = tmp29_28;
/*     */     int k = tmp25_22;
/*     */     (j = new char[tmp25_22] - 1);
/*     */     int i = 5 << 4;
/*     */     if ((5 << 4 ^ 3 << 2 ^ 0x1) >= 0)
/*     */     {
/*     */       int tmp48_47 = j;
/*     */       j--;
/*     */       ?[tmp48_47] = ((char)(a.charAt(tmp48_47) ^ i));
/*     */       int tmp69_66 = (j--);
/*     */       ?[tmp69_66] = ((char)(a.charAt(tmp69_66) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Double getRandDouble(double a, double a)
/*     */     throws java.lang.IllegalArgumentException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: dload_3
/*     */     //   1: dload_1
/*     */     //   2: dcmpl
/*     */     //   3: ifle +8 -> 11
/*     */     //   6: iconst_1
/*     */     //   7: goto +5 -> 12
/*     */     //   10: athrow
/*     */     //   11: iconst_0
/*     */     //   12: ldc 34
/*     */     //   14: invokestatic 36	nano/spook1998/rust/utils/RandomUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   17: invokestatic 42	org/apache/commons/lang/Validate:isTrue	(ZLjava/lang/String;)V
/*     */     //   20: getstatic 44	nano/spook1998/rust/utils/RandomUtil:ALLATORIxDEMO	Ljava/util/Random;
/*     */     //   23: invokevirtual 50	java/util/Random:nextDouble	()D
/*     */     //   26: dload_3
/*     */     //   27: dload_1
/*     */     //   28: dsub
/*     */     //   29: dmul
/*     */     //   30: dload_1
/*     */     //   31: dadd
/*     */     //   32: invokestatic 56	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   35: areturn
/*     */     // Line number table:
/*     */     //   Java source line #96	-> byte code offset #0
/*     */     //   Java source line #92	-> byte code offset #20
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	36	0	a	RandomUtil
/*     */     //   0	36	1	a	double
/*     */     //   0	36	3	a	double
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public int getRandInt(int a, int a)
/*     */     throws java.lang.IllegalArgumentException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iload_1
/*     */     //   2: if_icmple +8 -> 10
/*     */     //   5: iconst_1
/*     */     //   6: goto +5 -> 11
/*     */     //   9: athrow
/*     */     //   10: iconst_0
/*     */     //   11: ldc 34
/*     */     //   13: invokestatic 36	nano/spook1998/rust/utils/RandomUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   16: invokestatic 42	org/apache/commons/lang/Validate:isTrue	(ZLjava/lang/String;)V
/*     */     //   19: getstatic 44	nano/spook1998/rust/utils/RandomUtil:ALLATORIxDEMO	Ljava/util/Random;
/*     */     //   22: iload_2
/*     */     //   23: iload_1
/*     */     //   24: isub
/*     */     //   25: iconst_1
/*     */     //   26: iadd
/*     */     //   27: invokevirtual 65	java/util/Random:nextInt	(I)I
/*     */     //   30: iload_1
/*     */     //   31: iadd
/*     */     //   32: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #38	-> byte code offset #0
/*     */     //   Java source line #123	-> byte code offset #19
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	33	0	a	RandomUtil
/*     */     //   0	33	1	a	int
/*     */     //   0	33	2	a	int
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Float getRandFloat(float a, float a)
/*     */     throws java.lang.IllegalArgumentException
/*     */   {
/*     */     // Byte code:
/*     */     //   0: fload_2
/*     */     //   1: fload_1
/*     */     //   2: fcmpl
/*     */     //   3: ifle +8 -> 11
/*     */     //   6: iconst_1
/*     */     //   7: goto +5 -> 12
/*     */     //   10: athrow
/*     */     //   11: iconst_0
/*     */     //   12: ldc 34
/*     */     //   14: invokestatic 36	nano/spook1998/rust/utils/RandomUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   17: invokestatic 42	org/apache/commons/lang/Validate:isTrue	(ZLjava/lang/String;)V
/*     */     //   20: getstatic 44	nano/spook1998/rust/utils/RandomUtil:ALLATORIxDEMO	Ljava/util/Random;
/*     */     //   23: invokevirtual 72	java/util/Random:nextFloat	()F
/*     */     //   26: fload_2
/*     */     //   27: fload_1
/*     */     //   28: fsub
/*     */     //   29: fmul
/*     */     //   30: fload_1
/*     */     //   31: fadd
/*     */     //   32: invokestatic 77	java/lang/Float:valueOf	(F)Ljava/lang/Float;
/*     */     //   35: areturn
/*     */     // Line number table:
/*     */     //   Java source line #155	-> byte code offset #0
/*     */     //   Java source line #162	-> byte code offset #20
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	36	0	a	RandomUtil
/*     */     //   0	36	1	a	float
/*     */     //   0	36	2	a	float
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean getChance(double a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: dload_1
/*     */     //   1: ldc2_w 90
/*     */     //   4: dcmpl
/*     */     //   5: ifge +22 -> 27
/*     */     //   8: dload_1
/*     */     //   9: aload_0
/*     */     //   10: dconst_0
/*     */     //   11: ldc2_w 90
/*     */     //   14: invokevirtual 93	nano/spook1998/rust/utils/RandomUtil:getRandDouble	(DD)Ljava/lang/Double;
/*     */     //   17: invokevirtual 96	java/lang/Double:doubleValue	()D
/*     */     //   20: dcmpl
/*     */     //   21: ifge +6 -> 27
/*     */     //   24: iconst_0
/*     */     //   25: ireturn
/*     */     //   26: athrow
/*     */     //   27: iconst_1
/*     */     //   28: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #182	-> byte code offset #0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	29	0	a	RandomUtil
/*     */     //   0	29	1	a	double
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\RandomUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */