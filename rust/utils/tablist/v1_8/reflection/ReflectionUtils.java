/*     */ package nano.spook1998.rust.utils.tablist.v1_8.reflection;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ReflectionUtils
/*     */ {
/*     */   private static final Map<Class<?>, Map<String, Field>> ALLATORIxDEMO;
/*  79 */   private static final Map<String, Class<?>> b = ;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static synchronized Object getHandleWrapper(Object a)
/*     */   {
/*     */     try
/*     */     {
/* 105 */       int tmp18_17 = 1;tmp18_17;return ((Method)a).invoke(new Object[0], tmp18_17); } catch (Exception localException) {} throw getMethod(a.getClass(), ALLATORIxDEMO("K[XvMPHRI"));return null;
/*     */   }
/*     */   
/*     */   public static void setValue(Object a, String a, Object a)
/*     */     throws Exception
/*     */   {
/*  16 */     a = a.getClass().getDeclaredField(a); String 
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  43 */       tmp12_11 = a;tmp12_11.setAccessible(true);tmp12_11
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       .set(a, a);
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
/*     */   public static Object getHandle(Object a)
/*     */   {
/* 162 */     Object localObject = null;Method localMethod = getMethod(a.getClass(), ALLATORIxDEMO("K[XvMPHRI"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 182 */       int tmp22_21 = 1;tmp22_21;return ((Method)a).invoke(new Object[0], tmp22_21);
/*     */     }
/*     */     catch (IllegalArgumentException|IllegalAccessException|InvocationTargetException localIllegalArgumentException1) {}
/*  77 */     throw 
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       localMethod;return localObject;
/*     */   }
/*     */   
/*     */ 
/*     */   static
/*     */   {
/* 188 */     D = Maps.newHashMap();ALLATORIxDEMO = Maps.newHashMap();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static Object getValue(Object a, String a)
/*     */     throws Exception
/*     */   {
/* 196 */     a = a.getClass().getDeclaredField(a); String tmp11_10 = a;tmp11_10.setAccessible(true);return tmp11_10.get(a);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */   private static final Map<Class<?>, Map<String, Map<ArrayWrapper<Class<?>>, Method>>> M = Maps.newHashMap();
/*     */   private static final Map<String, Class<?>> D;
/*     */   private static String f;
/*     */   
/*     */   /* Error */
/*     */   public static synchronized Method getMethodWrapper(Class<?> a, String a, Class<?>... a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 18	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:M	Ljava/util/Map;
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface 24 2 0
/*     */     //   9: ifne +16 -> 25
/*     */     //   12: getstatic 18	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:M	Ljava/util/Map;
/*     */     //   15: aload_0
/*     */     //   16: invokestatic 30	com/google/common/collect/Maps:newHashMap	()Ljava/util/HashMap;
/*     */     //   19: invokeinterface 34 3 0
/*     */     //   24: pop
/*     */     //   25: getstatic 18	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:M	Ljava/util/Map;
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface 38 2 0
/*     */     //   34: checkcast 20	java/util/Map
/*     */     //   37: dup
/*     */     //   38: astore_3
/*     */     //   39: aload_1
/*     */     //   40: invokeinterface 24 2 0
/*     */     //   45: ifne +14 -> 59
/*     */     //   48: aload_3
/*     */     //   49: aload_1
/*     */     //   50: invokestatic 30	com/google/common/collect/Maps:newHashMap	()Ljava/util/HashMap;
/*     */     //   53: invokeinterface 34 3 0
/*     */     //   58: pop
/*     */     //   59: aload_3
/*     */     //   60: aload_1
/*     */     //   61: invokeinterface 38 2 0
/*     */     //   66: checkcast 20	java/util/Map
/*     */     //   69: astore_3
/*     */     //   70: new 40	nano/spook1998/rust/utils/tablist/v1_8/reflection/ArrayWrapper
/*     */     //   73: dup
/*     */     //   74: aload_2
/*     */     //   75: invokespecial 44	nano/spook1998/rust/utils/tablist/v1_8/reflection/ArrayWrapper:<init>	([Ljava/lang/Object;)V
/*     */     //   78: astore 4
/*     */     //   80: aload_3
/*     */     //   81: aload 4
/*     */     //   83: invokeinterface 24 2 0
/*     */     //   88: ifeq +16 -> 104
/*     */     //   91: aload_3
/*     */     //   92: aload 4
/*     */     //   94: invokeinterface 38 2 0
/*     */     //   99: checkcast 46	java/lang/reflect/Method
/*     */     //   102: areturn
/*     */     //   103: athrow
/*     */     //   104: aload_0
/*     */     //   105: invokevirtual 52	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
/*     */     //   108: dup
/*     */     //   109: astore 8
/*     */     //   111: arraylength
/*     */     //   112: istore 7
/*     */     //   114: iconst_0
/*     */     //   115: dup
/*     */     //   116: istore 6
/*     */     //   118: goto +58 -> 176
/*     */     //   121: athrow
/*     */     //   122: aload 8
/*     */     //   124: iload 6
/*     */     //   126: aaload
/*     */     //   127: dup
/*     */     //   128: astore 5
/*     */     //   130: invokevirtual 56	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   133: aload_1
/*     */     //   134: invokevirtual 61	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   137: ifeq +34 -> 171
/*     */     //   140: aload_2
/*     */     //   141: aload 5
/*     */     //   143: invokevirtual 65	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
/*     */     //   146: invokestatic 70	java/util/Arrays:equals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*     */     //   149: ifeq +22 -> 171
/*     */     //   152: aload_3
/*     */     //   153: aload 4
/*     */     //   155: aload 5
/*     */     //   157: dup_x2
/*     */     //   158: iconst_1
/*     */     //   159: invokevirtual 74	java/lang/reflect/Method:setAccessible	(Z)V
/*     */     //   162: aload 5
/*     */     //   164: invokeinterface 34 3 0
/*     */     //   169: pop
/*     */     //   170: areturn
/*     */     //   171: iinc 6 1
/*     */     //   174: iload 6
/*     */     //   176: iload 7
/*     */     //   178: if_icmplt -56 -> 122
/*     */     //   181: aload_3
/*     */     //   182: aload 4
/*     */     //   184: aconst_null
/*     */     //   185: dup_x2
/*     */     //   186: invokeinterface 34 3 0
/*     */     //   191: pop
/*     */     //   192: areturn
/*     */     // Line number table:
/*     */     //   Java source line #234	-> byte code offset #0
/*     */     //   Java source line #272	-> byte code offset #12
/*     */     //   Java source line #375	-> byte code offset #25
/*     */     //   Java source line #259	-> byte code offset #39
/*     */     //   Java source line #238	-> byte code offset #48
/*     */     //   Java source line #309	-> byte code offset #59
/*     */     //   Java source line #318	-> byte code offset #70
/*     */     //   Java source line #393	-> byte code offset #80
/*     */     //   Java source line #252	-> byte code offset #91
/*     */     //   Java source line #239	-> byte code offset #104
/*     */     //   Java source line #204	-> byte code offset #130
/*     */     //   Java source line #382	-> byte code offset #152
/*     */     //   Java source line #221	-> byte code offset #162
/*     */     //   Java source line #228	-> byte code offset #170
/*     */     //   Java source line #239	-> byte code offset #171
/*     */     //   Java source line #215	-> byte code offset #181
/*     */     //   Java source line #311	-> byte code offset #192
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	193	0	a	Class
/*     */     //   0	193	1	a	String
/*     */     //   0	193	2	a	Class[]
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Class<?> getCraftClass(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 92	org/bukkit/Bukkit:getServer	()Lorg/bukkit/Server;
/*     */     //   3: invokevirtual 96	java/lang/Object:getClass	()Ljava/lang/Class;
/*     */     //   6: invokevirtual 100	java/lang/Class:getPackage	()Ljava/lang/Package;
/*     */     //   9: invokevirtual 103	java/lang/Package:getName	()Ljava/lang/String;
/*     */     //   12: astore_1
/*     */     //   13: new 105	java/lang/StringBuilder
/*     */     //   16: dup
/*     */     //   17: aload_1
/*     */     //   18: dup
/*     */     //   19: bipush 46
/*     */     //   21: invokevirtual 109	java/lang/String:lastIndexOf	(I)I
/*     */     //   24: iconst_1
/*     */     //   25: iadd
/*     */     //   26: invokevirtual 113	java/lang/String:substring	(I)Ljava/lang/String;
/*     */     //   29: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   32: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   35: ldc 122
/*     */     //   37: invokestatic 125	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   40: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   43: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   46: astore_1
/*     */     //   47: new 105	java/lang/StringBuilder
/*     */     //   50: dup
/*     */     //   51: ldc -122
/*     */     //   53: invokestatic 125	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   56: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   59: aload_1
/*     */     //   60: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   67: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   70: astore_1
/*     */     //   71: aconst_null
/*     */     //   72: astore_2
/*     */     //   73: aload_1
/*     */     //   74: invokestatic 137	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   77: astore_2
/*     */     //   78: aload_2
/*     */     //   79: areturn
/*     */     //   80: athrow
/*     */     //   81: astore_1
/*     */     //   82: aload_2
/*     */     //   83: areturn
/*     */     // Line number table:
/*     */     //   Java source line #123	-> byte code offset #0
/*     */     //   Java source line #171	-> byte code offset #13
/*     */     //   Java source line #78	-> byte code offset #47
/*     */     //   Java source line #93	-> byte code offset #71
/*     */     //   Java source line #170	-> byte code offset #73
/*     */     //   Java source line #96	-> byte code offset #79
/*     */     //   Java source line #92	-> byte code offset #82
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	84	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   73	78	81	java/lang/ClassNotFoundException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static synchronized Class<?> getNMSClass(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 154	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:b	Ljava/util/Map;
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface 24 2 0
/*     */     //   9: ifeq +17 -> 26
/*     */     //   12: getstatic 154	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:b	Ljava/util/Map;
/*     */     //   15: aload_0
/*     */     //   16: invokeinterface 38 2 0
/*     */     //   21: checkcast 48	java/lang/Class
/*     */     //   24: areturn
/*     */     //   25: athrow
/*     */     //   26: new 105	java/lang/StringBuilder
/*     */     //   29: dup
/*     */     //   30: ldc -122
/*     */     //   32: invokestatic 125	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   35: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   38: invokestatic 157	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:getVersion	()Ljava/lang/String;
/*     */     //   41: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   44: aload_0
/*     */     //   45: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   48: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   51: astore_1
/*     */     //   52: aconst_null
/*     */     //   53: astore_2
/*     */     //   54: aload_1
/*     */     //   55: invokestatic 137	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   58: astore_2
/*     */     //   59: goto +18 -> 77
/*     */     //   62: athrow
/*     */     //   63: astore_1
/*     */     //   64: getstatic 154	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:b	Ljava/util/Map;
/*     */     //   67: aload_0
/*     */     //   68: aconst_null
/*     */     //   69: invokeinterface 34 3 0
/*     */     //   74: pop
/*     */     //   75: aconst_null
/*     */     //   76: areturn
/*     */     //   77: getstatic 154	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:b	Ljava/util/Map;
/*     */     //   80: aload_0
/*     */     //   81: aload_2
/*     */     //   82: invokeinterface 34 3 0
/*     */     //   87: pop
/*     */     //   88: aload_2
/*     */     //   89: areturn
/*     */     // Line number table:
/*     */     //   Java source line #76	-> byte code offset #0
/*     */     //   Java source line #69	-> byte code offset #12
/*     */     //   Java source line #130	-> byte code offset #26
/*     */     //   Java source line #30	-> byte code offset #52
/*     */     //   Java source line #58	-> byte code offset #54
/*     */     //   Java source line #1	-> byte code offset #59
/*     */     //   Java source line #26	-> byte code offset #64
/*     */     //   Java source line #107	-> byte code offset #75
/*     */     //   Java source line #81	-> byte code offset #77
/*     */     //   Java source line #54	-> byte code offset #88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	90	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   54	59	63	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Method getMethod(Class<?> a, String a, Class<?>[] a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 52	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
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
/*     */     //   25: invokevirtual 56	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   28: aload_1
/*     */     //   29: invokevirtual 61	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   32: ifeq +17 -> 49
/*     */     //   35: aload_2
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual 65	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
/*     */     //   40: invokestatic 161	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ClassListEqual	([Ljava/lang/Class;[Ljava/lang/Class;)Z
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
/*     */     //   Java source line #193	-> byte code offset #0
/*     */     //   Java source line #60	-> byte code offset #25
/*     */     //   Java source line #129	-> byte code offset #35
/*     */     //   Java source line #21	-> byte code offset #46
/*     */     //   Java source line #193	-> byte code offset #49
/*     */     //   Java source line #70	-> byte code offset #59
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	61	0	a	Class
/*     */     //   0	61	1	a	String
/*     */     //   0	61	2	a	Class[]
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
/*     */     int tmp39_35 = (j = new char[tmp25_22] - 1);
/*     */     tmp39_35;
/*     */     int i = (0x2 ^ 0x5) << 3 ^ 0x3 ^ 0x5;
/*     */     (5 << 3 ^ 0x4);
/*     */     if (tmp39_35 >= 0)
/*     */     {
/*     */       int tmp49_48 = j;
/*     */       j--;
/*     */       ?[tmp49_48] = ((char)(a.charAt(tmp49_48) ^ i));
/*     */       int tmp70_67 = (j--);
/*     */       ?[tmp70_67] = ((char)(a.charAt(tmp70_67) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Field getField(Class<?> a, String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 182	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
/*     */     //   4: dup
/*     */     //   5: astore 5
/*     */     //   7: arraylength
/*     */     //   8: istore 4
/*     */     //   10: iconst_0
/*     */     //   11: dup
/*     */     //   12: istore_3
/*     */     //   13: goto +36 -> 49
/*     */     //   16: athrow
/*     */     //   17: aload 5
/*     */     //   19: iload_3
/*     */     //   20: aaload
/*     */     //   21: astore_2
/*     */     //   22: aload_1
/*     */     //   23: ifnull +14 -> 37
/*     */     //   26: aload_2
/*     */     //   27: invokevirtual 185	java/lang/reflect/Field:getName	()Ljava/lang/String;
/*     */     //   30: aload_1
/*     */     //   31: invokevirtual 61	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   34: ifeq +11 -> 45
/*     */     //   37: aload_2
/*     */     //   38: iconst_1
/*     */     //   39: invokevirtual 186	java/lang/reflect/Field:setAccessible	(Z)V
/*     */     //   42: aload_2
/*     */     //   43: areturn
/*     */     //   44: athrow
/*     */     //   45: iinc 3 1
/*     */     //   48: iload_3
/*     */     //   49: iload 4
/*     */     //   51: if_icmplt -34 -> 17
/*     */     //   54: goto +4 -> 58
/*     */     //   57: astore_2
/*     */     //   58: aconst_null
/*     */     //   59: areturn
/*     */     // Line number table:
/*     */     //   Java source line #24	-> byte code offset #0
/*     */     //   Java source line #194	-> byte code offset #22
/*     */     //   Java source line #142	-> byte code offset #37
/*     */     //   Java source line #3	-> byte code offset #42
/*     */     //   Java source line #24	-> byte code offset #45
/*     */     //   Java source line #72	-> byte code offset #54
/*     */     //   Java source line #5	-> byte code offset #58
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	60	0	a	Class
/*     */     //   0	60	1	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	16	57	java/lang/SecurityException
/*     */     //   17	43	57	java/lang/SecurityException
/*     */     //   45	54	57	java/lang/SecurityException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Method getTypedMethod(Class<?> a, String a, Class<?> a, Class<?>... a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 193	java/lang/Class:getDeclaredMethods	()[Ljava/lang/reflect/Method;
/*     */     //   4: dup
/*     */     //   5: astore 6
/*     */     //   7: arraylength
/*     */     //   8: istore 5
/*     */     //   10: iconst_0
/*     */     //   11: dup
/*     */     //   12: istore 4
/*     */     //   14: goto +67 -> 81
/*     */     //   17: athrow
/*     */     //   18: aload 6
/*     */     //   20: iload 4
/*     */     //   22: aaload
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: ifnull +17 -> 42
/*     */     //   28: aload_1
/*     */     //   29: invokevirtual 56	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual 56	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   36: invokevirtual 61	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   39: ifeq +7 -> 46
/*     */     //   42: aload_2
/*     */     //   43: ifnull +25 -> 68
/*     */     //   46: aload_1
/*     */     //   47: invokevirtual 196	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
/*     */     //   50: aload_2
/*     */     //   51: invokevirtual 197	java/lang/Object:equals	(Ljava/lang/Object;)Z
/*     */     //   54: ifeq +22 -> 76
/*     */     //   57: aload_1
/*     */     //   58: invokevirtual 65	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
/*     */     //   61: aload_3
/*     */     //   62: invokestatic 70	java/util/Arrays:equals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*     */     //   65: ifeq +11 -> 76
/*     */     //   68: aload_1
/*     */     //   69: dup
/*     */     //   70: iconst_1
/*     */     //   71: invokevirtual 74	java/lang/reflect/Method:setAccessible	(Z)V
/*     */     //   74: areturn
/*     */     //   75: athrow
/*     */     //   76: iinc 4 1
/*     */     //   79: iload 4
/*     */     //   81: iload 5
/*     */     //   83: if_icmplt -65 -> 18
/*     */     //   86: aconst_null
/*     */     //   87: areturn
/*     */     // Line number table:
/*     */     //   Java source line #132	-> byte code offset #0
/*     */     //   Java source line #186	-> byte code offset #25
/*     */     //   Java source line #133	-> byte code offset #57
/*     */     //   Java source line #121	-> byte code offset #68
/*     */     //   Java source line #57	-> byte code offset #74
/*     */     //   Java source line #132	-> byte code offset #76
/*     */     //   Java source line #28	-> byte code offset #86
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	88	0	a	Class
/*     */     //   0	88	1	a	String
/*     */     //   0	88	2	a	Class
/*     */     //   0	88	3	a	Class[]
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static boolean ClassListEqual(Class<?>[] a, Class<?>[] a)
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
/*     */     //   Java source line #6	-> byte code offset #0
/*     */     //   Java source line #166	-> byte code offset #2
/*     */     //   Java source line #17	-> byte code offset #9
/*     */     //   Java source line #37	-> byte code offset #12
/*     */     //   Java source line #149	-> byte code offset #19
/*     */     //   Java source line #63	-> byte code offset #28
/*     */     //   Java source line #131	-> byte code offset #31
/*     */     //   Java source line #37	-> byte code offset #32
/*     */     //   Java source line #33	-> byte code offset #41
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	43	0	a	Class[]
/*     */     //   0	43	1	a	Class[]
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static synchronized String getVersion()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 205	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:f	Ljava/lang/String;
/*     */     //   3: ifnonnull +61 -> 64
/*     */     //   6: invokestatic 92	org/bukkit/Bukkit:getServer	()Lorg/bukkit/Server;
/*     */     //   9: ifnonnull +6 -> 15
/*     */     //   12: aconst_null
/*     */     //   13: areturn
/*     */     //   14: athrow
/*     */     //   15: invokestatic 92	org/bukkit/Bukkit:getServer	()Lorg/bukkit/Server;
/*     */     //   18: invokevirtual 96	java/lang/Object:getClass	()Ljava/lang/Class;
/*     */     //   21: invokevirtual 100	java/lang/Class:getPackage	()Ljava/lang/Package;
/*     */     //   24: invokevirtual 103	java/lang/Package:getName	()Ljava/lang/String;
/*     */     //   27: astore_0
/*     */     //   28: new 105	java/lang/StringBuilder
/*     */     //   31: dup
/*     */     //   32: aload_0
/*     */     //   33: dup
/*     */     //   34: bipush 46
/*     */     //   36: invokevirtual 109	java/lang/String:lastIndexOf	(I)I
/*     */     //   39: iconst_1
/*     */     //   40: iadd
/*     */     //   41: invokevirtual 113	java/lang/String:substring	(I)Ljava/lang/String;
/*     */     //   44: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   47: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   50: ldc 122
/*     */     //   52: invokestatic 125	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   55: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   58: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   61: putstatic 205	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:f	Ljava/lang/String;
/*     */     //   64: getstatic 205	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:f	Ljava/lang/String;
/*     */     //   67: areturn
/*     */     // Line number table:
/*     */     //   Java source line #52	-> byte code offset #0
/*     */     //   Java source line #114	-> byte code offset #6
/*     */     //   Java source line #55	-> byte code offset #12
/*     */     //   Java source line #198	-> byte code offset #15
/*     */     //   Java source line #10	-> byte code offset #28
/*     */     //   Java source line #115	-> byte code offset #64
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static synchronized Class<?> getOBCClass(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 201	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:D	Ljava/util/Map;
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface 24 2 0
/*     */     //   9: ifeq +17 -> 26
/*     */     //   12: getstatic 201	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:D	Ljava/util/Map;
/*     */     //   15: aload_0
/*     */     //   16: invokeinterface 38 2 0
/*     */     //   21: checkcast 48	java/lang/Class
/*     */     //   24: areturn
/*     */     //   25: athrow
/*     */     //   26: new 105	java/lang/StringBuilder
/*     */     //   29: dup
/*     */     //   30: ldc -41
/*     */     //   32: invokestatic 125	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   35: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   38: invokestatic 157	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:getVersion	()Ljava/lang/String;
/*     */     //   41: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   44: aload_0
/*     */     //   45: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   48: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   51: astore_1
/*     */     //   52: aconst_null
/*     */     //   53: astore_2
/*     */     //   54: aload_1
/*     */     //   55: invokestatic 137	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   58: astore_2
/*     */     //   59: goto +18 -> 77
/*     */     //   62: athrow
/*     */     //   63: astore_1
/*     */     //   64: getstatic 201	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:D	Ljava/util/Map;
/*     */     //   67: aload_0
/*     */     //   68: aconst_null
/*     */     //   69: invokeinterface 34 3 0
/*     */     //   74: pop
/*     */     //   75: aconst_null
/*     */     //   76: areturn
/*     */     //   77: getstatic 201	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:D	Ljava/util/Map;
/*     */     //   80: aload_0
/*     */     //   81: aload_2
/*     */     //   82: invokeinterface 34 3 0
/*     */     //   87: pop
/*     */     //   88: aload_2
/*     */     //   89: areturn
/*     */     // Line number table:
/*     */     //   Java source line #153	-> byte code offset #0
/*     */     //   Java source line #82	-> byte code offset #12
/*     */     //   Java source line #199	-> byte code offset #26
/*     */     //   Java source line #190	-> byte code offset #52
/*     */     //   Java source line #7	-> byte code offset #54
/*     */     //   Java source line #151	-> byte code offset #59
/*     */     //   Java source line #134	-> byte code offset #64
/*     */     //   Java source line #187	-> byte code offset #75
/*     */     //   Java source line #168	-> byte code offset #77
/*     */     //   Java source line #101	-> byte code offset #88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	90	0	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   54	59	63	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Method getMethod(Class<?> a, String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 52	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
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
/*     */     //   23: invokevirtual 56	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual 61	java/lang/String:equals	(Ljava/lang/Object;)Z
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
/*     */     //   Java source line #173	-> byte code offset #0
/*     */     //   Java source line #139	-> byte code offset #23
/*     */     //   Java source line #71	-> byte code offset #33
/*     */     //   Java source line #173	-> byte code offset #36
/*     */     //   Java source line #64	-> byte code offset #45
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	47	0	a	Class
/*     */     //   0	47	1	a	String
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Object getConstructor(Class<?> a, Object... a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 230	java/lang/Class:getDeclaredConstructors	()[Ljava/lang/reflect/Constructor;
/*     */     //   4: dup
/*     */     //   5: astore 5
/*     */     //   7: arraylength
/*     */     //   8: istore 4
/*     */     //   10: iconst_0
/*     */     //   11: dup
/*     */     //   12: istore_3
/*     */     //   13: goto +37 -> 50
/*     */     //   16: athrow
/*     */     //   17: aload 5
/*     */     //   19: iload_3
/*     */     //   20: aaload
/*     */     //   21: dup
/*     */     //   22: astore_2
/*     */     //   23: invokevirtual 233	java/lang/reflect/Constructor:getParameterTypes	()[Ljava/lang/Class;
/*     */     //   26: aload_1
/*     */     //   27: invokestatic 70	java/util/Arrays:equals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*     */     //   30: ifeq +16 -> 46
/*     */     //   33: aload_2
/*     */     //   34: iconst_1
/*     */     //   35: invokevirtual 234	java/lang/reflect/Constructor:setAccessible	(Z)V
/*     */     //   38: aload_2
/*     */     //   39: aload_1
/*     */     //   40: invokevirtual 238	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   43: areturn
/*     */     //   44: athrow
/*     */     //   45: astore_2
/*     */     //   46: iinc 3 1
/*     */     //   49: iload_3
/*     */     //   50: iload 4
/*     */     //   52: if_icmplt -35 -> 17
/*     */     //   55: aconst_null
/*     */     //   56: areturn
/*     */     // Line number table:
/*     */     //   Java source line #124	-> byte code offset #0
/*     */     //   Java source line #140	-> byte code offset #23
/*     */     //   Java source line #85	-> byte code offset #33
/*     */     //   Java source line #125	-> byte code offset #38
/*     */     //   Java source line #108	-> byte code offset #45
/*     */     //   Java source line #124	-> byte code offset #46
/*     */     //   Java source line #4	-> byte code offset #55
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	57	0	a	Class
/*     */     //   0	57	1	a	Object[]
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   38	43	45	java/lang/InstantiationException
/*     */     //   38	43	45	java/lang/IllegalAccessException
/*     */     //   38	43	45	java/lang/IllegalArgumentException
/*     */     //   38	43	45	java/lang/reflect/InvocationTargetException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static synchronized Field getFieldWrapper(Class<?> a, String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 203	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface 24 2 0
/*     */     //   9: ifne +23 -> 32
/*     */     //   12: invokestatic 30	com/google/common/collect/Maps:newHashMap	()Ljava/util/HashMap;
/*     */     //   15: astore_2
/*     */     //   16: getstatic 203	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   19: aload_0
/*     */     //   20: aload_2
/*     */     //   21: invokeinterface 34 3 0
/*     */     //   26: pop
/*     */     //   27: aload_2
/*     */     //   28: goto +18 -> 46
/*     */     //   31: athrow
/*     */     //   32: getstatic 203	nano/spook1998/rust/utils/tablist/v1_8/reflection/ReflectionUtils:ALLATORIxDEMO	Ljava/util/Map;
/*     */     //   35: aload_0
/*     */     //   36: invokeinterface 38 2 0
/*     */     //   41: checkcast 20	java/util/Map
/*     */     //   44: dup
/*     */     //   45: astore_2
/*     */     //   46: aload_1
/*     */     //   47: invokeinterface 24 2 0
/*     */     //   52: ifeq +15 -> 67
/*     */     //   55: aload_2
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface 38 2 0
/*     */     //   62: checkcast 184	java/lang/reflect/Field
/*     */     //   65: areturn
/*     */     //   66: athrow
/*     */     //   67: aload_0
/*     */     //   68: aload_1
/*     */     //   69: invokevirtual 211	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
/*     */     //   72: astore_3
/*     */     //   73: aload_2
/*     */     //   74: aload_1
/*     */     //   75: aload_3
/*     */     //   76: iconst_1
/*     */     //   77: invokevirtual 186	java/lang/reflect/Field:setAccessible	(Z)V
/*     */     //   80: aload_3
/*     */     //   81: invokeinterface 34 3 0
/*     */     //   86: pop
/*     */     //   87: aload_3
/*     */     //   88: areturn
/*     */     //   89: astore_3
/*     */     //   90: aload_2
/*     */     //   91: aload_1
/*     */     //   92: aconst_null
/*     */     //   93: dup_x2
/*     */     //   94: invokeinterface 34 3 0
/*     */     //   99: pop
/*     */     //   100: areturn
/*     */     // Line number table:
/*     */     //   Java source line #231	-> byte code offset #0
/*     */     //   Java source line #330	-> byte code offset #12
/*     */     //   Java source line #376	-> byte code offset #16
/*     */     //   Java source line #251	-> byte code offset #28
/*     */     //   Java source line #370	-> byte code offset #32
/*     */     //   Java source line #390	-> byte code offset #46
/*     */     //   Java source line #418	-> byte code offset #55
/*     */     //   Java source line #205	-> byte code offset #67
/*     */     //   Java source line #233	-> byte code offset #75
/*     */     //   Java source line #304	-> byte code offset #80
/*     */     //   Java source line #406	-> byte code offset #87
/*     */     //   Java source line #283	-> byte code offset #89
/*     */     //   Java source line #329	-> byte code offset #90
/*     */     //   Java source line #258	-> byte code offset #100
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	101	0	a	Class
/*     */     //   0	101	1	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   67	88	89	java/lang/Exception
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Method getMethod(Class<?> a, String a, Integer a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual 52	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
/*     */     //   4: dup
/*     */     //   5: astore 6
/*     */     //   7: arraylength
/*     */     //   8: istore 5
/*     */     //   10: iconst_0
/*     */     //   11: dup
/*     */     //   12: istore 4
/*     */     //   14: goto +44 -> 58
/*     */     //   17: athrow
/*     */     //   18: aload 6
/*     */     //   20: iload 4
/*     */     //   22: aaload
/*     */     //   23: dup
/*     */     //   24: astore_3
/*     */     //   25: invokevirtual 56	java/lang/reflect/Method:getName	()Ljava/lang/String;
/*     */     //   28: aload_1
/*     */     //   29: invokevirtual 61	java/lang/String:equals	(Ljava/lang/Object;)Z
/*     */     //   32: ifeq +21 -> 53
/*     */     //   35: aload_2
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual 65	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
/*     */     //   40: arraylength
/*     */     //   41: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   44: invokevirtual 259	java/lang/Integer:equals	(Ljava/lang/Object;)Z
/*     */     //   47: ifeq +6 -> 53
/*     */     //   50: aload_3
/*     */     //   51: areturn
/*     */     //   52: athrow
/*     */     //   53: iinc 4 1
/*     */     //   56: iload 4
/*     */     //   58: iload 5
/*     */     //   60: if_icmplt -42 -> 18
/*     */     //   63: aconst_null
/*     */     //   64: areturn
/*     */     // Line number table:
/*     */     //   Java source line #39	-> byte code offset #0
/*     */     //   Java source line #59	-> byte code offset #25
/*     */     //   Java source line #174	-> byte code offset #35
/*     */     //   Java source line #19	-> byte code offset #50
/*     */     //   Java source line #39	-> byte code offset #53
/*     */     //   Java source line #11	-> byte code offset #63
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	65	0	a	Class
/*     */     //   0	65	1	a	String
/*     */     //   0	65	2	a	Integer
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_8\reflection\ReflectionUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */