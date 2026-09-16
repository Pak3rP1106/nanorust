/*     */ package nano.spook1998.rust.object;
/*     */ 
/*     */ import org.bukkit.inventory.Inventory;
/*     */ 
/*     */ public class Gui {
/*     */   private Inventory f;
/*     */   private java.util.Map<Integer, String> D;
/*     */   private java.util.Map<Integer, java.util.List<org.bukkit.inventory.ItemStack>> M;
/*     */   private String b;
/*     */   private String ALLATORIxDEMO;
/*     */   
/*     */   public Inventory getInventory() {
/*  13 */     return a.f;
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
/*     */   public void setCost(Integer a, java.util.List<org.bukkit.inventory.ItemStack> a)
/*     */   {
/*  56 */     a.M.put(a, a);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCommand(Integer a, String a)
/*     */   {
/*  68 */     a.D.put(a, a);
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
/*     */   public String getG()
/*     */   {
/*  89 */     return a.ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/*  96 */     return a.b;
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
/*     */   public void setGui(Inventory a)
/*     */   {
/* 142 */     a.f = a;
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
/*     */   public Gui(String a, String a)
/*     */   {
/* 164 */     a.ALLATORIxDEMO = a;a.b = a;a.f = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     a;a.<init>();new java/util/HashMap.D = a;a.M = new java.util.HashMap();nano.spook1998.rust.object.utils.GuiUtil.addGui(a);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public String getCommand(Integer a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 29	nano/spook1998/rust/object/Gui:D	Ljava/util/Map;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 35 2 0
/*     */     //   10: ifeq +18 -> 28
/*     */     //   13: aload_0
/*     */     //   14: getfield 29	nano/spook1998/rust/object/Gui:D	Ljava/util/Map;
/*     */     //   17: aload_1
/*     */     //   18: invokeinterface 39 2 0
/*     */     //   23: checkcast 41	java/lang/String
/*     */     //   26: areturn
/*     */     //   27: athrow
/*     */     //   28: aconst_null
/*     */     //   29: areturn
/*     */     // Line number table:
/*     */     //   Java source line #73	-> byte code offset #0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	30	0	a	Gui
/*     */     //   0	30	1	a	Integer
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public java.util.List<org.bukkit.inventory.ItemStack> getCost(Integer a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 52	nano/spook1998/rust/object/Gui:M	Ljava/util/Map;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 35 2 0
/*     */     //   10: ifeq +18 -> 28
/*     */     //   13: aload_0
/*     */     //   14: getfield 52	nano/spook1998/rust/object/Gui:M	Ljava/util/Map;
/*     */     //   17: aload_1
/*     */     //   18: invokeinterface 39 2 0
/*     */     //   23: checkcast 61	java/util/List
/*     */     //   26: areturn
/*     */     //   27: athrow
/*     */     //   28: aconst_null
/*     */     //   29: areturn
/*     */     // Line number table:
/*     */     //   Java source line #104	-> byte code offset #0
/*     */     //   Java source line #47	-> byte code offset #28
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	30	0	a	Gui
/*     */     //   0	30	1	a	Integer
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\Gui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */