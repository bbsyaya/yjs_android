package com.cy.yigym.net.rsp;

import com.cy.wbs.RspBase;

/**
 * Created by ejianshen on 15/8/10.
 */
public class RspGetChaseRecord extends RspBase {

    public Data data=new Data();
    public class Data{
        public String my_fid="";
        public String another_fid="";
        public ChaseRecord chaseRecord=new ChaseRecord();
    }
    public class ChaseRecord{
        public String _id="";
        public double real_apart_distance=0;
        public double receiver_calorie=0;
        public double receiver_distance=0;
        public String receiver_id="";
        public double receiver_time=0;
        public double sender_calorie=0;
        public double sender_distance=0;
        public String sender_id="";
        public double sender_time=0;
        public double total_apart_distance=0;
    }
}
