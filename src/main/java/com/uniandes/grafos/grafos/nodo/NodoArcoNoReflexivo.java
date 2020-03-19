package com.uniandes.grafos.grafos.nodo;

import com.uniandes.grafos.grafos.arco.Arco;

import java.util.ArrayList;
import java.util.List;

public class NodoArcoNoReflexivo extends NodoBase {
    public NodoArcoNoReflexivo() {
        super();
    }

    @Override
    public List<NodoBase> getNodosAdyacentes() {
        List<NodoBase> nodos = new ArrayList<>();

        // por cada arco donde el nodo es origen
        for (Arco arco : arcos) {
            // si el arco no es reflexivo
            if (arco.getDestino().nombre != this.nombre)
                // agrega el nodo destino a la lista
                // de nodos adyacentes
                nodos.add(arco.getDestino());
        }

        // retorna la lista de nodos adyacentes
        return nodos;
    }
}
