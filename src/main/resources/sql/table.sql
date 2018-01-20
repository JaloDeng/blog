SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `j_blog`
-- ----------------------------
DROP TABLE IF EXISTS `j_blog`;
CREATE TABLE `j_blog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
  `summary` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '摘要',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '最后更新用户ID',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `j_blog_title_unique` (`title`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
--  Records 
-- ----------------------------
