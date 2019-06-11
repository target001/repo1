package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping("findOne")
    public String  finOne(Integer id, Model model){

        Items items = itemService.findOne(id);
        model.addAttribute("item",items);
        return "itemDetail";

    }

}
