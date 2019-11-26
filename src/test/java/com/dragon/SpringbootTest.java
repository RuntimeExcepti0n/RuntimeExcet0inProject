package com.dragon;


import com.dragon.entity.HotelOrderInfo;
import com.dragon.entity.TripPerson;
import com.dragon.mapper.HotelOrderInfoMapper;
import com.dragon.util.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * SpringBoot单元测试;
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTest {


    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloService02");
        System.out.println(b);
    }

    @Autowired
    private HotelOrderInfoMapper hotelOrderInfoMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<HotelOrderInfo> userList = hotelOrderInfoMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * AR active record
     */
    @Test
    public void testModel(){
        TripPerson tripPerson = new TripPerson();
        tripPerson.setBillNo("122");
        tripPerson.setId(UUIDUtil.getUUIDWithoutDash());
        tripPerson.setPersonName("王小二");
        tripPerson.insert();

    }

}