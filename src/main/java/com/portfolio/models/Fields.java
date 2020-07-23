package com.portfolio.models;

import com.google.gson.annotations.Expose;
import lombok.Builder;

import javax.persistence.*;

@Entity
@Table
public class Fields {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Expose
    private Integer id;

    @Column(nullable = false)
    private String type;

    @Column(length = 500)
    private String content;

    @Builder
    public Fields(String type, String content) {
        this.type = type;
        this.content = content;
    }
}
