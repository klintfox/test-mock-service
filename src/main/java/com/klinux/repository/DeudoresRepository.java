package com.klinux.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klinux.entity.Deudor;

@Repository
public interface DeudoresRepository extends CrudRepository<Deudor, Long> {

	public List<Deudor> findAll();

	public Optional<Deudor> findById(Long id);

	public Deudor save(Deudor deudor);

	public void deleteById(Long id);

}