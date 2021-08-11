// DTO: 테이터베이스와 통신할 객체의 정보.

package template.springboot.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class ProductRequestData {
    @NotBlank
    @Mapping("name")
    private String name;

    @NotBlank
    @Mapping("brand")
    private String brand;

    @NotBlank
    @Mapping("price")
    private String price;

    @NotBlank
    @Mapping("description")
    private String description;

    @NotBlank
    @Mapping("imageLink")
    private String imageLink;

    @NotBlank
    @Mapping("category")
    private String category;

}
