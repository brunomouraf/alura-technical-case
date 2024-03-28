# Case Alura

## 🚀 Requisições -1. Usuarios
 
POST Salvar usuario 
Role:
  0 = STUDENT
  1 = INSTRUCTOR
  2 = ADMINISTRATOR

localhost:8080/register-user

{
    "name": "Bruno Fernandes de Moura",
    "userName": "brunolmbbdois",
    "email": "instructor@hotmail.com",
    "password": "123",
    "role": "0"
}

================================================

## 🚀 Requisições -2. Cursos

POST Salvar curso
Status:
  0 = ENABLE
  1 = DISABLE

localhost:8080/register-course

{
    "rolePermission": "2",
    "name": "Curso de Spring Boot",
    "code": "spring-boot-alura-dois",
    "instructor": "instructor@hotmail.com",
    "description": "Neste curso vamos aprender a trabalhar com Spring Boot.",
    "status": "1"
}

================================================

GET Listar cursos
localhost:8080/list-course

{
    "role": "2",
    "status": "1"
}

================================================

PUT Atualizar status curso
localhost:8080/status-course-update

{
    "role": "2",
    "status": "0",
    "code": "spring-boot-alura-dois"
}

================================================


## 🚀 Requisições -3. Matriculas

POST Matricular
localhost:8080/enrollment

{
    "user": "brunolmbbdois",
    "course": "spring-boot-alura-dois"
}

================================================

PUT Atualizar nota 
localhost:8080/enrollment-update-hate

{
    "user": "brunolmbbdois",
    "course": "spring-boot-alura-dois",
    "hate": 6.5
}
