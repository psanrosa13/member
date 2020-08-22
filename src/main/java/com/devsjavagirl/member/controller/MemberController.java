package com.devsjavagirl.member.controller;

import com.devsjavagirl.member.dto.MemberDto;
import com.devsjavagirl.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

  @Autowired
  MemberService memberService;

  @GetMapping(value = "/{id}", produces = "application/json")
  public MemberDto consultById(@PathVariable long id) {
    return memberService.getById(id);
  }

  @PostMapping
  public MemberDTO create(@RequestBody MemberDto memberDto){
    memberService.create(memberDto);
  }

}
