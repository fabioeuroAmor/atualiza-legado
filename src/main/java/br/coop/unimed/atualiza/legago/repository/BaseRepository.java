package br.coop.unimed.atualiza.legago.repository;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import br.coop.unimed.atualiza.legago.domain.BaseEntity;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity<I>, I> extends JpaRepository<E, I>, JpaSpecificationExecutor<E> {
    default Optional<E> findFirst() {
        return findAll(PageRequest.of(0, 1)).stream().findFirst();
    }

    default Optional<E> findFirst(Specification<E> spec) {
        return findAll(spec, PageRequest.of(0, 1)).stream().findFirst();
    }

    default Optional<E> findFirst(Specification<E> spec, Sort sort) {
        return findAll(spec, PageRequest.of(0, 1, sort)).stream().findFirst();
    }

    default Optional<E> findSecond(Specification<E> spec, Sort sort) {
        return findAll(spec, PageRequest.of(0, 2, sort)).stream().skip(1).findFirst();
    }

    default boolean exists(Specification<E> spec) {
        return count(spec) > 0;
    }

}
