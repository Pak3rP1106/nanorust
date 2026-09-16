/*     */ package nano.spook1998.rust.utils.crafting.actionbar;
/*     */ 
/*     */ import net.minecraft.server.v1_8_R3.EntityPlayer;
/*     */ import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
/*     */ import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
/*     */ import net.minecraft.server.v1_8_R3.PlayerConnection;
/*     */ import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
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
/*     */ public class ActionBar
/*     */ {
/*     */   public static ActionBar instance;
/*     */   
/*     */   public ActionBar()
/*     */   {
/*  41 */     instance = 
/*     */     
/*     */ 
/*     */ 
/*  45 */       a;
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
/*     */   public void sendActionBar(Player a, String a)
/*     */   {
/*  93 */     ((CraftPlayer)a).getHandle().playerConnection.sendPacket(new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a(ALLATORIxDEMO("g\024hSdB>\f<\024") + a + ALLATORIxDEMO(">K")), (byte)2));
/*     */   }
/*     */   
/*     */   public static ActionBar getInstance() {
/*  97 */     if (instance == null)
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
/* 164 */       new ActionBar();
/*     */     }
/* 123 */     return instance;
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp17_16 = 3;
/*     */     int tmp25_22 = a.length();
/*     */     int tmp29_28 = 1;
/*     */     tmp29_28;
/*     */     int j;
/*     */     int ? = tmp29_28;
/*     */     int k = tmp25_22;
/*     */     (j = new char[tmp25_22] - 1);
/*     */     int i = tmp17_16 << tmp17_16 ^ 0x4;
/*     */     if ((5 << 4 ^ 3 << 1) >= 0)
/*     */     {
/*     */       int tmp48_47 = j;
/*     */       j--;
/*     */       ?[tmp48_47] = ((char)(a.charAt(tmp48_47) ^ i));
/*     */       int tmp69_66 = (j--);
/*     */       ?[tmp69_66] = ((char)(a.charAt(tmp69_66) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\crafting\actionbar\ActionBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */