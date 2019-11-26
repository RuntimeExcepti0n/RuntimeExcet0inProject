package com.dragon.service;

import com.dragon.entity.TripBase;

import java.util.List;

public interface  TripRefundService {

    void saveTripBase(TripBase tripBase);

    List<TripBase> selectTripBase(TripBase tripBase);

    Object getById(String id);
}
