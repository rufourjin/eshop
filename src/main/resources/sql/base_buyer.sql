CREATE TABLE `base_buyer` (
  `buyer_id` int NOT NULL AUTO_INCREMENT COMMENT '买家id',
  `buyer_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `buyer_pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户密码',
  `buyer_gender` varchar(10) NOT NULL COMMENT '性别',
  `buyer_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `buyer_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  `buyer_birth` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '生日',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`buyer_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
insert into base_buyer values(1,'a','123456','男','河南','12345678911','2012-1-1',NOW(),NOW());
insert into base_buyer values(2,'b','123456','男','天津','12345678912','1992-1-1',NOW(),NOW());
insert into base_buyer values(3,'c','123456','女','北京','12345678913','2004-1-1',NOW(),NOW());
insert into base_buyer values(4,'d','123456','男','云南','12345678914','1999-1-1',NOW(),NOW());
insert into base_buyer values(5,'e','123456','女','贵州','12345678915','1998-1-1',NOW(),NOW());
insert into base_buyer values(6,'f','123456','男','浙江','12345678916','1997-1-1',NOW(),NOW());
SET FOREIGN_KEY_CHECKS = 1;
