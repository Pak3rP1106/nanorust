/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ColorUtil
/*     */ {
/*     */   /* Error */
/*     */   public static String fixColor(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ifnonnull +75 -> 76
/*     */     //   4: new 9	java/lang/StringBuilder
/*     */     //   7: dup
/*     */     //   8: invokestatic 15	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   11: iconst_0
/*     */     //   12: bipush 9
/*     */     //   14: invokevirtual 19	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   17: invokestatic 25	java/lang/String:valueOf	(I)Ljava/lang/String;
/*     */     //   20: invokespecial 29	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   23: ldc 31
/*     */     //   25: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   28: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   31: invokestatic 15	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   34: iconst_0
/*     */     //   35: bipush 9
/*     */     //   37: invokevirtual 19	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   40: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   43: ldc 31
/*     */     //   45: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   48: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   51: invokestatic 15	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   54: iconst_0
/*     */     //   55: bipush 9
/*     */     //   57: invokevirtual 19	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   60: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   63: ldc 31
/*     */     //   65: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   68: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   71: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   74: areturn
/*     */     //   75: athrow
/*     */     //   76: bipush 38
/*     */     //   78: aload_0
/*     */     //   79: ldc 47
/*     */     //   81: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   84: ldc 49
/*     */     //   86: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   89: invokevirtual 53	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   92: ldc 55
/*     */     //   94: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   97: ldc 49
/*     */     //   99: invokestatic 34	nano/spook1998/rust/utils/ColorUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   102: invokevirtual 53	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   105: invokestatic 61	org/bukkit/ChatColor:translateAlternateColorCodes	(CLjava/lang/String;)Ljava/lang/String;
/*     */     //   108: areturn
/*     */     // Line number table:
/*     */     //   Java source line #146	-> byte code offset #0
/*     */     //   Java source line #46	-> byte code offset #76
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	109	0	a	String
/*     */   }
/*     */   
/*     */   public static List<String> fixColor(List<String> a)
/*     */   {
/*  41 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     Iterator localIterator;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     String str;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */     for (goto 42; localIterator.hasNext(); localArrayList.add(fixColor(str)))
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       str = (String)localIterator.next();
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
/* 164 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp15_14 = 2;
/*     */     int tmp21_20 = 4;
/*     */     int tmp31_28 = a.length();
/*     */     int tmp35_34 = 1;
/*     */     tmp35_34;
/*     */     int j;
/*     */     int ? = tmp35_34;
/*     */     int k = tmp31_28;
/*     */     int tmp45_41 = (j = new char[tmp31_28] - 1);
/*     */     tmp45_41;
/*     */     int i = tmp21_20 << tmp21_20 ^ 4 << 1;
/*     */     ((0x3 ^ 0x5) << 4 ^ tmp15_14 << tmp15_14 ^ 0x1);
/*     */     if (tmp45_41 >= 0)
/*     */     {
/*     */       int tmp55_54 = j;
/*     */       j--;
/*     */       ?[tmp55_54] = ((char)(a.charAt(tmp55_54) ^ i));
/*     */       int tmp76_73 = (j--);
/*     */       ?[tmp76_73] = ((char)(a.charAt(tmp76_73) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\ColorUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */