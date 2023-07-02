package guru.springframework.msscbreweryclient.web.model;

import lombok.Data;

import java.util.UUID;

@Data
public class CustomerDto {

    private UUID id;
    private String name;

    public CustomerDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public static CustomerDtoBuilder builder() {
        return new CustomerDtoBuilder();
    }

    public static class CustomerDtoBuilder {
        private UUID id;
        private String name;

        CustomerDtoBuilder() {
        }

        public CustomerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CustomerDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerDto build() {
            return new CustomerDto(this.id, this.name);
        }

        public String toString() {
            return "CustomerDto.CustomerDtoBuilder(id="
                    + this.id + ", name="
                    + this.name + ")";
        }
    }
}
