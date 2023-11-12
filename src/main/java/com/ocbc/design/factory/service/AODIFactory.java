package com.ocbc.design.factory.service;

import com.ocbc.design.factory.CarFactory;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 15:45
 */
public class AODIFactory implements CarFactory {
    @Override
    public void make() {
        System.out.println("this is aodi factory");
    }
}
