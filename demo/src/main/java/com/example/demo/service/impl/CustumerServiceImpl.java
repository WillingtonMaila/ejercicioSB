package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

/**
 * 
 * @author WILLI
 *
 */
@Service
@Log4j2
public class CustumerServiceImpl implements CustomerService {

	ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String validateIdentification(CustomerDto customerDto, String channel) throws JsonProcessingException {
		log.info("channel send: {} toBodyRequest:{}", channel, objectMapper.writeValueAsString(customerDto));
		return customerDto.getIdentification().length() == 10 ? "Ok" : "FAIL";

	}

}
