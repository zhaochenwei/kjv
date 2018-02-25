package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.Demand;
import com.ssm.service.DemandService;

@Controller
@RequestMapping("/demand")
public class TestController {
	private static Logger logger = Logger.getLogger(TestController.class);
	@Resource
    private DemandService demandService;
	
	@RequestMapping("/showDemand")
	@ResponseBody
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        Demand demand = demandService.getUserById(userId);
        logger.info(JSON.toJSONString(demand));
        return "你好";
    }
}
