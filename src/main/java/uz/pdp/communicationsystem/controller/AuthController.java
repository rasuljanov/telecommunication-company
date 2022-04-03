package uz.pdp.communicationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.communicationsystem.payload.ApiResponse;
import uz.pdp.communicationsystem.payload.LoginDto;
import uz.pdp.communicationsystem.service.AuthService;
import uz.pdp.communicationsystem.service.StaffService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService service;
    @Autowired
    StaffService staffService;


    @PostMapping("/loginForStaff")
    public HttpEntity<?> loginForStaff(@RequestBody LoginDto dto) {
        ApiResponse apiResponse = service.loginForStaff(dto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    //mobile appdan/browserdan shahsiy kabinetiga kirish
    @PostMapping("/loginForClient")
    public HttpEntity<?> loginForClient(@RequestBody LoginDto dto) {
        ApiResponse apiResponse = service.loginForClient(dto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }
}
