# Scala-tests
Pruebas con Scala, SBT, Spark...

### Prerequisitos
Este proyecto se ejecuta en entorno linux y se necesita tener instalado Java, Maven, SBT y Eclipse

### Instalar

En el directorio de SBT se crea la carpeta plugins si no existe y el archivo plugins.sbt:
/home/user/.sbt/sbt_version/plugins/plugins.sbt

Se añade el plugin sbteclipse para añadir las dependencias SBT del proyecto al classpath, añadiendo al archivo plugins.sbt la siguiente línea:
```
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
```
### Ejecutar

Abrir consola e ir al directorio del proyecto:
```
cd /directorio_proyecto
```
Lanzar SBT para descargar dependencias:
```
sbt run
```
Lanzar el plugin sbteclipse para que sea compatible con el IDE:
```
sbt eclipse
```
Finalmente, el proyecto está listo para ser importado en el IDE Eclipse y seguir desarrollándolo

### Apuntes

El proyecto base Scala es un arquetipo Maven descargable:
```
mvn archetype:generate
```
Se usa el arquetipo:
- net.alchim31.maven:scala-archetype-simple en su versión 1.6
