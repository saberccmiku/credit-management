package com.saber.credit.mapper;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 * 所有mapper层对象可以继承该抽象接口实现基本的增删改操作
 */
public interface BaseMapper<T> {
    /**
     * 查询所有数据
     * @return 所有数据的集合
     */
    List<T> query();
    /**
     * @param page page表示当前页数
     * @param limit limit表示用户设置的每页显示多少条数据
     * @return 对象集合
     */
    List<T> query(Integer page, Integer limit);
    /**
     * 通过id查询数据
     * @return 该id对应的数据
     */
    T queryById(String id);
    /**
     * 通过id删除数据
     */
    void deleteById(String id);
    /**
     * 通过id修改数据
     * @param id 该id对应的数据
     */
    void updateById(String id);
}
