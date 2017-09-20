package com.csys.myproject.webservice.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csys.myproject.dto.CommandeDTO;
import com.csys.myproject.service.CommandeService;
import com.csys.myproject.util.RestPreconditions;

@RestController
@RequestMapping("/api/commandes")
public class CommandeRessource {
	
	@Autowired
	CommandeService commandeService;
	private static final String ENTITY_NAME = "Commande";

	@GetMapping
	public Collection<CommandeDTO> findAll() {
		return  commandeService.findAll();
	}
	@GetMapping("/{id}")
	public CommandeDTO findOne(@PathVariable Integer id) {
		CommandeDTO commandeDTO = commandeService.findOne(id);
		RestPreconditions.checkFound(commandeDTO, ENTITY_NAME + "   Not Found");
		return commandeService.findOne(id);

	}
	@PostMapping
	public ResponseEntity<CommandeDTO> addCommande(@RequestBody CommandeDTO commandeDTO, BindingResult bindingResults)
			throws URISyntaxException, MethodArgumentNotValidException {
		if (commandeDTO.getIdCommande() != null) {
			bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an commande with a code"));
			throw new MethodArgumentNotValidException(null, bindingResults);
		}
		CommandeDTO result = commandeService.add(commandeDTO);
		return ResponseEntity.created(new URI("/api/articles/" + result.getIdCommande())).body(result);
	}
	@PutMapping
	public ResponseEntity<CommandeDTO> updateCommande(@RequestBody CommandeDTO commandeDTO) throws URISyntaxException {
		CommandeDTO result = commandeService.add(commandeDTO);
		return ResponseEntity.ok(result);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCommande(@PathVariable Integer id) {
		commandeService.delete(id);
		return ResponseEntity.ok().build();
	}
	
}
