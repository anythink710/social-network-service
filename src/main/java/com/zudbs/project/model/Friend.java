package com.zudbs.project.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Friend implements Serializable {
    private boolean follow;
}
