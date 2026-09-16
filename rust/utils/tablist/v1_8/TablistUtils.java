/*     */ package nano.spook1998.rust.utils.tablist.v1_8;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import nano.spook1998.rust.data.Settings;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TablistUtils
/*     */ {
/*     */   public static void updateTab(Player a)
/*     */   {
/* 170 */     int i = 0;TabManager.getInstance().sendPacketHeaderFooter(a, replace(Settings.TABLIST_HEADER, a), replace(Settings.TABLIST_FOOTER, a));
/*     */     int j;
/*  92 */     for (goto 65; ++j <= 19;) {
/*  13 */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  32 */         a.updateSlot(j, 0, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(i++, a));
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
/*     */     int k;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     tmpTernaryOp = (k = 0; for (goto 112; ++k <= 19;) {
/*  73 */       a.updateSlot(k, 1, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(i++, a));
/*     */     }
/*     */     
/*     */     int m;
/*  77 */     for (tmpTernaryOp = (m = 0; ++m <= 19;) {
/*  47 */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         a.updateSlot(m, 2, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(i++, a));
/*     */     }
/*     */     
/*     */ 
/*     */     int n;
/*     */     
/* 110 */     for (tmpTernaryOp = (n = 0; ++n <= 19;)
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
/* 141 */       a.updateSlot(n, 3, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(???++, a));
/*     */     }
/*  56 */     TabExecutor.getInstance().executeTab(a);
/*     */   }
/*     */   
/*     */   public static void showTab(Player a)
/*     */   {
/*   3 */     TabExecutor.getInstance().clearTab(a);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */     TabManager.getInstance().sendPacketHeaderFooter(a, replace(Settings.TABLIST_HEADER, a), replace(Settings.TABLIST_FOOTER, a));int i = 0;
/*     */     int j;
/*  72 */     for (goto 72; ++j <= 19;)
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
/*  86 */       a.addSlot(j, 0, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(i++, a));
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
/*     */     int k;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */     tmpTernaryOp = (k = 0; for (goto 119; ++k <= 19;) {
/*  60 */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         a.addSlot(k, 1, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(i++, a));
/*     */     }
/*     */     int m;
/*  21 */     for (tmpTernaryOp = (m = 0; ++m <= 19;)
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
/* 112 */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         a.addSlot(m, 2, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(i++, a));
/*     */     }
/*     */     int n;
/* 158 */     for (tmpTernaryOp = (n = 0; ++n <= 19;) {
/*  91 */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         a.addSlot(n, 3, (String)Settings.TABLIST_18.get(Integer.valueOf(i)), replace(???++, a));
/*     */     }
/*  59 */     TabExecutor.getInstance().executeTab(a);
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
/*     */   public static void updateAll()
/*     */   {
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
/* 123 */     for (goto 34; localIterator.hasNext();)
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
/* 171 */       updateTab((Player)localIterator.next());
/*     */     }
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
/*     */     int tmp35_31 = (j = new char[tmp21_18] - 1);
/*     */     tmp35_31;
/*     */     int i = 4 << 3 ^ 0x2 ^ 0x5;
/*     */     ((0x3 ^ 0x5) << 4);
/*     */     if (tmp35_31 >= 0)
/*     */     {
/*     */       int tmp45_44 = j;
/*     */       j--;
/*     */       ?[tmp45_44] = ((char)(a.charAt(tmp45_44) ^ i));
/*     */       int tmp66_63 = (j--);
/*     */       ?[tmp66_63] = ((char)(a.charAt(tmp66_63) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static String replace(String a, Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: invokestatic 117	java/util/Calendar:getInstance	()Ljava/util/Calendar;
/*     */     //   5: astore_3
/*     */     //   6: aload_1
/*     */     //   7: aload_3
/*     */     //   8: dup
/*     */     //   9: bipush 13
/*     */     //   11: invokevirtual 120	java/util/Calendar:get	(I)I
/*     */     //   14: istore_1
/*     */     //   15: bipush 12
/*     */     //   17: invokevirtual 120	java/util/Calendar:get	(I)I
/*     */     //   20: istore 4
/*     */     //   22: invokeinterface 124 1 0
/*     */     //   27: invokestatic 129	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   30: dup
/*     */     //   31: astore 5
/*     */     //   33: invokevirtual 135	nano/spook1998/rust/object/User:getClan	()Lnano/spook1998/rust/object/Clan;
/*     */     //   36: astore 6
/*     */     //   38: aload_2
/*     */     //   39: ifnull +10 -> 49
/*     */     //   42: aload_2
/*     */     //   43: invokevirtual 138	java/lang/String:isEmpty	()Z
/*     */     //   46: ifeq +6 -> 52
/*     */     //   49: aload_2
/*     */     //   50: areturn
/*     */     //   51: athrow
/*     */     //   52: iload_1
/*     */     //   53: bipush 10
/*     */     //   55: if_icmpge +41 -> 96
/*     */     //   58: aload_2
/*     */     //   59: ldc -116
/*     */     //   61: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: new 144	java/lang/StringBuilder
/*     */     //   67: dup
/*     */     //   68: bipush 48
/*     */     //   70: invokestatic 147	java/lang/String:valueOf	(C)Ljava/lang/String;
/*     */     //   73: invokespecial 150	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   76: iload_1
/*     */     //   77: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   80: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   83: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   86: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   89: astore_2
/*     */     //   90: iload 4
/*     */     //   92: goto +20 -> 112
/*     */     //   95: athrow
/*     */     //   96: aload_2
/*     */     //   97: ldc -116
/*     */     //   99: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   102: iload_1
/*     */     //   103: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   106: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   109: astore_2
/*     */     //   110: iload 4
/*     */     //   112: bipush 10
/*     */     //   114: if_icmpge +40 -> 154
/*     */     //   117: aload_2
/*     */     //   118: ldc -91
/*     */     //   120: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   123: new 144	java/lang/StringBuilder
/*     */     //   126: dup
/*     */     //   127: bipush 48
/*     */     //   129: invokestatic 147	java/lang/String:valueOf	(C)Ljava/lang/String;
/*     */     //   132: invokespecial 150	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   135: iload 4
/*     */     //   137: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   140: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   146: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   149: dup
/*     */     //   150: astore_2
/*     */     //   151: goto +19 -> 170
/*     */     //   154: aload_2
/*     */     //   155: ldc -91
/*     */     //   157: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   160: iload 4
/*     */     //   162: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   165: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   168: dup
/*     */     //   169: astore_2
/*     */     //   170: ldc -89
/*     */     //   172: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   175: new 89	nano/spook1998/rust/utils/PlayerUtil
/*     */     //   178: dup
/*     */     //   179: invokespecial 90	nano/spook1998/rust/utils/PlayerUtil:<init>	()V
/*     */     //   182: invokevirtual 171	nano/spook1998/rust/utils/PlayerUtil:getOnline	()Ljava/lang/Integer;
/*     */     //   185: invokevirtual 174	java/lang/Integer:intValue	()I
/*     */     //   188: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   191: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   194: dup
/*     */     //   195: astore_2
/*     */     //   196: ldc -80
/*     */     //   198: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   201: aload 5
/*     */     //   203: invokevirtual 177	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   206: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   209: dup
/*     */     //   210: astore_2
/*     */     //   211: ldc -77
/*     */     //   213: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   216: aload_3
/*     */     //   217: bipush 11
/*     */     //   219: invokevirtual 120	java/util/Calendar:get	(I)I
/*     */     //   222: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   225: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   228: dup
/*     */     //   229: astore_2
/*     */     //   230: ldc -75
/*     */     //   232: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   235: aload 5
/*     */     //   237: invokevirtual 184	nano/spook1998/rust/object/User:getPoints	()Ljava/lang/Integer;
/*     */     //   240: invokevirtual 174	java/lang/Integer:intValue	()I
/*     */     //   243: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   246: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   249: dup
/*     */     //   250: astore_2
/*     */     //   251: ldc -70
/*     */     //   253: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   256: aload 5
/*     */     //   258: invokevirtual 189	nano/spook1998/rust/object/User:getKill	()Ljava/lang/Integer;
/*     */     //   261: invokevirtual 174	java/lang/Integer:intValue	()I
/*     */     //   264: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   267: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   270: dup
/*     */     //   271: astore_2
/*     */     //   272: ldc -65
/*     */     //   274: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   277: aload 5
/*     */     //   279: invokevirtual 194	nano/spook1998/rust/object/User:getDeath	()Ljava/lang/Integer;
/*     */     //   282: invokevirtual 174	java/lang/Integer:intValue	()I
/*     */     //   285: invokestatic 154	java/lang/Integer:toString	(I)Ljava/lang/String;
/*     */     //   288: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   291: astore_2
/*     */     //   292: aload 6
/*     */     //   294: aload_2
/*     */     //   295: swap
/*     */     //   296: ifnull +20 -> 316
/*     */     //   299: ldc -60
/*     */     //   301: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   304: aload 6
/*     */     //   306: invokevirtual 201	nano/spook1998/rust/object/Clan:getTag	()Ljava/lang/String;
/*     */     //   309: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   312: astore_2
/*     */     //   313: goto +17 -> 330
/*     */     //   316: ldc -60
/*     */     //   318: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   321: ldc -53
/*     */     //   323: invokestatic 142	nano/spook1998/rust/utils/tablist/v1_8/TablistUtils:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   326: invokevirtual 163	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   329: astore_2
/*     */     //   330: invokestatic 208	nano/spook1998/rust/utils/RankUtil:getInstance	()Lnano/spook1998/rust/utils/RankUtil;
/*     */     //   333: aload_2
/*     */     //   334: invokevirtual 211	nano/spook1998/rust/utils/RankUtil:parseRank	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   337: dup
/*     */     //   338: astore_1
/*     */     //   339: ifnull +5 -> 344
/*     */     //   342: aload_1
/*     */     //   343: astore_2
/*     */     //   344: aload_1
/*     */     //   345: areturn
/*     */     // Line number table:
/*     */     //   Java source line #18	-> byte code offset #0
/*     */     //   Java source line #120	-> byte code offset #2
/*     */     //   Java source line #11	-> byte code offset #7
/*     */     //   Java source line #176	-> byte code offset #15
/*     */     //   Java source line #66	-> byte code offset #22
/*     */     //   Java source line #20	-> byte code offset #33
/*     */     //   Java source line #173	-> byte code offset #38
/*     */     //   Java source line #139	-> byte code offset #49
/*     */     //   Java source line #80	-> byte code offset #52
/*     */     //   Java source line #106	-> byte code offset #58
/*     */     //   Java source line #64	-> byte code offset #92
/*     */     //   Java source line #74	-> byte code offset #96
/*     */     //   Java source line #132	-> byte code offset #110
/*     */     //   Java source line #186	-> byte code offset #117
/*     */     //   Java source line #133	-> byte code offset #151
/*     */     //   Java source line #57	-> byte code offset #154
/*     */     //   Java source line #99	-> byte code offset #170
/*     */     //   Java source line #28	-> byte code offset #196
/*     */     //   Java source line #94	-> byte code offset #211
/*     */     //   Java source line #157	-> byte code offset #230
/*     */     //   Java source line #50	-> byte code offset #251
/*     */     //   Java source line #124	-> byte code offset #272
/*     */     //   Java source line #140	-> byte code offset #292
/*     */     //   Java source line #85	-> byte code offset #299
/*     */     //   Java source line #14	-> byte code offset #313
/*     */     //   Java source line #67	-> byte code offset #316
/*     */     //   Java source line #122	-> byte code offset #330
/*     */     //   Java source line #108	-> byte code offset #339
/*     */     //   Java source line #137	-> byte code offset #342
/*     */     //   Java source line #4	-> byte code offset #344
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	346	0	a	String
/*     */     //   0	346	1	a	Player
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_8\TablistUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */