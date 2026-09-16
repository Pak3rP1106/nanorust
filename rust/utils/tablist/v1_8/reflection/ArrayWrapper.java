/*     */ package nano.spook1998.rust.utils.tablist.v1_8.reflection;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import org.apache.commons.lang.Validate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ArrayWrapper<E>
/*     */ {
/*     */   private E[] ALLATORIxDEMO;
/*     */   
/*     */   public E[] getArray()
/*     */   {
/*  97 */     return a.ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */   @SafeVarargs
/*     */   public ArrayWrapper(E... a)
/*     */   {
/*  45 */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */       a.setArray(a);
/*     */   }
/*     */   
/*     */   public void setArray(E[] a)
/*     */   {
/* 123 */     Object[] tmp2_1 = a;Validate.notNull(tmp2_1, ALLATORIxDEMO("bUqFz\007`FmIlS#Ef\007mRoK"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     a.ALLATORIxDEMO = tmp2_1;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/*     */     return Arrays.hashCode(a.ALLATORIxDEMO);
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
/*     */     int i = 3;
/*     */     if (((0x2 ^ 0x5) << 3 ^ 0x2 ^ 0x5) >= 0)
/*     */     {
/*     */       int tmp44_43 = j;
/*     */       j--;
/*     */       ?[tmp44_43] = ((char)(a.charAt(tmp44_43) ^ i));
/*     */       int tmp65_62 = (j--);
/*     */       ?[tmp65_62] = ((char)(a.charAt(tmp65_62) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static <T> T[] toArray(Iterable<? extends T> a, Class<T> a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_m1
/*     */     //   1: istore_2
/*     */     //   2: aload_0
/*     */     //   3: instanceof 41
/*     */     //   6: ifeq +15 -> 21
/*     */     //   9: aload_0
/*     */     //   10: checkcast 41	java/util/Collection
/*     */     //   13: dup
/*     */     //   14: astore_3
/*     */     //   15: invokeinterface 44 1 0
/*     */     //   20: istore_2
/*     */     //   21: iload_2
/*     */     //   22: ifge +42 -> 64
/*     */     //   25: iconst_0
/*     */     //   26: istore_2
/*     */     //   27: aload_0
/*     */     //   28: invokeinterface 50 1 0
/*     */     //   33: dup
/*     */     //   34: astore 4
/*     */     //   36: goto +20 -> 56
/*     */     //   39: athrow
/*     */     //   40: aload 4
/*     */     //   42: iinc 2 1
/*     */     //   45: invokeinterface 56 1 0
/*     */     //   50: checkcast 5	java/lang/Object
/*     */     //   53: astore_3
/*     */     //   54: aload 4
/*     */     //   56: invokeinterface 60 1 0
/*     */     //   61: ifne -21 -> 40
/*     */     //   64: aload_1
/*     */     //   65: iload_2
/*     */     //   66: invokestatic 66	java/lang/reflect/Array:newInstance	(Ljava/lang/Class;I)Ljava/lang/Object;
/*     */     //   69: checkcast 67	[Ljava/lang/Object;
/*     */     //   72: astore_3
/*     */     //   73: iconst_0
/*     */     //   74: istore 4
/*     */     //   76: aload_0
/*     */     //   77: invokeinterface 50 1 0
/*     */     //   82: dup
/*     */     //   83: astore_2
/*     */     //   84: goto +23 -> 107
/*     */     //   87: athrow
/*     */     //   88: aload_2
/*     */     //   89: invokeinterface 56 1 0
/*     */     //   94: checkcast 5	java/lang/Object
/*     */     //   97: astore_1
/*     */     //   98: aload_2
/*     */     //   99: aload_3
/*     */     //   100: iload 4
/*     */     //   102: aload_1
/*     */     //   103: iinc 4 1
/*     */     //   106: aastore
/*     */     //   107: invokeinterface 60 1 0
/*     */     //   112: ifne -24 -> 88
/*     */     //   115: aload_3
/*     */     //   116: areturn
/*     */     // Line number table:
/*     */     //   Java source line #47	-> byte code offset #0
/*     */     //   Java source line #113	-> byte code offset #2
/*     */     //   Java source line #68	-> byte code offset #9
/*     */     //   Java source line #141	-> byte code offset #15
/*     */     //   Java source line #56	-> byte code offset #21
/*     */     //   Java source line #24	-> byte code offset #25
/*     */     //   Java source line #194	-> byte code offset #27
/*     */     //   Java source line #142	-> byte code offset #42
/*     */     //   Java source line #194	-> byte code offset #54
/*     */     //   Java source line #89	-> byte code offset #64
/*     */     //   Java source line #72	-> byte code offset #73
/*     */     //   Java source line #5	-> byte code offset #76
/*     */     //   Java source line #86	-> byte code offset #99
/*     */     //   Java source line #5	-> byte code offset #107
/*     */     //   Java source line #163	-> byte code offset #115
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	117	0	a	Iterable
/*     */     //   0	117	1	a	Class
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean equals(Object a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof 2
/*     */     //   4: ifne +6 -> 10
/*     */     //   7: iconst_0
/*     */     //   8: ireturn
/*     */     //   9: athrow
/*     */     //   10: aload_0
/*     */     //   11: getfield 13	nano/spook1998/rust/utils/tablist/v1_8/reflection/ArrayWrapper:ALLATORIxDEMO	[Ljava/lang/Object;
/*     */     //   14: aload_1
/*     */     //   15: checkcast 2	nano/spook1998/rust/utils/tablist/v1_8/reflection/ArrayWrapper
/*     */     //   18: getfield 13	nano/spook1998/rust/utils/tablist/v1_8/reflection/ArrayWrapper:ALLATORIxDEMO	[Ljava/lang/Object;
/*     */     //   21: invokestatic 90	java/util/Arrays:equals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*     */     //   24: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #96	-> byte code offset #0
/*     */     //   Java source line #92	-> byte code offset #7
/*     */     //   Java source line #13	-> byte code offset #10
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	25	0	a	ArrayWrapper
/*     */     //   0	25	1	a	Object
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_8\reflection\ArrayWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */