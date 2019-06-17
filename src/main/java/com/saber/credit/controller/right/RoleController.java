package com.saber.credit.controller.right;

import com.saber.credit.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/17.
 * 权限-角色管理
 */

@Controller
public class RoleController extends BaseController {

    @GetMapping(value = "/right/role")
    public String list(Model model){
        initPage(model);
        return "right/role";
    }
}
