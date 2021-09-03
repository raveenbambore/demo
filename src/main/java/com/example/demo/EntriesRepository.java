package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EntriesRepository extends CrudRepository<Entries, Long> {

    List<Entries> find

}
