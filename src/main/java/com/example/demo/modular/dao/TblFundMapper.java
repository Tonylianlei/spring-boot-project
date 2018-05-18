package com.example.demo.modular.dao;

import com.example.demo.modular.entity.TblFund;
import com.example.demo.modular.entity.TblFundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFundMapper {
    long countByExample(TblFundExample example);

    int deleteByExample(TblFundExample example);

    int deleteByPrimaryKey(String id);

    int insert(TblFund record);

    int insertSelective(TblFund record);

    List<TblFund> selectByExample(TblFundExample example);

    TblFund selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TblFund record, @Param("example") TblFundExample example);

    int updateByExample(@Param("record") TblFund record, @Param("example") TblFundExample example);

    int updateByPrimaryKeySelective(TblFund record);

    int updateByPrimaryKey(TblFund record);
}