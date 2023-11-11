package com.ocbc.design.chain;

import com.ocbc.design.chain.impl.Mt2101ReceiptHandler;
import com.ocbc.design.chain.impl.Mt8104ReceiptHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 20:03
 */
public class ReceiptHandlerContainer {

    private ReceiptHandlerContainer(){}

    public static List<IReceiptHandler> getReceiptHandlerList(){
        List<IReceiptHandler> receiptHandlerList = new ArrayList<>();
        receiptHandlerList.add(new Mt2101ReceiptHandler());
        receiptHandlerList.add(new Mt8104ReceiptHandler());
        return receiptHandlerList;
    }
}
