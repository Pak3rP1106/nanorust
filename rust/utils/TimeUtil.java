package nano.spook1998.rust.utils;

public class TimeUtil
{
  /* Error */
  public static String getDurationBreakdown(long a)
  {
    // Byte code:
    //   0: lload_0
    //   1: lconst_0
    //   2: lcmp
    //   3: ifne +10 -> 13
    //   6: ldc 9
    //   8: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   11: areturn
    //   12: athrow
    //   13: getstatic 19	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   16: lload_0
    //   17: invokevirtual 23	java/util/concurrent/TimeUnit:toDays	(J)J
    //   20: dup2
    //   21: lstore_2
    //   22: lconst_0
    //   23: lcmp
    //   24: ifle +13 -> 37
    //   27: lload_0
    //   28: getstatic 26	java/util/concurrent/TimeUnit:DAYS	Ljava/util/concurrent/TimeUnit;
    //   31: lload_2
    //   32: invokevirtual 29	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   35: lsub
    //   36: lstore_0
    //   37: getstatic 19	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   40: lload_0
    //   41: invokevirtual 32	java/util/concurrent/TimeUnit:toHours	(J)J
    //   44: dup2
    //   45: lstore 4
    //   47: lconst_0
    //   48: lcmp
    //   49: ifle +14 -> 63
    //   52: lload_0
    //   53: getstatic 35	java/util/concurrent/TimeUnit:HOURS	Ljava/util/concurrent/TimeUnit;
    //   56: lload 4
    //   58: invokevirtual 29	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   61: lsub
    //   62: lstore_0
    //   63: getstatic 19	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   66: lload_0
    //   67: invokevirtual 38	java/util/concurrent/TimeUnit:toMinutes	(J)J
    //   70: dup2
    //   71: lstore 6
    //   73: lconst_0
    //   74: lcmp
    //   75: ifle +14 -> 89
    //   78: lload_0
    //   79: getstatic 41	java/util/concurrent/TimeUnit:MINUTES	Ljava/util/concurrent/TimeUnit;
    //   82: lload 6
    //   84: invokevirtual 29	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   87: lsub
    //   88: lstore_0
    //   89: getstatic 19	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   92: lload_0
    //   93: invokevirtual 44	java/util/concurrent/TimeUnit:toSeconds	(J)J
    //   96: dup2
    //   97: lstore 8
    //   99: lconst_0
    //   100: lcmp
    //   101: ifle +14 -> 115
    //   104: lload_0
    //   105: getstatic 47	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   108: lload 8
    //   110: invokevirtual 29	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   113: lsub
    //   114: lstore_0
    //   115: new 49	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   122: astore_1
    //   123: lload_2
    //   124: lconst_0
    //   125: lcmp
    //   126: ifle +49 -> 175
    //   129: aload_1
    //   130: lload_2
    //   131: invokevirtual 57	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   134: lload_2
    //   135: ldc2_w 58
    //   138: lrem
    //   139: lstore 10
    //   141: pop
    //   142: lload 10
    //   144: lconst_1
    //   145: lcmp
    //   146: ifne +19 -> 165
    //   149: lload 4
    //   151: aload_1
    //   152: ldc 61
    //   154: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   157: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: goto +16 -> 177
    //   164: athrow
    //   165: aload_1
    //   166: ldc 61
    //   168: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   171: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: lload 4
    //   177: lconst_0
    //   178: lcmp
    //   179: ifle +74 -> 253
    //   182: aload_1
    //   183: lload 4
    //   185: invokevirtual 57	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   188: lload 4
    //   190: ldc2_w 58
    //   193: lrem
    //   194: lstore 10
    //   196: pop
    //   197: lload 10
    //   199: lconst_1
    //   200: lcmp
    //   201: ifne +18 -> 219
    //   204: lload 6
    //   206: aload_1
    //   207: ldc 66
    //   209: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   212: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: goto +39 -> 255
    //   219: lload 10
    //   221: ldc2_w 67
    //   224: lcmp
    //   225: aload_1
    //   226: swap
    //   227: ifge +17 -> 244
    //   230: ldc 66
    //   232: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   235: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: lload 6
    //   241: goto +14 -> 255
    //   244: ldc 66
    //   246: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   249: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: lload 6
    //   255: lconst_0
    //   256: lcmp
    //   257: ifle +74 -> 331
    //   260: aload_1
    //   261: lload 6
    //   263: invokevirtual 57	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   266: lload 6
    //   268: ldc2_w 58
    //   271: lrem
    //   272: lstore 10
    //   274: pop
    //   275: lload 10
    //   277: lconst_1
    //   278: lcmp
    //   279: ifne +18 -> 297
    //   282: lload 8
    //   284: aload_1
    //   285: ldc 70
    //   287: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   290: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: goto +39 -> 333
    //   297: lload 10
    //   299: ldc2_w 67
    //   302: lcmp
    //   303: aload_1
    //   304: swap
    //   305: ifge +17 -> 322
    //   308: ldc 70
    //   310: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   313: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: lload 8
    //   319: goto +14 -> 333
    //   322: ldc 70
    //   324: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   327: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: lload 8
    //   333: lconst_0
    //   334: lcmp
    //   335: ifle +72 -> 407
    //   338: aload_1
    //   339: lload 8
    //   341: invokevirtual 57	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   344: lload 8
    //   346: ldc2_w 58
    //   349: lrem
    //   350: lstore 10
    //   352: pop
    //   353: lload 10
    //   355: lconst_1
    //   356: lcmp
    //   357: ifne +17 -> 374
    //   360: aload_1
    //   361: dup
    //   362: ldc 72
    //   364: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   367: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: pop
    //   371: goto +37 -> 408
    //   374: lload 10
    //   376: ldc2_w 67
    //   379: lcmp
    //   380: aload_1
    //   381: swap
    //   382: ifle +16 -> 398
    //   385: ldc 72
    //   387: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   390: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: aload_1
    //   395: goto +13 -> 408
    //   398: ldc 72
    //   400: invokestatic 13	nano/spook1998/rust/utils/TimeUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
    //   403: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: pop
    //   407: aload_1
    //   408: invokevirtual 76	java/lang/StringBuilder:length	()I
    //   411: ifne +6 -> 417
    //   414: ldc 78
    //   416: areturn
    //   417: aload_1
    //   418: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   421: areturn
    // Line number table:
    //   Java source line #8	-> byte code offset #0
    //   Java source line #2	-> byte code offset #6
    //   Java source line #46	-> byte code offset #13
    //   Java source line #167	-> byte code offset #22
    //   Java source line #45	-> byte code offset #27
    //   Java source line #150	-> byte code offset #37
    //   Java source line #23	-> byte code offset #47
    //   Java source line #97	-> byte code offset #52
    //   Java source line #38	-> byte code offset #63
    //   Java source line #123	-> byte code offset #73
    //   Java source line #171	-> byte code offset #78
    //   Java source line #93	-> byte code offset #89
    //   Java source line #119	-> byte code offset #99
    //   Java source line #170	-> byte code offset #104
    //   Java source line #92	-> byte code offset #115
    //   Java source line #32	-> byte code offset #123
    //   Java source line #13	-> byte code offset #129
    //   Java source line #155	-> byte code offset #134
    //   Java source line #162	-> byte code offset #142
    //   Java source line #73	-> byte code offset #151
    //   Java source line #77	-> byte code offset #165
    //   Java source line #113	-> byte code offset #175
    //   Java source line #110	-> byte code offset #182
    //   Java source line #68	-> byte code offset #188
    //   Java source line #141	-> byte code offset #197
    //   Java source line #180	-> byte code offset #206
    //   Java source line #56	-> byte code offset #216
    //   Java source line #24	-> byte code offset #219
    //   Java source line #194	-> byte code offset #230
    //   Java source line #142	-> byte code offset #241
    //   Java source line #160	-> byte code offset #244
    //   Java source line #5	-> byte code offset #253
    //   Java source line #86	-> byte code offset #260
    //   Java source line #29	-> byte code offset #266
    //   Java source line #163	-> byte code offset #275
    //   Java source line #193	-> byte code offset #284
    //   Java source line #60	-> byte code offset #294
    //   Java source line #129	-> byte code offset #297
    //   Java source line #21	-> byte code offset #308
    //   Java source line #175	-> byte code offset #319
    //   Java source line #70	-> byte code offset #322
    //   Java source line #91	-> byte code offset #331
    //   Java source line #39	-> byte code offset #338
    //   Java source line #59	-> byte code offset #344
    //   Java source line #174	-> byte code offset #353
    //   Java source line #19	-> byte code offset #360
    //   Java source line #18	-> byte code offset #371
    //   Java source line #120	-> byte code offset #374
    //   Java source line #11	-> byte code offset #385
    //   Java source line #176	-> byte code offset #395
    //   Java source line #20	-> byte code offset #398
    //   Java source line #71	-> byte code offset #407
    //   Java source line #80	-> byte code offset #414
    //   Java source line #64	-> byte code offset #417
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	422	0	a	long
  }
  
  public static String ALLATORIxDEMO(String a)
  {
    int tmp25_22 = a.length();
    int tmp29_28 = 1;
    tmp29_28;
    int j;
    int ? = tmp29_28;
    int k = tmp25_22;
    (j = new char[tmp25_22] - 1);
    int i = (0x3 ^ 0x5) << 4 ^ 3 << 1;
    if (((0x3 ^ 0x5) << 4 ^ 0x1) >= 0)
    {
      int tmp48_47 = j;
      j--;
      ?[tmp48_47] = ((char)(a.charAt(tmp48_47) ^ i));
      int tmp69_66 = (j--);
      ?[tmp69_66] = ((char)(a.charAt(tmp69_66) ^ k));
    }
    return new String(?);
  }
}


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\TimeUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */