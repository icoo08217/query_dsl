package com.ll.exam.qsl.interestKeyword;

import com.ll.exam.qsl.user.entity.SiteUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterestKeywordId implements Serializable {

    private SiteUser user;
    private String content;
}
