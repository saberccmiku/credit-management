package com.saber.credit.service;

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
      * 查询符合条件的所有数据
      * @return 所有数据的集合
      */
     List<T> query(T t);
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
