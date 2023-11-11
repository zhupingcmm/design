package com.ocbc.design.chain.impl;

import com.ocbc.design.chain.IReceiptHandleChain;
import com.ocbc.design.chain.IReceiptHandler;
import com.ocbc.design.chain.ReceiptHandlerContainer;
import com.ocbc.design.strategy.model.Receipt;

import java.util.List;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 19:57
 */
public class ReceiptHandleChain implements IReceiptHandleChain {
    // 记录当前处理者的位置
    private int index = 0;

    private static List<IReceiptHandler> receiptHandlerList;
    
    static {
        //从容器中获取处理器对象
        receiptHandlerList = ReceiptHandlerContainer.getReceiptHandlerList();
    }
    @Override
    public void handleReceipt(Receipt receipt) {
        if (receiptHandlerList != null && receiptHandlerList.size() >0 && (index != receiptHandlerList.size())) {
                IReceiptHandler receiptHandler = receiptHandlerList.get(index++);
                receiptHandler.handleReceipt(receipt,this);
        }

    }
}
