package com.kiendz.toyshop_website.common;

public enum OrderStatus {
    PENDING,// (Đang chờ xử lý): Đơn hàng vừa được tạo, chưa được xử lý.
    CONFIRMED,// (Đã xác nhận): Đơn hàng đã được xác nhận bởi hệ thống hoặc nhân viên.
    PROCESSING,// (Đang xử lý): Đơn hàng đang được chuẩn bị.
    SHIPPED,// (Đã giao hàng): Đơn hàng đã được gửi đi từ kho.
    DELIVERED,// (Đã giao tới khách): Đơn hàng đã đến tay khách hàng.
    CANCELLED,// (Đã hủy): Đơn hàng bị hủy bởi khách hàng hoặc hệ thống.
    RETURNED,// (Đã trả lại): Đơn hàng bị khách hàng trả lại sau khi nhận.
    FAILED,// (Thất bại): Đơn hàng không thể giao thành công (ví dụ: sai địa chỉ).
}
