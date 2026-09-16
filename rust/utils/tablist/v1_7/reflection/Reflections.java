/*     */ package nano.spook1998.rust.utils.tablist.v1_7.reflection;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Reflections
/*     */ {
/*     */   public static <T> FieldAccessor<T> getField(Class<?> a, Class<T> a, int a)
/*     */   {
/*  60 */     return ALLATORIxDEMO(a, null, a, a);
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
/*     */   public static Object getHandle(Entity a)
/*     */   {
/*     */     try
/*     */     {
/* 104 */       int tmp18_17 = 1;tmp18_17;return a.invoke(new Object[0], tmp18_17); } catch (Exception localException) {} throw getMethod(a.getClass(), ALLATORIxDEMO("R\002A/T\tQ\013P"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */     return null;
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
/*     */   public static String getVersion()
/*     */   {
/* 167 */     String str = Bukkit.getServer().getClass().getPackage().getName();return str.substring(str.lastIndexOf('.') + 1) + ALLATORIxDEMO("\033");
/*     */   }
/*     */   
/*     */   public static Object getHandle(World a)
/*     */   {
/*     */     try
/*     */     {
/*  56 */       int tmp18_17 = 1;tmp18_17;return a.invoke(new Object[0], tmp18_17); } catch (Exception localException) {} throw getMethod(a.getClass(), ALLATORIxDEMO("R\002A/T\tQ\013P"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */     return null;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Method getMethod(Class<?> a, String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 78	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
/*     */     //   4: dup
/*     */     //   5: astore 5
/*     */     //   7: arraylength
/*     */     //   8: istore 4
/*     */     //   10: iconst_0
/*     */     //   11: dup
/*     */     //   12: istore_3
/*     */     //   13: goto +27 -> 40
/*     */     //   16: athrow
/*     */     //   17: aload 5
/*     */     //   19: iload_3
/*     */     //   20: aaload
/*     */     //   21: dup
/*     */     //   22: astore_2
/*     */     //   23: invokevirtual 81	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual 85	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   30: ifeq +6 -> 36
/*     */     //   33: aload_2
/*     */     //   34: areturn
/*     */     //   35: athrow
/*     */     //   36: iinc 3 1
/*     */     //   39: iload_3
/*     */     //   40: iload 4
/*     */     //   42: if_icmplt -25 -> 17
/*     */     //   45: aconst_null
/*     */     //   46: areturn
/*     */     // Line number table:
/*     */     //   Java source line #16	-> byte code offset #0
/*     */     //   Java source line #43	-> byte code offset #23
/*     */     //   Java source line #148	-> byte code offset #33
/*     */     //   Java source line #16	-> byte code offset #36
/*     */     //   Java source line #181	-> byte code offset #45
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	47	0	a	Class
/*     */     //   0	47	1	a	String
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Class<?> getCraftClass(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 41	java/lang/StringBuilder
/*     */     //   3: dup
/*     */     //   4: ldc 98
/*     */     //   6: invokestatic 65	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   9: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   12: invokestatic 100	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:getVersion	()Ljava/lang/String;
/*     */     //   15: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   18: aload_0
/*     */     //   19: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   22: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   25: astore_1
/*     */     //   26: aconst_null
/*     */     //   27: astore_2
/*     */     //   28: aload_1
/*     */     //   29: invokestatic 103	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   32: astore_2
/*     */     //   33: aload_2
/*     */     //   34: areturn
/*     */     //   35: athrow
/*     */     //   36: astore_1
/*     */     //   37: aload_2
/*     */     //   38: areturn
/*     */     // Line number table:
/*     */     //   Java source line #97	-> byte code offset #0
/*     */     //   Java source line #164	-> byte code offset #26
/*     */     //   Java source line #123	-> byte code offset #28
/*     */     //   Java source line #171	-> byte code offset #34
/*     */     //   Java source line #93	-> byte code offset #37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	33	36	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static boolean classListEqual(Class<?>[] a, Class<?>[] a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_1
/*     */     //   1: istore_2
/*     */     //   2: aload_0
/*     */     //   3: arraylength
/*     */     //   4: aload_1
/*     */     //   5: arraylength
/*     */     //   6: if_icmpeq +6 -> 12
/*     */     //   9: iconst_0
/*     */     //   10: ireturn
/*     */     //   11: athrow
/*     */     //   12: iconst_0
/*     */     //   13: dup
/*     */     //   14: istore_3
/*     */     //   15: goto +21 -> 36
/*     */     //   18: athrow
/*     */     //   19: aload_0
/*     */     //   20: iload_3
/*     */     //   21: aaload
/*     */     //   22: aload_1
/*     */     //   23: iload_3
/*     */     //   24: aaload
/*     */     //   25: if_acmpeq +7 -> 32
/*     */     //   28: iconst_0
/*     */     //   29: dup
/*     */     //   30: istore_2
/*     */     //   31: ireturn
/*     */     //   32: iinc 3 1
/*     */     //   35: iload_3
/*     */     //   36: aload_0
/*     */     //   37: arraylength
/*     */     //   38: if_icmplt -19 -> 19
/*     */     //   41: iload_2
/*     */     //   42: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #159	-> byte code offset #0
/*     */     //   Java source line #128	-> byte code offset #2
/*     */     //   Java source line #191	-> byte code offset #9
/*     */     //   Java source line #126	-> byte code offset #12
/*     */     //   Java source line #6	-> byte code offset #19
/*     */     //   Java source line #53	-> byte code offset #28
/*     */     //   Java source line #166	-> byte code offset #31
/*     */     //   Java source line #126	-> byte code offset #32
/*     */     //   Java source line #149	-> byte code offset #41
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	43	0	a	Class[]
/*     */     //   0	43	1	a	Class[]
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static java.lang.reflect.Field getField(Class<?> a, String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual 113	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
/*     */     //   5: areturn
/*     */     //   6: athrow
/*     */     //   7: astore_1
/*     */     //   8: aconst_null
/*     */     //   9: areturn
/*     */     // Line number table:
/*     */     //   Java source line #72	-> byte code offset #0
/*     */     //   Java source line #5	-> byte code offset #7
/*     */     //   Java source line #86	-> byte code offset #8
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	10	0	a	Class
/*     */     //   0	10	1	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	5	7	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Class<?> getBukkitClass(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 41	java/lang/StringBuilder
/*     */     //   3: dup
/*     */     //   4: ldc 116
/*     */     //   6: invokestatic 65	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   9: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   12: invokestatic 100	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:getVersion	()Ljava/lang/String;
/*     */     //   15: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   18: aload_0
/*     */     //   19: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   22: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   25: astore_1
/*     */     //   26: aconst_null
/*     */     //   27: astore_2
/*     */     //   28: aload_1
/*     */     //   29: invokestatic 103	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   32: astore_2
/*     */     //   33: aload_2
/*     */     //   34: areturn
/*     */     //   35: athrow
/*     */     //   36: astore_1
/*     */     //   37: aload_2
/*     */     //   38: areturn
/*     */     // Line number table:
/*     */     //   Java source line #96	-> byte code offset #0
/*     */     //   Java source line #92	-> byte code offset #26
/*     */     //   Java source line #13	-> byte code offset #28
/*     */     //   Java source line #155	-> byte code offset #34
/*     */     //   Java source line #73	-> byte code offset #37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	39	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	33	36	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Method getMethod(Class<?> a, String a, Class<?>... a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 78	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
/*     */     //   4: dup
/*     */     //   5: astore 6
/*     */     //   7: arraylength
/*     */     //   8: istore 5
/*     */     //   10: iconst_0
/*     */     //   11: dup
/*     */     //   12: istore 4
/*     */     //   14: goto +40 -> 54
/*     */     //   17: athrow
/*     */     //   18: aload 6
/*     */     //   20: iload 4
/*     */     //   22: aaload
/*     */     //   23: dup
/*     */     //   24: astore_3
/*     */     //   25: invokevirtual 81	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   28: aload_1
/*     */     //   29: invokevirtual 85	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   32: ifeq +17 -> 49
/*     */     //   35: aload_2
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual 147	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
/*     */     //   40: invokestatic 149	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:classListEqual	([Ljava/lang/Class;[Ljava/lang/Class;)Z
/*     */     //   43: ifeq +6 -> 49
/*     */     //   46: aload_3
/*     */     //   47: areturn
/*     */     //   48: athrow
/*     */     //   49: iinc 4 1
/*     */     //   52: iload 4
/*     */     //   54: iload 5
/*     */     //   56: if_icmplt -38 -> 18
/*     */     //   59: aconst_null
/*     */     //   60: areturn
/*     */     // Line number table:
/*     */     //   Java source line #108	-> byte code offset #0
/*     */     //   Java source line #137	-> byte code offset #25
/*     */     //   Java source line #165	-> byte code offset #46
/*     */     //   Java source line #108	-> byte code offset #49
/*     */     //   Java source line #87	-> byte code offset #59
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	61	0	a	Class
/*     */     //   0	61	1	a	String
/*     */     //   0	61	2	a	Class[]
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp11_10 = 1;
/*     */     int tmp27_24 = a.length();
/*     */     int tmp31_30 = 1;
/*     */     tmp31_30;
/*     */     int j;
/*     */     int ? = tmp31_30;
/*     */     int k = tmp27_24;
/*     */     (j = new char[tmp27_24] - 1);
/*     */     int i = (0x3 ^ 0x5) << 4 ^ 0x2 ^ 0x5;
/*     */     if ((5 << 4 ^ tmp11_10 << tmp11_10) >= 0)
/*     */     {
/*     */       int tmp50_49 = j;
/*     */       j--;
/*     */       ?[tmp50_49] = ((char)(a.charAt(tmp50_49) ^ i));
/*     */       int tmp71_68 = (j--);
/*     */       ?[tmp71_68] = ((char)(a.charAt(tmp71_68) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static java.lang.reflect.Field getPrivateField(Class<?> a, String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual 113	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
/*     */     //   5: dup
/*     */     //   6: astore_1
/*     */     //   7: iconst_1
/*     */     //   8: invokevirtual 167	java/lang/reflect/Field:setAccessible	(Z)V
/*     */     //   11: aload_1
/*     */     //   12: areturn
/*     */     //   13: athrow
/*     */     //   14: astore_1
/*     */     //   15: aconst_null
/*     */     //   16: areturn
/*     */     // Line number table:
/*     */     //   Java source line #50	-> byte code offset #0
/*     */     //   Java source line #124	-> byte code offset #7
/*     */     //   Java source line #140	-> byte code offset #11
/*     */     //   Java source line #85	-> byte code offset #14
/*     */     //   Java source line #14	-> byte code offset #15
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	17	0	a	Class
/*     */     //   0	17	1	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	12	14	java/lang/Exception
/*     */   }
/*     */   
/*     */   public static abstract interface ConstructorInvoker
/*     */   {
/*     */     public abstract Object invoke(Object... paramVarArgs);
/*     */   }
/*     */   
/*     */   public static abstract interface FieldAccessor<T>
/*     */   {
/*     */     public abstract T get(Object paramObject);
/*     */     
/*     */     public abstract boolean hasField(Object paramObject);
/*     */     
/*     */     public abstract void set(Object paramObject1, Object paramObject2);
/*     */   }
/*     */   
/*     */   public static abstract interface MethodInvoker
/*     */   {
/*     */     public abstract Object invoke(Object paramObject, Object... paramVarArgs);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_7\reflection\Reflections.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */