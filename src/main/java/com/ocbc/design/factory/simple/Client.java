package com.ocbc.design.factory.simple;

import com.ocbc.design.factory.service.AODIFactory;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 15:47
 */
public class Client {
    public static void main(String[] args) {
        AODIFactory aodiFactory = (AODIFactory) SimpleFactory.getCarFactory("AODI");
        aodiFactory.make();
    }
}
