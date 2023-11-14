package com.internalsystems.loginSystem;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internalsystems.Utils.ResponseBean;

import jakarta.validation.Valid;
@Validated
@RestController
@RequestMapping("/api/globleusers")
public class GlobleUserController {
	private final GlobleUserService globleUsersService;
	
    public GlobleUserController(GlobleUserService globleUsersService) {
        this.globleUsersService = globleUsersService;
    }
    
    
  /*  @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseBean> handleValidationException(MethodArgumentNotValidException exception) {
    	ResponseBean response = new ResponseBean();
        exception.getBindingResult().getFieldErrors().forEach(error  ->{
        	response.setResponseDesc(error.getField()+" : "+error.getDefaultMessage());
        });
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);  
      }
*/
    @PostMapping
    public GlobleUserDTO createGlobleUser(@RequestBody @Valid GlobleUserDTO globleUserDTO) {
        //return globleUsersService.createGlobleUser(globleUserDTO);
        return null;
    }
}
