package com.ocbc.design.strategy;

import com.ocbc.design.strategy.model.Receipt;
import com.ocbc.design.strategy.service.IReceiptHandleStrategy;

import java.util.List;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:09
 */
public class Client {

    public static void main(String[] args) {


        List
                <Receipt> receipts = ReceiptBuilder.generateReceiptList();

        ReceiptStrategyContext context = new ReceiptStrategyContext();
        for (Receipt receipt : receipts) {
            IReceiptHandleStrategy receiptHandleStrategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            context.setReceiptHandleStrategy(receiptHandleStrategy);
            context.handleReceipt(receipt);
        }

    }


}








