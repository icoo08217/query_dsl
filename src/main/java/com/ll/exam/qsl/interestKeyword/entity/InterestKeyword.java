package com.ll.exam.qsl.interestKeyword.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class InterestKeyword {

    @Id
    @EqualsAndHashCode.Include
    String content;


}
