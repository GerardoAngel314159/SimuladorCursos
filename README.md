# SimuladorCursos

[Practica 1]
Bonzi Buddy

Angel Maldonado Gerardo De Jesús    320188268
Candiani Pérez Gabriel              318268534
Salazar Enriquez Luis Alberto       321155405

En esta practica, aunque su implementacion no fue particularmente compleja, el mayor desafio residio en planificar la manera de integrar los distintos patrones de diseño requeridos. Profundizamos en la implementacion de los patrones Strategy y Observer, comprobando sus beneficios para mantener un codigo mas limpio y estructurado, lo que a su vez facilita la comprension y la realizacion de futuras actualizaciones.

Ademas, observamos que los problemas de programacion pueden abordarse de multiples maneras, y que existen diversos modelos de diseño, algunos mas eficientes que otros segun las necesidades de cada proyecto. Tambien confirmamos que es posible combinar varios patrones de manera simultanea para lograr soluciones más robustas y flexibles.

Para la practica, para la implementacion del patrón de diseño de Observer se decidio usar de la forma que los cursos son el "sujeto" y los alumnos son los "observadores", esto por el hecho de que los cursos son quienes realizan la actualizacion, al momento de dar mensajes los cursos son quienes realizan el mensaje y los alumnos lo reciben y por esto mismo los alumnos son quienes son los observadores porque son muchos y ellos reciben la notificacion del sujeto.

En nuestra practica aplicamos el patron Strategy mediante la definicion de una interfaz comun (en este caso, la interfaz Curso) que especifica un conjunto de metodos que deben implementar todos los tipos de cursos. Esto nos permitio encapsular las distintas logicas de Simulacion de Cursos (como el calculo de costos, la forma de registrar y cobrar a los alumnos, etc.) en clases concretas, tales como CursoJava, CursoCanto y CursoEcuDif.


La practica de compila con "javac *.java" y despues con "java SimuladorCursos"
