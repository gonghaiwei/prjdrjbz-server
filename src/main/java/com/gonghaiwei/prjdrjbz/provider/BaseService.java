package com.gonghaiwei.prjdrjbz.provider;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class BaseService implements ApplicationContextAware {

  protected static ApplicationContext appCtx;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    appCtx = applicationContext;
  }

  public <T> T getBean(Class<T> beanClass) {
    T bean = null;
    try {
      bean = appCtx.getBean(beanClass);
    } catch (NoSuchBeanDefinitionException e) {
      throw new IllegalStateException(String.format("没有找到bean:%s", beanClass.getName()));
    }
    return bean;
  }
}
