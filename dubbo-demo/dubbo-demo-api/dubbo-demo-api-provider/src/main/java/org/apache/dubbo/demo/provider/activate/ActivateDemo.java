package org.apache.dubbo.demo.provider.activate;

import org.apache.dubbo.common.URL;

import java.util.List;

import static org.apache.dubbo.common.extension.ExtensionLoader.getExtensionLoader;

public class ActivateDemo {

    public static void main(String[] args) {

        /*FilterImpl1 f1 = new FilterImpl1();
        FilterImpl2 f2 = new FilterImpl2();
        FilterImpl3 f3 = new FilterImpl3();
        FilterImpl4 f4 = new FilterImpl4();
        FilterImpl5 f5 = new FilterImpl5();

        List<IFilter> filters = new ArrayList<>();
        filters.add(f1);
        filters.add(f2);
        filters.add(f3);
        filters.add(f4);
        filters.add(f5);

        Collections.sort(filters, ActivateComparator.COMPARATOR);*/

        URL url = URL.valueOf("test://localhost/test");
        List<ActivateI> list = getExtensionLoader(ActivateI.class)
                .getActivateExtension(url, new String[]{}, "default_group");
        System.out.println(">>>>> size: "+list.size());

        System.out.println(">>>>> default name: "+getExtensionLoader(ActivateI.class).getDefaultExtensionName());

    }

}
