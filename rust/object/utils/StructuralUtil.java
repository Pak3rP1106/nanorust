/*    */ package nano.spook1998.rust.object.utils;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import nano.spook1998.rust.object.Structural;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.block.Block;
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
/*    */ public class StructuralUtil
/*    */ {
/*    */   public static void removeStructural(Structural a)
/*    */   {
/* 23 */     if (ALLATORIxDEMO.contains(a)) { ALLATORIxDEMO.remove(a);
/*    */     }
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
/*    */   public static Integer checkBlocks(Block a)
/*    */   {
/* ;3 */     Integer localInteger = Integer.valueOf(0);
/*    */     Iterator localIterator;
/* ;0 */     for (goto 76; localIterator.hasNext();) { Structural localStructural = (Structural)localIterator.next();
/* 68 */       if (a.getLocation().distance(localStructural.getBlock().getLocation()) <= 30.0D)
/*    */       {
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* >1 */         if (localStructural.isInStructuralAll(a).booleanValue()) localInteger = Integer.valueOf(localInteger.intValue() + 1);
/*    */       }
/*    */     }
/* 24 */     return localInteger;
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
/*    */   public static List<Structural> getList()
/*    */   {
/* 38 */     return ALLATORIxDEMO;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static void addStructural(Structural a)
/*    */   {
/* 45 */     if (!ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.add(a); }
/* 46 */   private static List<Structural> ALLATORIxDEMO = new ArrayList();
/*    */   
/*    */   /* Error */
/*    */   public static Structural checkBlock(Block a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: invokestatic 14	nano/spook1998/rust/object/utils/StructuralUtil:getList	()Ljava/util/List;
/*    */     //   3: invokeinterface 20 1 0
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: goto +54 -> 64
/*    */     //   13: athrow
/*    */     //   14: aload_2
/*    */     //   15: invokeinterface 26 1 0
/*    */     //   20: checkcast 28	nano/spook1998/rust/object/Structural
/*    */     //   23: astore_1
/*    */     //   24: aload_0
/*    */     //   25: invokeinterface 34 1 0
/*    */     //   30: aload_1
/*    */     //   31: invokevirtual 38	nano/spook1998/rust/object/Structural:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   34: invokeinterface 34 1 0
/*    */     //   39: invokevirtual 44	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
/*    */     //   42: ldc2_w 45
/*    */     //   45: dcmpg
/*    */     //   46: ifgt +17 -> 63
/*    */     //   49: aload_1
/*    */     //   50: aload_0
/*    */     //   51: invokevirtual 50	nano/spook1998/rust/object/Structural:isInStructural	(Lorg/bukkit/block/Block;)Ljava/lang/Boolean;
/*    */     //   54: invokevirtual 56	java/lang/Boolean:booleanValue	()Z
/*    */     //   57: ifeq +6 -> 63
/*    */     //   60: aload_1
/*    */     //   61: areturn
/*    */     //   62: athrow
/*    */     //   63: aload_2
/*    */     //   64: invokeinterface 59 1 0
/*    */     //   69: ifne -55 -> 14
/*    */     //   72: aconst_null
/*    */     //   73: areturn
/*    */     // Line number table:
/*    */     //   Java source line #78	-> byte code offset #0
/*    */     //   Java source line #93	-> byte code offset #24
/*    */     //   Java source line #119	-> byte code offset #49
/*    */     //   Java source line #78	-> byte code offset #63
/*    */     //   Java source line #92	-> byte code offset #72
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	74	0	a	Block
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static Structural checkBlockHP(Block a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: invokestatic 14	nano/spook1998/rust/object/utils/StructuralUtil:getList	()Ljava/util/List;
/*    */     //   3: invokeinterface 20 1 0
/*    */     //   8: dup
/*    */     //   9: astore_2
/*    */     //   10: goto +54 -> 64
/*    */     //   13: athrow
/*    */     //   14: aload_2
/*    */     //   15: invokeinterface 26 1 0
/*    */     //   20: checkcast 28	nano/spook1998/rust/object/Structural
/*    */     //   23: astore_1
/*    */     //   24: aload_0
/*    */     //   25: invokeinterface 34 1 0
/*    */     //   30: aload_1
/*    */     //   31: invokevirtual 38	nano/spook1998/rust/object/Structural:getBlock	()Lorg/bukkit/block/Block;
/*    */     //   34: invokeinterface 34 1 0
/*    */     //   39: invokevirtual 44	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
/*    */     //   42: ldc2_w 45
/*    */     //   45: dcmpg
/*    */     //   46: ifgt +17 -> 63
/*    */     //   49: aload_1
/*    */     //   50: aload_0
/*    */     //   51: invokevirtual 95	nano/spook1998/rust/object/Structural:isInStructuralAll	(Lorg/bukkit/block/Block;)Ljava/lang/Boolean;
/*    */     //   54: invokevirtual 56	java/lang/Boolean:booleanValue	()Z
/*    */     //   57: ifeq +6 -> 63
/*    */     //   60: aload_1
/*    */     //   61: areturn
/*    */     //   62: athrow
/*    */     //   63: aload_2
/*    */     //   64: invokeinterface 59 1 0
/*    */     //   69: ifne -55 -> 14
/*    */     //   72: aconst_null
/*    */     //   73: areturn
/*    */     // Line number table:
/*    */     //   Java source line #155	-> byte code offset #0
/*    */     //   Java source line #162	-> byte code offset #24
/*    */     //   Java source line #73	-> byte code offset #49
/*    */     //   Java source line #155	-> byte code offset #63
/*    */     //   Java source line #77	-> byte code offset #72
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	74	0	a	Block
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\StructuralUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */