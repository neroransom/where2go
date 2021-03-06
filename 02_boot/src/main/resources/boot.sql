drop database boot;

-- 创建 boot 数据库
CREATE DATABASE
IF
	NOT EXISTS boot DEFAULT CHARSET utf8 COLLATE utf8_bin;

-- 选择 boot 数据库
USE boot;

-- 创建 user 表
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE
IF
	EXISTS `user`;
CREATE TABLE `user` (
	`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`user_name` VARCHAR ( 255 ) COLLATE utf8_bin NOT NULL,
	`password` VARCHAR ( 255 ) COLLATE utf8_bin NOT NULL,
	`salt` VARCHAR ( 255 ) COLLATE utf8_bin NOT NULL,
	PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
SET FOREIGN_KEY_CHECKS = 1;
