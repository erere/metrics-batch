package com.test.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MetricsItemProcessor implements ItemProcessor<StudentDTO, StudentDTO> {

	private static final Logger log = LoggerFactory.getLogger(MetricsItemProcessor.class);

	@Override
	public StudentDTO process(final StudentDTO studentDTO) throws Exception {
		final String name = studentDTO.getName().toUpperCase();
		final String email = studentDTO.getEmailAddress().toUpperCase();
		final String purchasedPackage = studentDTO.getPurchasedPackage().toUpperCase();

		final StudentDTO transformedStudent = new StudentDTO(email, name, purchasedPackage);

		log.info("Converting (" + studentDTO + ") into (" + transformedStudent + ")");

		return transformedStudent;
	}

}
