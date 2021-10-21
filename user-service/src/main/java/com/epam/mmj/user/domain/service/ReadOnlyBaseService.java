package com.epam.mmj.user.domain.service;

import com.epam.mmj.user.domain.repository.ReadOnlyRepository;

/**
 * @param <TE>
 * @param <T>
 * @author Sourabh Sharma
 */
public abstract class ReadOnlyBaseService<TE, T> {

  private ReadOnlyRepository<TE, T> repository;

  ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
    this.repository = repository;
  }
}
