package org.africalib.gallery.backend.Controller;


import org.africalib.gallery.backend.entity.Member;
import org.africalib.gallery.backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    MemberRepository memberRepository;

//    @PostMapping("/api/account/login")
//    public int login(@RequestBody Map<String, String> params) {
//        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));
//        if(member!=null){
//            return member.getId();
//        }
//        return 0;
//    }
}