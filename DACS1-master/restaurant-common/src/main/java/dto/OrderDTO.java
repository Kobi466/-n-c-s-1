package dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int orderId;
    private String customerName;
    private String customerPhone;
    private LocalDateTime orderDate;
    private double totalPrice;
    private List<OrderItemDTO> items;

    // Constructors, Getters, Setters
    public OrderDTO() {
    }

    public OrderDTO(String userName, String sdt, LocalDateTime orderDate, double total, List<OrderItemDTO> itemDTOs) {
        this.customerName = userName;
        this.customerPhone = sdt;
        this.orderDate = orderDate;
        this.totalPrice = total;
        this.items = itemDTOs;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDTO> items) {
        this.items = items;
    }
}
