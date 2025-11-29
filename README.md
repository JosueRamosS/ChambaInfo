# ChambaInfo

Aplicación móvil para la gestión y búsqueda de información laboral, desarrollada con Spring Boot en el backend y Android en el frontend.

## Información del Proyecto

### Equipo de Desarrollo

- Josué Ramos
- Diego Álvarez
- Jhosep Mollapaza
- José Macha

### Docente
Edson Luque

### Curso
Tecnologías de Construcción de Software

---

## Guía para el Usuario

### Descripción

ChambaInfo es una plataforma que conecta oportunidades laborales con usuarios, facilitando la búsqueda y gestión de información de empleos.

### Requisitos del Sistema

- Android 8.6 o superior
- Conexión a Internet

### Instalación de la Aplicación

#### Paso 1: Descargar el APK

Descargue el archivo APK desde el siguiente enlace:

**[Descargar ChambaInfo.apk](https://drive.google.com/drive/folders/1PamYtKBGYBXlQKbpiwclP3VIDd20xyVE?usp=sharing)**

#### Paso 2: Habilitar Instalación de Fuentes Desconocidas

1. Abrir Configuración en su dispositivo Android
2. Ir a Seguridad o Privacidad
3. Activar la opción Fuentes desconocidas o Instalar aplicaciones desconocidas

#### Paso 3: Instalar la Aplicación

1. Abrir el archivo APK descargado
2. Seguir las instrucciones en pantalla
3. Una vez instalada, la aplicación estará disponible en el menú de aplicaciones

### Uso de la Aplicación

1. Abrir ChambaInfo desde el menú de aplicaciones
2. Crear una cuenta o iniciar sesión
3. Navegar por las ofertas laborales disponibles
4. Aplicar a empleos de su interés

---

## Especificaciones Técnicas

### Arquitectura del Sistema

#### Backend
- **Framework:** Spring Boot
- **Lenguaje:** Java
- **Base de Datos:** PostgreSQL
- **Hosting de BD:** Neon Tech
- **Deployment:** Railway
- **Repositorio:** [GitHub Backend](https://github.com/JosueRamosS/ChambaInfo.git)

#### Frontend
- **Plataforma:** Android
- **Repositorio:** [GitHub Frontend](https://github.com/JosueRamosS/ChambaInfo.git)

### Instalación del Entorno de Desarrollo

#### Requisitos Previos

**Para el Backend:**
- Java JDK 17 o superior
- Maven
- IDE recomendado: IntelliJ IDEA o Eclipse

**Para el Frontend:**
- Android Studio
- SDK de Android

### Configuración del Backend

1. Clonar el repositorio del backend desde GitHub
2. Configurar las credenciales de la base de datos PostgreSQL de Neon Tech
3. Compilar el proyecto con Maven
4. Ejecutar la aplicación Spring Boot

La aplicación estará disponible localmente en el puerto 8080.

### Configuración del Frontend

1. Clonar el repositorio del frontend desde GitHub
2. Abrir el proyecto en Android Studio
3. Configurar la URL del backend (Railway)
4. Sincronizar las dependencias con Gradle
5. Compilar e instalar en un dispositivo o emulador

### Base de Datos

La base de datos PostgreSQL está alojada en Neon Tech y contiene las tablas necesarias para el funcionamiento de la app.

### Deployment

#### Backend en Railway
La API está desplegada en Railway empleando Dockerfile.

#### Base de Datos en Neon Tech
Base de datos PostgreSQL serverless configurada y conectada al backend.

---

Desarrollado por el equipo 3 del curso Tecnologías de Construcción de Software.
