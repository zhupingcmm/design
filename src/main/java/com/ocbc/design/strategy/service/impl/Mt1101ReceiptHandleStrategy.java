package com.ocbc.design.strategy.service.impl;

import com.ocbc.design.strategy.model.Receipt;
import com.ocbc.design.strategy.service.IReceiptHandleStrategy;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:48
 */
public class Mt1101ReceiptHandleStrategy implements IReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT1101:" + receipt.getMessage());
    }

}
