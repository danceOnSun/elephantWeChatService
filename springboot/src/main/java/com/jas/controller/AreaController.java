package com.jas.controller;

import com.jas.domain.Area;
import com.jas.service.AreaService;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;


/**
 * @author xiangle.yu
 * @create 2018-06-01 15:39
 **/
@Slf4j
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    
    @Autowired
    private AreaService areaService;
    private final static Logger logger = LoggerFactory.getLogger(AreaController.class);

    @GetMapping(value = "/listarea")
    public Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> list = areaService.getAreaList();
        Date date=new Date();
        modelMap.put("areaList", list);
        logger.info(date+":xiangle.yu log test01");
        return modelMap;
    }
    
    @GetMapping("/getarea")
    public Map<String, Object> getAreaByAreaId(Integer areaId){
        Map<String, Object> modelMap = new HashMap<>();
        Area area = areaService.getAreaByAreaId(areaId);
        
        modelMap.put("area", area);
        
        return modelMap;
    }
    
    @PostMapping("/addarea")
    public Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.addArea(area));
        
        return modelMap;
    }

    @PostMapping("/modifyarea")
    public Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.modifyArea(area));

        return modelMap;
    }
    
    @GetMapping("/delarea")
    public Map<String, Object> deleteArea(Integer areaId){
        System.out.println(areaId);
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.deleteArea(areaId));

        return modelMap;
    } 
    
}
