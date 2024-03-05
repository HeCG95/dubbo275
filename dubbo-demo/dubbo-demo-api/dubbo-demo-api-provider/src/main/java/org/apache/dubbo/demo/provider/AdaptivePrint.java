package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.AdaptiveClassCodeGenerator;
import org.apache.dubbo.common.serialize.Serialization;
import org.apache.dubbo.registry.RegistryFactory;
import org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter;
import org.apache.dubbo.rpc.Protocol;

public class AdaptivePrint {

    public static void main(String[] args) {

        AdaptiveClassCodeGenerator generator =
//                new AdaptiveClassCodeGenerator(RegistryFactory.class, "dubbo");
//                new AdaptiveClassCodeGenerator(Protocol.class, "dubbo");
//                new AdaptiveClassCodeGenerator(ZookeeperTransporter.class, "curator");
                new AdaptiveClassCodeGenerator(Serialization.class, "hessian2");
        System.out.println(generator.generate());

    }

}
