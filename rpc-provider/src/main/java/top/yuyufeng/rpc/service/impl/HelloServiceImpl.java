package top.yuyufeng.rpc.service.impl;

import top.yuyufeng.rpc.service.HelloService;

/**
 * created by yuyufeng on 2017/8/18.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String words) {
        System.out.println("hello:" + words);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello:" + words;
    }
}
