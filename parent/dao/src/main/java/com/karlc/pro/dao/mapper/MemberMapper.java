package com.karlc.pro.dao.mapper;

import com.karlc.pro.model.Member;
import org.apache.ibatis.annotations.Param;


public interface MemberMapper {

    Member findMemberByUid(@Param("uid") Long uid) throws Exception;

    Member findMemberByMemberId(@Param("employee_id") Integer memberId) throws Exception;

}
