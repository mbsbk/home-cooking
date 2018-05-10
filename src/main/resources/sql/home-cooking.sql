/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : home-cooking

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 10/05/2018 16:40:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for BOOK
-- ----------------------------
DROP TABLE IF EXISTS `BOOK`;
CREATE TABLE `BOOK` (
  `BOOK_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `BOOK_NAME` varchar(128) DEFAULT NULL,
  `IMAGE_ID` varchar(64) DEFAULT NULL,
  `DEFAUL_COOK_ID` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for COOK
-- ----------------------------
DROP TABLE IF EXISTS `COOK`;
CREATE TABLE `COOK` (
  `COOK_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `BOOK_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DETAIL` longtext,
  PRIMARY KEY (`COOK_ID`,`BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for IMAGE
-- ----------------------------
DROP TABLE IF EXISTS `IMAGE`;
CREATE TABLE `IMAGE` (
  `IMAGE_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `IMAGE_BLOB` blob,
  PRIMARY KEY (`IMAGE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for USER
-- ----------------------------
DROP TABLE IF EXISTS `USER`;
CREATE TABLE `USER` (
  `USER_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `WECHAT_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for USER_BOOK
-- ----------------------------
DROP TABLE IF EXISTS `USER_BOOK`;
CREATE TABLE `USER_BOOK` (
  `USER_BOOK_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_ID` varchar(64) DEFAULT NULL,
  `BOOK_ID` varchar(64) DEFAULT NULL,
  `FAVORITE_COOK_ID` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`USER_BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
