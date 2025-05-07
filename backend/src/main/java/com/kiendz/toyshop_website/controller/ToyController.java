package com.kiendz.toyshop_website.controller;

import com.kiendz.toyshop_website.dto.response.ApiResponse;
import com.kiendz.toyshop_website.dto.response.PageResponse;
import com.kiendz.toyshop_website.dto.response.ToyResponse;
import com.kiendz.toyshop_website.entity.Toy;
import com.turkraft.springfilter.boot.Filter;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kien Tran
 * @version 1.0
 * @since 2025-4-22
 */
@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/api/v1")
@Slf4j
public class ToyController {
    @GetMapping("/toys")
    ApiResponse<PageResponse<ToyResponse>> getALlToys(
            @Filter Specification<Toy> spec, @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "6") int size {
        PageResponse<ToyResponse> result = toyService.getAllCourses(spec, page, size);

        return ApiResponse.<PageResponse<ToyResponse>>builder()
                .code(HttpStatus.OK.value())
                .message("Get all toys successfully")
                .result(result)
                .build();
    }


}
