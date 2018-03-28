package com.karlc.pro.dao;

import com.karlc.pro.dao.mapper.MemberMapper;
import com.karlc.pro.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by luyh on 16/4/27.
 */

@Component
public class DaoMember implements IDaoMember{


    private MemberMapper memberMapper;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return memberMapper.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return memberMapper.findMemberByMemberId(memberId);
    }
}
