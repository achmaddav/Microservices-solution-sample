package com.rapidtech.inventoryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class InventoryRequest {
    private String skuCode;
    private Integer quantity;
}
