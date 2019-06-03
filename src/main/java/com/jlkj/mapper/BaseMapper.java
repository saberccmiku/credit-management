package com.jlkj.mapper;

import java.util.List;

/**
 * Created by saber on 2019/6/3
 */
public interface BaseMapper<T> {
    List<T> query();
    T queryById();
}
