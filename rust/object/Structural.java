/*     */ package nano.spook1998.rust.object;
/*     */ 
/*     */ import org.bukkit.block.Block;
/*     */ 
/*     */ public class Structural { private Integer H;
/*     */   
/*   7 */   public java.util.List<Block> getTypeBlock5() { return a.M; }
/*     */   
/*     */ 
/*     */ 
/*     */   private java.util.List<Block> d;
/*     */   
/*     */ 
/*     */   private Boolean K;
/*     */   
/*     */ 
/*     */   private java.util.List<Block> m;
/*     */   
/*     */ 
/*     */   private nano.spook1998.rust.utils.type.StructuralType F;
/*     */   
/*     */   private java.util.List<Block> g;
/*     */   
/*     */   private byte f;
/*     */   
/*     */   private Block D;
/*     */   
/*     */   private java.util.List<Block> M;
/*     */   
/*     */   private java.util.List<Block> b;
/*     */   
/*     */   private Long ALLATORIxDEMO;
/*     */   
/*     */   public void setHealth(Integer a)
/*     */   {
/*  36 */     a.H = a;
/*     */   }
/*     */   
/*     */   public void setTime() {
/*  40 */     a.ALLATORIxDEMO = Long.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTypeBlock4(java.util.List<Block> a)
/*     */   {
/*  51 */     a.b = a;
/*     */   }
/*     */   
/*  54 */   public java.util.List<Block> getTypeBlock1() { return a.g; }
/*     */   
/*     */   public void setStructuralType(nano.spook1998.rust.utils.type.StructuralType a)
/*     */   {
/*  58 */     a.F = a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Long getTime()
/*     */   {
/*  65 */     return a.ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */   public void setStatusToBuild(Boolean a) {
/*  69 */     a.K = a;
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
/*     */   public java.util.List<Block> getTypeBlock3()
/*     */   {
/*  82 */     return a.m;
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
/* 101 */   public void setTypeBlock1(java.util.List<Block> a) { a.g = a; }
/*     */   
/* 103 */   public Block getBlock() { return a.D; }
/*     */   
/* 105 */   public void setTypeBlock3(java.util.List<Block> a) { a.m = a; }
/*     */   
/* 107 */   public nano.spook1998.rust.utils.type.StructuralType getStructuralType() { return a.F; }
/*     */   
/*     */   public Structural(Block a) {
/* 110 */     
/*     */     
/*     */ 
/* 113 */       a.D = a;a.F = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */     a;a.<init>();new java/util/ArrayList.g = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */     a.d = new java.util.ArrayList();a.b = new java.util.ArrayList();a.M = new java.util.ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */     5.H = Integer.valueOf(a);0.K = Boolean.valueOf(a);a.ALLATORIxDEMO = Long.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public java.util.List<Block> getTypeBlock2() {
/* 117 */     return a.d;
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
/*     */   public Boolean getStatusToBuild()
/*     */   {
/* 130 */     return a.K;
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
/*     */   public void setTypeBlock5(java.util.List<Block> a)
/*     */   {
/* 152 */     a.M = a;
/*     */   }
/*     */   
/*     */   public void run(User a)
/*     */   {
/*     */     Object localObject;
/*  72 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.FLOOR))
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
/*  86 */       void tmp31_30 = (localObject = new nano.spook1998.rust.structural.Floor(a.D.getLocation()));tmp31_30.calculate(a); Object tmp40_39 = localObject;a.setTypeBlock1(((nano.spook1998.rust.structural.Floor)localObject).getListBlock1());a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         .setTypeBlock2(((nano.spook1998.rust.structural.Floor)localObject).getListBlock2());a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         .setTypeBlock3(tmp40_39.getFakeSpawn());a.setTypeBlock4(tmp40_39.getListBlock3());a.setStatusToBuild(tmp31_30.isBuild());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.ROOF))
/*     */     {
/*  70 */       void tmp106_105 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         (localObject = new nano.spook1998.rust.structural.Roof(a.D.getLocation()));tmp106_105.calculate(a); Object 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         tmp115_114 = localObject;a.setTypeBlock1(((nano.spook1998.rust.structural.Roof)localObject).getListBlock1());a.setTypeBlock2(((nano.spook1998.rust.structural.Roof)localObject).getListBlock2());a.setTypeBlock3(tmp115_114.getFakeSpawn());a.setTypeBlock4(tmp115_114.getListBlock3());a.setStatusToBuild(tmp106_105.isBuild());
/*     */     }
/*  19 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.WALL))
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
/* 120 */       void tmp181_180 = (localObject = new nano.spook1998.rust.structural.Wall(a.D.getLocation()));tmp181_180.calculate(a); Object tmp190_189 = localObject;a.setTypeBlock1(((nano.spook1998.rust.structural.Wall)localObject).getListBlock1());a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         .setTypeBlock2(((nano.spook1998.rust.structural.Wall)localObject).getListBlock2());a.setTypeBlock3(tmp190_189.getFakeSpawn());a.setTypeBlock4(tmp190_189.getListBlock3());a.setStatusToBuild(tmp181_180.isBuild());
/*     */     }
/*  71 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.WALLWITHDOOR))
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
/* 106 */       void tmp256_255 = (localObject = new nano.spook1998.rust.structural.WallWithDoor(a.D.getLocation()));tmp256_255.calculate(a); Object tmp265_264 = localObject;a.setTypeBlock1(((nano.spook1998.rust.structural.WallWithDoor)localObject).getListBlock1());a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         .setTypeBlock2(((nano.spook1998.rust.structural.WallWithDoor)localObject).getListBlock2());a.setTypeBlock3(tmp265_264.getFakeSpawn());a.setTypeBlock4(tmp265_264.getListBlock3());a.setStatusToBuild(tmp256_255.isBuild()); }
/* 133 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.WALLWITHWINDOW))
/*     */     {
/*  57 */       void tmp331_330 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         (localObject = new nano.spook1998.rust.structural.WallWithWindow(a.D.getLocation()));tmp331_330.calculate(a); Object 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         tmp340_339 = localObject; Object tmp346_345 = localObject;a.setTypeBlock1(tmp346_345.getListBlock1());a.setTypeBlock2(tmp346_345.getListBlock2());a.setTypeBlock3(((nano.spook1998.rust.structural.WallWithWindow)localObject).getFakeSpawn());a.setTypeBlock4(tmp340_339.getListBlock3());a.setTypeBlock5(tmp340_339.getListBlock4());a.setStatusToBuild(tmp331_330.isBuild());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.STAIRS))
/*     */     {
/*  14 */       void tmp414_413 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         (localObject = new nano.spook1998.rust.structural.Stairs(a.D.getLocation()));tmp414_413.calculate(a); Object tmp423_422 = localObject;a.f = ((nano.spook1998.rust.structural.Stairs)localObject).getDirection();a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         .setTypeBlock1(((nano.spook1998.rust.structural.Stairs)localObject).getListBlock1());a.setTypeBlock2(tmp423_422.getListBlock2());a.setTypeBlock3(tmp423_422.getFakeSpawn());a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         .setStatusToBuild(tmp414_413.isBuild());
/*     */     }
/*   4 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.WALLSPEC))
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
/*  87 */       void tmp489_488 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */         (localObject = new nano.spook1998.rust.structural.WallSpec(a.D.getLocation()));tmp489_488.calculate(a); Object tmp498_497 = localObject;a.setTypeBlock1(((nano.spook1998.rust.structural.WallSpec)localObject).getListBlock1());a
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         .setTypeBlock2(((nano.spook1998.rust.structural.WallSpec)localObject).getListBlock2());a.setTypeBlock3(tmp498_497.getFakeSpawn());a.setTypeBlock4(tmp498_497.getListBlock3());a.setStatusToBuild(tmp489_488.isBuild());
/*     */     }
/*  15 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.WALLWITHWINDOWSPEC))
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
/* 102 */       void tmp564_563 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         (localObject = new nano.spook1998.rust.structural.WallWithWindowSpec(a.D.getLocation()));tmp564_563.calculate(a); Object 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         tmp573_572 = localObject; Object tmp579_578 = localObject;a.setTypeBlock1(tmp579_578.getListBlock1());a.setTypeBlock2(tmp579_578.getListBlock2());a.setTypeBlock3(((nano.spook1998.rust.structural.WallWithWindowSpec)localObject).getFakeSpawn());a.setTypeBlock4(tmp573_572.getListBlock3());a
/* 197 */         .setTypeBlock5(tmp573_572.getListBlock4());a.setStatusToBuild(tmp564_563.isBuild());
/*     */     }
/*  53 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.ROOFSPEC))
/*     */     {
/*  17 */       void tmp647_646 = 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         (localObject = new nano.spook1998.rust.structural.RoofSpec(a.D.getLocation()));tmp647_646.calculate(a); Object tmp656_655 = localObject;a.setTypeBlock1(((nano.spook1998.rust.structural.RoofSpec)localObject).getListBlock1());a.setTypeBlock2(((nano.spook1998.rust.structural.RoofSpec)localObject).getListBlock2());a.setTypeBlock3(tmp656_655.getFakeSpawn());a.setTypeBlock4(tmp656_655.getListBlock3());a.setStatusToBuild(tmp647_646.isBuild());
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */     if (a.getStructuralType().equals(nano.spook1998.rust.utils.type.StructuralType.FLOORSPEC))
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
/* 184 */       void tmp722_721 = (localObject = new nano.spook1998.rust.structural.FloorSpec(a.D.getLocation()));tmp722_721.calculate(a); Object tmp731_730 = localObject; Object tmp737_736 = localObject;a.D = tmp737_736.getMainBlock();a.setTypeBlock1(tmp737_736.getListBlock1());a.setTypeBlock2(((nano.spook1998.rust.structural.FloorSpec)localObject).getListBlock2());a.setTypeBlock3(tmp731_730.getFakeSpawn());a.setTypeBlock4(tmp731_730.getListBlock3());a
/* 185 */         .setStatusToBuild(tmp722_721.isBuild()); } }
/*     */   
/* 187 */   public Integer getHealth() { return a.H; }
/*     */   
/* 189 */   public void setTypeBlock2(java.util.List<Block> a) { a.d = a; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public java.util.List<Block> getTypeBlock4()
/*     */   {
/* 199 */     return a.b;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean isInStructuralAll(Block a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 64	nano/spook1998/rust/object/Structural:g	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 70 2 0
/*     */     //   10: ifeq +9 -> 19
/*     */     //   13: iconst_1
/*     */     //   14: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   17: areturn
/*     */     //   18: athrow
/*     */     //   19: aload_0
/*     */     //   20: getfield 60	nano/spook1998/rust/object/Structural:d	Ljava/util/List;
/*     */     //   23: aload_1
/*     */     //   24: invokeinterface 70 2 0
/*     */     //   29: ifeq +9 -> 38
/*     */     //   32: iconst_1
/*     */     //   33: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   36: areturn
/*     */     //   37: athrow
/*     */     //   38: iconst_0
/*     */     //   39: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   42: areturn
/*     */     // Line number table:
/*     */     //   Java source line #271	-> byte code offset #0
/*     */     //   Java source line #266	-> byte code offset #19
/*     */     //   Java source line #203	-> byte code offset #38
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	43	0	a	Structural
/*     */     //   0	43	1	a	Block
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void build(org.bukkit.entity.Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 95	org/bukkit/Bukkit:getOnlinePlayers	()Ljava/util/Collection;
/*     */     //   3: invokeinterface 101 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +60 -> 70
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 107 1 0
/*     */     //   20: checkcast 109	org/bukkit/entity/Player
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokeinterface 113 1 0
/*     */     //   30: aload_0
/*     */     //   31: getfield 87	nano/spook1998/rust/object/Structural:D	Lorg/bukkit/block/Block;
/*     */     //   34: invokeinterface 114 1 0
/*     */     //   39: invokevirtual 120	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
/*     */     //   42: ldc2_w 121
/*     */     //   45: dcmpg
/*     */     //   46: ifgt +23 -> 69
/*     */     //   49: aload_1
/*     */     //   50: aload_0
/*     */     //   51: getfield 87	nano/spook1998/rust/object/Structural:D	Lorg/bukkit/block/Block;
/*     */     //   54: invokeinterface 114 1 0
/*     */     //   59: getstatic 128	org/bukkit/Sound:GHAST_FIREBALL	Lorg/bukkit/Sound;
/*     */     //   62: fconst_1
/*     */     //   63: dup
/*     */     //   64: invokeinterface 132 5 0
/*     */     //   69: aload_2
/*     */     //   70: invokeinterface 136 1 0
/*     */     //   75: ifne -61 -> 14
/*     */     //   78: aload_0
/*     */     //   79: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   82: getstatic 145	nano/spook1998/rust/utils/type/StructuralType:WALLWITHWINDOW	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   85: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   88: ifne +16 -> 104
/*     */     //   91: aload_0
/*     */     //   92: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   95: getstatic 151	nano/spook1998/rust/utils/type/StructuralType:WALLWITHWINDOWSPEC	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   98: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   101: ifeq +235 -> 336
/*     */     //   104: aload_0
/*     */     //   105: invokevirtual 154	nano/spook1998/rust/object/Structural:getTypeBlock4	()Ljava/util/List;
/*     */     //   108: invokeinterface 155 1 0
/*     */     //   113: dup
/*     */     //   114: astore_2
/*     */     //   115: goto +42 -> 157
/*     */     //   118: athrow
/*     */     //   119: aload_2
/*     */     //   120: invokeinterface 107 1 0
/*     */     //   125: checkcast 79	org/bukkit/block/Block
/*     */     //   128: dup
/*     */     //   129: astore_1
/*     */     //   130: invokeinterface 159 1 0
/*     */     //   135: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   138: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   141: ifeq +15 -> 156
/*     */     //   144: aload_1
/*     */     //   145: bipush 17
/*     */     //   147: bipush 13
/*     */     //   149: iconst_1
/*     */     //   150: invokeinterface 170 4 0
/*     */     //   155: pop
/*     */     //   156: aload_2
/*     */     //   157: invokeinterface 136 1 0
/*     */     //   162: ifne -43 -> 119
/*     */     //   165: aload_0
/*     */     //   166: invokevirtual 173	nano/spook1998/rust/object/Structural:getTypeBlock1	()Ljava/util/List;
/*     */     //   169: invokeinterface 155 1 0
/*     */     //   174: dup
/*     */     //   175: astore_2
/*     */     //   176: goto +41 -> 217
/*     */     //   179: aload_2
/*     */     //   180: invokeinterface 107 1 0
/*     */     //   185: checkcast 79	org/bukkit/block/Block
/*     */     //   188: dup
/*     */     //   189: astore_1
/*     */     //   190: invokeinterface 159 1 0
/*     */     //   195: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   198: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   201: ifeq +15 -> 216
/*     */     //   204: aload_1
/*     */     //   205: bipush 17
/*     */     //   207: bipush 12
/*     */     //   209: iconst_1
/*     */     //   210: invokeinterface 170 4 0
/*     */     //   215: pop
/*     */     //   216: aload_2
/*     */     //   217: invokeinterface 136 1 0
/*     */     //   222: ifne -43 -> 179
/*     */     //   225: aload_0
/*     */     //   226: invokevirtual 175	nano/spook1998/rust/object/Structural:getTypeBlock2	()Ljava/util/List;
/*     */     //   229: invokeinterface 155 1 0
/*     */     //   234: dup
/*     */     //   235: astore_2
/*     */     //   236: goto +38 -> 274
/*     */     //   239: aload_2
/*     */     //   240: invokeinterface 107 1 0
/*     */     //   245: checkcast 79	org/bukkit/block/Block
/*     */     //   248: dup
/*     */     //   249: astore_1
/*     */     //   250: invokeinterface 159 1 0
/*     */     //   255: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   258: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   261: ifeq +12 -> 273
/*     */     //   264: aload_1
/*     */     //   265: getstatic 178	org/bukkit/Material:HAY_BLOCK	Lorg/bukkit/Material;
/*     */     //   268: invokeinterface 182 2 0
/*     */     //   273: aload_2
/*     */     //   274: invokeinterface 136 1 0
/*     */     //   279: ifne -40 -> 239
/*     */     //   282: aload_0
/*     */     //   283: invokevirtual 185	nano/spook1998/rust/object/Structural:getTypeBlock5	()Ljava/util/List;
/*     */     //   286: invokeinterface 155 1 0
/*     */     //   291: dup
/*     */     //   292: astore_2
/*     */     //   293: goto +35 -> 328
/*     */     //   296: aload_2
/*     */     //   297: invokeinterface 107 1 0
/*     */     //   302: checkcast 79	org/bukkit/block/Block
/*     */     //   305: astore_1
/*     */     //   306: aload_2
/*     */     //   307: aload_1
/*     */     //   308: bipush 20
/*     */     //   310: iconst_0
/*     */     //   311: iconst_1
/*     */     //   312: invokeinterface 170 4 0
/*     */     //   317: aload_0
/*     */     //   318: getfield 64	nano/spook1998/rust/object/Structural:g	Ljava/util/List;
/*     */     //   321: aload_1
/*     */     //   322: invokeinterface 188 2 0
/*     */     //   327: pop2
/*     */     //   328: invokeinterface 136 1 0
/*     */     //   333: ifne -37 -> 296
/*     */     //   336: aload_0
/*     */     //   337: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   340: getstatic 191	nano/spook1998/rust/utils/type/StructuralType:ROOFSPEC	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   343: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   346: ifne +81 -> 427
/*     */     //   349: aload_0
/*     */     //   350: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   353: getstatic 194	nano/spook1998/rust/utils/type/StructuralType:FLOORSPEC	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   356: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   359: ifne +68 -> 427
/*     */     //   362: aload_0
/*     */     //   363: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   366: getstatic 197	nano/spook1998/rust/utils/type/StructuralType:WALLSPEC	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   369: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   372: ifne +55 -> 427
/*     */     //   375: aload_0
/*     */     //   376: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   379: getstatic 200	nano/spook1998/rust/utils/type/StructuralType:ROOF	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   382: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   385: ifne +42 -> 427
/*     */     //   388: aload_0
/*     */     //   389: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   392: getstatic 203	nano/spook1998/rust/utils/type/StructuralType:FLOOR	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   395: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   398: ifne +29 -> 427
/*     */     //   401: aload_0
/*     */     //   402: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   405: getstatic 206	nano/spook1998/rust/utils/type/StructuralType:WALL	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   408: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   411: ifne +16 -> 427
/*     */     //   414: aload_0
/*     */     //   415: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   418: getstatic 209	nano/spook1998/rust/utils/type/StructuralType:WALLWITHDOOR	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   421: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   424: ifeq +169 -> 593
/*     */     //   427: aload_0
/*     */     //   428: invokevirtual 154	nano/spook1998/rust/object/Structural:getTypeBlock4	()Ljava/util/List;
/*     */     //   431: invokeinterface 155 1 0
/*     */     //   436: dup
/*     */     //   437: astore_2
/*     */     //   438: goto +26 -> 464
/*     */     //   441: aload_2
/*     */     //   442: invokeinterface 107 1 0
/*     */     //   447: checkcast 79	org/bukkit/block/Block
/*     */     //   450: astore_1
/*     */     //   451: aload_2
/*     */     //   452: aload_1
/*     */     //   453: bipush 17
/*     */     //   455: bipush 13
/*     */     //   457: iconst_1
/*     */     //   458: invokeinterface 170 4 0
/*     */     //   463: pop
/*     */     //   464: invokeinterface 136 1 0
/*     */     //   469: ifne -28 -> 441
/*     */     //   472: aload_0
/*     */     //   473: invokevirtual 173	nano/spook1998/rust/object/Structural:getTypeBlock1	()Ljava/util/List;
/*     */     //   476: invokeinterface 155 1 0
/*     */     //   481: dup
/*     */     //   482: astore_2
/*     */     //   483: goto +41 -> 524
/*     */     //   486: aload_2
/*     */     //   487: invokeinterface 107 1 0
/*     */     //   492: checkcast 79	org/bukkit/block/Block
/*     */     //   495: dup
/*     */     //   496: astore_1
/*     */     //   497: invokeinterface 159 1 0
/*     */     //   502: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   505: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   508: ifeq +15 -> 523
/*     */     //   511: aload_1
/*     */     //   512: bipush 17
/*     */     //   514: bipush 12
/*     */     //   516: iconst_1
/*     */     //   517: invokeinterface 170 4 0
/*     */     //   522: pop
/*     */     //   523: aload_2
/*     */     //   524: invokeinterface 136 1 0
/*     */     //   529: ifne -43 -> 486
/*     */     //   532: aload_0
/*     */     //   533: invokevirtual 175	nano/spook1998/rust/object/Structural:getTypeBlock2	()Ljava/util/List;
/*     */     //   536: invokeinterface 155 1 0
/*     */     //   541: dup
/*     */     //   542: astore_2
/*     */     //   543: goto +38 -> 581
/*     */     //   546: aload_2
/*     */     //   547: invokeinterface 107 1 0
/*     */     //   552: checkcast 79	org/bukkit/block/Block
/*     */     //   555: dup
/*     */     //   556: astore_1
/*     */     //   557: invokeinterface 159 1 0
/*     */     //   562: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   565: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   568: ifeq +12 -> 580
/*     */     //   571: aload_1
/*     */     //   572: getstatic 178	org/bukkit/Material:HAY_BLOCK	Lorg/bukkit/Material;
/*     */     //   575: invokeinterface 182 2 0
/*     */     //   580: aload_2
/*     */     //   581: invokeinterface 136 1 0
/*     */     //   586: ifne -40 -> 546
/*     */     //   589: aload_0
/*     */     //   590: goto +126 -> 716
/*     */     //   593: aload_0
/*     */     //   594: invokevirtual 173	nano/spook1998/rust/object/Structural:getTypeBlock1	()Ljava/util/List;
/*     */     //   597: invokeinterface 155 1 0
/*     */     //   602: dup
/*     */     //   603: astore_2
/*     */     //   604: goto +41 -> 645
/*     */     //   607: aload_2
/*     */     //   608: invokeinterface 107 1 0
/*     */     //   613: checkcast 79	org/bukkit/block/Block
/*     */     //   616: dup
/*     */     //   617: astore_1
/*     */     //   618: invokeinterface 159 1 0
/*     */     //   623: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   626: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   629: ifeq +15 -> 644
/*     */     //   632: aload_1
/*     */     //   633: bipush 17
/*     */     //   635: bipush 12
/*     */     //   637: iconst_1
/*     */     //   638: invokeinterface 170 4 0
/*     */     //   643: pop
/*     */     //   644: aload_2
/*     */     //   645: invokeinterface 136 1 0
/*     */     //   650: ifne -43 -> 607
/*     */     //   653: aload_0
/*     */     //   654: invokevirtual 175	nano/spook1998/rust/object/Structural:getTypeBlock2	()Ljava/util/List;
/*     */     //   657: invokeinterface 155 1 0
/*     */     //   662: dup
/*     */     //   663: astore_2
/*     */     //   664: goto +43 -> 707
/*     */     //   667: aload_2
/*     */     //   668: invokeinterface 107 1 0
/*     */     //   673: checkcast 79	org/bukkit/block/Block
/*     */     //   676: dup
/*     */     //   677: astore_1
/*     */     //   678: invokeinterface 159 1 0
/*     */     //   683: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   686: invokevirtual 166	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   689: ifeq +17 -> 706
/*     */     //   692: aload_1
/*     */     //   693: bipush 53
/*     */     //   695: aload_0
/*     */     //   696: getfield 211	nano/spook1998/rust/object/Structural:f	B
/*     */     //   699: iconst_1
/*     */     //   700: invokeinterface 170 4 0
/*     */     //   705: pop
/*     */     //   706: aload_2
/*     */     //   707: invokeinterface 136 1 0
/*     */     //   712: ifne -45 -> 667
/*     */     //   715: aload_0
/*     */     //   716: getstatic 216	nano/spook1998/rust/data/Settings:STRUCTURAL_DEFAULT_HEALTH	Ljava/lang/Integer;
/*     */     //   719: invokevirtual 218	nano/spook1998/rust/object/Structural:setHealth	(Ljava/lang/Integer;)V
/*     */     //   722: aload_0
/*     */     //   723: invokestatic 224	nano/spook1998/rust/object/utils/StructuralUtil:addStructural	(Lnano/spook1998/rust/object/Structural;)V
/*     */     //   726: return
/*     */     // Line number table:
/*     */     //   Java source line #418	-> byte code offset #0
/*     */     //   Java source line #312	-> byte code offset #78
/*     */     //   Java source line #268	-> byte code offset #104
/*     */     //   Java source line #205	-> byte code offset #130
/*     */     //   Java source line #268	-> byte code offset #156
/*     */     //   Java source line #304	-> byte code offset #165
/*     */     //   Java source line #406	-> byte code offset #190
/*     */     //   Java source line #304	-> byte code offset #216
/*     */     //   Java source line #329	-> byte code offset #225
/*     */     //   Java source line #258	-> byte code offset #250
/*     */     //   Java source line #329	-> byte code offset #273
/*     */     //   Java source line #389	-> byte code offset #282
/*     */     //   Java source line #286	-> byte code offset #307
/*     */     //   Java source line #335	-> byte code offset #317
/*     */     //   Java source line #389	-> byte code offset #328
/*     */     //   Java source line #246	-> byte code offset #336
/*     */     //   Java source line #234	-> byte code offset #427
/*     */     //   Java source line #272	-> byte code offset #452
/*     */     //   Java source line #234	-> byte code offset #464
/*     */     //   Java source line #349	-> byte code offset #472
/*     */     //   Java source line #375	-> byte code offset #497
/*     */     //   Java source line #349	-> byte code offset #523
/*     */     //   Java source line #238	-> byte code offset #532
/*     */     //   Java source line #301	-> byte code offset #557
/*     */     //   Java source line #238	-> byte code offset #580
/*     */     //   Java source line #309	-> byte code offset #590
/*     */     //   Java source line #318	-> byte code offset #593
/*     */     //   Java source line #393	-> byte code offset #618
/*     */     //   Java source line #318	-> byte code offset #644
/*     */     //   Java source line #210	-> byte code offset #653
/*     */     //   Java source line #366	-> byte code offset #678
/*     */     //   Java source line #210	-> byte code offset #706
/*     */     //   Java source line #382	-> byte code offset #715
/*     */     //   Java source line #221	-> byte code offset #722
/*     */     //   Java source line #228	-> byte code offset #726
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	727	0	a	Structural
/*     */     //   0	727	1	a	org.bukkit.entity.Player
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void destroy()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 95	org/bukkit/Bukkit:getOnlinePlayers	()Ljava/util/Collection;
/*     */     //   3: invokeinterface 101 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +60 -> 70
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 107 1 0
/*     */     //   20: checkcast 109	org/bukkit/entity/Player
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokeinterface 113 1 0
/*     */     //   30: aload_0
/*     */     //   31: getfield 87	nano/spook1998/rust/object/Structural:D	Lorg/bukkit/block/Block;
/*     */     //   34: invokeinterface 114 1 0
/*     */     //   39: invokevirtual 120	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
/*     */     //   42: ldc2_w 121
/*     */     //   45: dcmpg
/*     */     //   46: ifgt +23 -> 69
/*     */     //   49: aload_1
/*     */     //   50: aload_0
/*     */     //   51: getfield 87	nano/spook1998/rust/object/Structural:D	Lorg/bukkit/block/Block;
/*     */     //   54: invokeinterface 114 1 0
/*     */     //   59: getstatic 232	org/bukkit/Sound:EXPLODE	Lorg/bukkit/Sound;
/*     */     //   62: fconst_1
/*     */     //   63: dup
/*     */     //   64: invokeinterface 132 5 0
/*     */     //   69: aload_2
/*     */     //   70: invokeinterface 136 1 0
/*     */     //   75: ifne -61 -> 14
/*     */     //   78: aload_0
/*     */     //   79: invokevirtual 173	nano/spook1998/rust/object/Structural:getTypeBlock1	()Ljava/util/List;
/*     */     //   82: invokeinterface 155 1 0
/*     */     //   87: dup
/*     */     //   88: astore_2
/*     */     //   89: goto +35 -> 124
/*     */     //   92: athrow
/*     */     //   93: aload_2
/*     */     //   94: invokeinterface 107 1 0
/*     */     //   99: checkcast 79	org/bukkit/block/Block
/*     */     //   102: dup
/*     */     //   103: astore_1
/*     */     //   104: invokestatic 236	nano/spook1998/rust/object/utils/StructuralUtil:checkBlocks	(Lorg/bukkit/block/Block;)Ljava/lang/Integer;
/*     */     //   107: invokevirtual 242	java/lang/Integer:intValue	()I
/*     */     //   110: iconst_1
/*     */     //   111: if_icmpne +12 -> 123
/*     */     //   114: aload_1
/*     */     //   115: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   118: invokeinterface 182 2 0
/*     */     //   123: aload_2
/*     */     //   124: invokeinterface 136 1 0
/*     */     //   129: ifne -36 -> 93
/*     */     //   132: aload_0
/*     */     //   133: invokevirtual 175	nano/spook1998/rust/object/Structural:getTypeBlock2	()Ljava/util/List;
/*     */     //   136: invokeinterface 155 1 0
/*     */     //   141: dup
/*     */     //   142: astore_2
/*     */     //   143: goto +34 -> 177
/*     */     //   146: aload_2
/*     */     //   147: invokeinterface 107 1 0
/*     */     //   152: checkcast 79	org/bukkit/block/Block
/*     */     //   155: dup
/*     */     //   156: astore_1
/*     */     //   157: invokestatic 236	nano/spook1998/rust/object/utils/StructuralUtil:checkBlocks	(Lorg/bukkit/block/Block;)Ljava/lang/Integer;
/*     */     //   160: invokevirtual 242	java/lang/Integer:intValue	()I
/*     */     //   163: iconst_1
/*     */     //   164: if_icmpne +12 -> 176
/*     */     //   167: aload_1
/*     */     //   168: getstatic 165	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   171: invokeinterface 182 2 0
/*     */     //   176: aload_2
/*     */     //   177: invokeinterface 136 1 0
/*     */     //   182: ifne -36 -> 146
/*     */     //   185: aload_0
/*     */     //   186: invokestatic 245	nano/spook1998/rust/object/utils/StructuralUtil:removeStructural	(Lnano/spook1998/rust/object/Structural;)V
/*     */     //   189: return
/*     */     // Line number table:
/*     */     //   Java source line #215	-> byte code offset #0
/*     */     //   Java source line #311	-> byte code offset #78
/*     */     //   Java source line #341	-> byte code offset #104
/*     */     //   Java source line #311	-> byte code offset #123
/*     */     //   Java source line #344	-> byte code offset #132
/*     */     //   Java source line #298	-> byte code offset #157
/*     */     //   Java source line #344	-> byte code offset #176
/*     */     //   Java source line #217	-> byte code offset #185
/*     */     //   Java source line #211	-> byte code offset #189
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	190	0	a	Structural
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void upgrade(org.bukkit.Material a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 95	org/bukkit/Bukkit:getOnlinePlayers	()Ljava/util/Collection;
/*     */     //   3: invokeinterface 101 1 0
/*     */     //   8: dup
/*     */     //   9: astore_3
/*     */     //   10: goto +60 -> 70
/*     */     //   13: athrow
/*     */     //   14: aload_3
/*     */     //   15: invokeinterface 107 1 0
/*     */     //   20: checkcast 109	org/bukkit/entity/Player
/*     */     //   23: dup
/*     */     //   24: astore_2
/*     */     //   25: invokeinterface 113 1 0
/*     */     //   30: aload_0
/*     */     //   31: getfield 87	nano/spook1998/rust/object/Structural:D	Lorg/bukkit/block/Block;
/*     */     //   34: invokeinterface 114 1 0
/*     */     //   39: invokevirtual 120	org/bukkit/Location:distance	(Lorg/bukkit/Location;)D
/*     */     //   42: ldc2_w 121
/*     */     //   45: dcmpg
/*     */     //   46: ifgt +23 -> 69
/*     */     //   49: aload_2
/*     */     //   50: aload_0
/*     */     //   51: invokevirtual 389	nano/spook1998/rust/object/Structural:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   54: invokeinterface 114 1 0
/*     */     //   59: getstatic 392	org/bukkit/Sound:ANVIL_USE	Lorg/bukkit/Sound;
/*     */     //   62: fconst_1
/*     */     //   63: dup
/*     */     //   64: invokeinterface 132 5 0
/*     */     //   69: aload_3
/*     */     //   70: invokeinterface 136 1 0
/*     */     //   75: ifne -61 -> 14
/*     */     //   78: aload_0
/*     */     //   79: invokevirtual 140	nano/spook1998/rust/object/Structural:getStructuralType	()Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   82: getstatic 331	nano/spook1998/rust/utils/type/StructuralType:STAIRS	Lnano/spook1998/rust/utils/type/StructuralType;
/*     */     //   85: invokevirtual 148	nano/spook1998/rust/utils/type/StructuralType:equals	(Ljava/lang/Object;)Z
/*     */     //   88: ifeq +5 -> 93
/*     */     //   91: return
/*     */     //   92: athrow
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual 175	nano/spook1998/rust/object/Structural:getTypeBlock2	()Ljava/util/List;
/*     */     //   97: invokeinterface 155 1 0
/*     */     //   102: dup
/*     */     //   103: astore_3
/*     */     //   104: goto +21 -> 125
/*     */     //   107: aload_3
/*     */     //   108: invokeinterface 107 1 0
/*     */     //   113: checkcast 79	org/bukkit/block/Block
/*     */     //   116: astore_2
/*     */     //   117: aload_3
/*     */     //   118: aload_2
/*     */     //   119: aload_1
/*     */     //   120: invokeinterface 182 2 0
/*     */     //   125: invokeinterface 136 1 0
/*     */     //   130: ifne -23 -> 107
/*     */     //   133: return
/*     */     // Line number table:
/*     */     //   Java source line #260	-> byte code offset #0
/*     */     //   Java source line #231	-> byte code offset #78
/*     */     //   Java source line #330	-> byte code offset #93
/*     */     //   Java source line #376	-> byte code offset #118
/*     */     //   Java source line #330	-> byte code offset #125
/*     */     //   Java source line #370	-> byte code offset #133
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	134	0	a	Structural
/*     */     //   0	134	1	a	org.bukkit.Material
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean isInStructural(Block a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 60	nano/spook1998/rust/object/Structural:d	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 70 2 0
/*     */     //   10: ifeq +9 -> 19
/*     */     //   13: iconst_1
/*     */     //   14: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   17: areturn
/*     */     //   18: athrow
/*     */     //   19: iconst_0
/*     */     //   20: invokestatic 75	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   23: areturn
/*     */     // Line number table:
/*     */     //   Java source line #381	-> byte code offset #0
/*     */     //   Java source line #392	-> byte code offset #19
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	24	0	a	Structural
/*     */     //   0	24	1	a	Block
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\Structural.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */