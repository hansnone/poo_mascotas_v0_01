# Explicación de los Pilares de POO en el Sistema de Mascotas

## 1. Abstracción
- **Implementación**: La clase abstracta `Mascota` representa el concepto general de una mascota, definiendo atributos comunes (nombre, edad, tipo) y un método abstracto `emitirSonido()`. Esto permite trabajar con mascotas de manera genérica sin preocuparse por los detalles específicos de cada tipo.

## 2. Encapsulamiento
- **Implementación**: Los atributos de la clase `Mascota` (nombre, edad, tipo) son privados (`private`) y solo se accede a ellos mediante métodos públicos `getters` y `setters`. Esto protege los datos y controla el acceso/modificación desde fuera de la clase.

## 3. Herencia
- **Implementación**: Las clases `Perro`, `Gato`, `Pez`, `Periquito`, `Conejo` y `Hamster` heredan de la clase abstracta `Mascota` usando la palabra clave `extends`. Esto permite que todas las clases hijas compartan los atributos y métodos de `Mascota`, evitando duplicación de código.

## 4. Polimorfismo
- **Implementación**: El método `emitirSonido()` es definido como abstracto en `Mascota` y cada clase hija lo implementa de manera específica. En `AppMascotas`, se usa una lista de tipo `ArrayList<Mascota>` para almacenar diferentes tipos de mascotas y se invoca `emitirSonido()` de forma polimórfica, ejecutando la implementación correspondiente a cada tipo de mascota sin necesidad de conocer su tipo específico.
