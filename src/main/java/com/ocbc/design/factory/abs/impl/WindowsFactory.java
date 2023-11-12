package com.ocbc.design.factory.abs.impl;

import com.ocbc.design.factory.abs.Button;
import com.ocbc.design.factory.abs.GUIFactory;
import com.ocbc.design.factory.abs.Window;

/**
 * @Author: pzhu
 * @Date: 2023/11/12 17:11
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
