package com.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/11/23 16:27
 */

public class TestBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            context.getClassLoader().loadClass("a.com.bean.TestBean1");
            return true;
        } catch (Exception e) {
//            e.printStackTrace();
            return false;
        }
    }
}
