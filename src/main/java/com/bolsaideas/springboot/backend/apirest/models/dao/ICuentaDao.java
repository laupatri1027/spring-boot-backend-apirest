package com.bolsaideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsaideas.springboot.backend.apirest.models.entity.Cuenta;

public interface ICuentaDao extends CrudRepository<Cuenta, Long> {

}
