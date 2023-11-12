package com.ocbc.design.factory.abs.impl;

import com.ocbc.design.factory.abs.Button;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 17:10
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("macOS button");
    }
}
