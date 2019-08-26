package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.DepartamentoDao;
import com.mballem.curso.boot.domain.Departamento;

public class DepartamentoServiceImpl implements DepartmentoService{
	
	
	@Autowired
	private DepartamentoDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Transactional(readOnly = true)
	@Override
	public void excluir(Long id) {
	dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Departamento> buscarTodos() {
		
		return dao.findAll();
	}

}
