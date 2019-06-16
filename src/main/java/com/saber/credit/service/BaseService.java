package com.saber.credit.service;

import com.saber.credit.entities.BaseBean;
import com.saber.credit.entities.User;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public interface BaseService<T> {

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
