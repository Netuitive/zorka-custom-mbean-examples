package com.netuitive.mbean;

import java.util.Random;

/**
 *
 * @author john.king
 */
public class Test implements TestMBean{

    Long x;
    Long y;
    Random r = new Random();

    public Test(Long x, Long y) {
        this.x = x;
        this.y = y;
    }
    
    //return random long in range
    @Override
    public Long getTestValue() {
        return x+((long)(r.nextDouble()*(y-x)));
    }

}
