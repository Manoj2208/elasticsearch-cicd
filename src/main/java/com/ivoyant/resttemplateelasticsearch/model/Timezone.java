package com.ivoyant.resttemplateelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "timezone")
public class Timezone implements Serializable {
    @Id
    @Field(type = FieldType.Auto)
    private Integer id;
    private String offset;
    private String description;
}
