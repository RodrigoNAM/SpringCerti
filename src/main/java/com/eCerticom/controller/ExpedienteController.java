package com.eCerticom.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eCerticom.model.Expediente;
import com.eCerticom.service.IExpedienteService;




@Controller
@RequestMapping("/expedientes")
public class ExpedienteController {
	
	@Autowired
	private IExpedienteService service;
	
	@GetMapping ("/MMicro")
    public String MMicro() {		
		
        return "MMicro";
    }
	
	@GetMapping ("/MVisor")
    public String MVisor() {		
		
        return "MVisor";
    }
	
	@GetMapping ("/listar")
    public String ListarTodos(Model model) {
		
		List<Expediente> exp=null;
		
		Expediente expediente = new Expediente();
	
		model.addAttribute("per", expediente);

		model.addAttribute("personas", exp);
		
		
        return "forms";
    }
	
	@GetMapping ("/fake")
    public String ListarTodos1(Model model) {
        return "prueba";
    }
	
	@GetMapping ("/Buscar/")
    public String Buscar(Expediente expe, BindingResult result, Model model) {
		
		Expediente expediente = new Expediente();

		model.addAttribute("per", expediente);
		
		String tipo_doc = expe.getTipo_de_documento();
		String nro_exp = expe.getNro_expediente();
		String nom_arc = expe.getNombre_archivo();
		String num_doc = expe.getNumero_del_documento();
		String fecha = expe.getFecha_del_documento();
		
		List<Expediente> mixtaP=service.LMixtaP(tipo_doc, nro_exp, nom_arc,	num_doc, fecha);
		List<Expediente> ENombre = service.ListaCnombre_archivo(expe.getNombre_archivo());
		List<Expediente> ENum = service.ListaCnro_expediente(expe.getNro_expediente());
		List<Expediente> ETipo = service.ListaCtipo_de_documento(expe.getTipo_de_documento());
		List<Expediente> EDate = service.ListaCfecha_del_documento(fecha);
		List<Expediente> ENumD = service.ListaCnumero_del_documento(num_doc);
		List<Expediente> fake=service.listar();
		List<Expediente> finalL = null;	
		
		if(expe.getChecker() == null || expe.getChecker().equals("") || expe.getChecker().isEmpty() == true) {
			
			if(nro_exp == null || nro_exp.equals("") || nro_exp.isEmpty() == true) {
				if(tipo_doc == null || tipo_doc.equals("") || tipo_doc.isEmpty() == true) {
					if(num_doc == null || num_doc.equals("") || num_doc.isEmpty() == true) {
						if(fecha == null || fecha.equals("") || fecha.isEmpty() == true) {
							if(nom_arc == null || nom_arc.equals("") || nom_arc.isEmpty() == true) {
								finalL = fake;
								model.addAttribute("personas", finalL);
							    return "forms";
							}
						}
					}
				}
			}
			
			finalL = mixtaP;
			model.addAttribute("personas", finalL);
		    return "forms";
		    
		}else {
			
			if(nro_exp == null || nro_exp.equals("") || nro_exp.isEmpty() == true) {
				if(tipo_doc == null || tipo_doc.equals("") || tipo_doc.isEmpty() == true) {
					if(num_doc == null || num_doc.equals("") || num_doc.isEmpty() == true) {
						if(fecha == null || fecha.equals("") || fecha.isEmpty() == true) {
							if(nom_arc == null || nom_arc.equals("") || nom_arc.isEmpty() == true) {
								model.addAttribute("personas", finalL);
								return "forms";
							}else {
								finalL=ENombre; 
								if(finalL == null || finalL.isEmpty() == true) {
									finalL = null;	
									model.addAttribute("personas", finalL);
									return "forms";
								}else {
									model.addAttribute("personas", finalL);
									model.addAttribute("personas1", finalL.get(0)); 
									return "forms2";
								}
							}
						}else {
							finalL = EDate;
							if(finalL == null || finalL.isEmpty() == true) {
								finalL = null;	
								model.addAttribute("personas", finalL);
								return "forms";
							}else {
								model.addAttribute("personas", finalL);
								model.addAttribute("personas1", finalL.get(0)); 
								return "forms2";
							}
						}
					}else {
						finalL = ENumD;
						if(finalL == null || finalL.isEmpty() == true) {
							finalL = null;	
							model.addAttribute("personas", finalL);
							return "forms";
						}else {
							model.addAttribute("personas", finalL);
							model.addAttribute("personas1", finalL.get(0)); 
							return "forms2";
						}
					}
				}else {
					finalL = ETipo;
					if(finalL == null || finalL.isEmpty() == true) {
						finalL = null;	
						model.addAttribute("personas", finalL);
						return "forms";
					}else {
						model.addAttribute("personas", finalL);
						model.addAttribute("personas1", finalL.get(0)); 
						return "forms2";
					}
				}
			}else {
				finalL = ENum;
				if(finalL == null || finalL.isEmpty() == true) {
					finalL = null;	
					model.addAttribute("personas", finalL);
					return "forms";
				}else {
					model.addAttribute("personas", finalL);
					model.addAttribute("personas1", finalL.get(0)); 
					return "forms2";
				}
			}
		}
    }
	
}
