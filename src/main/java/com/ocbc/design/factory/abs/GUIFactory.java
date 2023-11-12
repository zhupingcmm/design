package com.ocbc.design.factory.abs;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 17:10
 */
public interface GUIFactory {

    Button createButton();

    Window createWindow();
}
