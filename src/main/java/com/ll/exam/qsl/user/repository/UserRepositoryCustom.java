package com.ll.exam.qsl.user.repository;

import com.ll.exam.qsl.user.entity.SiteUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);

    int getQslCount();

    SiteUser getQslUserOrderByIdAscOne();

    List<SiteUser> getQslUsersOrderById();

    List<SiteUser> searchQsl(String searchParam);

    Page<SiteUser> searchQsl(String kw, Pageable pageable);

    List<SiteUser> getQslUserByKeyword(String kw);
}