package com.example.demo.controller;

import com.example.demo.modular.entity.TblFund;
import com.example.demo.resultUtils.ResultMessage;
import com.example.demo.service.FundService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创建人:连磊
 * 日期: 2018/5/17. 11:41
 * 描述：
 */
@RestController
public class FundController {

    @Resource
    private FundService fundService;


    @RequestMapping(value = "/fund" , method = RequestMethod.GET)
    public ResultMessage getFundList(){
        return ResultMessage.getNew().setData(fundService.getFund());
    }
}
