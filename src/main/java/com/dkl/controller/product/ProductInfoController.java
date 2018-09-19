package com.dkl.controller.product;

import com.dkl.converter.CartDTO2StringConverter;
import com.dkl.dto.CartDTO;
import com.dkl.dto.OrderMasterDTO;
import com.dkl.pojo.Browsing;
import com.dkl.pojo.UserInfo;
import com.dkl.service.product.BrowsingService;
import com.dkl.vo.ProductVO;
import com.dkl.service.product.ProductInfoService;
import com.dkl.vo.ProductListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private BrowsingService browsingService;

    @ResponseBody
    @RequestMapping("carList")
    public ProductListVO<Map<String, Object>> carList(@RequestParam(defaultValue = "0") Integer index, @RequestParam(defaultValue = "9") Integer pageSize, HttpSession session) {
        System.out.println("进入了方法");
        return productInfoService.findPageMap(index, pageSize);

    }

    @RequestMapping("carOne")
    public String carOne(String productId, Integer id, Model model) {
        // 首先判断是否有用户点击
        System.out.println("productId:" + productId);
        if (id != null) {
            // 先查询该用户下是否已经有了该商品的浏览记录
            int browsingUserId = browsingService.findBrowsingUserId(id, productId);
            if (browsingUserId <= 0) {
                // 如果该用户没有该商品id 则添加该商品id 无返回值
                // 如果添加失败方法里面直接抛出error异常
                browsingService.browsingAdd(new Browsing(productId, id));
                // TODO 需要修改浏览个数 请点我
                int browsingClearId = browsingService.findBrowsingUserId(id, null);
                if (browsingClearId > 5) {
                    int browsingId = browsingService.findBrowsingClearId(id);
                    browsingService.browsingClear(new Browsing(browsingId, id));
                }

            }
            // 如果该用户有了该商品id 则直接跳出判断


            // TODO 添加成功后在进行查询该商品的浏览记录是否大于6

            // 如果小于则直接跳出判断

            // 如果大于则调用findBrowsingClearId方法

            // 通过返回值来删除一些值
        }
        model.addAttribute("map", productInfoService.findByProductInfoOne(productId));

        return "qian/carDerdetail";

    }

    // 保存车辆信息caonima
    @RequestMapping("saveProductCar")
    public String saveProductCar(CartDTO cartDTO, UserInfo userInfo, HttpSession session) {
        List<CartDTO> cartDTOS = new ArrayList<>();
        if (userInfo != null) {
            // 购物车
            List<CartDTO> cartDTOList = new ArrayList<>();
            // 没有则表示是第一次点击
            Object cart = session.getAttribute("cart");
            System.out.println(cart);
            if (cart == null) {
                cartDTOList.add(cartDTO);
                session.setAttribute("cart", cartDTOList);
            } else {
                cartDTOS = (List<CartDTO>) cart;
                // 如果包含了该对象则对该对象进行数量增加
                if (cartDTOS.contains(cartDTO)) {
                    cartDTOS.forEach(i -> {
                        if (i.getProductId().equals(cartDTO.getProductId())) {
                            i.setProductQuantity(i.getProductQuantity() + cartDTO.getProductQuantity());
                        }
                    });
                }
                // 重新赋值
                session.setAttribute("cart", cartDTOS);
            }
        }
        session.setAttribute("count", cartDTOS.size());
        return "forward:carOne";
    }


    @ResponseBody
    @RequestMapping("carOneTest")
    public ProductVO carOneTest(String productId) {
        return productInfoService.findByProductInfoOne(productId);
    }

    @ResponseBody
    @RequestMapping("show")
    public ProductListVO<Map<String, Object>> show(@RequestParam(defaultValue = "0") Integer index, @RequestParam(defaultValue = "9") Integer pageSize) {
        return productInfoService.findPageMap(index, pageSize);
    }
}
