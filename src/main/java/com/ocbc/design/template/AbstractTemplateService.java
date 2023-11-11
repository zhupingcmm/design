package com.ocbc.design.template;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 21:02
 */
public abstract class AbstractTemplateService implements TemplateService{
    public void templateMethod(){
        step1();
        step2();
        step3();

    }
    @Override
    public void step3() {
        System.out.println("stop3 default implementation");
    }
}
