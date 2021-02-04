package com.study.houtai.controller;

import com.study.houtai.po.SysDept;
import com.study.houtai.service.IDeptService;
import com.study.houtai.utils.RespJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService iDeptService;
    @RequestMapping("/getdept")
    public String getDept(){
        return "page/menu";
    }

    @RequestMapping("/getdeptdata")
    @ResponseBody
    public RespJson getDeptData(){
        List<SysDept> list = iDeptService.getDeptAll();
        RespJson respJson = new RespJson();
        respJson.setCode(0);
        respJson.setMsg("ok");
        respJson.setCount(list.size());
        respJson.setData(list);
        //System.out.println(respJson);
        return  respJson;
    }
}
