package org.springframework.samples.petclinic.owner;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OwnerToOwnerFormDTOConverter implements Converter<Owner, OwnerFormDTO> {

	@Override
	public OwnerFormDTO convert(Owner source) {
		return OwnerFormDTO.fromOwner(source);
	}

}
