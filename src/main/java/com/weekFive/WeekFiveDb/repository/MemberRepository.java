package com.weekFive.WeekFiveDb.repository;

import com.weekFive.WeekFiveDb.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // custom method
    Optional<Member> findByEmail(String email);
}
