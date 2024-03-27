package br.com.alura.challenge.Service;

import br.com.alura.challenge.Entity.UserEntity;
import br.com.alura.challenge.Repository.UserRepository;
import br.com.alura.challenge.Request.UserRegisterRequest;
import br.com.alura.challenge.Useful.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    UserValidation userValidation = new UserValidation();

    public UserEntity saveUser(UserRegisterRequest userRegisterRequest){
        UserEntity user = userRegisterRequest.saveRequestObject();


        if(userValidation.userNameValidation(userRegisterRequest.getUserName())){
            if(userValidation.userEmailValidation(userRegisterRequest.getEmail())){
                if(!userRepository.existsByUserName(userRegisterRequest.getUserName()) || !userRepository.existsByEmail(userRegisterRequest.getEmail())){
                    userRepository.save(user);
                    return user;
                }else throw new RuntimeException("Usuário ja cadastrado com mesmo e-mail ou nome de usuario.");

            }else throw new RuntimeException("E-mail invalido.");

        }else throw new RuntimeException("Nome de usuario invalido.");

    }
}
