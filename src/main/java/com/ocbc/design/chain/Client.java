package com.ocbc.design.chain;

import com.ocbc.design.chain.impl.ReceiptHandleChain;
import com.ocbc.design.strategy.ReceiptBuilder;
import com.ocbc.design.strategy.model.Receipt;

import java.util.List;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 20:06
 */
public class Client {
    public static void main(String[] args) {
        List<Receipt> receipts = ReceiptBuilder.generateReceiptList();
        for (Receipt receipt : receipts) {
            ReceiptHandleChain receiptHandleChain = new ReceiptHandleChain();
            receiptHandleChain.handleReceipt(receipt);
        }
    }
}
