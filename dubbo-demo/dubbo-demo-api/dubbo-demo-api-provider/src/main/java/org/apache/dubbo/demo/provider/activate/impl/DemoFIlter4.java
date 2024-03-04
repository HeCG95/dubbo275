package org.apache.dubbo.demo.provider.activate.impl;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.demo.provider.activate.ActivateI;

@Activate(group = "Provider", order = 3)
public class DemoFIlter4 implements ActivateI {
    @Override
    public String echo(String msg) {
        return null;
    }
}
