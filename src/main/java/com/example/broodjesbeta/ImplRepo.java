package com.example.broodjesbeta;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class ImplRepo implements JpaRepository<Broodjes, Integer> {
    @Override
    public List<Broodjes> findAll() {
        return null;
    }

    @Override
    public List<Broodjes> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Broodjes> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Broodjes> findAllById(Iterable<Integer> iterable) {
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
    public void delete(Broodjes broodjes) {

    }

    @Override
    public void deleteAll(Iterable<? extends Broodjes> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Broodjes> S save(S s) {
        return null;
    }

    @Override
    public <S extends Broodjes> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Broodjes> findById(Integer integer) {
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
    public <S extends Broodjes> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Broodjes> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Broodjes getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Broodjes> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Broodjes> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Broodjes> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Broodjes> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Broodjes> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Broodjes> boolean exists(Example<S> example) {
        return false;
    }
}
