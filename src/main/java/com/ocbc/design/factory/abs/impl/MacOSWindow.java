package com.ocbc.design.factory.abs.impl;

import com.ocbc.design.factory.abs.Window;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 17:09
 */
public class MacOSWindow implements Window {
    @Override
    public void render() {
        System.out.println("MAC OS window ");
    }
}
