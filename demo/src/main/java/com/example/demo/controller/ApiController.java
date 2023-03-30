/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author WILLI
 *
 */
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApiController {

	CustomerService customerService;

	@GetMapping("/api")
	public ResponseEntity<Object> startController(@RequestBody CustomerDto customerDto,
			@RequestHeader(value = "channel") String channel) throws JsonProcessingException {
		return new ResponseEntity<>(customerService.validateIdentification(customerDto, channel), HttpStatus.OK);
	}

}
