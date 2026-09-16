/*    */ package nano.spook1998.rust.object.utils; import nano.spook1998.rust.object.Gui;
/*    */ 
/*  2 */ public class GuiUtil { private static java.util.List<Gui> ALLATORIxDEMO = new java.util.ArrayList();
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
/*    */   public static java.util.List<Gui> getGui()
/*    */   {
/* 41 */     return ALLATORIxDEMO;
/*    */   }
/*    */   
/*    */   public static void addGui(Gui a)
/*    */   {
/* 46 */     if (!ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.add(a);
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static Gui get(String a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: invokestatic 34	nano/spook1998/rust/object/utils/GuiUtil:getGui	()Ljava/util/List;
/*    */     //   3: invokeinterface 38 1 0
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: goto +29 -> 39
/*    */     //   13: athrow
/*    */     //   14: aload_2
/*    */     //   15: invokeinterface 44 1 0
/*    */     //   20: checkcast 46	nano/spook1998/rust/object/Gui
/*    */     //   23: dup
/*    */     //   24: astore_1
/*    */     //   25: invokevirtual 50	nano/spook1998/rust/object/Gui:getName	()Ljava/lang/String;
/*    */     //   28: aload_0
/*    */     //   29: invokevirtual 56	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*    */     //   32: ifeq +6 -> 38
/*    */     //   35: aload_1
/*    */     //   36: areturn
/*    */     //   37: athrow
/*    */     //   38: aload_2
/*    */     //   39: invokeinterface 60 1 0
/*    */     //   44: ifne -30 -> 14
/*    */     //   47: aconst_null
/*    */     //   48: areturn
/*    */     // Line number table:
/*    */     //   Java source line #97	-> byte code offset #0
/*    */     //   Java source line #164	-> byte code offset #25
/*    */     //   Java source line #97	-> byte code offset #38
/*    */     //   Java source line #123	-> byte code offset #47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	49	0	a	String
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static Gui getG(String a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: invokestatic 34	nano/spook1998/rust/object/utils/GuiUtil:getGui	()Ljava/util/List;
/*    */     //   3: invokeinterface 38 1 0
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: goto +29 -> 39
/*    */     //   13: athrow
/*    */     //   14: aload_2
/*    */     //   15: invokeinterface 44 1 0
/*    */     //   20: checkcast 46	nano/spook1998/rust/object/Gui
/*    */     //   23: dup
/*    */     //   24: astore_1
/*    */     //   25: invokevirtual 66	nano/spook1998/rust/object/Gui:getG	()Ljava/lang/String;
/*    */     //   28: aload_0
/*    */     //   29: invokevirtual 56	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
/*    */     //   32: ifeq +6 -> 38
/*    */     //   35: aload_1
/*    */     //   36: areturn
/*    */     //   37: athrow
/*    */     //   38: aload_2
/*    */     //   39: invokeinterface 60 1 0
/*    */     //   44: ifne -30 -> 14
/*    */     //   47: aconst_null
/*    */     //   48: areturn
/*    */     // Line number table:
/*    */     //   Java source line #93	-> byte code offset #0
/*    */     //   Java source line #119	-> byte code offset #25
/*    */     //   Java source line #93	-> byte code offset #38
/*    */     //   Java source line #96	-> byte code offset #47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	49	0	a	String
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\GuiUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */