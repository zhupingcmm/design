package com.ocbc.design.template.impl;

import com.ocbc.design.template.AbstractTemplateService;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 21:04
 */
public class TemplateServiceImpl extends AbstractTemplateService {
    @Override
    public void step1() {
        System.out.println("AbstractTemplateService step 1");
    }

    @Override
    public void step2() {
        System.out.println("AbstractTemplateService step 2");
    }
}
