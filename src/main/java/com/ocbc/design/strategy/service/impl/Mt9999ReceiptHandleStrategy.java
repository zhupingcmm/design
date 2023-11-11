package com.ocbc.design.strategy.service.impl;

import com.ocbc.design.strategy.model.Receipt;
import com.ocbc.design.strategy.service.IReceiptHandleStrategy;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:49
 */
public class Mt9999ReceiptHandleStrategy implements IReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT9999:" + receipt.getMessage());
    }

}