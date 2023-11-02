package com.example.demo.service.impl;

import com.example.demo.model.Invoice;
import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.pojo.InvoicePojo;
import com.example.demo.pojo.OrderPojo;
import com.example.demo.repository.OrderRepo;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;

    private final ProductService productService;

    private final UserService userService;

    @Override
    public Order checkIt(Integer id) throws Exception {
        Optional<Order> optionalOrder = orderRepo.findByOrderId(id);
        if (optionalOrder.isPresent())
            return optionalOrder.get();
        throw new Exception("Id Not Found");
    }



    @Override
    public List<OrderPojo> addOrder(List<OrderPojo> orderPojoList,Invoice invoice) throws Exception {
        Order order;
        for(OrderPojo orderPojo: orderPojoList) {
            if (orderPojo.getId() != null)
                order = checkIt(orderPojo.getId());
            else
                order = new Order();
            Product product = productService.checkIt(orderPojo.getProductId());
            order.setProduct(product);
            User user = userService.checkIt(orderPojo.getUserId());
            order.setUser(user);
            order.setInvoice(invoice);
            order.setQuantity(orderPojo.getQuantity());
            Order result = orderRepo.save(order);
            orderPojo.setId(result.getId());
            orderPojo.setPrice(product.getPrice() * order.getQuantity());
        }
        return orderPojoList;
    }

    @Override
    public List<Map<String, Object>> getAll() {
        return orderRepo.getAll();

    }
}
