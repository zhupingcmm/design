package com.ocbc.design.chain.impl;

import com.ocbc.design.chain.IReceiptHandleChain;
import com.ocbc.design.chain.IReceiptHandler;
import com.ocbc.design.strategy.model.Receipt;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 20:00
 */
public class Mt2101ReceiptHandler implements IReceiptHandler {

    @Override
    public void handleReceipt(Receipt receipt, IReceiptHandleChain handleChain) {
        if ("MT2101".equals(receipt.getType())) {
            System.out.println("解析报文MT2101:" + receipt.getMessage());
        }
        //处理不了该回执就往下传递
        else {
            handleChain.handleReceipt(receipt);
        }
    }
}