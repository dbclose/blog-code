package com.jojoldu.blogcode.querydsl.domain.academy;

import com.jojoldu.blogcode.querydsl.dto.StudentCount;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018-12-29
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public interface AcademyRepositoryCustom {
    List<Academy> findByName(String name);
    List<StudentCount> findAllStudentCount();
    List<Academy> findAllByStudentId(long studentId);
}
