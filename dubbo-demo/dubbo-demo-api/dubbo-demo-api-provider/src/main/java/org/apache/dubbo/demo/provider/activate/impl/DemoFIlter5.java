package org.apache.dubbo.demo.provider.activate.impl;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.demo.provider.activate.ActivateI;

@Activate(group = "Consumer", order = 2)
public class DemoFIlter5 implements ActivateI {
    @Override
    public String echo(String msg) {
        return null;
    }
}
