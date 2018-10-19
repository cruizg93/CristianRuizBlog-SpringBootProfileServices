package com.cristianruizblog.profileServices.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("LINUX")
public class SistemaOperativoLinux implements SistemaOperativoService{

	@Override
	public String getSistemaOperativoName() {
		return "LINUX";
	}

}
