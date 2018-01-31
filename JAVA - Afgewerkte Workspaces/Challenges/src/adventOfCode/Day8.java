package adventOfCode;

public class Day8 {

	public static void main(String[] args) {
		String input = "d dec 683 if qn == 0\r\n" + "d dec -220 if h == 0\r\n" + "rak dec -875 if rak > -9\r\n"
				+ "isy dec 250 if wf == 0\r\n" + "cie dec 20 if rak > 870\r\n" + "isy inc 93 if wf >= -5\r\n"
				+ "o dec 739 if bok < 8\r\n" + "rak inc -605 if mxg <= 9\r\n" + "rak inc 668 if rfw > -8\r\n"
				+ "rfw dec 214 if h > -7\r\n" + "j dec 649 if wf != 4\r\n" + "bok dec -712 if cie >= -22\r\n"
				+ "s dec 151 if rxb == 0\r\n" + "bok dec -656 if d <= -463\r\n" + "pf dec -435 if brr != -10\r\n"
				+ "pf dec 115 if rxb < 6\r\n" + "uxr dec -574 if brr == -3\r\n" + "h inc -34 if s == -151\r\n"
				+ "rxb inc -919 if rak == 938\r\n" + "s inc 627 if o <= -748\r\n" + "rxb dec -456 if rfw != -214\r\n"
				+ "rak dec -687 if x <= 8\r\n" + "d dec 292 if bok >= 1363\r\n" + "mxg inc 665 if o == -739\r\n"
				+ "brr dec 531 if bok == 1368\r\n" + "isy dec -890 if x != 7\r\n" + "o inc -649 if bok > 1361\r\n"
				+ "erb dec 656 if j != -648\r\n" + "vso inc -882 if wf <= -2\r\n" + "rxb inc 978 if brr >= -539\r\n"
				+ "pf dec -176 if wf <= 8\r\n" + "rxb dec -647 if hsn == 0\r\n" + "vso inc -2 if isy <= 725\r\n"
				+ "brr dec -661 if x != 4\r\n" + "uxr dec 913 if x <= 9\r\n" + "hsn inc -784 if rxb <= 706\r\n"
				+ "pf dec -795 if hsn <= -782\r\n" + "pf dec 421 if rfw >= -217\r\n" + "o inc -88 if s < -147\r\n"
				+ "rak inc 991 if hsn == -784\r\n" + "brr dec -27 if bok != 1372\r\n" + "uxr dec 705 if x >= -2\r\n"
				+ "tss inc 130 if h != -35\r\n" + "vso inc -800 if wf != 8\r\n" + "tss inc 301 if pf != 866\r\n"
				+ "ie inc -311 if cie == -20\r\n" + "mxg inc -20 if vso >= -808\r\n" + "cie dec -142 if bok == 1368\r\n"
				+ "rfw dec -141 if rxb != 706\r\n" + "isy dec -826 if j > -656\r\n" + "cie inc 252 if pf >= 870\r\n"
				+ "hsn dec 972 if bs < 2\r\n" + "hsn inc -576 if rfw >= -219\r\n" + "bok dec 439 if h >= -40\r\n"
				+ "cie dec 614 if h == -34\r\n" + "cie dec 890 if cie == -240\r\n" + "wf inc -251 if pf <= 875\r\n"
				+ "isy inc -507 if o == -1476\r\n" + "bok dec 619 if bok < 928\r\n" + "rxb inc 361 if rfw == -224\r\n"
				+ "rfw dec -654 if s < -141\r\n" + "mxg dec -488 if isy >= 1047\r\n" + "pf dec 721 if mxg >= 1135\r\n"
				+ "h inc -4 if rxb == 706\r\n" + "hsn dec -966 if rfw >= 431\r\n" + "isy dec -422 if h < -44\r\n"
				+ "rfw inc -379 if qn == 0\r\n" + "pf inc -78 if cie >= -1136\r\n" + "o inc 902 if isy > 1042\r\n"
				+ "erb dec -529 if brr <= 160\r\n" + "x dec 280 if o <= -572\r\n" + "isy dec -266 if d < -751\r\n"
				+ "j dec -260 if isy != 1313\r\n" + "rak dec 330 if qn != 9\r\n" + "tss inc -113 if ie <= -311\r\n"
				+ "isy dec -186 if erb > -135\r\n" + "o dec 839 if pf <= 800\r\n" + "x inc -906 if uxr > -1622\r\n"
				+ "hsn dec 353 if vso > -808\r\n" + "cie dec -734 if bs > -9\r\n" + "rak dec -690 if rfw == 61\r\n"
				+ "tss inc 355 if rfw == 54\r\n" + "isy dec 507 if erb != -127\r\n" + "uxr dec -901 if hsn >= -1726\r\n"
				+ "tss inc 787 if cie == -396\r\n" + "j inc -851 if d < -753\r\n" + "d dec -929 if pf < 790\r\n"
				+ "h inc -328 if mxg <= 1140\r\n" + "j dec -381 if erb != -122\r\n" + "o dec 810 if rxb <= 696\r\n"
				+ "brr dec 207 if x == -1186\r\n" + "rak dec -697 if erb < -135\r\n" + "ie dec 96 if vso <= -798\r\n"
				+ "vso inc 739 if rak < 2968\r\n" + "o inc 890 if mxg == 1133\r\n" + "wf dec 453 if pf <= 785\r\n"
				+ "rxb inc -950 if bok > 923\r\n" + "brr inc 160 if isy != 1504\r\n" + "isy inc 767 if rak < 2967\r\n"
				+ "bok dec 297 if bs != 2\r\n" + "qn dec -686 if erb == -127\r\n" + "uxr dec -835 if h >= -370\r\n"
				+ "rxb dec -315 if pf < 799\r\n" + "h inc -97 if j != -864\r\n" + "bs inc -380 if erb < -117\r\n"
				+ "rfw dec -444 if tss <= 1108\r\n" + "brr inc 951 if wf <= -251\r\n" + "erb dec -665 if h != -465\r\n"
				+ "qn inc -350 if isy != 1504\r\n" + "h inc 603 if bs < -373\r\n" + "vso inc -545 if uxr != 111\r\n"
				+ "o inc 110 if brr > 894\r\n" + "s dec -924 if rfw <= 509\r\n" + "hsn dec -114 if rfw != 507\r\n"
				+ "tss dec -441 if erb != 529\r\n" + "d inc -791 if bok > 630\r\n" + "rxb dec 576 if pf >= 800\r\n"
				+ "x dec 797 if j >= -859\r\n" + "cie inc 828 if rfw <= 507\r\n" + "s inc 945 if mxg != 1127\r\n"
				+ "mxg inc 122 if qn <= 685\r\n" + "rak inc 778 if pf <= 786\r\n" + "tss inc -795 if pf < 794\r\n"
				+ "vso dec -412 if d >= -1553\r\n" + "vso inc 371 if bs != -385\r\n" + "wf inc 443 if uxr != 109\r\n"
				+ "wf dec 366 if rak == 2976\r\n" + "tss inc 608 if vso >= -571\r\n" + "x inc 316 if qn != 694\r\n"
				+ "o inc -570 if mxg > 1136\r\n" + "qn inc 346 if bok < 636\r\n" + "erb dec 947 if erb != 529\r\n"
				+ "uxr dec -673 if h != 147\r\n" + "pf inc -252 if d == -1546\r\n" + "ie dec -157 if o < -406\r\n"
				+ "vso inc -46 if rfw > 499\r\n" + "qn dec -915 if vso <= -617\r\n" + "bok dec 288 if rak < 2983\r\n"
				+ "o inc -842 if uxr == 783\r\n" + "rfw dec 867 if mxg > 1136\r\n" + "s dec -639 if uxr == 791\r\n"
				+ "uxr dec 825 if erb < -406\r\n" + "rxb inc 414 if j >= -866\r\n" + "d dec 695 if vso > -612\r\n"
				+ "mxg dec 119 if uxr == -34\r\n" + "tss inc -168 if bs > -379\r\n" + "tss inc 379 if mxg <= 1017\r\n"
				+ "mxg dec 629 if ie != -250\r\n" + "rak inc 803 if d != -2245\r\n" + "pf dec -393 if rxb > 488\r\n"
				+ "ie dec 574 if tss <= 1740\r\n" + "bok dec 498 if brr <= 907\r\n" + "rxb inc -999 if x < -1663\r\n"
				+ "h inc -716 if s != 2359\r\n" + "vso inc -635 if cie > 430\r\n" + "tss inc 712 if mxg > 1009\r\n"
				+ "x dec 303 if mxg == 1016\r\n" + "x dec -426 if rfw <= 510\r\n" + "rxb dec -99 if wf <= -174\r\n"
				+ "ie dec 955 if x == -1241\r\n" + "ie inc -6 if qn < 1036\r\n" + "o inc 231 if pf != 541\r\n"
				+ "d inc -967 if bok < -147\r\n" + "bs dec -86 if qn <= 1037\r\n" + "rak dec 255 if x != -1240\r\n"
				+ "rfw dec 143 if d >= -3204\r\n" + "qn dec 175 if hsn > -1614\r\n" + "j inc -550 if isy == 1504\r\n"
				+ "cie dec -553 if d != -3209\r\n" + "wf dec 353 if hsn == -1605\r\n" + "vso dec -563 if d <= -3205\r\n"
				+ "o inc 593 if wf == -535\r\n" + "vso dec -519 if vso != -677\r\n" + "rfw inc 122 if s >= 2357\r\n"
				+ "wf inc -889 if vso <= -166\r\n" + "ie dec -73 if rak >= 3531\r\n" + "pf dec 79 if d <= -3201\r\n"
				+ "hsn dec 164 if cie > 982\r\n" + "rak dec 237 if rxb != -419\r\n" + "qn dec -585 if tss > 2442\r\n"
				+ "rfw dec -186 if rfw >= 623\r\n" + "uxr dec 520 if rfw < 822\r\n" + "x dec 447 if x > -1251\r\n"
				+ "vso inc -796 if pf < 464\r\n" + "tss dec 34 if rxb == -415\r\n" + "x inc 603 if cie != 994\r\n"
				+ "uxr dec -234 if h <= -577\r\n" + "rak inc 381 if h < -571\r\n" + "j inc 692 if pf >= 455\r\n"
				+ "pf inc -279 if pf != 461\r\n" + "bs inc -401 if h == -576\r\n" + "o inc -629 if mxg != 1018\r\n"
				+ "hsn dec -619 if x < -1086\r\n" + "bok dec -91 if qn >= 1433\r\n" + "bs dec 660 if isy < 1495\r\n"
				+ "x dec -908 if vso != -960\r\n" + "rak inc -16 if x >= -185\r\n" + "mxg dec -367 if mxg == 1010\r\n"
				+ "bs inc 487 if o > -802\r\n" + "mxg inc -608 if o == -811\r\n" + "brr inc -730 if d < -3198\r\n"
				+ "mxg dec -872 if qn != 1438\r\n" + "bs inc 467 if cie >= 983\r\n" + "isy inc 504 if cie < 981\r\n"
				+ "rxb inc 356 if isy >= 1501\r\n" + "pf inc 427 if mxg < 1279\r\n" + "brr inc 967 if isy < 1510\r\n"
				+ "rxb dec 561 if j > -720\r\n" + "hsn dec -175 if d != -3218\r\n" + "wf dec 700 if hsn >= -1602\r\n"
				+ "h inc 637 if brr >= 1137\r\n" + "uxr inc 964 if wf >= -1232\r\n" + "rxb inc -739 if uxr > 401\r\n"
				+ "erb dec -494 if qn == 1450\r\n" + "rxb inc -226 if qn != 1436\r\n" + "brr inc 131 if bs <= -220\r\n"
				+ "rak inc -899 if mxg == 1274\r\n" + "tss dec -737 if bs != -238\r\n" + "j dec 700 if wf == -1220\r\n"
				+ "j dec -823 if rak > 3654\r\n" + "j inc 466 if d > -3211\r\n" + "ie dec -521 if o == -811\r\n"
				+ "d inc -898 if qn > 1440\r\n" + "isy dec 197 if rfw <= 815\r\n" + "erb dec -911 if vso > -952\r\n"
				+ "j inc -835 if cie >= 983\r\n" + "erb dec -315 if uxr != 416\r\n" + "brr inc -673 if erb <= -99\r\n"
				+ "erb inc -72 if vso <= -949\r\n" + "vso inc 165 if mxg <= 1285\r\n" + "qn dec -870 if vso >= -799\r\n"
				+ "pf dec -574 if j == -1086\r\n" + "pf inc -858 if erb > -173\r\n" + "erb inc -243 if cie >= 985\r\n"
				+ "rxb inc -927 if x == -177\r\n" + "rxb inc -260 if vso < -792\r\n" + "tss inc 62 if rak > 3647\r\n"
				+ "tss dec -675 if vso <= -792\r\n" + "qn inc 807 if rfw <= 810\r\n" + "bok inc -360 if d > -4101\r\n"
				+ "s dec 56 if brr != 1260\r\n" + "wf inc 855 if j == -1096\r\n" + "j inc 698 if s <= 2304\r\n"
				+ "isy dec -459 if hsn <= -1591\r\n" + "s dec -577 if bok > -71\r\n" + "wf dec -469 if j != -397\r\n"
				+ "pf dec 127 if tss != 3897\r\n" + "o inc 442 if rak >= 3651\r\n" + "d dec 941 if j <= -383\r\n"
				+ "brr dec 809 if rak <= 3652\r\n" + "o inc 161 if rfw != 820\r\n" + "h dec 284 if uxr <= 418\r\n"
				+ "j inc -805 if pf < 475\r\n" + "uxr inc 731 if uxr > 409\r\n" + "isy dec -589 if isy <= 1772\r\n"
				+ "s inc 358 if h <= -221\r\n" + "wf inc 680 if rxb == -2519\r\n" + "brr dec 919 if ie != -1270\r\n"
				+ "tss dec -77 if h > -226\r\n" + "qn dec 953 if hsn == -1594\r\n" + "s inc -553 if rfw == 813\r\n"
				+ "isy dec 389 if qn < 1367\r\n" + "qn dec 676 if vso != -782\r\n" + "mxg dec 328 if uxr > 1135\r\n"
				+ "wf dec 788 if hsn < -1599\r\n" + "uxr inc -361 if brr == -459\r\n"
				+ "isy dec -775 if rxb > -2504\r\n" + "uxr inc 680 if vso < -788\r\n" + "tss dec 368 if tss <= 3967\r\n"
				+ "pf inc -494 if qn <= 681\r\n" + "tss inc 84 if bok == -63\r\n" + "rfw dec -146 if rfw >= 804\r\n"
				+ "erb dec -175 if pf >= 484\r\n" + "pf dec -655 if hsn <= -1590\r\n" + "j dec 273 if pf != 1133\r\n"
				+ "rak inc -305 if wf > -764\r\n" + "o inc -234 if rxb != -2503\r\n" + "rfw dec -499 if uxr < 1470\r\n"
				+ "bs inc -102 if qn < 687\r\n" + "j dec 698 if o > -435\r\n" + "cie inc -460 if cie > 977\r\n"
				+ "wf inc 134 if rfw <= 1463\r\n" + "uxr dec -390 if h == -223\r\n" + "uxr dec -834 if bok >= -64\r\n"
				+ "ie inc 538 if s == 2688\r\n" + "cie inc 504 if o > -445\r\n" + "bok inc 102 if ie < -1255\r\n"
				+ "pf dec -65 if erb != -408\r\n" + "vso dec -317 if vso >= -791\r\n" + "x dec -139 if brr >= -459\r\n"
				+ "s inc 772 if bok < 34\r\n" + "bs dec 736 if j <= -664\r\n" + "j dec -352 if vso != -794\r\n"
				+ "s dec -656 if cie == 1029\r\n" + "rfw inc -919 if x <= -44\r\n" + "o inc 101 if vso < -793\r\n"
				+ "bok dec 37 if bok == 39\r\n" + "hsn dec 413 if erb > -414\r\n" + "d inc 686 if rak != 3337\r\n"
				+ "d dec -164 if j < -300\r\n" + "brr dec 968 if bok >= 1\r\n" + "rxb dec 177 if cie != 1029\r\n"
				+ "j inc 200 if o >= -448\r\n" + "brr inc -665 if vso <= -792\r\n" + "vso inc 581 if rak != 3345\r\n"
				+ "vso inc 491 if wf != -621\r\n" + "rxb inc 611 if rxb >= -2513\r\n" + "bok inc -77 if x != -39\r\n"
				+ "cie dec 354 if qn <= 691\r\n" + "ie dec -328 if uxr != 2693\r\n" + "qn inc 629 if cie <= 679\r\n"
				+ "mxg dec -941 if x > -46\r\n" + "tss inc -153 if x >= -46\r\n" + "o inc -459 if h == -222\r\n"
				+ "ie inc -744 if s >= 3333\r\n" + "tss inc 62 if brr != -2086\r\n" + "tss inc -27 if bs == -330\r\n"
				+ "vso dec -435 if rak != 3341\r\n" + "isy dec -751 if x != -38\r\n" + "hsn inc 700 if mxg != 1898\r\n"
				+ "hsn inc -383 if wf == -624\r\n" + "rfw dec -697 if rfw >= 1458\r\n"
				+ "brr inc -446 if ie > -1682\r\n" + "d dec 43 if rfw < 2152\r\n" + "pf dec -798 if rxb == -1909\r\n"
				+ "vso inc -517 if x != -38\r\n" + "rxb dec -595 if rxb < -1892\r\n" + "s dec -820 if mxg <= 1884\r\n"
				+ "o dec -502 if uxr >= 2686\r\n" + "wf inc -541 if rak < 3340\r\n" + "d inc 285 if tss != 3572\r\n"
				+ "vso dec -901 if brr != -2543\r\n" + "uxr dec 402 if rxb != -1306\r\n"
				+ "erb dec -927 if erb > -416\r\n" + "tss dec -62 if rxb != -1312\r\n" + "o inc -194 if qn >= 1319\r\n"
				+ "hsn inc 734 if isy <= 1972\r\n" + "tss dec 553 if qn > 1308\r\n" + "d inc -33 if vso == 1616\r\n"
				+ "bok dec 775 if tss <= 3080\r\n" + "hsn dec 119 if cie >= 669\r\n" + "x inc -50 if j <= -106\r\n"
				+ "erb dec -422 if qn >= 1309\r\n" + "bs dec -573 if rxb <= -1303\r\n"
				+ "uxr dec 431 if uxr <= 2692\r\n" + "rxb inc 174 if uxr <= 2255\r\n" + "tss inc -613 if wf >= -627\r\n"
				+ "brr inc 166 if d != -3936\r\n" + "rak inc -947 if brr <= -2365\r\n" + "bs dec -504 if qn == 1312\r\n"
				+ "cie inc 259 if wf > -630\r\n" + "hsn inc -290 if hsn == -1075\r\n"
				+ "isy dec -778 if mxg <= 1899\r\n" + "rxb inc -146 if x >= -90\r\n" + "bs inc -812 if cie > 929\r\n"
				+ "cie dec -71 if d <= -3943\r\n" + "vso dec 235 if d >= -3935\r\n" + "qn inc 192 if rak >= 2391\r\n"
				+ "rfw inc 403 if erb == 940\r\n" + "rak inc -881 if rxb >= -1285\r\n" + "x dec 30 if rak > 1510\r\n"
				+ "s inc 541 if rxb < -1268\r\n" + "hsn inc -622 if tss != 2453\r\n" + "rak inc -778 if erb <= 946\r\n"
				+ "hsn dec 300 if wf <= -628\r\n" + "hsn inc -72 if ie != -1688\r\n" + "erb inc -145 if erb > 936\r\n"
				+ "x inc -99 if o < -440\r\n" + "vso inc 866 if bok > -842\r\n" + "vso dec -308 if uxr <= 2256\r\n"
				+ "rfw dec 487 if uxr != 2260\r\n" + "rfw dec -21 if mxg > 1881\r\n" + "h inc 866 if rxb <= -1273\r\n"
				+ "erb dec 234 if d >= -3951\r\n" + "erb dec -658 if qn == 1504\r\n" + "o dec 771 if rfw == 2092\r\n"
				+ "h inc -843 if brr < -2377\r\n" + "ie inc -528 if bok >= -851\r\n" + "qn dec 187 if rfw == 2086\r\n"
				+ "isy inc -308 if d <= -3946\r\n" + "rfw inc -163 if vso < 1930\r\n" + "isy inc 815 if h == 643\r\n"
				+ "mxg dec 606 if h < 642\r\n" + "mxg dec 165 if vso > 1923\r\n" + "rfw dec -530 if uxr <= 2253\r\n"
				+ "ie inc 129 if mxg == 1726\r\n" + "uxr dec -505 if h != 638\r\n" + "bok inc -535 if bok >= -851\r\n"
				+ "o dec 941 if j != -104\r\n" + "rak dec -133 if rfw >= 2460\r\n" + "bs inc -461 if mxg >= 1727\r\n"
				+ "j dec -938 if brr != -2368\r\n" + "erb inc 737 if x >= -207\r\n" + "tss dec -280 if hsn < -2051\r\n"
				+ "s dec 651 if bs == -65\r\n" + "rak inc -979 if vso < 1934\r\n" + "pf dec -487 if hsn != -2060\r\n"
				+ "qn inc 384 if j != 830\r\n" + "j inc -389 if o < -2147\r\n" + "hsn dec 14 if s > 3224\r\n"
				+ "rxb dec -710 if uxr <= 2766\r\n" + "hsn inc 278 if s != 3229\r\n" + "tss inc 376 if brr < -2370\r\n"
				+ "d inc 306 if j != 435\r\n" + "wf inc -561 if tss > 3122\r\n" + "h dec -154 if bs >= -65\r\n"
				+ "x inc 396 if hsn != -2073\r\n" + "mxg dec -806 if cie < 1013\r\n" + "hsn dec 941 if hsn <= -2078\r\n"
				+ "erb inc 18 if pf > 1677\r\n" + "x inc 63 if rak > -244\r\n" + "rfw inc 883 if tss == 3124\r\n"
				+ "s inc -615 if erb < 1241\r\n" + "s inc -696 if vso < 1933\r\n" + "qn dec 120 if pf <= 1678\r\n"
				+ "rxb dec -680 if rxb <= -563\r\n" + "wf inc -880 if ie > -2087\r\n" + "tss dec 422 if d <= -3641\r\n"
				+ "d dec 270 if cie > 1004\r\n" + "h dec 993 if tss > 3114\r\n" + "isy dec 490 if o != -2144\r\n"
				+ "bok dec -649 if h > -200\r\n" + "bs dec -505 if o != -2164\r\n" + "hsn inc -863 if rfw == 2459\r\n"
				+ "bok inc -307 if bs <= 442\r\n" + "x dec 961 if rxb > 104\r\n" + "pf inc -606 if brr >= -2376\r\n"
				+ "mxg dec 409 if qn >= 1880\r\n" + "rxb inc -962 if ie == -2079\r\n" + "bs dec 847 if hsn >= -2944\r\n"
				+ "hsn inc 543 if erb == 1237\r\n" + "d dec -752 if ie != -2086\r\n" + "h inc 90 if rak != -228\r\n"
				+ "j dec 620 if cie < 1003\r\n" + "o inc 827 if o != -2156\r\n" + "erb inc -601 if bs >= -408\r\n"
				+ "mxg inc -616 if o >= -1335\r\n" + "h dec -583 if rfw < 2468\r\n" + "rfw inc -727 if erb <= 643\r\n"
				+ "s dec 178 if rak < -237\r\n" + "rfw inc -781 if x >= -1122\r\n" + "hsn inc 503 if brr < -2365\r\n"
				+ "h dec 738 if hsn != -1888\r\n" + "vso inc 10 if rfw != 961\r\n" + "tss dec 455 if j != 430\r\n"
				+ "pf dec -654 if bok >= -1047\r\n" + "mxg dec -953 if hsn == -1890\r\n"
				+ "rfw inc -859 if cie <= 1008\r\n" + "rxb inc -957 if x >= -1112\r\n"
				+ "erb inc 775 if isy >= 3061\r\n" + "rfw inc -574 if rxb == -850\r\n" + "erb inc 304 if s <= 1746\r\n"
				+ "bok dec 703 if bs <= -413\r\n" + "d dec 788 if bs <= -404\r\n" + "uxr inc -714 if bok > -1035\r\n"
				+ "bs dec -244 if h <= -264\r\n" + "h dec -530 if vso == 1934\r\n" + "s inc -792 if bs != -407\r\n"
				+ "j inc 384 if rfw >= -484\r\n" + "rfw dec -694 if cie <= 1013\r\n" + "hsn inc -53 if uxr != 2762\r\n"
				+ "rxb dec 83 if j != 834\r\n" + "rxb inc 849 if o >= -1329\r\n" + "o dec -244 if j < 816\r\n"
				+ "x inc 812 if rxb <= -78\r\n" + "pf dec -950 if brr == -2372\r\n" + "x inc -169 if hsn == -1943\r\n"
				+ "mxg inc -673 if vso != 1929\r\n" + "tss dec -932 if pf == 2682\r\n" + "o dec 976 if pf <= 2685\r\n"
				+ "mxg inc -90 if mxg >= 1783\r\n" + "pf inc -466 if pf <= 2690\r\n" + "rxb dec -592 if uxr < 2760\r\n"
				+ "s dec 904 if pf <= 2216\r\n" + "o inc -958 if qn != 1888\r\n" + "d inc 317 if ie != -2077\r\n"
				+ "d inc 732 if wf > -1511\r\n" + "tss dec -200 if tss <= 3584\r\n" + "mxg inc -894 if mxg >= 1692\r\n"
				+ "uxr dec -883 if rak > -248\r\n" + "d dec 576 if x >= -481\r\n" + "mxg inc -418 if d <= -3478\r\n"
				+ "rxb dec -435 if tss == 3594\r\n" + "rxb dec -200 if uxr != 3646\r\n" + "j dec 70 if d != -3473\r\n"
				+ "cie inc 524 if d > -3469\r\n" + "tss dec 988 if rak <= -233\r\n" + "bok inc 567 if pf < 2226\r\n"
				+ "tss inc -486 if isy > 3064\r\n" + "erb inc -952 if brr < -2380\r\n" + "uxr inc 723 if rfw <= 214\r\n"
				+ "x dec -510 if ie != -2078\r\n" + "d inc 395 if rfw <= 212\r\n" + "erb inc 592 if isy > 3075\r\n"
				+ "ie inc -61 if d >= -3080\r\n" + "rak inc 400 if qn >= 1898\r\n" + "erb dec 449 if cie > 997\r\n"
				+ "ie inc -918 if pf > 2215\r\n" + "s dec -711 if rfw <= 220\r\n" + "rxb dec 519 if wf != -1504\r\n"
				+ "ie dec -59 if rxb < 1145\r\n" + "erb dec 425 if tss == 2120\r\n" + "cie inc -306 if isy <= 3069\r\n"
				+ "x dec 635 if o >= -2296\r\n" + "wf dec 815 if tss == 2120\r\n" + "d dec -366 if pf >= 2210\r\n"
				+ "cie inc -787 if o < -2302\r\n" + "erb dec -305 if brr != -2374\r\n" + "rfw dec -915 if pf > 2216\r\n"
				+ "bs inc -516 if hsn >= -1947\r\n" + "rxb inc 845 if tss != 2120\r\n"
				+ "erb dec -201 if qn == 1888\r\n" + "h inc 297 if tss < 2129\r\n" + "h dec -860 if s > 1541\r\n"
				+ "isy dec -59 if hsn > -1949\r\n" + "mxg inc -266 if wf > -2316\r\n" + "vso dec -578 if d != -2703\r\n"
				+ "qn dec 420 if o <= -2299\r\n" + "ie dec 307 if wf == -2319\r\n" + "pf dec -948 if bs >= -929\r\n"
				+ "j dec 927 if h == 1416\r\n" + "vso dec 879 if d > -2717\r\n" + "j dec -543 if uxr != 4374\r\n"
				+ "d dec -20 if o != -2308\r\n" + "brr inc 606 if erb > 1340\r\n" + "hsn dec 547 if rak != -244\r\n"
				+ "cie dec -865 if uxr < 4366\r\n" + "bs inc -408 if o <= -2294\r\n" + "wf inc 938 if rfw < 207\r\n"
				+ "pf inc 633 if j != 1289\r\n" + "rak dec -871 if d <= -2687\r\n" + "hsn inc 311 if tss < 2125\r\n"
				+ "wf dec -231 if qn <= 1477\r\n" + "mxg dec 617 if rxb < 1137\r\n" + "hsn inc 20 if ie > -3315\r\n"
				+ "uxr inc -810 if hsn < -2154\r\n" + "d dec -738 if mxg > 798\r\n" + "o inc 513 if d < -1960\r\n"
				+ "s dec 953 if mxg <= 812\r\n" + "s inc 664 if cie < 775\r\n" + "h dec 18 if bok >= -480\r\n"
				+ "erb dec 43 if rak > 631\r\n" + "vso inc 662 if rak > 632\r\n" + "mxg inc -938 if wf >= -2083\r\n"
				+ "brr inc -359 if rxb > 1136\r\n" + "s dec -402 if rxb < 1144\r\n" + "h dec 59 if x < 48\r\n"
				+ "mxg inc 842 if bs == -1331\r\n" + "ie inc -748 if vso >= 2298\r\n" + "mxg inc -176 if erb > 1301\r\n"
				+ "s inc -345 if bs == -1335\r\n" + "cie inc 52 if brr < -2125\r\n" + "j inc -243 if wf > -2095\r\n"
				+ "d dec 992 if qn != 1468\r\n" + "h inc 302 if tss == 2120\r\n" + "rfw dec 431 if hsn >= -2168\r\n"
				+ "hsn inc -930 if wf > -2098\r\n" + "x dec -477 if cie != 767\r\n" + "erb dec 922 if pf <= 3797\r\n"
				+ "j dec 838 if cie <= 782\r\n" + "mxg inc -96 if bs < -1324\r\n" + "cie dec 707 if hsn > -3099\r\n"
				+ "mxg inc 258 if h < 1655\r\n" + "hsn dec -441 if qn >= 1461\r\n" + "j dec 518 if tss >= 2115\r\n"
				+ "tss dec -760 if ie == -3306\r\n" + "ie dec 21 if d != -1948\r\n" + "j dec -990 if s > 997\r\n"
				+ "bs inc -889 if bok >= -482\r\n" + "s dec 732 if hsn == -2646\r\n" + "pf dec -401 if hsn <= -2639\r\n"
				+ "rak inc 211 if isy != 3128\r\n" + "brr inc -868 if uxr == 3554\r\n"
				+ "vso dec 811 if uxr <= 3563\r\n" + "pf dec 232 if rxb >= 1137\r\n" + "bok inc -193 if vso < 1490\r\n"
				+ "d dec 817 if qn == 1468\r\n" + "rak inc 282 if bs < -2216\r\n" + "o inc 74 if pf < 3972\r\n"
				+ "isy dec -602 if rxb <= 1148\r\n" + "pf inc -6 if cie <= 69\r\n" + "uxr inc 835 if rfw >= -228\r\n"
				+ "tss inc 790 if bok <= -661\r\n" + "rak dec -719 if bok <= -662\r\n" + "cie inc 978 if j > -298\r\n"
				+ "d dec 475 if brr > -2994\r\n" + "rxb dec -348 if pf >= 3976\r\n" + "o dec 62 if j < -301\r\n"
				+ "brr dec 486 if bok > -675\r\n" + "isy dec -256 if hsn == -2648\r\n"
				+ "rxb dec -536 if tss < 3671\r\n" + "ie dec 91 if vso < 1490\r\n" + "h inc 53 if h >= 1644\r\n"
				+ "qn inc 621 if d > -3247\r\n" + "hsn dec -433 if x <= 523\r\n" + "x dec 703 if tss >= 3673\r\n"
				+ "x inc -557 if isy >= 3978\r\n" + "bs inc -180 if h < 1709\r\n" + "pf inc -25 if hsn <= -2207\r\n"
				+ "bs dec 761 if o > -2294\r\n" + "uxr dec 989 if brr > -3482\r\n" + "erb dec 385 if h > 1703\r\n"
				+ "hsn dec 339 if bok < -664\r\n" + "isy inc -176 if s > 989\r\n" + "hsn inc 405 if isy == 3810\r\n"
				+ "pf dec -849 if uxr < 3402\r\n" + "bok inc 274 if rak > 1631\r\n" + "j inc 433 if tss >= 3668\r\n"
				+ "ie dec 385 if o <= -2290\r\n" + "rak inc 529 if tss >= 3670\r\n" + "isy dec -467 if o < -2285\r\n"
				+ "erb inc 765 if erb >= 7\r\n" + "vso dec -935 if wf >= -2084\r\n" + "tss inc 21 if brr != -3487\r\n"
				+ "s dec 631 if erb > 5\r\n" + "hsn inc 709 if h < 1709\r\n" + "isy inc 754 if tss != 3691\r\n"
				+ "rak dec -730 if rfw <= -216\r\n" + "erb inc 33 if bs <= -3156\r\n" + "hsn inc 972 if rxb <= 1681\r\n"
				+ "d inc 902 if mxg <= 1634\r\n" + "cie inc -544 if d == -2343\r\n" + "wf dec -706 if bs <= -3160\r\n"
				+ "j dec 564 if isy < 4282\r\n" + "ie inc -832 if o > -2298\r\n" + "rfw inc 737 if pf >= 4795\r\n"
				+ "o inc 558 if o <= -2285\r\n" + "erb dec 749 if bs > -3163\r\n" + "pf dec -93 if h > 1700\r\n"
				+ "o dec 85 if isy > 4271\r\n" + "brr inc -713 if x <= -45\r\n" + "x dec 659 if d < -2344\r\n"
				+ "tss dec -316 if mxg < 1638\r\n" + "pf inc -542 if bok < -388\r\n" + "tss dec 572 if h <= 1708\r\n"
				+ "s inc -19 if cie != -464\r\n" + "j dec -262 if hsn <= -463\r\n" + "rfw dec -775 if rxb > 1677\r\n"
				+ "s inc 564 if ie > -4639\r\n" + "o inc -484 if brr == -3479\r\n" + "uxr dec -651 if hsn <= -463\r\n"
				+ "wf dec 866 if qn == 2094\r\n" + "ie inc 635 if pf < 4339\r\n" + "cie inc 248 if pf == 4341\r\n"
				+ "rxb dec 233 if o > -2299\r\n" + "bok inc 914 if cie != -232\r\n" + "hsn dec -748 if x == -47\r\n"
				+ "cie dec 322 if uxr <= 4046\r\n" + "mxg inc 79 if brr <= -3477\r\n" + "tss dec 939 if x == -42\r\n"
				+ "pf dec 773 if s < 1551\r\n" + "bok inc -145 if mxg >= 1712\r\n" + "uxr inc -237 if tss > 2494\r\n"
				+ "d dec 187 if mxg >= 1705\r\n" + "ie inc -280 if o > -2305\r\n" + "rak inc -757 if isy > 4273\r\n"
				+ "s dec -922 if isy != 4278\r\n" + "pf dec 868 if qn <= 2089\r\n" + "pf dec 838 if j >= -174\r\n"
				+ "ie inc 293 if rfw > 554\r\n" + "bok dec -846 if o >= -2303\r\n" + "o dec -869 if qn == 2089\r\n"
				+ "rak inc 960 if cie <= -224\r\n" + "vso dec -192 if o != -1443\r\n" + "o dec -477 if rxb != 1675\r\n"
				+ "bs dec 256 if uxr > 3813\r\n" + "brr dec 224 if bok > 1360\r\n" + "qn dec -294 if erb <= -726\r\n"
				+ "h dec 790 if ie >= -4628\r\n" + "erb inc -964 if rak != 3104\r\n" + "rfw dec 417 if s >= 2462\r\n"
				+ "wf inc -396 if pf == 1862\r\n" + "wf dec 765 if s > 2457\r\n" + "bs inc -213 if mxg < 1711\r\n"
				+ "rfw dec 18 if o > -963\r\n" + "isy dec 99 if uxr != 3808\r\n" + "uxr dec -548 if mxg > 1707\r\n"
				+ "hsn dec 404 if brr == -3703\r\n" + "cie dec -420 if x <= -49\r\n" + "erb dec -623 if rxb < 1682\r\n"
				+ "h dec 519 if rxb > 1682\r\n" + "o dec -58 if rak < 3106\r\n" + "vso inc 459 if rxb == 1679\r\n"
				+ "hsn dec 843 if rfw < 126\r\n" + "mxg inc 820 if pf < 1864\r\n" + "hsn inc 60 if ie >= -4629\r\n"
				+ "brr dec 25 if rxb == 1679\r\n" + "uxr dec 148 if wf > -2545\r\n" + "s dec 416 if o == -897\r\n"
				+ "hsn inc -427 if ie != -4625\r\n" + "s inc -925 if erb >= -1066\r\n"
				+ "tss dec -413 if d != -2530\r\n" + "j dec 346 if tss <= 2500\r\n" + "uxr inc -160 if wf != -2542\r\n"
				+ "wf inc -718 if bs == -3630\r\n" + "j inc -518 if brr != -3728\r\n"
				+ "hsn dec -489 if bok <= 1372\r\n" + "bok dec -28 if tss == 2496\r\n" + "bok dec -106 if x != -34\r\n"
				+ "d dec 905 if erb == -1060\r\n" + "bok dec -303 if s <= 1529\r\n" + "vso inc 650 if uxr > 4053\r\n"
				+ "cie inc -209 if ie < -4627\r\n" + "erb dec 272 if d <= -3435\r\n" + "h dec 100 if wf != -3253\r\n"
				+ "ie inc -783 if d != -3425\r\n" + "wf dec -712 if vso == 2785\r\n" + "pf dec 133 if ie > -5403\r\n"
				+ "brr dec 218 if bs < -3625\r\n" + "qn dec -420 if rfw < 127\r\n" + "bok dec -633 if s < 1546\r\n"
				+ "cie inc -932 if ie > -5412\r\n" + "wf dec 515 if pf > 1857\r\n" + "mxg inc 454 if ie <= -5411\r\n"
				+ "x inc -77 if hsn == -1593\r\n" + "o inc 746 if brr <= -3950\r\n" + "x dec 872 if erb >= -1332\r\n"
				+ "vso inc 268 if h != 815\r\n" + "h dec -436 if bs != -3624\r\n" + "erb dec -543 if bok < 2141\r\n"
				+ "ie dec -375 if tss == 2496\r\n" + "x dec -176 if rxb > 1672\r\n" + "pf dec 926 if rfw <= 124\r\n"
				+ "bs inc -134 if pf <= 938\r\n" + "isy dec 664 if rxb != 1684\r\n" + "s inc 584 if isy >= 3523\r\n"
				+ "vso dec 913 if rak >= 3098\r\n" + "bs inc 745 if wf == -3064\r\n" + "rfw inc 309 if qn == 2515\r\n"
				+ "uxr dec -496 if isy <= 3515\r\n" + "hsn dec -633 if isy <= 3514\r\n" + "brr dec 502 if j <= -521\r\n"
				+ "brr inc -521 if j != -519\r\n" + "tss dec 302 if o != -891\r\n" + "hsn inc 340 if ie != -5030\r\n"
				+ "cie dec 959 if j > -522\r\n" + "wf inc 417 if erb <= -781\r\n" + "isy dec -376 if d <= -3444\r\n"
				+ "h inc -131 if cie != -2112\r\n" + "bs inc -510 if vso < 3055\r\n" + "x inc -780 if rxb > 1676\r\n"
				+ "ie dec 702 if tss >= 2187\r\n" + "rfw inc 590 if h <= 1124\r\n" + "wf dec -967 if hsn > -969\r\n"
				+ "vso dec -104 if s > 1536\r\n" + "hsn inc 197 if brr <= -4468\r\n" + "qn dec -309 if ie == -5730\r\n"
				+ "x inc 694 if brr > -4472\r\n" + "isy dec -704 if vso > 3164\r\n" + "j inc -127 if x >= -904\r\n"
				+ "pf inc -579 if uxr != 4550\r\n" + "bok inc -666 if rak > 3092\r\n"
				+ "vso dec -926 if hsn <= -969\r\n" + "brr dec 71 if brr > -4467\r\n" + "s dec 10 if o > -904\r\n"
				+ "j inc -338 if x == -901\r\n" + "cie dec -630 if x >= -910\r\n" + "cie dec -716 if ie < -5737\r\n"
				+ "wf inc 613 if wf <= -1678\r\n" + "s dec -409 if bs <= -3539\r\n" + "rfw inc -505 if d < -3432\r\n"
				+ "bok inc 912 if bs == -3529\r\n" + "isy inc -992 if mxg > 2525\r\n" + "bok dec 100 if tss <= 2196\r\n"
				+ "s inc 712 if s > 1520\r\n" + "cie dec -381 if brr != -4465\r\n" + "brr dec 793 if cie > -1099\r\n"
				+ "bok dec -387 if bok < 2283\r\n" + "s dec 812 if mxg > 2520\r\n" + "hsn dec 422 if isy >= 2519\r\n"
				+ "brr dec -597 if wf <= -1063\r\n" + "tss inc -539 if h == 1119\r\n" + "d dec 159 if hsn == -1382\r\n"
				+ "h dec 474 if wf <= -1067\r\n" + "h dec -34 if vso < 3161\r\n" + "rxb inc 714 if pf != 936\r\n"
				+ "wf dec -564 if pf > 926\r\n" + "d inc 534 if erb >= -781\r\n" + "h inc 808 if j == -982\r\n"
				+ "brr inc 976 if qn == 2509\r\n" + "o dec 623 if rfw > 201\r\n" + "hsn dec -794 if h < 1492\r\n"
				+ "uxr inc 649 if mxg <= 2533\r\n" + "cie inc 156 if rak == 3096\r\n" + "j dec -392 if hsn == -588\r\n"
				+ "tss inc -161 if rfw != 213\r\n" + "rfw dec 864 if qn > 2512\r\n" + "d inc -499 if cie == -950\r\n"
				+ "rxb inc -849 if rfw > 203\r\n" + "x inc -478 if pf == 939\r\n" + "j inc -343 if uxr > 5194\r\n"
				+ "qn inc 504 if d < -4087\r\n" + "pf inc -430 if s > 1423\r\n" + "o inc -709 if x <= -911\r\n"
				+ "mxg inc 594 if rxb != 824\r\n" + "h dec -885 if h == 1487\r\n" + "brr inc -663 if bok <= 2657\r\n"
				+ "tss inc 504 if bs != -3532\r\n" + "brr inc -100 if s < 1432\r\n" + "bs inc 133 if rfw == 206\r\n"
				+ "hsn inc 535 if rfw >= 200\r\n" + "hsn inc -82 if h != 2372\r\n" + "mxg dec 254 if rak != 3090\r\n"
				+ "wf inc -401 if o <= -1513\r\n" + "d dec 577 if qn < 3019\r\n" + "qn inc 94 if bok > 2660\r\n"
				+ "pf dec -990 if ie <= -5732\r\n" + "bok dec 181 if cie < -945\r\n" + "qn dec 431 if bok <= 2489\r\n"
				+ "mxg inc 128 if qn >= 2673\r\n" + "d dec -233 if tss > 1996\r\n" + "rak dec 364 if ie != -5732\r\n"
				+ "tss inc 174 if o == -1521\r\n" + "tss dec -463 if isy != 2530\r\n"
				+ "rak inc -238 if bs >= -3403\r\n" + "brr dec 447 if j == -933\r\n" + "ie dec 853 if cie > -952\r\n"
				+ "bs dec 350 if bs < -3393\r\n" + "brr dec -996 if d <= -4434\r\n" + "cie dec -749 if tss < 2634\r\n"
				+ "mxg inc -484 if bok == 2484\r\n" + "vso dec -135 if x == -899\r\n" + "d inc -426 if rxb < 832\r\n"
				+ "h dec -40 if uxr != 5199\r\n" + "rak inc -480 if brr == -2445\r\n" + "h inc 818 if s == 1428\r\n"
				+ "hsn dec -708 if hsn < -51\r\n" + "rfw inc -155 if rxb != 838\r\n" + "pf inc -3 if o < -1511\r\n"
				+ "qn dec -144 if ie <= -6579\r\n" + "hsn dec 166 if s > 1418\r\n" + "rfw inc 216 if bok == 2484\r\n"
				+ "h inc 65 if isy <= 2523\r\n" + "uxr inc -405 if ie <= -6592\r\n" + "h inc -85 if wf <= -896\r\n"
				+ "rfw dec 104 if s == 1428\r\n" + "ie dec -144 if vso != 3157\r\n" + "ie dec -877 if rfw < 156\r\n"
				+ "uxr dec 836 if isy >= 2514\r\n" + "mxg inc -753 if uxr >= 4358\r\n" + "j inc -695 if x >= -901\r\n"
				+ "rak dec -399 if wf >= -910\r\n" + "d dec 289 if vso != 3157\r\n" + "hsn inc 482 if j == -1628\r\n"
				+ "rfw dec 10 if bs >= -3741\r\n" + "vso inc 803 if d != -4864\r\n" + "vso inc -335 if qn == 2820\r\n"
				+ "o dec 527 if rak != 2776\r\n" + "tss dec 799 if rfw > 170\r\n" + "j dec -763 if hsn > 967\r\n"
				+ "tss dec 259 if pf <= 1498\r\n" + "wf inc -260 if rxb <= 820\r\n" + "x inc -560 if hsn < 980\r\n"
				+ "j inc 126 if wf <= -898\r\n" + "uxr inc -665 if j != -736\r\n" + "vso inc -59 if h >= 3170\r\n"
				+ "j dec 88 if isy < 2528\r\n" + "brr inc 622 if uxr < 3692\r\n" + "wf dec -81 if isy >= 2521\r\n"
				+ "rfw inc 497 if tss > 2370\r\n" + "d inc 411 if erb <= -789\r\n" + "cie inc -375 if mxg == 1761\r\n"
				+ "bok inc -998 if hsn <= 972\r\n" + "pf inc 224 if mxg != 1757\r\n" + "x inc 551 if rxb <= 835\r\n"
				+ "qn inc -388 if brr != -2442\r\n" + "rfw inc -79 if rak < 2779\r\n" + "hsn dec 756 if j > -831\r\n"
				+ "wf dec -67 if ie > -6589\r\n" + "hsn dec -175 if tss < 2381\r\n" + "tss dec -861 if rak == 2777\r\n"
				+ "o dec -461 if rak >= 2772\r\n" + "rxb dec 916 if erb <= -795\r\n" + "pf dec 379 if erb == -789\r\n"
				+ "isy inc -155 if bok == 1486\r\n" + "erb dec 790 if o == -1587\r\n" + "brr inc 445 if tss < 3242\r\n"
				+ "rxb inc 884 if hsn > 394\r\n" + "tss dec 591 if x == -913\r\n" + "j dec 298 if cie == -1325\r\n"
				+ "ie dec -68 if mxg <= 1764\r\n" + "mxg dec 387 if vso < 3570\r\n" + "tss dec -86 if bs != -3748\r\n"
				+ "rxb inc 238 if hsn >= 390\r\n" + "rak inc -28 if bok == 1486\r\n" + "rak inc -640 if mxg == 1374\r\n"
				+ "qn dec -83 if tss >= 3314\r\n" + "tss dec -238 if bok != 1476\r\n" + "tss dec -101 if o != -1587\r\n"
				+ "hsn dec -537 if tss == 3561\r\n" + "wf inc -859 if brr == -2000\r\n"
				+ "tss inc -35 if uxr >= 3698\r\n" + "cie inc -970 if rak <= 2112\r\n" + "rfw inc 971 if h < 3172\r\n"
				+ "wf dec 887 if rfw < 1555\r\n" + "bok inc 20 if o <= -1592\r\n" + "mxg inc -326 if cie > -2298\r\n"
				+ "mxg inc -684 if j > -1116\r\n" + "brr inc 639 if qn >= 2510\r\n" + "rxb dec -332 if rxb < 1069\r\n"
				+ "uxr dec 189 if brr > -1369\r\n" + "rak dec -567 if rfw == 1552\r\n" + "cie dec 407 if uxr > 3505\r\n"
				+ "h dec -365 if o < -1585\r\n" + "cie dec -990 if s == 1428\r\n" + "rfw dec 368 if ie == -6517\r\n"
				+ "vso dec -76 if wf != -2502\r\n" + "erb inc 334 if bs >= -3747\r\n" + "o inc 583 if qn == 2515\r\n"
				+ "pf inc 7 if rxb > 1399\r\n" + "o inc 166 if qn >= 2512\r\n" + "wf inc 492 if x <= -905\r\n"
				+ "uxr inc -566 if d == -4452\r\n" + "bok inc -919 if isy >= 2364\r\n"
				+ "hsn inc 517 if rak != 2677\r\n" + "j dec -916 if d != -4454\r\n" + "bok dec 116 if rak > 2674\r\n"
				+ "vso dec -477 if x < -907\r\n" + "qn dec -964 if erb == -1245\r\n" + "j dec 987 if qn > 3478\r\n"
				+ "rak dec 317 if d < -4442\r\n" + "isy dec 1 if cie > -1717\r\n" + "j dec 95 if mxg == 1046\r\n"
				+ "h dec -927 if s <= 1435\r\n" + "o dec 812 if ie >= -6518\r\n" + "brr inc -499 if uxr >= 2936\r\n"
				+ "rak dec 716 if cie == -1712\r\n" + "x inc 482 if pf == 1350\r\n" + "cie inc -272 if mxg != 1049\r\n"
				+ "isy inc -839 if brr == -1870\r\n" + "o inc -259 if erb <= -1239\r\n" + "j dec 859 if x != -910\r\n"
				+ "isy inc 493 if tss != 3521\r\n" + "rxb dec -673 if mxg >= 1043\r\n" + "vso dec 35 if uxr <= 2947\r\n"
				+ "rxb dec -128 if bok < 459\r\n" + "bok inc 645 if isy >= 2853\r\n" + "bok inc 384 if s < 1430\r\n"
				+ "h inc -709 if brr != -1865\r\n" + "o inc 638 if cie != -1980\r\n" + "rak dec 9 if pf != 1345\r\n"
				+ "erb dec -772 if rfw != 1176\r\n" + "ie inc -817 if rfw == 1184\r\n" + "vso dec 21 if ie == -7334\r\n"
				+ "s inc -829 if uxr > 2936\r\n" + "isy inc -205 if cie <= -1984\r\n" + "mxg dec -404 if o == -1271\r\n"
				+ "x inc 633 if mxg < 1462\r\n" + "vso inc 795 if bok <= 1481\r\n" + "cie inc 613 if h == 3753\r\n"
				+ "s inc 156 if qn != 3478\r\n" + "wf inc 908 if erb > -467\r\n" + "x inc -340 if j < -1191\r\n"
				+ "bok dec -790 if uxr > 2940\r\n" + "d inc 588 if vso >= 4774\r\n" + "ie dec 711 if rxb < 2209\r\n"
				+ "j dec -687 if isy >= 2657\r\n" + "brr inc -979 if bok == 2270\r\n" + "uxr dec -130 if isy < 2649\r\n"
				+ "h inc -403 if pf == 1341\r\n" + "pf dec -156 if ie == -8045\r\n" + "o dec 828 if bok <= 2276\r\n"
				+ "bs inc -379 if d != -3864\r\n" + "vso inc 570 if isy != 2654\r\n" + "brr dec -208 if brr > -2837\r\n"
				+ "d dec 364 if wf != -2005\r\n" + "pf inc -459 if d <= -4219\r\n" + "wf dec 449 if tss != 3536\r\n"
				+ "s dec -477 if wf >= -2464\r\n" + "j dec 366 if vso == 4782\r\n" + "s dec 240 if rxb != 2201\r\n"
				+ "hsn dec -892 if h > 3752\r\n" + "ie dec -551 if o <= -2098\r\n" + "wf inc -574 if tss < 3531\r\n"
				+ "s dec -972 if isy >= 2664\r\n" + "isy dec -632 if pf <= 1042\r\n" + "uxr inc -733 if vso > 4779\r\n"
				+ "bok inc -541 if o == -2099\r\n" + "pf inc -723 if cie >= -1378\r\n"
				+ "brr inc 993 if isy != 3285\r\n" + "isy inc -859 if brr == -1851\r\n"
				+ "qn inc -925 if rfw != 1184\r\n" + "brr dec 118 if j != -1572\r\n" + "rak inc -711 if hsn <= 2343\r\n"
				+ "o dec 896 if rfw <= 1184\r\n" + "qn inc -332 if h <= 3759\r\n" + "rak dec -684 if mxg == 1452\r\n"
				+ "qn dec 945 if uxr <= 2216\r\n" + "d inc 971 if rfw < 1189\r\n" + "bok dec -80 if o != -2995\r\n"
				+ "hsn dec 288 if uxr >= 2219\r\n" + "x inc -986 if bok > 1725\r\n" + "o inc -640 if tss > 3527\r\n"
				+ "rak dec -210 if isy == 3287\r\n" + "qn dec -937 if j > -1570\r\n" + "d dec -796 if ie >= -7497\r\n"
				+ "rfw dec 869 if d != -2456\r\n" + "j dec 941 if erb == -473\r\n" + "vso inc -366 if j > -2509\r\n"
				+ "h inc -526 if d != -2461";

		String[] input2 = input.split("\r\n");

		String[][] gegevens = new String[1000][7];
		String[][] geheugenbanken = new String[1000][2];

		for (int i = 0; i < input2.length; i++) {
			gegevens[i] = input2[i].split(" ");
		}

		int match = 0;
		int countPlaats = 0;
		for (int i = 0; i < gegevens.length; i++) {
			match = 0;
			for (int j = 0; j < gegevens.length; j++) {
				if (geheugenbanken[j][0] != null) {
					if (geheugenbanken[j][0].equals(gegevens[i][0])) {
						match++;
					}
				}
			}
			if (match == 0) {
				geheugenbanken[countPlaats][0] = gegevens[i][0];
				countPlaats++;
			}
		}
		
		for (int i = 0; i < geheugenbanken.length; i++) {
			geheugenbanken[i][1] = "0";
		}

		for (int i = 0; i < geheugenbanken.length; i++) {
			if (geheugenbanken[i][0] != null) {
				System.out.println("Plaats: " + i + " met als naam: " + geheugenbanken[i][0] + " heeft waarde: "+ geheugenbanken[i][1]);
			}
		}

		int groot = 0;
		for (int i = 0; i < gegevens.length; i++) {
			int pos = 0;
			int pos2 = 0;
			for (int j = 0; j < geheugenbanken.length; j++) {
				if (gegevens[i][4].equals(geheugenbanken[j][0])) {
					pos = j;
				}
			}
			if (gegevens[i][5].equals("==")) {
				if (gegevens[i][6].equals(geheugenbanken[pos][1])) {
					for (int j = 0; j < geheugenbanken.length; j++) {
						if (gegevens[i][0].equals(geheugenbanken[j][0])) {
							pos2 = j;
						}
					}
					if (gegevens[i][1].equals("dec")) {
						geheugenbanken[pos2][1] = Integer.toString(Integer.parseInt(geheugenbanken[pos2][1]) - Integer.parseInt(gegevens[i][2]));
					} else {
						geheugenbanken[pos2][1] = Integer.toString(Integer.parseInt(geheugenbanken[pos2][1]) + Integer.parseInt(gegevens[i][2]));
					}
				}
			}
			if (gegevens[i][5].equals(">")) {
				if (Integer.parseInt(geheugenbanken[pos][1]) > (Integer.parseInt(gegevens[i][6]))) {
					for (int j = 0; j < geheugenbanken.length; j++) {
						if (gegevens[i][0].equals(geheugenbanken[j][0])) {
							pos2 = j;
						}
					}
					if (gegevens[i][1].equals("dec")) {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) - Integer.parseInt(gegevens[i][2]));
					} else {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) + Integer.parseInt(gegevens[i][2]));
					}
				}
			}
			if (gegevens[i][5].equals("<")) {
				if (Integer.parseInt(geheugenbanken[pos][1]) < (Integer.parseInt(gegevens[i][6]))) {
					for (int j = 0; j < geheugenbanken.length; j++) {
						if (gegevens[i][0].equals(geheugenbanken[j][0])) {
							pos2 = j;
						}
					}
					if (gegevens[i][1].equals("dec")) {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) - Integer.parseInt(gegevens[i][2]));
					} else {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) + Integer.parseInt(gegevens[i][2]));
					}
				}
			}
			if (gegevens[i][5].equals(">=")) {
				if (Integer.parseInt(geheugenbanken[pos][1]) >= (Integer.parseInt(gegevens[i][6]))) {
					for (int j = 0; j < geheugenbanken.length; j++) {
						if (gegevens[i][0].equals(geheugenbanken[j][0])) {
							pos2 = j;
						}
					}
					if (gegevens[i][1].equals("dec")) {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) - Integer.parseInt(gegevens[i][2]));
					} else {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) + Integer.parseInt(gegevens[i][2]));
					}
				}
			}
			if (gegevens[i][5].equals("<=")) {
				if (Integer.parseInt(geheugenbanken[pos][1]) <= (Integer.parseInt(gegevens[i][6]))) {
					for (int j = 0; j < geheugenbanken.length; j++) {
						if (gegevens[i][0].equals(geheugenbanken[j][0])) {
							pos2 = j;
						}
					}
					if (gegevens[i][1].equals("dec")) {
						geheugenbanken[pos2][1] = Integer.toString(Integer.parseInt(geheugenbanken[pos2][1]) - Integer.parseInt(gegevens[i][2]));
					} else {
						geheugenbanken[pos2][1] = Integer.toString(Integer.parseInt(geheugenbanken[pos2][1]) + Integer.parseInt(gegevens[i][2]));
					}
				}
			}
			if (gegevens[i][5].equals("!=")) {
				if (!gegevens[i][6].equals(geheugenbanken[pos][1])) {
					for (int j = 0; j < geheugenbanken.length; j++) {
						if (gegevens[i][0].equals(geheugenbanken[j][0])) {
							pos2 = j;
						}
					}
					if (gegevens[i][1].equals("dec")) {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) - Integer.parseInt(gegevens[i][2]));
					} else {
						geheugenbanken[pos2][1] = Integer
								.toString(Integer.parseInt(geheugenbanken[pos2][1]) + Integer.parseInt(gegevens[i][2]));
					}
				}
			}
			for (int k = 0; k < geheugenbanken.length; k++) {
				if (geheugenbanken[k][0] != null) {
					if (Integer.parseInt(geheugenbanken[k][1]) > groot) {
						groot = (Integer.parseInt(geheugenbanken[k][1]));
					}
				}
			}
		}
		
		for (int i = 0; i < geheugenbanken.length; i++) {
			if (geheugenbanken[i][0] != null) {
				System.out.println("Plaats: " + i + " met als naam: " + geheugenbanken[i][0] + " heeft waarde: "+ geheugenbanken[i][1]);
			}
		}

		int grootste = 0;
		for (int i = 0; i < geheugenbanken.length; i++) {
			if (geheugenbanken[i][0] != null) {
				if (Integer.parseInt(geheugenbanken[i][1]) > grootste) {
					grootste = (Integer.parseInt(geheugenbanken[i][1]));
				}
			}
		}
		
		System.out.println("*** Deel 1 ***");
		System.out.println(grootste);
		System.out.println("*** Deel 2 ***");
		System.out.println(groot);
	}

}
