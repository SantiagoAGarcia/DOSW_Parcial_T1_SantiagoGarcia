**1.	Realice el diagrama de contexto con las generalidades del sistema. (Añadirlo al README.md)**

<img width="875" height="634" alt="image" src="https://github.com/user-attachments/assets/f9aaadbc-1fe0-43f4-8d02-d2fa1335f78d" />



**2.	Identifique 5 requerimientos del sistema: 3 funcionales y 2 no funcionales. Garantice que al menos 1 requerimiento funcional utilice Iterator y al menos 1 utilice Composite. (Añadirlo al README.md)**
1. PAW CONNECT debe tener la cpacidad de permitir filtrar segun los dintintos criterios (Se realizara con iterator)
2. PAW CONNECT debe tener la capacidad de realizar una solicitud de adopcion la cual tiene 4 estados.
3. PAW CONNECT debe tener la capacidad de almacenar la informacion en AWS Mongo Atlas (Se realizara con composite)
4. El sistema debe tener los colores institucionales
5. Las busquedas en el catalogo deben tardar <= 1s para el 90% de las consultas


**3. Seleccione los 2 requerimientos funcionales más importantes y desarrolle un diagrama de casos de uso con su respectiva historia de usuario. Al menos uno debe utilizar un patrón identificado. (Añadirlo al README.md)**
<img width="843" height="447" alt="image" src="https://github.com/user-attachments/assets/f9b7b863-530e-403b-b433-fcf9ef85d3a4" />

Patrón Aplicado: Iterator
Los iteradores concretos encapsulan el recorrido sobre la colección de mascotas sin exponer la estructura interna de la jerarquía de refugios.

Historia de Usuario HU-01 — Filtrado con Iterator:
Como Usuario adoptante
Quiero Filtrar el catálogo por especie, edad, compatibilidad o refugio
Para Encontrar una mascota que se ajuste a mis necesidades

<img width="732" height="311" alt="image" src="https://github.com/user-attachments/assets/066c0651-0da4-4d3a-89e6-157b082b3575" />

Patrón Aplicado: Composite
ComponenteRefugio define operaciones comunes. Refugio y Ciudad / RedNacional implementan la interfaz uniformemente.

Historia de Usuario HU-03 — Jerarquía de Refugios con Composite
Como Administrador de la red de refugios
Quiero Tratar un refugio individual y una red de refugios de la misma manera
Para Consultar conteos y listados en cualquier nivel jerárquico

**4. Especifique los 2 requerimientos funcionales siguiendo la plantilla de Análisis de Requerimientos. (Añadir a docs/requirements/) - Genera las pantallas con Figma y adjuntalas.**
Link Figma: https://www.figma.com/make/TVfuwcrmG4NEoUddXqkeia/Sin-t%C3%ADtulo?t=Kntijn3dKLyYNJZm-1

**Cada uno de los Requisitos se desarrollo en su respectivo formato encontrado en la carperta docs/Formatos/**
