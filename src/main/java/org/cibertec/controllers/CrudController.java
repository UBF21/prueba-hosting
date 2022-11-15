package org.cibertec.controllers;

import java.util.Optional;

import org.cibertec.models.Bus;
import org.cibertec.repository.IBusRepository;
import org.cibertec.repository.IChoferRepository;
import org.cibertec.repository.IRutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crud")
public class CrudController {

	@Autowired
	IBusRepository repoBus;
	
	@Autowired
	IRutaRepository repoRuta;
	
	@Autowired
	IChoferRepository repoChofer;
	
	@GetMapping("/btnListado")
	public String buttonListado() {
		return "btnListar_GUERRERO_LOPEZ";
	}
	
	@GetMapping("/listado")
	public String listado(Model model) {
		
		model.addAttribute("listado", repoBus.findAll());
		model.addAttribute("cantidadBuses", repoBus.findAll().size());
		return "listadoBus_GUERRERO_LOPEZ";
	}
	
	@GetMapping("/cargarBus/{id}")
	public String cargarFormBus(@PathVariable int id,Model model) {
		
		Optional<Bus> bus  = Optional.ofNullable(repoBus.findById(id).get());
		if (bus.isPresent()) {
			model.addAttribute("rutas", repoRuta.findAll());
			model.addAttribute("choferes", repoChofer.findAll());
			model.addAttribute("bus", bus);
			return "formBus_GUERRERO_LOPEZ";
		}
		
		return "redirect:/crud/listado";
	}
	
	@PostMapping("/guardarBus")
	public String guardarFormBus(@ModelAttribute(name = "bus") Bus bus,Model model){
				
		if (bus != null) {
			if(bus.getIdChofer() == -1 || bus.getIdRuta() == -1) {
				model.addAttribute("bus", repoBus.findById(bus.getIdBus()).get());
				model.addAttribute("rutas", repoRuta.findAll());
				model.addAttribute("mensajeErrorCombo","Tiene que seleccionar tanto una Ruta o Chofer");
				model.addAttribute("choferes", repoChofer.findAll());
				return "formBus_GUERRERO_LOPEZ";
			}
				repoBus.save(bus);
				model.addAttribute("mensajeCorrecto","Se Editó correctamente el Registro");
				model.addAttribute("bus", repoBus.findById(bus.getIdBus()).get());
				model.addAttribute("rutas", repoRuta.findAll());
				model.addAttribute("choferes", repoChofer.findAll());
				return "formBus_GUERRERO_LOPEZ";
			
		}
		
		return "redirect:/crud/listado";
	}
}
