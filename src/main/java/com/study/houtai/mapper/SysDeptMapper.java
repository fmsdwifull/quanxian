package com.study.houtai.mapper;

import com.study.houtai.po.SysDept;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SysDeptMapper {
    List<SysDept> getDeptAll();
}
