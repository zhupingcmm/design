package com.ocbc.design.strategy;

import com.ocbc.design.strategy.model.Receipt;
import com.ocbc.design.strategy.service.IReceiptHandleStrategy;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:50
 */
public class ReceiptStrategyContext {


    private IReceiptHandleStrategy receiptHandleStrategy;

    /**
     * 在 上下文中设置策略的 对象
     */
    public void setReceiptHandleStrategy(IReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    /**
     * 通过 上下文执行 策略对象的处理方法
     * 如果策略对象为 null，将不会执行任何处理
     * @param receipt
     */
    public void handleReceipt(Receipt receipt) {
        if (receiptHandleStrategy != null) {
            receiptHandleStrategy.handleReceipt(receipt);
        }
    }
}
