package com.springdeploy.spring_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;


    @GetMapping("/api/hello")
    public String hello() {
        System.out.println(message);
        return "Hello world";
    }

    @GetMapping("/")
    public String page() {
        return """
                <!DOCTYPE html>
                <html lang="es">
                <head>
                  <meta charset="UTF-8">
                  <meta name="viewport" content="width=device-width, initial-scale=1">
                  <title>Mi Página Bootstrap</title>
                  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
                </head>
                <body>
                
                  <!-- Navbar -->
                  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div class="container">
                      <a class="navbar-brand" href="#">MiSitio</a>
                      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                        <span class="navbar-toggler-icon"></span>
                      </button>
                      <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav ms-auto">
                          <li class="nav-item"><a class="nav-link active" href="#">Inicio</a></li>
                          <li class="nav-item"><a class="nav-link" href="#">Servicios</a></li>
                          <li class="nav-item"><a class="nav-link" href="#">Contacto</a></li>
                        </ul>
                      </div>
                    </div>
                  </nav>
                
                  <!-- Encabezado -->
                  <header class="bg-primary text-white text-center py-5">
                    <div class="container">
                      <h1 class="display-4">Bienvenido a Mi Sitio Web</h1>
                      <p class="lead">Este es un ejemplo básico usando Bootstrap 5</p>
                    </div>
                  </header>
                
                  <!-- Contenido principal -->
                  <main class="container my-5">
                    <div class="row">
                      <div class="col-md-4">
                        <div class="card shadow-sm">
                          <div class="card-body">
                            <h5 class="card-title">Título 1</h5>
                            <p class="card-text">Contenido de la tarjeta. Puedes modificarlo como desees.</p>
                            <a href="#" class="btn btn-primary">Ver más</a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="card shadow-sm">
                          <div class="card-body">
                            <h5 class="card-title">Título 2</h5>
                            <p class="card-text">Otra tarjeta con contenido genérico.</p>
                            <a href="#" class="btn btn-primary">Ver más</a>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="card shadow-sm">
                          <div class="card-body">
                            <h5 class="card-title">Título 3</h5>
                            <p class="card-text">Contenido adicional para mostrar cómo se ve en columnas.</p>
                            <a href="#" class="btn btn-primary">Ver más</a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </main>
                
                  <!-- Footer -->
                  <footer class="bg-dark text-white text-center py-3">
                    <p class="mb-0">© 2025 MiSitio. Todos los derechos reservados.</p>
                  </footer>
                
                  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
                </body>
                </html>
                
                """;
    }
}
