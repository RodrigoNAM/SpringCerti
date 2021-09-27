package com.eCerticom.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCerticom.model.Expediente;
import com.eCerticom.repo.IExpedienteRepo;
import com.eCerticom.service.IExpedienteService;

@Service
public class ExpedienteServiceImpl implements IExpedienteService{
	
	@Autowired
	private IExpedienteRepo repo;

	@Override
	public Expediente registra(Expediente t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Expediente modificar(Expediente t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Expediente> leer(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Expediente> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}


	public List<Expediente> ListaCnombre_archivo(String name) {
		// TODO Auto-generated method stub
		return repo.LCNombrePDF(name);
	}


	public List<Expediente> ListaCnro_expediente(String num) {
		// TODO Auto-generated method stub
		return repo.LCNroEXP(num);
	}


	public List<Expediente> ListaCtipo_de_documento(String tipo) {
		// TODO Auto-generated method stub
		return repo.LCTipoDOC(tipo);
	}

	@Override
	public List<Expediente> LMixtaP(String tipo, String num, String name, String doc, String fecha) {
		// TODO Auto-generated method stub
		return repo.LPM(tipo, num, name, doc, fecha);
	}

	@Override
	public List<Expediente> ListaCnumero_del_documento(String num) {
		// TODO Auto-generated method stub
		return repo.LCNumPDF(num);
	}

	@Override
	public List<Expediente> ListaCfecha_del_documento(String date) {
		// TODO Auto-generated method stub
		return repo.LCFechaPDF(date);
	}

}
