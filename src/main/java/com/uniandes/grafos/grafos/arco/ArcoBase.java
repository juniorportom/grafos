package com.uniandes.grafos.grafos.arco;

import com.uniandes.grafos.grafos.nodo.NodoBase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class ArcoBase {
    protected NodoBase origen;
    protected NodoBase destino;

}
