package com.saber.credit.mapper;

import com.saber.credit.entities.BaseBean;
import com.saber.credit.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 * 所有mapper层对象可以继承该抽象接口实现基本的增删改操作
 */
@Repository
public interface BaseMapper<T> {
    /**
     * 查询所有数据
     * @return 所有数据的集合
     */
    List<T> query();
    /**
     * 通过id查询数据
     * @return 该id对应的数据
     */
    T queryById(String id);
    /**
     * 通过id删除数据
     */
    void delete(String id);
    /**
     * 通过id修改数据
     * @param t 对应的数据
     */
    void update(T t);

    /**
     * 插入数据
     * @param t 对象
     */
    void insert(T t);
}
