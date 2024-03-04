package org.apache.dubbo.demo.provider.activate;

import org.apache.dubbo.common.extension.SPI;

@SPI("mineName")
public interface ActivateI {
    String echo(String msg);
}
