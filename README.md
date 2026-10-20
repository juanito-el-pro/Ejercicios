# Actividad: Relaciones entre Clases

## Caso 1: Gestión de asignaturas universitarias
![Caso 1](diagramas/Caso1_Asignaturas.jpg)

**Relaciones identificadas:**
- Departamento ◇— Profesor (Agregación, 1 a 1..*)
- Profesor — Asignatura (Asociación, 1 a 1..*)
- Asignatura ◆— Sesión (Composición, 1 a 1..*)
- GestorAcademico ◇— Asignatura (Agregación, 1 a 0..*)

## Caso 2: Gestión de supermercado
![Caso 2](diagramas/Caso2_Supermercado.jpg)

**Relaciones identificadas:**
- Supermercado ◇— Empleado (Agregación, 1 a 1..*)
- Supermercado ◆— Sección (Composición, 1 a 1..*)
- Sección — Producto (Asociación, 1..* a 1..*)
- GestorInventario ◇— Producto (Agregación, 1 a 0..*)
- GestorInventario ··▶ VerificadorStock (Dependencia)

#Se uso IA para redactar la simbologia a texto
