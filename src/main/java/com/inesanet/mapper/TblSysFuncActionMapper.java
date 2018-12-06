package com.inesanet.mapper;

import com.inesanet.domain.TblSysFuncAction;
import com.inesanet.domain.TblSysFuncActionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblSysFuncActionMapper {
    long countByExample(TblSysFuncActionExample example);

    int deleteByExample(TblSysFuncActionExample example);

    int deleteByPrimaryKey(Integer actionId);

    int insert(TblSysFuncAction record);

    int insertSelective(TblSysFuncAction record);

    List<TblSysFuncAction> selectByExample(TblSysFuncActionExample example);

    TblSysFuncAction selectByPrimaryKey(Integer actionId);

    int updateByExampleSelective(@Param("record") TblSysFuncAction record, @Param("example") TblSysFuncActionExample example);

    int updateByExample(@Param("record") TblSysFuncAction record, @Param("example") TblSysFuncActionExample example);

    int updateByPrimaryKeySelective(TblSysFuncAction record);

    int updateByPrimaryKey(TblSysFuncAction record);
}