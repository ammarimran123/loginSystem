package com.internalsystems.loginSystem;

import org.springframework.stereotype.Service;

import com.internalsystems.entities.GlobleUsers;

@Service
public class GlobleUserService {

	private final GlobleUsersRepository globleUsersRepository;
	public GlobleUserService(GlobleUsersRepository globleUsersRepository) {
		this.globleUsersRepository = globleUsersRepository;
	}
	public GlobleUserDTO createGlobleUser(GlobleUserDTO globleUserDTO) {
		// You can add additional validation logic here if needed
		GlobleUsers user = new GlobleUsers(globleUserDTO);
		user= globleUsersRepository.save(user);
		return new GlobleUserDTO(user);
	}



}
