    CREATE TABLE IF NOT EXISTS t_trip_base(
    	id VARCHAR(32),
        bill_no VARCHAR(32),
        scan_number VARCHAR(32),
        dept_id  VARCHAR(20),
        dept_name  VARCHAR(20),
        refund_total_amount decimal(18,2),
        is_quick_pay VARCHAR(2),
        is_qu_gui_mian VARCHAR(2),
        is_vip VARCHAR(2),
        status VARCHAR(2),
        is_delete VARCHAR(2),
        created_by VARCHAR(32),
        updated_by VARCHAR(32),
        created_date DATETIME,
        updated_date DATETIME
    );

     CREATE TABLE IF NOT EXISTS t_other_cost_info(
     	id VARCHAR(32),
         bill_no VARCHAR(32),
         person_name VARCHAR(32),
         person_um  VARCHAR(20),
         cost_reason  VARCHAR(20),
         refund_amount decimal(18,2),
         is_delete VARCHAR(2),
         created_by VARCHAR(32),
         updated_by VARCHAR(32),
         created_date DATETIME,
         updated_date DATETIME
     );
    CREATE TABLE IF NOT EXISTS t_hotel_order_info(
        	id VARCHAR(32),
            bill_no VARCHAR(32),
            person_name VARCHAR(32),
            person_num  VARCHAR(20),
            refund_amount decimal(18,2),
            hotel_city VARCHAR(32),
            hotel_name VARCHAR(32),
            hotel_address VARCHAR(32),
            check_in_date DATETIME,
            check_out_date DATETIME,
            is_delete VARCHAR(2),
            created_by VARCHAR(32),
            updated_by VARCHAR(32),
            created_date DATETIME,
            updated_date DATETIME
        );
     CREATE TABLE IF NOT EXISTS t_transportation_order_info(
             id VARCHAR(32),
             bill_no VARCHAR(32),
             person_name VARCHAR(32),
             person_num  VARCHAR(20),
             refund_amount decimal(18,2),
             trans_type_no VARCHAR(2),
             tran_type_name VARCHAR(20),
             depart_address VARCHAR(32),
             arrive_address VARCHAR(32),
             trans_class_no VARCHAR(2),
             trans_class_name VARCHAR(20),
             depart_date DATETIME,
             arrive_date DATETIME,
             is_delete VARCHAR(2),
             created_by VARCHAR(32),
             updated_by VARCHAR(32),
             created_date DATETIME,
             updated_date DATETIME
            );

    CREATE TABLE IF NOT EXISTS t_trip_person(
              id VARCHAR(32) NOT NULL COMMENT '主键ID',
              bill_no VARCHAR(32),
              person_name VARCHAR(32),
              person_num  VARCHAR(20),
              finacial_class_name VARCHAR(32),
              finacial_class_code VARCHAR(2),
              is_excutive VARCHAR(2),
              is_delete VARCHAR(2),
              PRIMARY KEY (`id`)
            );

       CREATE TABLE IF NOT EXISTS t_payment_info(
                         id VARCHAR(32) COMMENT '主键ID',
                         bill_no VARCHAR(32) COMMENT '单据编号',
                         payee_name VARCHAR(32),
                         payee_num  VARCHAR(20),
                         account_name VARCHAR(32),
                         account_num VARCHAR(64),
                         pay_way VARCHAR(2),
                         is_delete VARCHAR(2),
                         created_by VARCHAR(32),
                         updated_by VARCHAR(32),
                         created_date DATETIME,
                         updated_date DATETIME,
                         PRIMARY KEY (`id`)
                       );
    
