package com.devsjavagirl.member.service;

import com.devsjavagirl.member.dto.MemberDto;
import com.devsjavagirl.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  @Autowired
  private MemberRepository memberRepository;

  public MemberDto getById(long id) {
    return new MemberDto();
  }

    public void create(MemberDto memberDto) {

    }
}
