package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class SpiTest {

    public static void main(String[] args) {

        SpiTest test = new SpiTest();
        test.loadDubboProtocol();

    }

    private void loadDubboProtocol(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class)
                .getExtension("dubbo");
        System.out.println(protocol);
    }

}