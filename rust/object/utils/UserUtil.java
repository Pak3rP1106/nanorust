/*    */ package nano.spook1998.rust.object.utils; import nano.spook1998.rust.object.User;
/*    */ 
/*  2 */ public class UserUtil { private static java.util.List<User> ALLATORIxDEMO = new java.util.ArrayList();
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
/*    */   public static void addUser(User a)
/*    */   {
/* 41 */     if (!ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.add(a);
/*    */   }
/*    */   
/*    */   public static java.util.List<User> getUsers()
/*    */   {
/* 46 */     return ALLATORIxDEMO;
/*    */   }
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
/*    */   public static void removeUser(User a)
/*    */   {
/* 97 */     if (ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.remove(a);
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static User get(String a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 12	nano/spook1998/rust/object/utils/UserUtil:ALLATORIxDEMO	Ljava/util/List;
/*    */     //   3: invokeinterface 34 1 0
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: goto +29 -> 39
/*    */     //   13: athrow
/*    */     //   14: aload_2
/*    */     //   15: invokeinterface 40 1 0
/*    */     //   20: checkcast 42	nano/spook1998/rust/object/User
/*    */     //   23: dup
/*    */     //   24: astore_1
/*    */     //   25: invokevirtual 46	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*    */     //   28: aload_0
/*    */     //   29: invokevirtual 52	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*    */     //   32: ifeq +6 -> 38
/*    */     //   35: aload_1
/*    */     //   36: areturn
/*    */     //   37: athrow
/*    */     //   38: aload_2
/*    */     //   39: invokeinterface 56 1 0
/*    */     //   44: ifne -30 -> 14
/*    */     //   47: new 42	nano/spook1998/rust/object/User
/*    */     //   50: dup
/*    */     //   51: aload_0
/*    */     //   52: invokespecial 59	nano/spook1998/rust/object/User:<init>	(Ljava/lang/String;)V
/*    */     //   55: areturn
/*    */     // Line number table:
/*    */     //   Java source line #123	-> byte code offset #0
/*    */     //   Java source line #171	-> byte code offset #25
/*    */     //   Java source line #123	-> byte code offset #38
/*    */     //   Java source line #93	-> byte code offset #47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	56	0	a	String
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\UserUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */