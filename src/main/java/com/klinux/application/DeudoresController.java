package com.klinux.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.klinux.entity.Deudor;
import com.klinux.repository.DeudoresRepository;
import com.klinux.request.DeudorRequest;

@RestController
public class DeudoresController {

	@Autowired
	private DeudoresRepository repository;

	@GetMapping("factoring/v1/deudores")
	public List<Deudor> getDeudores() throws Exception {
		return repository.findAll();
	}

	@GetMapping("factoring/v1/deudores/{id}")
	public Optional<Deudor> getDeudor(@PathVariable Long id) throws Exception {
		return repository.findById(id);
	}

	@PostMapping("factoring/v1/deudores")
	public Deudor saveDeudor(@RequestBody DeudorRequest request) throws Exception {
		Deudor deudor = new Deudor();
		deudor.setNumero(request.getNumero());
		deudor.setFechaIngreso(request.getFechaIngreso());
		deudor.setTipo(request.getTipo());
		deudor.setRut(request.getRut());
		deudor.setRazonSocial(request.getRazonSocial());
		deudor.setCant(request.getCant());
		deudor.setDeudores(request.getDeudores());
		deudor.setMontoTotal(request.getMontoTotal());
		return repository.save(deudor);
	}

	@PutMapping("/factoring/v1/deudores/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Deudor editar(@RequestBody DeudorRequest request, @PathVariable Long id) {
		Optional<Deudor> deudorDb = repository.findById(id);	
		deudorDb.orElseThrow().setNumero(request.getNumero());
		deudorDb.orElseThrow().setFechaIngreso(request.getFechaIngreso());
		deudorDb.orElseThrow().setTipo(request.getTipo());
		deudorDb.orElseThrow().setRut(request.getRut());
		deudorDb.orElseThrow().setRazonSocial(request.getRazonSocial());
		deudorDb.orElseThrow().setCant(request.getCant());
		deudorDb.orElseThrow().setDeudores(request.getDeudores());
		deudorDb.orElseThrow().setMontoTotal(request.getMontoTotal());
		return repository.save(deudorDb.orElseThrow());
	}
	
	@DeleteMapping("/factoring/v1/deudores/{id}")
	public void eliminar(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
