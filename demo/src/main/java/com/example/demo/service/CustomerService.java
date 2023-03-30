/**
 * 
 */
package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.dto.CustomerDto;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author WILLI
 *
 */
@Service
public interface CustomerService {

	String validateIdentification(CustomerDto customerDto, String channel) throws JsonProcessingException;

}
