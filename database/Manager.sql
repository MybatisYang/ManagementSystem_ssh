/*

 Source Server         : 本地数据库Root
 Source Server Type    : MySQL
 Source Host           : 127.0.0.1:3306
 Database Name         : Manager

 Date: 11/05/2021
*/

CREATE DATABASE Manager;
use Manager;
SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                        `userid` int(10) NOT NULL ,
                        `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                        `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                        `realname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                        `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                        `admin` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                        PRIMARY KEY (`userid`)
);

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `user` VALUES (00000, 'admin',  'admin','a','admin@163.com','Y');

