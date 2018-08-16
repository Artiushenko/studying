DROP TABLE t_user;
CREATE TABLE t_user (
user_id NUMBER PRIMARY KEY NOT NULL,
user_name VARCHAR2(128),
user_address VARCHAR2(128)
);

INSERT INTO t_user VALUES(1, 'name_1', 'address_1');
INSERT INTO t_user VALUES(2, 'name_2', 'address_2');
INSERT INTO t_user VALUES(3, 'name_3', 'address_3');
INSERT INTO t_user VALUES(4, 'name_4', 'address_4');
INSERT INTO t_user VALUES(5, 'name_5', 'address_5');
SELECT * FROM t_user

CREATE TABLE t_orders(
order_id NUMBER PRIMARY KEY NOT NULL,
fk_user_id NUMBER CONSTRAINT fk_order_user REFERENCES t_user(user_id) NOT NULL,
product_name VARCHAR2(128) NOT NULL,
product_price NUMBER NOT NULL,
product_quantity NUMBER NOT NULL
)


delete from t_orders Where order_id>5;
SELECT * FROM t_orders;
INSERT INTO t_orders VALUES (1, 1, 'product_1', 100, 10);
INSERT INTO t_orders VALUES (2, 2, 'product_2', 200, 20);
INSERT INTO t_orders VALUES (3, 3, 'product_3', 300, 30);
INSERT INTO t_orders VALUES (4, 4, 'product_4', 400, 40);
INSERT INTO t_orders VALUES (5, 5, 'product_5', 500, 50);
INSERT INTO t_orders VALUES (7, 6, 'product_5', 500, 50);


