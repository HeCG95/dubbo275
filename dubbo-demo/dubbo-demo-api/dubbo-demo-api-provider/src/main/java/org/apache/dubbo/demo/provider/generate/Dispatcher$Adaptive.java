package org.apache.dubbo.demo.provider.generate;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.remoting.Dispatcher;

public class Dispatcher$Adaptive implements org.apache.dubbo.remoting.Dispatcher {

    public org.apache.dubbo.remoting.ChannelHandler dispatch(org.apache.dubbo.remoting.ChannelHandler arg0, org.apache.dubbo.common.URL arg1) {
        if (arg1 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg1;

        String extName = url.getParameter("dispatcher", url.getParameter("dispather", url.getParameter("channel.handler", "all")));

        if (extName == null)
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.remoting.Dispatcher) name from url (" + url.toString() + ") use keys([dispatcher, dispather, channel.handler])");

        Dispatcher extension = (org.apache.dubbo.remoting.Dispatcher) ExtensionLoader.getExtensionLoader(org.apache.dubbo.remoting.Dispatcher.class).getExtension(extName);
        return extension.dispatch(arg0, arg1);
    }

}