package com.ocbc.design.factory.simple.service;

import com.ocbc.design.factory.simple.CarFactory;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 15:45
 */
public class BBAFactory implements CarFactory {
    @Override
    public void make() {
        System.out.println("This is BBA factory");
    }
}
