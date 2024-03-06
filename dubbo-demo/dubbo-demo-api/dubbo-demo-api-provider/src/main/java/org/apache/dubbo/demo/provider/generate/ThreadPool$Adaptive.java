package org.apache.dubbo.demo.provider.generate;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.threadpool.ThreadPool;

public class ThreadPool$Adaptive implements org.apache.dubbo.common.threadpool.ThreadPool {
    public java.util.concurrent.Executor getExecutor(org.apache.dubbo.common.URL arg0)  {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;

        String extName = url.getParameter("threadpool", "fixed");

        if(extName == null) throw new IllegalStateException("Failed to get extension (org.apache.dubbo.common.threadpool.ThreadPool) name from url (" + url.toString() + ") use keys([threadpool])");

        ThreadPool extension = ExtensionLoader
                .getExtensionLoader(ThreadPool.class).getExtension(extName);
        return extension.getExecutor(arg0);
    }

}
