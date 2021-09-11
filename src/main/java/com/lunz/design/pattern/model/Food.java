package com.lunz.design.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 食品实体
 * @Author: dev_tct
 * @CreateDate: 2021/9/12
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    /**
     * 食物名称
     */
    private String name;

    /**
     * 加辣
     * @param spicyLevel
     */
    public void addSpicy(String spicyLevel){
    }

    /**
     * 加配料
     * @param condimentName
     */
    public void addCondiment(String condimentName){

    }


}
