package org.apache.dubbo.demo.provider.activate;

import org.apache.dubbo.common.URL;

import java.util.List;

import static org.apache.dubbo.common.constants.CommonConstants.GROUP_KEY;
import static org.apache.dubbo.common.extension.ExtensionLoader.getExtensionLoader;

public class ActivateDemo {

    public static void main(String[] args) {

        ActivateDemo demo = new ActivateDemo();
//        demo.testActivate();
        demo.testRule();

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

    }

    private void testRule(){
        URL url = URL.valueOf("test://localhost/test");
        url = url.addParameter(GROUP_KEY, "Provider");

        // 没有出现在values配置中的，即为默认激活的扩展实现
        // 通过"-"开头的配置明确指定不激活的扩展实现，直接就忽略
        List<ActivateI> list = getExtensionLoader(ActivateI.class)
                .getActivateExtension(url, new String[]{
                                "demoFilter3", "-demoFilter2", "default", "demoFilter1"},
                        "Provider");
        System.out.println(">>>>> group size: "+list.size());
    }

    private void testActivate(){
        URL url = URL.valueOf("test://localhost/test");
        List<ActivateI> list = getExtensionLoader(ActivateI.class)
                .getActivateExtension(url, new String[]{}, "default_group");
        System.out.println(">>>>> size: "+list.size());

        System.out.println(">>>>> default name: "+getExtensionLoader(ActivateI.class).getDefaultExtensionName());

        url = url.addParameter(GROUP_KEY, "group1");
        list = getExtensionLoader(ActivateI.class)
                .getActivateExtension(url, new String[]{}, "group1");
        System.out.println(">>>>> group size: "+list.size());
    }

}
