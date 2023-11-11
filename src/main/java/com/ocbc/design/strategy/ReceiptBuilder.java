package com.ocbc.design.strategy;

import com.ocbc.design.strategy.model.Receipt;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:59
 */
public class ReceiptBuilder {
    public static List<Receipt>  generateReceiptList() {
        List<Receipt> receiptList = new ArrayList<>();
        receiptList.add(new Receipt("我是MT2101回执喔","MT2101"));
        receiptList.add(new Receipt("我是MT1101回执喔","MT1101"));
        receiptList.add(new Receipt("我是MT8104回执喔","MT8104"));
        receiptList.add(new Receipt("我是MT9999回执喔","MT9999"));
        return receiptList;
    }
}
