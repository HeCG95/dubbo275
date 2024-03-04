package org.apache.dubbo.demo.provider.activate.impl;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.demo.provider.activate.ActivateI;

@Activate(group = {"default_group"})
public class ActivateImpl1 implements ActivateI {
    @Override
    public String echo(String msg) {
        return "Impl1";
    }
}
