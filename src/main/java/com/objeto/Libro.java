package com.objeto;

import com.funciones.ClaseEstatica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Libro {
    @Getter @Setter
   private String titulo;
   @Getter @Setter
   private String autor;
   @Getter @Setter
   private float precio;
   @Getter @Setter
   private String editorial;
   @Getter @Setter
   private int paginas;
   @Getter @Setter
   private int año;
   @Getter @Setter   
   private String edicion;

  
}

