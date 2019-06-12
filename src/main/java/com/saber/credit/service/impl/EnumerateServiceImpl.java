package com.saber.credit.service.impl;

import com.saber.credit.entities.Enumerate;
import com.saber.credit.entities.EnumerateItem;
import com.saber.credit.mapper.EnumerateMapper;
import com.saber.credit.service.EnumerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by saber on 2019/6/12.
 * 枚举
 */
@Service
public class EnumerateServiceImpl extends BaseServiceImpl<Enumerate> implements EnumerateService {

    @Autowired
    private EnumerateMapper enumerateMapper;

    @Override
    public Enumerate queryByCode(String code) {
        return enumerateMapper.queryByCode(code);
    }

    @Override
    public List<EnumerateItem> queryByPCode(String pCode) {
        return enumerateMapper.queryByPCode(pCode);
    }


}
