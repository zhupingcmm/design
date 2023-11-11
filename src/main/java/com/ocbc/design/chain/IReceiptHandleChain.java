package com.ocbc.design.chain;

import com.ocbc.design.strategy.model.Receipt;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 19:56
 */
public interface IReceiptHandleChain {
    void handleReceipt(Receipt receipt);
}
