package com.spring.carsharing.repositories;

import com.spring.carsharing.models.Auto;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class AutoRepository implements JpaRepository<Auto, Integer> {
    @Override
    public List<Auto> findAll() {
        return null;
    }

    @Override
    public List<Auto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Auto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Auto> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Auto entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Auto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Auto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Auto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Auto> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Auto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Auto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Auto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Auto getOne(Integer integer) {
        return null;
    }

    @Override
    public Auto getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Auto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Auto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Auto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Auto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Auto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Auto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Auto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
