package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PersonRepository {
    private final int version;
    @Qualifier

    public long count() {
        System.out.println("PersonRepository(v%d).count() 작동".formatted(version));

        return 3;
    }
}