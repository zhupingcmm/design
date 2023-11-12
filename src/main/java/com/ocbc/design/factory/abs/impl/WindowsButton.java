package com.ocbc.design.factory.abs.impl;

import com.ocbc.design.factory.abs.Button;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 17:09
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("windows button");
    }
}
