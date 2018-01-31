package com.example.demo;

import com.netflix.appinfo.InstanceInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class EurekaStateChangeListener {
    private  final Logger log = LoggerFactory.getLogger(EurekaStateChangeListener.class);
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        //服务销毁事件
        log.info("服务名为"+event.getAppName()+"端口号为"+event.getServerId()+"的服务销毁了-------------------------------");
    }
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        //服务注册事件
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.out.println(instanceInfo);
        log.info("服务名为"+instanceInfo.getAppName()+"端口号为"+instanceInfo.getId()+"的服务注册了-------------------------------");
    }
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        //服务续约事件
        event.getAppName();
        event.getServerId();
        //log.info("服务续约-------------------------------");
        log.info("服务名为"+event.getAppName()+"端口号为"+event.getServerId()+"的服务续约了-------------------------------");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        //启动事件
        log.info("服务启动-------------------------------");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        //注册中心启动事件
        log.info("注册中心启动-------------------------------");
    }

}
