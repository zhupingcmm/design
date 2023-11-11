package com.ocbc.design.template;

import com.ocbc.design.template.impl.TemplateServiceImpl;

/**
 * @Author: pzhu
 * @Date: 2023/11/11 21:05
 */
public class Client {
    public static void main(String[] args) {
        TemplateService templateService = new TemplateServiceImpl();
        templateService.templateMethod();
    }
}
