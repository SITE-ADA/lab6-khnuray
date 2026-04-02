package az.edu.ada.wm2.lab6.model.mapper;

import az.edu.ada.wm2.lab6.model.Category;
import az.edu.ada.wm2.lab6.model.Product;
import az.edu.ada.wm2.lab6.model.dto.ProductRequestDto;
import az.edu.ada.wm2.lab6.model.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequestDto dto) {
        Product product = new Product();
        if (dto.getProductName() != null) {
            product.setProductName(dto.getProductName());
        }
        if (dto.getPrice() != null) {
            product.setPrice(dto.getPrice());
        }
        if (dto.getExpirationDate() != null) {
            product.setExpirationDate(dto.getExpirationDate());
        }
        return product;
    }

    public ProductResponseDto toResponseDto(Product product) {
        List<String> names = product.getCategories().stream()
                .map(Category::getName)
                .toList();
        return ProductResponseDto.builder()
                .id(product.getId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .expirationDate(product.getExpirationDate())
                .categoryNames(names)
                .build();
    }
}
