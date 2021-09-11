package com.lunz.design.pattern.simplefactory;

import com.lunz.design.pattern.model.Food;
import com.lunz.design.pattern.model.HuangMenChicken;
import com.lunz.design.pattern.model.LanZhouNoodle;

/**
 * @Description: 简单工厂模式
 * @Author: dev_tct
 * @CreateDate: 2021/9/12
 * @Version: 1.0
 */
public class SimpleFactory {
    public static Food makeFood(String name) {
        if (name.equals("noodle")) {
            Food noodle = new LanZhouNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if (name.equals("chicken")) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }
}
