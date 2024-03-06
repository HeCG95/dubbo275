package org.apache.dubbo.demo.provider.generate;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.registry.RegistryFactory;

public class RegistryFactory$Adaptive implements RegistryFactory {
    public org.apache.dubbo.registry.Registry getRegistry(org.apache.dubbo.common.URL arg0) {

        if (arg0 == null) throw new IllegalArgumentException("url == null");

        org.apache.dubbo.common.URL url = arg0;

        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());

        if (extName == null)
            throw new IllegalStateException("Failed to get extension ll(org.apache.dubbo.registry.RegistryFactory) name from url (" + url.toString() + ") use keys([protocol])");

        RegistryFactory extension = ExtensionLoader.getExtensionLoader(RegistryFactory.class)
                .getExtension(extName);
        return extension.getRegistry(arg0);
    }
}
