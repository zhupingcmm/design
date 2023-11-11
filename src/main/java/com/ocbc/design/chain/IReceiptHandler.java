package com.ocbc.design.chain;

import com.ocbc.design.strategy.model.Receipt;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 19:55
 */
public interface IReceiptHandler {

    void handleReceipt(Receipt receipt, IReceiptHandleChain handleChain);
}
