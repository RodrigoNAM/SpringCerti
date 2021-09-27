package com.eCerticom.service;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
	
	T registra(T t);
	T modificar(T t);
	Optional<T> leer(Integer id);
	List<T> listar();
	void eliminar(Integer id);
	List<T> ListaCnombre_archivo(String name);
	List<T> ListaCnumero_del_documento(String num);
	List<T> ListaCfecha_del_documento(String date);
	List<T> ListaCnro_expediente(String num);
	List<T> ListaCtipo_de_documento(String tipo);
	List<T> LMixtaP(String tipo, String num, String name, String doc, String fecha);

}
