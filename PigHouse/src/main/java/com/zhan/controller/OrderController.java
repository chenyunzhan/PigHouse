package com.zhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;


@Controller
@RequestMapping(path="/order")
public class OrderController {
	
	
	public static String APP_ID = "2017052007293080";
	public static String APP_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCJE/NZRoAqAg7gAkvnSFca+e6skCF0vwRFVlqMIzPO3S8lAl6QgK6bwgmHgZw8as9Bi8SXOBRJCR6Ofo47XeM9C/A89xBPSCTCFquYxZreKwc7DJT1vIsZMrjjAa5MH+w9F8lm72Tk5FwmI3N2WpWi4k2aXm5+Y5TxkcTiJczEOZH9piV/UGD1v0g6QLzgW/JlnnWT43TVIHvV8UgeAvzZcWUlgerNlPtVXm9uSg4IfCH41IYlAVPlYJGFafz728fEQjWNF8W1wfglXahNTSFpZDO3g9WQG077+YYsfB2JYQb7B3BpNGf/wRlw/jk4xOzlwBh2qbptctzyzbprb6NRAgMBAAECggEAJC9UCbkGlBA/BPsWNlNuSvy2+G6DpmHWKseE14FjZ7QTgd2CQPr3HL637UFVkM1RMKhImPKAyFbT7iGSQjGijrbcD/vYHlWY/nMlkQp4uzT4j6nemI/Q2DH/hE0pSYcTwXzJ+ZYwOAvgF2E8VX3MCldazOkomcyHwM0N//SifRmiEEFLt9oWQfiquBWKIVw1xSwQGbg/W+vfh4ofltwefGj1LfHM6uNuOtZvdedHg8xaXgM6NhiUKdzmbjALh49/fZm8q3vGpCIkBCGlM+i6eH/vlU300ETgOPqxC53GI4mElgvfZXpXRmxN05pGo2z1iwGcx0pB3dy43q38Khh1AQKBgQDNj6NbV54iztfFAWFkgMN/Sx4g6bXqPyZUMtMjppT4/DSOSp1RwYSCG+b8p2XIS7sh8Y35RkNZ5RxKw2RPXTteHpVLHKxdY5Dxp6EA4JuTLpknmMQfEPjOAbJYmu9u3/FVvNlSPMsq8MSXgXlPRakEo6RJXwRC5Pbb6QvNkWX0KQKBgQCqtodvwPk9jye5bgWb3f4IqHkIC6jwJ5kH62ykbCDtxzoXzbVhZcrZQevIig/vJ6eEG2+gFmY48aF/W5XmkSVAMogBn7TU7/uDw60CBcqeA/JocHfxPXec42MlMEHl/F4cYnUQ9DaeiM6hi3w9JYulIu13PWygbqOP7vYHuR5a6QKBgHPtbdM1tpkqzcTs4mArvhUr5/Hn3BAfTR5vC2QvrhQ9J+aXbeGNoY0+7yXNwjkTfJXIBKlwVst7yljfmNKpYbHSzZ9urEZ+wF+IieRUx2hZ/0W1geWDTM3hZxNRTXbaFOClgGpAntO4tSY8fo2WW5uiLiSy0VRojE+5Pk7QkQ8BAoGAYOcFkCEZGaF2KiLS2jwz5BRFx5RezBueGUnAvMCIHJD3X+Wr7OKMN7Dct1PvYZC/3RR504SDeBVo19NUDrIbVAqa+1j9m9WxjoT3YuuIrROOeUxGOVDr4cmNUOHItlT/0trsmrgVfP4pVLfJySfT0eQ2qXXbgGHtRFmfnJivK2kCgYByotOasWx63V9vr/DanHAQxA6FJUvkTvAvJq2IyBriRJfLrnWvjJyhxVTzL0d7S4DWEdYNRrpzJOOj3f126MkpFkT76fb7SkigjwjT5oVjdn9hDaCWXGOM9Y5j2CEJ0mFPnSsXjPEdAvjUVLZ6io5Y/ObsGsRvZR21uTzimUwNBQ==";
	public static String CHARSET = "utf-8";
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiRPzWUaAKgIO4AJL50hXGvnurJAhdL8ERVZajCMzzt0vJQJekICum8IJh4GcPGrPQYvElzgUSQkejn6OO13jPQvwPPcQT0gkwharmMWa3isHOwyU9byLGTK44wGuTB/sPRfJZu9k5ORcJiNzdlqVouJNml5ufmOU8ZHE4iXMxDmR/aYlf1Bg9b9IOkC84FvyZZ51k+N01SB71fFIHgL82XFlJYHqzZT7VV5vbkoOCHwh+NSGJQFT5WCRhWn8+9vHxEI1jRfFtcH4JV2oTU0haWQzt4PVkBtO+/mGLHwdiWEG+wdwaTRn/8EZcP45OMTs5cAYdqm6bXLc8s26a2+jUQIDAQAB";

	@GetMapping(path="/orderEncode")
	public  @ResponseBody String orderEncode() {
		
		//实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
		model.setBody("我是测试数据");
		model.setSubject("App支付测试Java");
		model.setOutTradeNo("1");
		model.setTimeoutExpress("30m");
		model.setTotalAmount("0.01");
		model.setProductCode("QUICK_MSECURITY_PAY");
		request.setBizModel(model);
		request.setNotifyUrl("商户外网可以访问的异步地址");
		try {
		        //这里和普通的接口调用不同，使用的是sdkExecute
		        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
		        System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
		    } catch (AlipayApiException e) {
		        e.printStackTrace();
		}
		
		
		return "";
	}

}
