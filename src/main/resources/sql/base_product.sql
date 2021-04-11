CREATE TABLE `base_product` (
  `product_id` int NOT NULL COMMENT '商品编号(主键)',
  `product_name` varchar(50) NOT NULL COMMENT '商品名称',
  `product_price` decimal(5,2) NOT NULL COMMENT '价格',
  `product_intro` varchar(50) DEFAULT NULL COMMENT '商品介绍',
  `p_create_time` datetime DEFAULT NULL COMMENT '上架时间',
  `p_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`product_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
insert into base_product values(1001,'aa','3.99','xzxcxzv',NOW(),NOW());
insert into base_product values(1002,'bb','9.99','xzcxvqeqw',NOW(),NOW());