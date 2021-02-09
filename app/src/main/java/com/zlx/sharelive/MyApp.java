package com.zlx.sharelive;

import com.zlx.module_base.BaseApplication;
import com.zlx.module_base.config.ModuleLifecycleConfig;
import com.zlx.module_network.util.LogUtil;


/**
 * @date: 2019\3\8 0008
 * @author: zlx
 * @email: 1170762202@qq.com
 * @description:
 */
public class MyApp extends BaseApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.show("11111提交");
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }




}
