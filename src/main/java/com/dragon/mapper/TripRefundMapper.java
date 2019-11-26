package com.dragon.mapper;

import com.dragon.entity.TripBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TripRefundMapper {

    void saveTripBase(TripBase tripBase);

    List<TripBase> selectTripBase(TripBase tripBase);

    @Update({"${id}"})
    void getById(@Param("id") String id);
}
