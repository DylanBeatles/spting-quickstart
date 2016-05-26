/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.spting_quickstart.knight;

import com.spring.study.spting_quickstart.quest.Quest;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: SlayDragonKnight.java, v 0.1 May 25, 2016 2:59:28 PM wb-zhanglu.y Exp $
 */
public class SlayDragonKnight implements Knight {
    private Quest quest;

    /**
     * @param quest
     */
    public SlayDragonKnight(Quest quest) {
        super();
        this.quest = quest;
    }

    /** 
     * @see com.spring.study.spting_quickstart.knight.Knight#fight()
     */
    public void fight() {
        System.out.println(this.quest.embark());
    }

    /**
     * Getter method for property <tt>quest</tt>.
     * 
     * @return property value of quest
     */
    public Quest getQuest() {
        return quest;
    }

    /**
     * Setter method for property <tt>quest</tt>.
     * 
     * @param quest value to be assigned to property quest
     */
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

}
