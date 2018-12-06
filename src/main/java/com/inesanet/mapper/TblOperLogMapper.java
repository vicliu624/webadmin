package com.inesanet.mapper;

import com.inesanet.domain.TblOperLog;
import com.inesanet.domain.TblOperLogExample;
import com.inesanet.domain.TblOperLogWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblOperLogMapper {
    long countByExample(TblOperLogExample example);

    int deleteByExample(TblOperLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblOperLogWithBLOBs record);

    int insertSelective(TblOperLogWithBLOBs record);

    List<TblOperLogWithBLOBs> selectByExampleWithBLOBs(TblOperLogExample example);

    List<TblOperLog> selectByExample(TblOperLogExample example);

    TblOperLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblOperLogWithBLOBs record, @Param("example") TblOperLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TblOperLogWithBLOBs record, @Param("example") TblOperLogExample example);

    int updateByExample(@Param("record") TblOperLog record, @Param("example") TblOperLogExample example);

    int updateByPrimaryKeySelective(TblOperLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TblOperLogWithBLOBs record);

    int updateByPrimaryKey(TblOperLog record);
}