package com.uniandes.grafos.grafos.arco;

import com.uniandes.grafos.grafos.nodo.Nodo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Arco {
    private Nodo origen;
    private Nodo destino;
    private int peso;
}
