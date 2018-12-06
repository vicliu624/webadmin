package com.inesanet.mapper;

import com.inesanet.domain.TblSysFunc;
import com.inesanet.domain.TblSysFuncExample;
import com.inesanet.domain.TblSysFuncWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblSysFuncMapper {
    long countByExample(TblSysFuncExample example);

    int deleteByExample(TblSysFuncExample example);

    int deleteByPrimaryKey(Integer funcId);

    int insert(TblSysFuncWithBLOBs record);

    int insertSelective(TblSysFuncWithBLOBs record);

    List<TblSysFuncWithBLOBs> selectByExampleWithBLOBs(TblSysFuncExample example);

    List<TblSysFunc> selectByExample(TblSysFuncExample example);

    TblSysFuncWithBLOBs selectByPrimaryKey(Integer funcId);

    int updateByExampleSelective(@Param("record") TblSysFuncWithBLOBs record, @Param("example") TblSysFuncExample example);

    int updateByExampleWithBLOBs(@Param("record") TblSysFuncWithBLOBs record, @Param("example") TblSysFuncExample example);

    int updateByExample(@Param("record") TblSysFunc record, @Param("example") TblSysFuncExample example);

    int updateByPrimaryKeySelective(TblSysFuncWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TblSysFuncWithBLOBs record);

    int updateByPrimaryKey(TblSysFunc record);
}