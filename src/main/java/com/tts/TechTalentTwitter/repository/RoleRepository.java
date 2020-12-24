package com.tts.TechTalentTwitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TechTalentTwitter.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
