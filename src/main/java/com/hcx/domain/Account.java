package com.hcx.domain;

import lombok.Data;
import lombok.ToString;

/**
 * Created by hongcaixia on 2020/1/4.
 */
@Data
@ToString
public class Account {

    private Integer id;
    private String name;
    private Double money;
}
