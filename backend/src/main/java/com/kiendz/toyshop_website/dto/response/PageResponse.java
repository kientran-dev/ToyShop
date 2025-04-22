package com.kiendz.toyshop_website.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collections;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PageResponse<T> {
    int currentPage; // Trang hiện tại
    int pageSize; // Số sản phẩm mỗi trang
    int totalElements; // Tổng số sản phẩm
    int totalPages; // Tổng số trang

    @Builder.Default
    List<T> items = Collections.emptyList(); // Danh sách sản phẩm
}
