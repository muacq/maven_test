package com.karlc.pro.service;

import com.karlc.pro.model.Member;

/**
 * Created by luyh on 16/4/27.
 */
public interface IMemberService {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(Integer memberId) throws Exception;


}
