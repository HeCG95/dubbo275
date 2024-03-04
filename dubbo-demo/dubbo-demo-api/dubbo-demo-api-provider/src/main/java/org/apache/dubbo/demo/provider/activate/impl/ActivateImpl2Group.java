package org.apache.dubbo.demo.provider.activate.impl;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.demo.provider.activate.ActivateI;

@Activate(group = {"group1", "group2"})
public class ActivateImpl2Group implements ActivateI {
    @Override
    public String echo(String msg) {
        return "group1";
    }
}
