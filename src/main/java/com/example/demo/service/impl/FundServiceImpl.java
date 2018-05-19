package com.example.demo.service.impl;

import com.example.demo.modular.dao.TblFundMapper;
import com.example.demo.modular.entity.TblFund;
import com.example.demo.modular.entity.TblFundExample;
import com.example.demo.service.FundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创建人:连磊
 * 日期: 2018/5/17. 11:43
 * 描述：
 */
@Service
public class FundServiceImpl implements FundService {

    @Resource
    private TblFundMapper tblFundMapper;

    @Override
    public List<TblFund> getFund() {
        TblFundExample tblFundExample = new TblFundExample();
        return tblFundMapper.selectByExample(tblFundExample);
    }
}
