package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.Commande;
import com.csys.myproject.dto.CommandeDTO;
import com.csys.myproject.factory.CommandeFactory;
import com.csys.myproject.repository.CommandeRepository;

@Service
@Transactional
public class CommandeService {

	@Autowired
	CommandeRepository commandeRepository;

	@Transactional(readOnly = true)
	public CommandeDTO findOne(Integer id) {
		Commande commande = commandeRepository.findOne(id);
		return CommandeFactory.commandeToCommandeDTO(commande);
	}

	@Transactional(readOnly = true)
	public Collection<CommandeDTO> findAll() {
		List<Commande> result = commandeRepository.findAll();
		return CommandeFactory.CommandeToCommandeDTOs(result);
	}

	public CommandeDTO add(CommandeDTO commandeDTO) {
		Commande commande = CommandeFactory.commandeDTOToCommande(commandeDTO);
		commande = commandeRepository.save(commande);
		return CommandeFactory.commandeToCommandeDTO(commande);
	}
	public CommandeDTO update(CommandeDTO commandeDTO) {
		
		Commande commande=commandeRepository.save(CommandeFactory.commandeDTOToCommande(commandeDTO));
	    return CommandeFactory.commandeToCommandeDTO(commande);
	}
	public void delete(Integer id) {
		commandeRepository.delete(id);

	}

}
