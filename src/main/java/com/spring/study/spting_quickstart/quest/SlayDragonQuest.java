/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.spting_quickstart.quest;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: SlayDragonQuest.java, v 0.1 May 25, 2016 2:58:35 PM wb-zhanglu.y Exp $
 */
public class SlayDragonQuest implements Quest {

    /** 
     * @see com.spring.study.spting_quickstart.quest.Quest#embark()
     */
    public String embark() {
        return "i killed the dragon";
    }

}
