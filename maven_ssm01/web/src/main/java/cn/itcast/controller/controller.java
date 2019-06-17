package cn.itcast.controller;


import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public ModelAndView findById(ModelAndView modelAndView, HttpServletRequest request){
        String number = request.getParameter("number");
        User user = userService.selectById(Integer.parseInt(number));
        modelAndView.addObject("user",user);
        modelAndView.setViewName("select");
        return modelAndView;
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<User> all = userService.findAll();
        model.addAttribute("users",all);
        return "UserList";
    }
}
