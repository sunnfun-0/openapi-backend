/*
 Navicat Premium Dump SQL

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80404 (8.4.4)
 Source Host           : localhost:3306
 Source Schema         : openapi

 Target Server Type    : MySQL
 Target Server Version : 80404 (8.4.4)
 File Encoding         : 65001

 Date: 14/04/2025 10:30:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for biz_interface_info
-- ----------------------------
DROP TABLE IF EXISTS `biz_interface_info`;
CREATE TABLE `biz_interface_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `description` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '描述',
  `url` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '接口地址',
  `request_header` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '请求头',
  `response_header` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '响应头',
  `status` int NOT NULL DEFAULT 0 COMMENT '接口状态（0-关闭，1-开启）',
  `method` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '请求类型',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `create_by` bigint NULL DEFAULT NULL COMMENT '创建人ID',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `update_by` bigint NULL DEFAULT NULL COMMENT '修改人ID',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除标识(0-未删除 1-已删除)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '接口信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of biz_interface_info
-- ----------------------------
INSERT INTO `biz_interface_info` VALUES (1, '陈子韬', 'OSqBUYb4Cz', 'http://video.yuto5.co.jp/ArtsHandicraftsSewing', 'A man’s best friends are his ten fingers.', 'It wasn’t raining when Noah built the ark.', 0, '陈子韬', '2016-01-06 02:40:15', 32, '2017-01-19 19:50:49', 888, 0);
INSERT INTO `biz_interface_info` VALUES (2, '邵岚', 'kjPaR1bniY', 'https://image.zhennanshi706.biz/Beauty', 'Navicat Monitor is a safe, simple and agentless remote server monitoring tool that                  ', 'After logged in the Navicat Cloud feature, the Navigation pane will be divided into                 ', 1, '邵岚', '2018-07-22 13:40:40', 59, '2018-04-18 19:02:02', 690, 0);
INSERT INTO `biz_interface_info` VALUES (3, '向詩涵', '5U9NhHr9sP', 'http://drive.feng1222.jp/AppsGames', 'To successfully establish a new connection to local/remote server - no matter via                   ', 'Remember that failure is an event, not a person.', 0, '向詩涵', '2016-09-26 23:24:29', 842, '2009-12-24 09:25:21', 274, 1);
INSERT INTO `biz_interface_info` VALUES (4, '许詩涵', 'DIo1VeWqZA', 'https://www.jialunt.com/ArtsHandicraftsSewing', 'Navicat is a multi-connections Database Administration tool allowing you to connect                 ', 'If you wait, all that happens is you get older. In the middle of winter I at last                   ', 1, '许詩涵', '2016-04-21 12:19:19', 571, '2001-03-14 15:10:53', 459, 1);
INSERT INTO `biz_interface_info` VALUES (5, '金詩涵', '8tq01wVCtF', 'https://video.anqi429.co.jp/ClothingShoesandJewelry', 'The past has no power over the present moment. SQL Editor allows you to create and                  ', 'Navicat Monitor requires a repository to store alerts and metrics for historical analysis.', 0, '金詩涵', '2009-04-09 04:43:33', 20, '2005-08-01 11:59:10', 780, 1);
INSERT INTO `biz_interface_info` VALUES (6, '贺致远', 'xSr7yalHHc', 'https://www.totszhin2.net/CellPhonesAccessories', 'Secure SHell (SSH) is a program to log in into another computer over a network, execute             ', 'Navicat allows you to transfer data from one database and/or schema to another with                 ', 0, '贺致远', '2008-06-14 18:56:51', 168, '2012-05-14 00:38:31', 167, 0);
INSERT INTO `biz_interface_info` VALUES (7, '姚宇宁', 'ZN0yA0ruDF', 'https://auth.rita8.org/ToysGames', 'I destroy my enemies when I make them my friends.', 'A man is not old until regrets take the place of dreams. You must be the change you                 ', 0, '姚宇宁', '2017-08-11 05:28:53', 777, '2016-07-16 10:12:19', 678, 1);
INSERT INTO `biz_interface_info` VALUES (8, '蔡璐', 'MlkIU1ed70', 'http://auth.gonzal.info/FilmSupplies', 'If you wait, all that happens is you get older. SSH serves to prevent such vulnerabilities          ', 'Genius is an infinite capacity for taking pains. SQL Editor allows you to create                    ', 1, '蔡璐', '2004-01-25 08:11:26', 815, '2004-08-02 11:29:26', 553, 1);
INSERT INTO `biz_interface_info` VALUES (9, '陶嘉伦', 'tN5LrRRdH7', 'https://image.huangs.us/CollectiblesFineArt', 'You must be the change you wish to see in the world.', 'Import Wizard allows you to import data to tables/collections from CSV, TXT, XML, DBF and more.', 1, '陶嘉伦', '2020-11-13 03:58:09', 795, '2005-11-01 03:22:03', 702, 0);
INSERT INTO `biz_interface_info` VALUES (10, '王杰宏', 'iz2jZJi4Un', 'http://drive.mason75.co.jp/Handcrafts', 'The past has no power over the present moment.', 'The Main Window consists of several toolbars and panes for you to work on connections,              ', 1, '王杰宏', '2013-03-08 23:59:22', 791, '2007-02-20 08:19:19', 238, 1);
INSERT INTO `biz_interface_info` VALUES (11, '金安琪', 'aLQb3N17Pg', 'http://drive.ryota323.cn/ArtsHandicraftsSewing', 'To start working with your server in Navicat, you should first establish a connection               ', 'I will greet this day with love in my heart. Navicat Data Modeler enables you to                    ', 1, '金安琪', '2010-02-21 01:47:30', 364, '2004-01-02 19:19:04', 2, 0);
INSERT INTO `biz_interface_info` VALUES (12, '曾云熙', 'MBf9ayJVAI', 'http://auth.akh831.com/BaggageTravelEquipment', 'With its well-designed Graphical User Interface(GUI), Navicat lets you quickly and                  ', 'The reason why a great man is great is that he resolves to be a great man.', 0, '曾云熙', '2019-07-06 13:13:09', 333, '2013-06-25 16:48:11', 56, 1);
INSERT INTO `biz_interface_info` VALUES (13, '田子韬', '2XmsjqENnT', 'http://www.yuenfat1.net/SportsOutdoor', 'Always keep your eyes open. Keep watching. Because whatever you see can inspire you.', 'After logged in the Navicat Cloud feature, the Navigation pane will be divided into                 ', 0, '田子韬', '2006-11-19 11:08:38', 279, '2018-04-05 19:53:33', 414, 0);
INSERT INTO `biz_interface_info` VALUES (14, '程致远', 'FFvQluCdvR', 'https://drive.melissa8.net/ToysGames', 'The Main Window consists of several toolbars and panes for you to work on connections,              ', 'Remember that failure is an event, not a person. It wasn’t raining when Noah built the ark.', 0, '程致远', '2003-05-20 09:14:55', 500, '2002-07-27 07:29:12', 885, 0);
INSERT INTO `biz_interface_info` VALUES (15, '钱秀英', '1D2xkqFNLp', 'https://www.ikkiwada6.org/SportsOutdoor', 'All journeys have secret destinations of which the traveler is unaware.', 'Anyone who has ever made anything of importance was disciplined.', 0, '钱秀英', '2006-11-22 16:19:33', 200, '2023-11-03 06:48:36', 199, 1);
INSERT INTO `biz_interface_info` VALUES (16, '史震南', 'qyNnmOiTLv', 'http://www.kwokwingto.co.jp/CenturionGardenOutdoor', 'In the Objects tab, you can use the List List, Detail Detail and ER Diagram ER Diagram              ', 'The repository database can be an existing MySQL, MariaDB, PostgreSQL, SQL Server,                  ', 0, '史震南', '2014-03-17 18:33:20', 61, '2001-09-15 02:36:20', 545, 0);
INSERT INTO `biz_interface_info` VALUES (17, '陈睿', 'SR5SjHIZUE', 'https://www.nakamoriy.com/AutomotivePartsAccessories', 'Sometimes you win, sometimes you learn.', 'You cannot save people, you can just love them. Navicat Monitor requires a repository               ', 0, '陈睿', '2007-11-13 06:18:52', 391, '2016-11-07 12:46:43', 975, 1);
INSERT INTO `biz_interface_info` VALUES (18, '刘岚', 'ZnM34n9dgv', 'http://www.chungwk401.jp/Beauty', 'To open a query using an external editor, control-click it and select Open with External            ', 'The On Startup feature allows you to control what tabs appear when you launch Navicat.', 1, '刘岚', '2005-02-05 05:50:49', 499, '2002-04-19 13:59:56', 138, 1);
INSERT INTO `biz_interface_info` VALUES (19, '尹璐', 'Hzkx6Gccg3', 'http://auth.katbry5.cn/ToysGames', 'I may not have gone where I intended to go, but I think I have ended up where I needed to be.', 'You can select any connections, objects or projects, and then select the corresponding              ', 0, '尹璐', '2023-09-01 19:31:20', 997, '2011-11-09 15:42:28', 128, 1);
INSERT INTO `biz_interface_info` VALUES (20, '杨晓明', 'BDjG98nFFB', 'http://auth.caz626.org/Appliances', 'It can also manage cloud databases such as Amazon Redshift, Amazon RDS, Alibaba Cloud.              ', 'It wasn’t raining when Noah built the ark.', 0, '杨晓明', '2002-12-14 00:56:14', 30, '2005-09-14 22:10:51', 781, 0);
INSERT INTO `biz_interface_info` VALUES (21, '郭璐', 'PTVrhIBdiN', 'http://drive.jiehowa63.xyz/ClothingShoesandJewelry', 'Secure SHell (SSH) is a program to log in into another computer over a network, execute             ', 'Navicat Monitor requires a repository to store alerts and metrics for historical analysis.', 1, '郭璐', '2004-07-04 15:33:57', 819, '2001-09-27 02:27:23', 125, 0);
INSERT INTO `biz_interface_info` VALUES (22, '严致远', 'VlSoLiYBQ8', 'https://drive.mms1953.org/CDsVinyl', 'Import Wizard allows you to import data to tables/collections from CSV, TXT, XML, DBF and more.', 'With its well-designed Graphical User Interface(GUI), Navicat lets you quickly and                  ', 1, '严致远', '2021-12-01 22:29:38', 696, '2005-11-30 08:27:45', 669, 0);
INSERT INTO `biz_interface_info` VALUES (23, '吴子异', '3unrhYSNtf', 'http://www.yota65.cn/CollectiblesFineArt', 'I destroy my enemies when I make them my friends.', 'A man is not old until regrets take the place of dreams.', 1, '吴子异', '2020-07-22 22:57:55', 727, '2021-12-18 17:08:33', 789, 1);
INSERT INTO `biz_interface_info` VALUES (24, '萧安琪', 'vZ75R9hcUK', 'https://video.mingshing.cn/ArtsHandicraftsSewing', 'In other words, Navicat provides the ability for data in different databases and/or                 ', 'The Navigation pane employs tree structure which allows you to take action upon the                 ', 1, '萧安琪', '2020-01-31 04:29:02', 173, '2013-10-26 22:07:17', 716, 1);
INSERT INTO `biz_interface_info` VALUES (25, '薛震南', 'vf9g9Vrfjh', 'https://drive.yuning627.net/Beauty', 'Navicat Monitor can be installed on any local computer or virtual machine and does                  ', 'Genius is an infinite capacity for taking pains.', 0, '薛震南', '2001-04-01 08:17:44', 349, '2024-09-07 11:45:40', 480, 1);
INSERT INTO `biz_interface_info` VALUES (26, '梁璐', '7OkMcidzOO', 'http://www.shinosugiyama.xyz/Handcrafts', 'To connect to a database or schema, simply double-click it in the pane.                             ', 'Flexible settings enable you to set up a custom key for comparison and synchronization.', 1, '梁璐', '2004-01-08 18:02:26', 99, '2005-03-08 20:29:59', 8, 1);
INSERT INTO `biz_interface_info` VALUES (27, '杨子韬', 'w7aJccnZWJ', 'http://drive.luwoods58.cn/CenturionGardenOutdoor', 'The Main Window consists of several toolbars and panes for you to work on connections,              ', 'Instead of wondering when your next vacation is, maybe you should set up a life you                 ', 1, '杨子韬', '2018-08-11 01:51:55', 937, '2001-10-10 01:50:58', 143, 1);
INSERT INTO `biz_interface_info` VALUES (28, '杨詩涵', 'MfyqxKxZC5', 'http://www.zitaodi1981.biz/HouseholdKitchenAppliances', 'Optimism is the one quality more associated with success and happiness than any other.', 'To open a query using an external editor, control-click it and select Open with External            ', 0, '杨詩涵', '2008-07-03 21:53:07', 774, '2008-12-11 06:52:38', 851, 0);
INSERT INTO `biz_interface_info` VALUES (29, '刘杰宏', 'aWHoMFhGyB', 'http://www.liaowaisan905.info/HouseholdKitchenAppliances', 'Navicat is a multi-connections Database Administration tool allowing you to connect                 ', 'It can also manage cloud databases such as Amazon Redshift, Amazon RDS, Alibaba Cloud.              ', 0, '刘杰宏', '2009-10-25 07:53:53', 982, '2010-09-15 03:57:50', 287, 1);
INSERT INTO `biz_interface_info` VALUES (30, '江致远', '52wq7U1khJ', 'http://video.yauwm510.xyz/CenturionGardenOutdoor', 'All journeys have secret destinations of which the traveler is unaware.                             ', 'Navicat provides a wide range advanced features, such as compelling code editing                    ', 0, '江致远', '2015-04-27 09:01:34', 48, '2005-06-17 07:57:21', 741, 0);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `nickname` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户头像',
  `profile` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户简介',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系方式',
  `email` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `role` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'user' COMMENT '用户角色：user/admin/ban',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `create_by` bigint NULL DEFAULT NULL COMMENT '创建人ID',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `update_by` bigint NULL DEFAULT NULL COMMENT '修改人ID',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除标识(0-未删除 1-已删除)',
  `wx_open_id` char(28) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '微信 openid',
  `wx_union_id` char(28) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '微信 unionid',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `login_name`(`username` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'openapi', 'openapi', 'vN3xtYZnGkk+9Uqzxxj4n+twzInzDJZaf+RIke4X0Wk=$Wv985rbdnUTprducBqKmYw==', NULL, NULL, '17867283307', 'sunnmaster001@gmail.com', 'admin', '2025-04-13 21:07:13', -1, NULL, NULL, 0, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
