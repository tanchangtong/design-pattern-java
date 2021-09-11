package com.lunz.design.pattern.test;

import com.lunz.design.pattern.model.Food;
import com.lunz.design.pattern.simplefactory.SimpleFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Description: 单元测试
 * @Author: dev_tct
 * @CreateDate: 2021/9/12
 * @Version: 1.0
 */
@Slf4j
public class DesignPatternTest {

    @Test
    public void SimpleFactoryTest(){
        Food noodle = SimpleFactory.makeFood("noodle");
        log.info("{}",noodle);

        Food chicken = SimpleFactory.makeFood("chicken");
        log.info("{}",chicken);
    }
}
