package mate.academy.spring.model.dto;

public class CinemaHallResponseDto {
    private int capacity;
    private String description;

    public CinemaHallResponseDto() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
