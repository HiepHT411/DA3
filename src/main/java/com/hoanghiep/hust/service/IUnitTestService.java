package com.hoanghiep.hust.service;

import com.hoanghiep.hust.entity.UnitTest;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IUnitTestService {

    Page<UnitTest> getAllUnitTests(int pageNo, int pageSize, String sortField, String sortDir);

    UnitTest getUnitTestById(Long id);
}
