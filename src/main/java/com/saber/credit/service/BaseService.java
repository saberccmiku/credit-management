package com.saber.credit.service;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public interface BaseService<T> {

     List<T> query() ;

     List<T> query(Integer page, Integer limit);

     T queryById(String id) ;

     void deleteById(String id);

     void updateById(String id);

}
