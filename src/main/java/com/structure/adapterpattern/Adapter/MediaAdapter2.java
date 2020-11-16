package com.structure.adapterpattern.Adapter;

import com.create.factorypattern.service.FactoryInterfaceService;
import com.create.factorypattern.service.impl.CreateServiceImpl;
import com.create.factorypattern.service.impl.DeleteServiceImpl;
import com.create.factorypattern.service.impl.ReadServiceImpl;
import com.create.factorypattern.service.impl.UpdateServiceImpl;
import com.structure.adapterpattern.service.AdvancedMediaPlayerService;
import com.structure.adapterpattern.service.impl.MP4PlayerServicecImpl;
import com.structure.adapterpattern.service.impl.VlcPlayerServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/16
 * @Description:
 */


public class MediaAdapter2 {
    public AdvancedMediaPlayerService getInterface(String shapeType){
        if(shapeType == null){
            return null;
        }

        switch (shapeType) {
            case "mp4": return new MP4PlayerServicecImpl();
            case "vlc": return new VlcPlayerServiceImpl();
        }
        return null;
    }
}
