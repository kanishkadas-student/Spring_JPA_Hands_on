--table structure->
CREATE TABLE IF NOT EXISTS `ormlearn`.`stock` (
`st_id` INT NOT NULL AUTO_INCREMENT,
`st_code` varchar(10),
`st_date` date,
`st_open` double,
`st_close` double,
`st_volume` bigint,
PRIMARY KEY (`st_id`)
);

-- Table Data.

insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-1", 194.169998, 192.729996, 17777000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-2", 191.100006, 189.020004, 15297000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-3", 184.690002, 181.729996, 23086700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-4", 183.690002, 184.509995, 18035700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-5", 183.600006, 185.149994, 15833200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-6", 186.619995, 190.160004, 14828900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-7", 190, 187.850006, 11058800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-8", 186.850006, 185.369995, 10936300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-13", 185.520004, 188.449997, 13577000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-14", 185.800003, 179.710007, 18903700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-15", 180.949997, 182.589996, 12925900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-16", 183.75, 183.699997, 12654600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-19", 186.009995, 186.169998, 9691200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-20", 185.449997, 183.809998, 10083400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-21", 185, 183.550003, 8398200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-22", 183.429993, 182.039993, 10821400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-23", 180.839996, 177.75, 17323400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-26", 179.399994, 180.360001, 8773600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-27", 181.929993, 181.300003, 14399600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-28", 180.529999, 181.759995, 9386100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-29", 183.770004, 185.570007, 10128700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-8-30", 186.779999, 185.669998, 10774500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-3", 184, 182.389999, 9779400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-4", 184.649994, 187.139999, 11308000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-5", 188.529999, 190.899994, 13876700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-6", 190.210007, 187.490005, 15226800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-9", 187.729996, 188.759995, 14722400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-10", 187.440002, 186.169998, 15455900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-11", 186.460007, 188.490005, 11761700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-12", 189.860001, 187.470001, 11419800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-13", 187.330002, 187.190002, 11441100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-16", 186.929993, 186.220001, 8444800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-17", 186.660004, 188.080002, 9671100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-18", 188.089996, 188.139999, 9681900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-19", 188.660004, 190.139999, 10392700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-20", 190.660004, 189.929993, 19934200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-23", 189.339996, 186.820007, 13327600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-24", 187.979996, 181.279999, 18546600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-25", 181.449997, 182.800003, 18068300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-26", 181.330002, 180.110001, 16083300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-27", 180.490005, 177.100006, 14656200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("FB", "2019-9-30", 177.869995, 178.080002, 10740000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-1-11", 1091.400024, 1085.97998, 2006600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-2-11", 1089, 1071.48999, 2171900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-5-11", 1072.530029, 1055.72998, 2267900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-6-11", 1055.02002, 1069.569946, 1433000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-7-11", 1083.48999, 1108.23999, 2169400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-8-11", 1107.300049, 1094.630005, 1684700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-9-11", 1084.02002, 1077.02002, 1743000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-12-11", 1073.130005, 1049.359985, 1700100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-3-12", 1132.160034, 1116.359985, 2876600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-4-12", 1112.98999, 1062.469971, 2281500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-6-12", 1045, 1078.079956, 2371800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-7-12", 1072.22998, 1046.579956, 2134100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-10-12", 1042.939941, 1053.180054, 1682600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-11-12", 1066.939941, 1061.650024, 1692600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2018-12-12", 1077.079956, 1073.72998, 1448000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-2-1", 1027.199951, 1054.680054, 1593400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-3-1", 1050.670044, 1025.469971, 2098000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-4-1", 1042.560059, 1078.069946, 2301100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-7-1", 1080.969971, 1075.920044, 2372300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-8-1", 1086, 1085.369995, 1770700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-9-1", 1087.98999, 1081.650024, 1349900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-10-1", 1074.939941, 1078.829956, 1329900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-11-1", 1069.900024, 1064.469971, 1543200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-1-2", 1122.290039, 1118.619995, 1655800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-4-2", 1119.01001, 1141.420044, 3920400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-5-2", 1129.630005, 1151.869995, 4114800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-6-2", 1149.27002, 1122.890015, 2412800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-7-2", 1111.819946, 1105.910034, 1914900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-8-2", 1094.880005, 1102.380005, 1088300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-11-2", 1103.75, 1102.119995, 924900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("GOOGL", "2019-12-2", 1111.01001, 1127.579956, 1751800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-1-11", 304.589996, 317.380005, 15121500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-2-11", 318, 309.100006, 13404600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-5-11", 311.100006, 315.440002, 10283000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-6-11", 314.76001, 310.839996, 9710400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-7-11", 312.899994, 327.5, 13328300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-8-11", 328, 317.920013, 11023900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-9-11", 311.070007, 303.470001, 13480800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-12-11", 300, 294.070007, 10924800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-3-12", 293.190002, 290.299988, 14117400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-4-12", 288.130005, 275.329987, 12800600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-6-12", 268.329987, 282.880005, 13074300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-7-12", 282.480011, 265.140015, 12466700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-10-12", 264.190002, 269.700012, 9605600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-11-12", 274.079987, 265.320007, 9843200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2018-12-12", 267.660004, 274.880005, 11456700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-2-1", 259.279999, 267.660004, 11679500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-3-1", 270.200012, 271.200012, 14969600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-4-1", 281.880005, 297.570007, 19330100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-7-1", 302.100006, 315.339996, 18620100);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-8-1", 319.980011, 320.269989, 15359200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-9-1", 317.709991, 319.959991, 13343200);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-10-1", 314.570007, 324.660004, 13472500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-11-1", 330.959991, 337.589996, 19500400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-1-2", 337.179993, 339.850006, 9827800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-4-2", 342.600006, 351.339996, 9051400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-5-2", 353.200012, 355.809998, 9046600);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-6-2", 357, 352.190002, 6717700);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-7-2", 347.899994, 344.709991, 7864500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-8-2", 338, 347.570007, 7561400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-11-2", 350, 345.730011, 5454900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-12-2", 348.089996, 359.970001, 10429400);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-1-3", 362.26001, 357.320007, 5526500);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-4-3", 359.720001, 351.040009, 7487000);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-5-3", 351.459991, 354.299988, 5937800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-6-3", 353.600006, 359.609985, 6211900);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-7-3", 360.160004, 352.600006, 6151300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-8-3", 345.75, 349.600006, 6898800);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-11-3", 352, 358.859985, 5387300);
insert into stock (st_code, st_date, st_open, st_close, st_volume) values ("NFLX", "2019-12-3", 359.369995, 356.269989, 5164600);