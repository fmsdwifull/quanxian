package com.study.houtai.service.impl;

import com.study.houtai.mapper.SysDeptMapper;
import com.study.houtai.po.SysDept;
import com.study.houtai.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDeptServiceImpl implements IDeptService {
    @Autowired
    private SysDeptMapper sysDeptMapper;
    @Override
    public List<SysDept> getDeptAll() {
        return sysDeptMapper.getDeptAll();
    }
}
