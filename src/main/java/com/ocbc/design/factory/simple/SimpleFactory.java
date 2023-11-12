package com.ocbc.design.factory.simple;

import com.ocbc.design.factory.simple.service.AODIFactory;
import com.ocbc.design.factory.simple.service.BBAFactory;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 15:41
 */
public class SimpleFactory {

    public static CarFactory getCarFactory(String type) {

        CarFactory carFactory = null;
        if ("BBA".equals(type)) {
            carFactory = new BBAFactory();
        } else if ("AODI".equals(type)) {
            carFactory = new AODIFactory();
        }

        return carFactory;
    }
}
