package dev.ghass.mybatisflyway.api;

import java.util.List;
import java.util.UUID;

public interface AbstractRepository<T> {
  List<T> selectAll();

  T selectById(UUID id);

  void insert(T t);

  void deleteById(UUID id);
}
