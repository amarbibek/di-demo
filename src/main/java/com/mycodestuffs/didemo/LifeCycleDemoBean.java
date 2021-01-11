package com.mycodestuffs.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("from BeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("From setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("From Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("From afterPropsSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("From setAppCtx");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("from postconstruct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("from preDestroy");
    }
    public void beforeInit(){
        System.out.println("from beforeInit");
    }
    public void afterInit(){
        System.out.println("from afterInit");
    }
}
