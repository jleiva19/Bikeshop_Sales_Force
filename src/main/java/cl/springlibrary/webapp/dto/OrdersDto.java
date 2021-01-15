package cl.springlibrary.webapp.dto;

import cl.springlibrary.webapp.entity.sales.Orders;

import java.time.LocalDate;
public class OrdersDto {
    private Integer orderId;
    private String  staffName;
    private String clientName;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private String orderStatus;

    public OrdersDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersDto ordersDto = (OrdersDto) o;

        return orderId != null ? orderId.equals(ordersDto.orderId) : ordersDto.orderId == null;
    }

    @Override
    public int hashCode() {
        return orderId != null ? orderId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrdersDto{" +
                "orderId=" + orderId +
                ", staffName='" + staffName + '\'' +
                ", clientName='" + clientName + '\'' +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }

    public OrdersDto(Integer orderId, String staffName, String clientName, LocalDate orderDate, LocalDate requiredDate, String orderStatus) {
        this.orderId = orderId;
        this.staffName = staffName;
        this.clientName = clientName;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
