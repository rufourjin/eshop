create table base_order(
order_id int not null auto_increment comment "订单号(主键)",
o_buyer_id int not null comment "购买者ID",
o_product_id int not null comment "商品ID",
order_time  datetime  DEFAULT NULL COMMENT '下单时间',
FOREIGN KEY(o_buyer_id) REFERENCES base_buyer(buyer_id),
FOREIGN KEY(o_product_id) REFERENCES base_product(product_id),
primary key (order_id)USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
insert into base_order VALUES(1,3,1001,now());
insert into base_order VALUES(2,5,1001,now());
insert into base_order VALUES(3,4,1002,now());
