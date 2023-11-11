package com.ocbc.design.strategy;

import com.ocbc.design.strategy.service.IReceiptHandleStrategy;
import com.ocbc.design.strategy.service.impl.Mt2010ReceiptHandleStrategy;
import com.ocbc.design.strategy.service.impl.Mt8104ReceiptHandleStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 18:51
 */
public class ReceiptHandleStrategyFactory {

    private static final Map<String, IReceiptHandleStrategy> receiptHandleStrategyMap = new HashMap<>();

    /**
     * 初始化 策略对象
     */
    private ReceiptHandleStrategyFactory () {
        receiptHandleStrategyMap.put("MT2101",  new Mt2010ReceiptHandleStrategy());
        receiptHandleStrategyMap.put("MT8104", new Mt8104ReceiptHandleStrategy());
    }

    /**
     *  工厂模式，根据策略对象类型 获取策略对象
     * @param receiptType
     * @return
     */
    public static IReceiptHandleStrategy getReceiptHandleStrategy(String receiptType) {
      return receiptHandleStrategyMap.get(receiptType);
    }
}
