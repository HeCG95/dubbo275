package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.AdaptiveClassCodeGenerator;
import org.apache.dubbo.registry.RegistryFactory;

public class AdaptivePrint {

    public static void main(String[] args) {

        AdaptiveClassCodeGenerator generator =
                new AdaptiveClassCodeGenerator(RegistryFactory.class, "protocol");
        System.out.println(generator.generate());

    }

}
