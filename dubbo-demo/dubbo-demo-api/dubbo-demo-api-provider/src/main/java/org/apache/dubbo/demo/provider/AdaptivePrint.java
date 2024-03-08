package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.AdaptiveClassCodeGenerator;
import org.apache.dubbo.common.serialize.Serialization;
import org.apache.dubbo.common.threadpool.ThreadPool;
import org.apache.dubbo.registry.RegistryFactory;
import org.apache.dubbo.remoting.Dispatcher;
import org.apache.dubbo.remoting.exchange.Exchanger;
import org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.ProxyFactory;

public class AdaptivePrint {

    public static void main(String[] args) {

        AdaptiveClassCodeGenerator generator =
//                new AdaptiveClassCodeGenerator(RegistryFactory.class, "dubbo");
//                new AdaptiveClassCodeGenerator(Protocol.class, "dubbo");
//                new AdaptiveClassCodeGenerator(ZookeeperTransporter.class, "curator");
//                new AdaptiveClassCodeGenerator(Serialization.class, "hessian2");
//                new AdaptiveClassCodeGenerator(ThreadPool.class, "fixed");
//                new AdaptiveClassCodeGenerator(Dispatcher.class, "all");
//                new AdaptiveClassCodeGenerator(Exchanger.class, "header");
                new AdaptiveClassCodeGenerator(ProxyFactory.class, "javassist");
        System.out.println(generator.generate());

    }

}
