

-- -----------------------------------------------------
-- Table `topc_iems`.`t_iems_renter`
-- -----------------------------------------------------
--DROP TABLE IF EXISTS `topc_iems`.`t_iems_renter` ;

CREATE TABLE IF NOT EXISTS `topc_iems`.`t_iems_renter` (
  `pk_id` VARCHAR(32) NOT NULL COMMENT '主键ID',
  `renter_type` VARCHAR(20) NOT NULL COMMENT '租客类型 /个人，公司',
  `renter_name` VARCHAR(200) NOT NULL COMMENT '姓名或工商注册名',
  `renter_verify_id` VARCHAR(200) NOT NULL COMMENT '身份证号或社会统一信用编码',
  `renter_contactor` VARCHAR(100) NOT NULL COMMENT '租客联系人',
  `renter_contactor_telephone` VARCHAR(100) NOT NULL COMMENT '租客联系电话',
  `renter_financial_contactor` VARCHAR(100) NOT NULL COMMENT '租客财务联系人',
  `renter_financial_contactor_telephone` VARCHAR(100) NOT NULL COMMENT '租客财务联系人电话/催缴信息默认发送该电话',
  `renter_bill_email` VARCHAR(100) NOT NULL COMMENT '账单接收邮箱	',
  `renter_com_man` VARCHAR(100) NULL COMMENT '公司法人	',
  `renter_com_man_telephone` VARCHAR(100) NULL COMMENT '公司法人电话',
  `renter_com_built_time` DATETIME NULL COMMENT '公司成立日期	',
  `renter_com_type` VARCHAR(20) NULL COMMENT '公司类型',
  `renter_com_address` VARCHAR(200) NULL COMMENT '公司注册住所',
  `renter_com_reg_amount` DOUBLE NULL COMMENT '公司注册资本',
   `is_deleted` VARCHAR(2) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  `create_by` VARCHAR(20) NOT NULL COMMENT '	创建人',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_by` VARCHAR(20) NOT NULL COMMENT '更新人',
  `update_time` DATETIME NOT NULL COMMENT '更新时间',
  `lessee_id` VARCHAR(20) NOT NULL COMMENT '租户ID',
  PRIMARY KEY (`pk_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `topc_iems`.`t_iems_building`
-- -----------------------------------------------------
--DROP TABLE IF EXISTS `topc_iems`.`t_iems_building` ;

CREATE TABLE IF NOT EXISTS `topc_iems`.`t_iems_building` (
  `pk_id` VARCHAR(32) NOT NULL COMMENT '主键ID',
  `building_name` VARCHAR(100) NOT NULL COMMENT '楼宇名称',
  `building_pic` VARCHAR(200) NULL COMMENT '图片',
  `building_pic_small` VARCHAR(200) NULL COMMENT '图片缩略图',
  `building_floors` INT NOT NULL COMMENT '楼层数',
  `building_area`DOUBLE NOT NULL COMMENT '面积',
  `building_location_province` VARCHAR(20) NOT NULL COMMENT '省份',
  `building_location_city` VARCHAR(20) NOT NULL COMMENT '城市',
  `building_location_district` VARCHAR(20) NOT NULL COMMENT '区/县',
  `building_address` VARCHAR(100) NOT NULL COMMENT '详细地址',
  `building_manager` VARCHAR(100) NULL COMMENT '主管',
  `building_manager_telephone` VARCHAR(45) NULL COMMENT '主管电话',
  `building_telephone` VARCHAR(45) NULL COMMENT '楼宇电话',
  `building_status` VARCHAR(2) NOT NULL COMMENT '楼宇状态',
   `is_deleted` VARCHAR(2) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  `create_by` VARCHAR(20) NOT NULL COMMENT '	创建人',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_by` VARCHAR(20) NOT NULL COMMENT '更新人',
  `update_time` DATETIME NOT NULL COMMENT '更新时间',
  `lessee_id` VARCHAR(20) NOT NULL COMMENT '租户ID',
  PRIMARY KEY (`pk_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `topc_iems`.`t_iems_floor`
-- -----------------------------------------------------
--DROP TABLE IF EXISTS `topc_iems`.`t_iems_floor` ;

CREATE TABLE IF NOT EXISTS `topc_iems`.`t_iems_floor` (
  `pk_id` VARCHAR(32) NOT NULL COMMENT '主键ID',
  `building_pk_id` VARCHAR(32) NOT NULL COMMENT '楼宇ID',
  `floor_no` INT NOT NULL COMMENT '楼层',
  `floor_area`DOUBLIE NOT NULL,
  `floor_manager` VARCHAR(100) NULL,
  `floor_manager_telephone` VARCHAR(100) NULL COMMENT '负责人电话',
  `floor_status` VARCHAR(2) NOT NULL COMMENT '楼层状态',
   `is_deleted` VARCHAR(2) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  `create_by` VARCHAR(20) NOT NULL COMMENT '	创建人',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_by` VARCHAR(20) NOT NULL COMMENT '更新人',
  `update_time` DATETIME NOT NULL COMMENT '更新时间',
  `lessee_id` VARCHAR(20) NOT NULL COMMENT '租户ID',
  PRIMARY KEY (`pk_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `topc_iems`.`T_iems_room`
-- -----------------------------------------------------
--DROP TABLE IF EXISTS `topc_iems`.`T_iems_room` ;

CREATE TABLE IF NOT EXISTS `topc_iems`.`T_iems_room` (
  `pk_id` VARCHAR(32) NOT NULL COMMENT '主键',
  `floor_pk_id` VARCHAR(32) NOT NULL COMMENT '楼层ID',
  `room_no` VARCHAR(50) NOT NULL COMMENT '房间号',
  `room_area`DOUBLIE NOT NULL COMMENT '房间面积',
  `room_status` VARCHAR(2) NOT NULL COMMENT '房间状态',
  `room_gov_no` VARCHAR(64) NOT NULL COMMENT '政府编码',
  `room_mark` VARCHAR(500) NULL COMMENT '备注',
   `is_deleted` VARCHAR(2) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  `create_by` VARCHAR(20) NOT NULL COMMENT '	创建人',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_by` VARCHAR(20) NOT NULL COMMENT '更新人',
  `update_time` DATETIME NOT NULL COMMENT '更新时间',
  `lessee_id` VARCHAR(20) NOT NULL COMMENT '租户ID',
UNIQUE KEY(room_no, floor_pk_id),
  PRIMARY KEY (`pk_id`))
ENGINE = InnoDB;
