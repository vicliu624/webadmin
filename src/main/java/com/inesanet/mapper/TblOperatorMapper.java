package com.inesanet.mapper;

import com.inesanet.domain.TblOperator;
import com.inesanet.domain.TblOperatorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblOperatorMapper {
    long countByExample(TblOperatorExample example);

    int deleteByExample(TblOperatorExample example);

    int deleteByPrimaryKey(Long operatorId);

    int insert(TblOperator record);

    int insertSelective(TblOperator record);

    List<TblOperator> selectByExample(TblOperatorExample example);

    TblOperator selectByPrimaryKey(Long operatorId);

    int updateByExampleSelective(@Param("record") TblOperator record, @Param("example") TblOperatorExample example);

    int updateByExample(@Param("record") TblOperator record, @Param("example") TblOperatorExample example);

    int updateByPrimaryKeySelective(TblOperator record);

    int updateByPrimaryKey(TblOperator record);
}