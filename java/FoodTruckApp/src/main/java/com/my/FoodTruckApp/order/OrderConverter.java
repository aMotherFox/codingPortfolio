package com.my.FoodTruckApp.order;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class OrderConverter {

    public OrderDTO entityToDto(Order order, OrderDTO orderDTO) {
        //OrderDTO is output, passing in order

        OrderDTO dto = new OrderDTO();
        //creating object of OrderDTO called dto
        //now put the fields coming from the order into the dto
        dto.setId(order.getId());
        dto.setEntreeOrders(orderDTO.getEntreeOrders());
        dto.setAppetizerOrders(orderDTO.getAppetizerOrders());

        return dto;
    }
    //take the input as DTO and convert it to entity
    public Order dtoToEntity(OrderDTO orderDTO, Order order) {

        Order entity = new Order();

        entity.setId(orderDTO.getId());
        entity.setCustomerId(order.getCustomerId());

        return entity;
    }

    public List<OrderDTO> entityToDto(List<Order> order, List<OrderDTO> orderDTO) {

        return order.stream().map(field -> entityToDto(field)).collect(Collectors.toList());
    }
}
