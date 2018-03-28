package com.karlc.pro.service;

import com.karlc.pro.dao.IDaoMember;
import com.karlc.pro.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luyh on 16/4/27.
 */

@Service
public class MemberService implements IMemberService{


    private IDaoMember daoMember;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return daoMember.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return daoMember.findMemberByMemberId(memberId);
    }
}
