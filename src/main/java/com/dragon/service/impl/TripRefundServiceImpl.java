package com.dragon.service.impl;

import com.dragon.entity.TripBase;
import com.dragon.service.TripRefundService;
import com.dragon.mapper.TripRefundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripRefundServiceImpl implements TripRefundService {

    @Autowired
    private TripRefundMapper refundMapper;

    @Override
    public void saveTripBase(TripBase tripBase) {
        refundMapper.saveTripBase(tripBase);
    }

    @Override
    public List<TripBase> selectTripBase(TripBase tripBase) {
        List<TripBase> tripBases = refundMapper.selectTripBase(tripBase);
        return tripBases;
    }

    @Override
    public Object getById(String id) {
         refundMapper.getById(id);
        return null;
    }
}
