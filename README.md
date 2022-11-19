# stemtech-app-web
Aplicação web que servirá informações para o app mobile (Startup StemTech)

Passos para executar a aplicação:
Baixar o codigo fonte na IDE de preferencia (por se tratar de Kotlin + Gradle, particularmente prefiro utilizar o IntelliJ)
O projeto está na versão 8 do Java

Após feita a build com sucesso, executar a classe AppApplication.kt e confirmar nos logs que a aplicação subiu com sucesso na porta 8081:

![image](https://user-images.githubusercontent.com/62717114/202864640-231bd611-4f52-40bd-8531-b8ce94b6afd1.png)

Feito isso, basta acessar o endpoint: http://localhost:8081/curso

![image](https://user-images.githubusercontent.com/62717114/202864705-6c781710-9f94-41b8-a81f-4cfb121e58a6.png)

Este é o endpoint que será consumido pelo aplicativo Web e irá renderizar os cursos
