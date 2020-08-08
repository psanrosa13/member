package com.devsjavagirl.member.service;

import com.devsjavagirl.member.dto.MemberDto;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
  public MemberDto getById(long id) {
    return new MemberDto();
  }
}
