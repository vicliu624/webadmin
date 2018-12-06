package com.inesanet.mapper;

import com.inesanet.domain.TblRoleFunc;
import com.inesanet.domain.TblRoleFuncExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblRoleFuncMapper {
    long countByExample(TblRoleFuncExample example);

    int deleteByExample(TblRoleFuncExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblRoleFunc record);

    int insertSelective(TblRoleFunc record);

    List<TblRoleFunc> selectByExample(TblRoleFuncExample example);

    TblRoleFunc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblRoleFunc record, @Param("example") TblRoleFuncExample example);

    int updateByExample(@Param("record") TblRoleFunc record, @Param("example") TblRoleFuncExample example);

    int updateByPrimaryKeySelective(TblRoleFunc record);

    int updateByPrimaryKey(TblRoleFunc record);
}