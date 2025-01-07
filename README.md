# Ejercicio3JR_DEIN

## Descripción

    Ejercicio3JR_DEIN es una aplicación JavaFX que gestiona un supermercado virtual. Permite a los usuarios gestionar productos, secciones, y visualizar datos a través de informes gráficos generados con JasperReports. La aplicación utiliza una base de datos para almacenar información y una interfaz moderna construida en JavaFX.

## Características

    Interfaz Gráfica de Usuario (GUI): Diseñada con JavaFX para una experiencia intuitiva y moderna.
    
    Gestión de Productos y Secciones: Permite agregar, modificar y eliminar registros relacionados con productos y secciones del supermercado.
    
    Visualización de Datos: Generación de gráficos e informes detallados.
    
    Validación de Datos: Asegura la integridad de la información ingresada por los usuarios.
    
    Informes Personalizables: Informes con datos relevantes para la toma de decisiones, incluyendo gráficos y tablas.

## Requisitos

  ### Para ejecutar esta aplicación, necesitarás:
  
      Java Development Kit (JDK) 11 o superior.
      
      JavaFX SDK (asegúrate de tener configurado el path correctamente).
      
      JasperReports Library.
      
      Una base de datos configurada y accesible.

## Estructura del Proyecto

    src/: Carpeta que contiene el código fuente.
    
    eu/andreatt/ejercicio3jr_dein/application/: Contiene la clase principal Ejercicio3.java.
    
    eu/andreatt/ejercicio3jr_dein/bbdd/: Contiene ConexionBD.java para la gestión de la base de datos.
    
    eu/andreatt/ejercicio3jr_dein/controller/: Contiene Controller.java para la lógica de la aplicación.
    
    eu/andreatt/ejercicio3jr_dein/util/: Contiene Propiedades.java para la gestión de configuraciones.
    
    eu/andreatt/ejercicio3jr_dein/fxml/: Archivos FXML que definen la estructura de la interfaz gráfica.
    
    eu/andreatt/ejercicio3jr_dein/images/: Imágenes utilizadas en la aplicación.
    
    eu/andreatt/ejercicio3jr_dein/reportes/: Archivos de informes JasperReports, como .jrxml y .jasper.
    
    configuration.properties: Archivo para configuración de base de datos.
    
    module-info.java: Archivo de configuración del módulo Java.

## Cómo Ejecutar la Aplicación

    Clonar o descargar:
    
    Clona el repositorio o descárgalo a tu máquina local.
    
    Configurar la base de datos:
    
    Edita el archivo configuration.properties para proporcionar la URL de la base de datos, usuario y contraseña.

## Compilar y ejecutar:

    Abre el proyecto en tu IDE favorito y asegúrate de configurar el JDK y JavaFX.
    
    Ejecuta la clase principal Ejercicio3.java para iniciar la aplicación.
