package com.shorturl.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Data
@Getter
@Setter
public class ShortenRequestData {

    @NotBlank
    private String url;

    @JsonCreator
    public ShortenRequestData() {

    }

    @JsonCreator
    public ShortenRequestData(@JsonProperty("url") String url) {
        this.url = url;
    }

}
