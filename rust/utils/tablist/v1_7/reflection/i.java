/*    */ package nano.spook1998.rust.utils.tablist.v1_7.reflection;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class i
/*    */   implements Reflections.FieldAccessor<T>
/*    */ {
/*    */   public boolean hasField(Object a)
/*    */   {
/* 74 */     return a.ALLATORIxDEMO.getDeclaringClass().isAssignableFrom(a.getClass());
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public T get(Object a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield 19	nano/spook1998/rust/utils/tablist/v1_7/reflection/i:ALLATORIxDEMO	Ljava/lang/reflect/Field;
/*    */     //   4: aload_1
/*    */     //   5: invokevirtual 43	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   8: areturn
/*    */     //   9: athrow
/*    */     //   10: astore_2
/*    */     //   11: new 45	java/lang/RuntimeException
/*    */     //   14: dup
/*    */     //   15: ldc 47
/*    */     //   17: invokestatic 50	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*    */     //   20: aload_2
/*    */     //   21: invokespecial 54	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   24: athrow
/*    */     // Line number table:
/*    */     //   Java source line #174	-> byte code offset #0
/*    */     //   Java source line #19	-> byte code offset #10
/*    */     //   Java source line #18	-> byte code offset #11
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	25	0	a	i
/*    */     //   0	25	1	a	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	8	10	java/lang/IllegalAccessException
/*    */   }
/*    */   
/*    */   i(Field paramField) {}
/*    */   
/*    */   /* Error */
/*    */   public void set(Object a, Object a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield 19	nano/spook1998/rust/utils/tablist/v1_7/reflection/i:ALLATORIxDEMO	Ljava/lang/reflect/Field;
/*    */     //   4: aload_1
/*    */     //   5: aload_2
/*    */     //   6: invokevirtual 64	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   9: return
/*    */     //   10: athrow
/*    */     //   11: astore_2
/*    */     //   12: new 45	java/lang/RuntimeException
/*    */     //   15: dup
/*    */     //   16: ldc 47
/*    */     //   18: invokestatic 50	nano/spook1998/rust/utils/tablist/v1_7/reflection/Reflections:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*    */     //   21: aload_2
/*    */     //   22: invokespecial 54	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   25: athrow
/*    */     //   26: athrow
/*    */     // Line number table:
/*    */     //   Java source line #173	-> byte code offset #0
/*    */     //   Java source line #139	-> byte code offset #9
/*    */     //   Java source line #71	-> byte code offset #12
/*    */     //   Java source line #106	-> byte code offset #26
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	27	0	a	i
/*    */     //   0	27	1	a	Object
/*    */     //   0	27	2	a	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	9	11	java/lang/IllegalAccessException
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_7\reflection\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */