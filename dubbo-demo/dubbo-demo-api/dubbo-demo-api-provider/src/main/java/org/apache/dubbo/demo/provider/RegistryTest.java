package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.registry.RegistryFactory;

public class RegistryTest {

    public static void main(String[] args) {

        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(
                RegistryFactory.class)
                .getExtension("dubbo");
        System.out.println(registryFactory);

    }

}
