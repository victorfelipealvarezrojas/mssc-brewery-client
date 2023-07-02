package guru.springframework.msscbreweryclient.web.model;

import lombok.Data;

import java.util.UUID;

@Data
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public BeerDto(UUID id, String beerName, String beerStyle, Long upc) {
        this.id = id;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
    }

    public static BeerDtoBuilder builder() {
        return new BeerDtoBuilder();
    }

    public static class BeerDtoBuilder {
        private UUID id;
        private String beerName;
        private String beerStyle;
        private Long upc;

        public BeerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerDtoBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerDtoBuilder beerStyle(String beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerDtoBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public BeerDto build() {
            return new BeerDto(this.id, this.beerName, this.beerStyle, this.upc);
        }

        public String toString() {
            return "BeerDto.BeerDtoBuilder(id="
                    + this.id + ", beerName="
                    + this.beerName + ", beerStyle="
                    + this.beerStyle + ", upc="
                    + this.upc + ")";
        }
    }
}
