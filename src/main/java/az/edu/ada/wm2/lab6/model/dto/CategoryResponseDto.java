package az.edu.ada.wm2.lab6.model.dto;

public class CategoryResponseDto {

    private String name;

    public CategoryResponseDto() {
    }

    public CategoryResponseDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
