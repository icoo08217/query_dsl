package com.ll.exam.qsl.interestKeyword.entity;


import com.ll.exam.qsl.interestKeyword.InterestKeywordId;
import com.ll.exam.qsl.user.entity.SiteUser;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@IdClass(InterestKeywordId.class)
public class InterestKeyword {

    @Id
    @ManyToOne
    @EqualsAndHashCode.Include
    private SiteUser user;

    @Id
    @EqualsAndHashCode.Include
    String content;


}
