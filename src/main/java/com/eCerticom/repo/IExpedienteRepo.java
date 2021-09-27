package com.eCerticom.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eCerticom.model.Expediente;

public interface IExpedienteRepo extends JpaRepository<Expediente, Integer>{
	
	@Query(value = "SELECT * FROM (SELECT * FROM (SELECT * FROM (SELECT * FROM (SELECT * FROM t_expediente_documento WHERE fecha_del_documento like %:key5%) "
			+ "WHERE nombre_archivo like %:key3% ) WHERE numero_del_documento like %:key4%) WHERE tipo_de_documento like %:key1%) WHERE nro_expediente like %:key2%", nativeQuery = true)
	public List<Expediente> LPM(@Param("key1")String tipo,@Param("key2")String num,@Param("key3")String name,
								@Param("key4")String doc,@Param("key5")String fecha);
	
	@Query(value = "SELECT * FROM t_expediente_documento WHERE nombre_archivo = ?1", nativeQuery = true)
	public List<Expediente> LCNombrePDF(String name);
	
	@Query(value = "SELECT * FROM t_expediente_documento WHERE fecha_del_documento = ?1", nativeQuery = true)
	public List<Expediente> LCFechaPDF(String date);
	
	@Query(value = "SELECT * FROM t_expediente_documento WHERE numero_del_documento = ?1", nativeQuery = true)
	public List<Expediente> LCNumPDF(String num_doc);
	
	@Query(value = "SELECT * FROM t_expediente_documento WHERE nro_expediente = ?1", nativeQuery = true)
	public List<Expediente> LCNroEXP(String num);
	
	@Query(value = "SELECT * FROM t_expediente_documento WHERE tipo_de_documento = ?1", nativeQuery = true)
	public List<Expediente> LCTipoDOC(String tipo);
	
}
