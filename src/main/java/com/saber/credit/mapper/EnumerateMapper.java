package com.saber.credit.mapper;

import com.saber.credit.entities.Enumerate;
import com.saber.credit.entities.EnumerateItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by saber on 2019/6/12.
 * 枚举
 */

@Repository
public interface EnumerateMapper extends BaseMapper<Enumerate> {

    /**
     * 根据枚举编号查询枚举类
     * @param code 枚举编号
     * @return Enumerate
     */
    Enumerate queryByCode(String code);

    /**
     * 根据枚举父类编号查询父类下的所有枚举
     * @param pCode 枚举父类编号
     * @return Enumerate
     */
    List<EnumerateItem>  queryByPCode(String pCode);

}
