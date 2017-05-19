package com.zhan.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import com.zhan.model.HouseRepository;
import com.zhan.model.Member;
import com.zhan.model.MemberRepository;

@Controller
@RequestMapping(path="/member")
public class MemberController {
	
	
	@Autowired
	private MemberRepository memberRepository;
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    
	@GetMapping(path="/getVerificationCode")
	public @ResponseBody String getVerificationCode (@RequestParam String phone, HttpSession httpSession) {
		String url = "http://gw.api.taobao.com/router/rest";
		String appkey = "23828439";
		String secret = "02f0e4b856e25fa3743f86f6daf47002";
		int code = (int)((Math.random()*9+1)*100000);
		String codeJson = "{code:'"+code+"'}";
		
		httpSession.setAttribute("code", String.valueOf(code));
		
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend( "" );
		req.setSmsType( "normal" );
		req.setSmsFreeSignName( "陈云展测试" );
		req.setSmsParamString(codeJson);
		req.setRecNum( phone );
		req.setSmsTemplateCode( "SMS_67300847" );
		try {
			AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
			System.out.println(rsp.getBody());
			return rsp.getBody();
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{\"error\":\"获取验证友失败\"}";
	}
	
	
	@GetMapping(path="/doLogin")
	public @ResponseBody Map<String,Object> doLogin (@RequestParam String phone, @RequestParam String code, HttpSession httpSession) {
		
		String realCode = (String) httpSession.getAttribute("code");
		Map<String,Object> map = new HashMap<String,Object>();

		if(!code.equals(realCode)) {
			map.put("error", "验证码不正确");
			return map;
		}
		
		Member m = memberRepository.findByPhone(phone);
		
		if(m == null) {
			Member member = new Member();
			member.setPhone(phone);
			member.setLevel("0");
			memberRepository.save(member);
			m = memberRepository.findByPhone(phone);
		}
		map.put("member", m);
		return map;
	}

}
