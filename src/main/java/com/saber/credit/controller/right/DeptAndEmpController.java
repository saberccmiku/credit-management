package com.saber.credit.controller.right;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 权限-部门与员工
 */

@Controller
public class DeptAndEmpController extends BaseController{

    @GetMapping(value = "/right/deptAndEmp")
    public String list(Model model){
        initPage(model);
        return "right/deptAndEmp";
    }
}
