package com.gonghaiwei.prjdrjbz.provider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Target({
    ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Transactional(value = "transactionManager", propagation = Propagation.REQUIRED,
    rollbackFor = Exception.class)
public @interface CommonTX {

}
