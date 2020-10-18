package com.mashibing;

/**
 * @author: 马士兵教育
 * @create: 2019-09-21 16:33
 */
public  class   FanXingInterfaceSub implements FanXingInterface<String> {


    @Override
    public String test() {
        return new String();
    }

    @Override
    public void test2(String string) {
        System.out.println(string);
    }
}
