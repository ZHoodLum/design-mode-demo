package com.springmvc.compositeentitypattern.entity;

/**
 * @author：ZDY
 * @Date：Created in 2020/12/13
 * @Description:创建组合实体。
 */


public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
