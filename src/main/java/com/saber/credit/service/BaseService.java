package com.saber.credit.service;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public interface BaseService<T> {

     List<T> query() ;

     T queryById() ;

     void deleteById();

     void updateById();

}
