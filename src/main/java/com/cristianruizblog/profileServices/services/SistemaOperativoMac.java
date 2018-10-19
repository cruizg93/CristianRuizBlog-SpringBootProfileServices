package com.cristianruizblog.profileServices.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("MAC")
public class SistemaOperativoMac implements SistemaOperativoService{

	@Override
	public String getSistemaOperativoName() {
		return "MACOS";
	}

}
