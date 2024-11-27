package dev.ghass.mybatisflyway.api.user;

import org.apache.ibatis.annotations.Mapper;

import dev.ghass.mybatisflyway.api.AbstractRepository;

@Mapper
public interface UserRepository extends AbstractRepository<User> {
}
