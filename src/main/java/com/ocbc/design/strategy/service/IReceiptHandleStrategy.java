package com.ocbc.design.strategy.service;

import com.ocbc.design.strategy.model.Receipt;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:07
 */
public interface IReceiptHandleStrategy {

    void handleReceipt(Receipt receipt);
}
