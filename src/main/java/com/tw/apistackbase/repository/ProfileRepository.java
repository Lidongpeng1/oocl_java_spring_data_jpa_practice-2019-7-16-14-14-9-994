package com.tw.apistackbase.repository;

import com.tw.apistackbase.core.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
