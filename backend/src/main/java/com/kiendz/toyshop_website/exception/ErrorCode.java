package com.kiendz.toyshop_website.exception;

import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@FieldDefaults(makeFinal = true)
public enum ErrorCode {
    // Lỗi chung
    UNKNOWN_ERROR(500, "An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_REQUEST(400, "Invalid request data", HttpStatus.BAD_REQUEST),

    // Lỗi liên quan đến sản phẩm
    PRODUCT_NOT_FOUND(404, "Product not found", HttpStatus.NOT_FOUND),
    PRODUCT_OUT_OF_STOCK(400, "Product is out of stock", HttpStatus.BAD_REQUEST),
    INVALID_PRODUCT_PRICE(400, "Product price is invalid", HttpStatus.BAD_REQUEST),
    DUPLICATE_PRODUCT(409, "Product already exists", HttpStatus.CONFLICT),

    // Lỗi liên quan đến đơn hàng
    ORDER_NOT_FOUND(404, "Order not found", HttpStatus.NOT_FOUND),
    ORDER_ALREADY_CANCELLED(400, "Order has already been cancelled", HttpStatus.BAD_REQUEST),
    ORDER_INVALID_STATUS(400, "Invalid order status for this operation", HttpStatus.BAD_REQUEST),
    ORDER_ITEM_NOT_FOUND(404, "Order item not found", HttpStatus.NOT_FOUND),

    // Lỗi liên quan đến thanh toán
    PAYMENT_FAILED(402, "Payment processing failed", HttpStatus.PAYMENT_REQUIRED),
    INVALID_PAYMENT_AMOUNT(400, "Invalid payment amount", HttpStatus.BAD_REQUEST),
    PAYMENT_ALREADY_PROCESSED(400, "Payment has already been processed", HttpStatus.BAD_REQUEST),

    // Lỗi liên quan đến người dùng
    USER_NOT_FOUND(404, "User not found", HttpStatus.NOT_FOUND),
    USER_ALREADY_EXISTS(409, "User already exists", HttpStatus.CONFLICT),
    INVALID_CREDENTIALS(401, "Invalid username or password", HttpStatus.UNAUTHORIZED),
    ACCESS_DENIED(403, "Access denied", HttpStatus.FORBIDDEN),

    // Lỗi liên quan đến giỏ hàng
    CART_NOT_FOUND(404, "Cart not found", HttpStatus.NOT_FOUND),
    CART_ITEM_NOT_FOUND(404, "Cart item not found", HttpStatus.NOT_FOUND),
    INVALID_QUANTITY(400, "Invalid quantity in cart", HttpStatus.BAD_REQUEST);

    private int code;
    private String message;
    private HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
