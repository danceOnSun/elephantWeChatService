package com.jas.mapper;

import com.jas.domain.Area;

import java.util.List;

/**
 * @author xiangle.yu
 * @create 2018-06-01 15:39
 **/
public interface AreaMapper {
    /**
     * 列出区域信息
     * 
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据查询某一个区域信息
     * 
     * @param id
     * @return
     */
    Area queryAreaById(Integer id);

    /**
     * 插入一个区域信息
     * 
     * @param area 区域
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * 
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除某一个区域信息
     * 
     * @param id
     * @return
     */
    int deleteAreaById(Integer id);
}
