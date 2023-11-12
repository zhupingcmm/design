package com.ocbc.design.factory.abs.impl;

import com.ocbc.design.factory.abs.Window;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 17:08
 */
public class WindowsWindow implements Window {
    @Override
    public void render() {
        System.out.println("Windows window ");
    }
}
