 -- ----------------------------
        -- Table structure for picture_pet
        -- ----------------------------
        DROP TABLE IF EXISTS `picture_pet`;
        CREATE TABLE `picture_pet` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `name` varchar(255) NOT NULL DEFAULT '' COMMENT '宠物名字',
        `img` varchar(255) NOT NULL DEFAULT '' COMMENT '宠物图片type-growth_state，和前端约定格式',
        `greeting` varchar(255) NOT NULL DEFAULT '' COMMENT '宠物问候',
        `growth_state` int(11) NOT NULL COMMENT '宠物成长状态',
        `type` int(11) NOT NULL COMMENT '宠物种类(现在有24个种类，每个种类按照成长状态分为7个成长状态的宠物)',
        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`),
        UNIQUE KEY `uk_type_growth_state` (`type`,`growth_state`) COMMENT '宠物种类和宠物成长状态唯一确定一个宠物'
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='宠物表(注意小黄人幼年、小黄人青年是两个宠物，认为小黄人是一个宠物种类type，幼年和青年代表该种类的宠物成长状态growth_state)';
        
        -- select * from picture_pet where id=#{id};
        -- select * from picture_pet where type=#{type} and growth_state=#{growthState};

        -- ----------------------------
        -- Table structure for picture_pet_evolution
        -- ----------------------------
        DROP TABLE IF EXISTS `picture_pet_evolution`;
        CREATE TABLE `picture_pet_evolution` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `account_id` bigint(20) NOT NULL COMMENT '用户id',
        `picture_pet_id` int(11) NOT NULL COMMENT '宠物id',
        `picture_pet_type` int(11) NOT NULL COMMENT '宠物种类(现有24个种类的宠物,每个种类的宠物有7个成长状态)',
        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`),
        UNIQUE KEY `uk_account_id_picture_pet_id` (`account_id`,`picture_pet_id`) COMMENT '用户id与进化的宠物id唯一确定该进化记录',
        KEY `idx_picture_pet_type` (`picture_pet_type`) COMMENT '宠物种类添加索引'
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='宠物进化表';

        -- 获取解锁列表
        -- select * from picture_pet_evolution where (id,picture_pet_type) in (select max(id), picture_pet_type from picture_pet_evolution where account_id=#{accountId} group by picture_pet_type);

        -- ----------------------------
        -- Table structure for picture_pet_diamond_holding
        -- ----------------------------
        DROP TABLE IF EXISTS `picture_pet_diamond_holding`;
        CREATE TABLE `picture_pet_diamond_holding` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `account_id` bigint(20) NOT NULL COMMENT '用户id',
        `number` int(11) NOT NULL DEFAULT '0' COMMENT '钻石持有数目',
        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`),
        UNIQUE KEY `uk_account_id` (`account_id`) COMMENT '每个用户唯一找到持有钻石数目'
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='宠物钻石持有数表';

        -- ----------------------------
        -- Table structure for picture_pet_guardian
        -- ----------------------------
        DROP TABLE IF EXISTS `picture_pet_guardian`;
        CREATE TABLE `picture_pet_guardian` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `account_id` bigint(20) NOT NULL COMMENT '用户id',
        `picture_pet_id` int(11) NOT NULL COMMENT '宠物id',
        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`),
        UNIQUE KEY `uk_account_id` (`account_id`) COMMENT '每个用户只能把一个宠物设为守护'
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='宠物设为守护表';

        -- ----------------------------
        -- Table structure for picture_pet_newcomer_guide
        -- ----------------------------
        DROP TABLE IF EXISTS `picture_pet_newcomer_guide`;
        CREATE TABLE `picture_pet_newcomer_guide` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `account_id` bigint(20) NOT NULL COMMENT '用户id',
        `type` int(11) NOT NULL COMMENT '新手引导类型 1,2',
        `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`),
        UNIQUE KEY `uk_account_id_type` (`account_id`,`type`) COMMENT '用户id和新手引导类型唯一确定一条记录，保证每个 引导只出现一次'
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='宠物新手引导出现记录表';
