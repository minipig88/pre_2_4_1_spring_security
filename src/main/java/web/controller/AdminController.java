package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
        @Autowired
        private UserService userService;

        @RequestMapping(value = "/userList", method = RequestMethod.GET)
        public String userList(Model model) {
            model.addAttribute("allUsers", userService.getAllUser());
            return "admin";
        }

        @RequestMapping(value = "/delete", method = RequestMethod.POST)
        public String  deleteUser(@RequestParam(required = true, defaultValue = "" ) Long userId,
                                  @RequestParam(required = true, defaultValue = "" ) String action,
                                  Model model) {
            if (action.equals("delete")){
                userService.deleteUser(userId);
            }
            return "redirect:/admin";
        }
}
