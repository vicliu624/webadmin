package com.inesanet.mapper;

import com.inesanet.domain.TblOperRole;
import com.inesanet.domain.TblOperRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblOperRoleMapper {
    long countByExample(TblOperRoleExample example);

    int deleteByExample(TblOperRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblOperRole record);

    int insertSelective(TblOperRole record);

    List<TblOperRole> selectByExample(TblOperRoleExample example);

    TblOperRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblOperRole record, @Param("example") TblOperRoleExample example);

    int updateByExample(@Param("record") TblOperRole record, @Param("example") TblOperRoleExample example);

    int updateByPrimaryKeySelective(TblOperRole record);

    int updateByPrimaryKey(TblOperRole record);
}