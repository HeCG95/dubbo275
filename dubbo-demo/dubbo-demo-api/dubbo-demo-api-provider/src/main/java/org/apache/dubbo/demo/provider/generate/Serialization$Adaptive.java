package org.apache.dubbo.demo.provider.generate;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.serialize.Serialization;

public class Serialization$Adaptive implements org.apache.dubbo.common.serialize.Serialization {
    public java.lang.String getContentType()  {
        throw new UnsupportedOperationException("The method public abstract java.lang.String org.apache.dubbo.common.serialize.Serialization.getContentType() of interface org.apache.dubbo.common.serialize.Serialization is not adaptive method!");
    }

    public org.apache.dubbo.common.serialize.ObjectInput deserialize(org.apache.dubbo.common.URL arg0, java.io.InputStream arg1) throws java.io.IOException {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;

        String extName = url.getParameter("serialization", "hessian2");

        if(extName == null) throw new IllegalStateException("Failed to get extension (org.apache.dubbo.common.serialize.Serialization) name from url (" + url.toString() + ") use keys([serialization])");

        Serialization extension = ExtensionLoader
                .getExtensionLoader(Serialization.class).getExtension(extName);
        return extension.deserialize(arg0, arg1);
    }
    public byte getContentTypeId()  {
        throw new UnsupportedOperationException("The method public abstract byte org.apache.dubbo.common.serialize.Serialization.getContentTypeId() of interface org.apache.dubbo.common.serialize.Serialization is not adaptive method!");
    }

    public org.apache.dubbo.common.serialize.ObjectOutput serialize(org.apache.dubbo.common.URL arg0, java.io.OutputStream arg1) throws java.io.IOException {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;

        String extName = url.getParameter("serialization", "hessian2");

        if(extName == null) throw new IllegalStateException("Failed to get extension (org.apache.dubbo.common.serialize.Serialization) name from url (" + url.toString() + ") use keys([serialization])");

        Serialization extension = ExtensionLoader
                .getExtensionLoader(Serialization.class).getExtension(extName);
        return extension.serialize(arg0, arg1);
    }

}
