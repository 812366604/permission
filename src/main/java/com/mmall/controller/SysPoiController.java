package com.mmall.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmall.model.SysUser;
import com.mmall.service.SysUserService;
import com.mmall.util.PoiExcelUtil;
@Controller
@RequestMapping("/sys/poi")
public class SysPoiController {
	
	@Resource
    private SysUserService sysUserService;
	@RequestMapping("/poiexcel.json")
	public void poi(HttpServletResponse response,SysUser agent){
        
//        String[] rowName = {"id","姓名","city","用户名","省份"};
//        List<Object[]> dataList = new ArrayList<Object[]>();
//        List<SysUser> list = sysUserService.getAll();
//        for (int i = 0; i < list.size(); i++) {
//            Object[] element = {list.get(i).getId(),list.get(i).getAgentName(),list.get(i).getCityName(),list.get(i).getAdminId(),list.get(i).getProvinceName()};
//            dataList.add(element);
//        }
//        PoiExcelUtil utils = new PoiExcelUtil("测试", rowName, dataList );
//        try {
//            utils.export(response);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }
}
