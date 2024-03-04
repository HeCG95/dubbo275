package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.ExtensionFactory;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class SpiTest {

    public static void main(String[] args) {

        SpiTest test = new SpiTest();
        test.loadDubboProtocol();
//        test.loadExtensionFactory();


    }

    private void loadDubboProtocol(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class)
                .getExtension("dubbo");
//                .getAdaptiveExtension();
        System.out.println(protocol);
    }

    private void loadExtensionFactory(){
        ExtensionFactory extensionFactory = ExtensionLoader.getExtensionLoader(ExtensionFactory.class)
                .getAdaptiveExtension();
        System.out.println(extensionFactory);
    }

}
